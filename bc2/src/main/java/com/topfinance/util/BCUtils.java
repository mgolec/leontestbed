package com.topfinance.util;

import java.beans.PropertyDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.apache.camel.component.jetty.JettyHttpComponent;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.component.jms.JmsConfiguration;
import org.apache.camel.component.mina.MinaComponent;
import org.apache.camel.component.mina.MinaConfiguration;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.jms.connection.CachingConnectionFactory;

import com.ibm.mq.jms.MQQueueConnectionFactory;
import com.topfinance.cfg.CfgAccessException;
import com.topfinance.cfg.CfgConstants;
import com.topfinance.cfg.CfgImplFactory;
import com.topfinance.cfg.ICfgPortIn;
import com.topfinance.cfg.ICfgPortOut;
import com.topfinance.cfg.ICfgReader;
import com.topfinance.cfg.ICfgRouteRule;
import com.topfinance.cfg.ICfgTransIn;
import com.topfinance.cfg.ICfgTransIn8583;
import com.topfinance.cfg.ICfgTransInAMQ;
import com.topfinance.cfg.ICfgTransInIBMMQ;
import com.topfinance.cfg.ICfgTransInJetty;
import com.topfinance.cfg.ICfgTransOut;
import com.topfinance.cfg.ICfgTransOut8583;
import com.topfinance.cfg.ICfgTransOutAMQ;
import com.topfinance.components.tcp8583.Iso8583Codec;
import com.topfinance.converter.IsoDateConverter;
import com.topfinance.runtime.BcConstants;
import com.topfinance.runtime.OpInfo;


public class BCUtils {
    
    private static Logger logger = Logger.getLogger(BCUtils.class);
    
    public static String getUniqueId() {
        return getUniqueId("uid-");
        
    }
    
    public static void registerConverter() {
        ConvertUtils.register(new IsoDateConverter(), Date.class);
    }
    
    public static byte[] getMappingRuleFromFS(String fileName) {
        
    	// TODO get pp mapping from any folder
    	// now assume sample folder
        String mapFileName = BCUtils.getHomeDir()+FilePathHelper.PATH_SAMPLE_MAPPING+fileName;
        BCUtils.testFileExist(mapFileName, false);
        try {
            InputStream mapFile = new FileInputStream(mapFileName);
            ByteArrayOutputStream content = new ByteArrayOutputStream();
            IOUtils.copy(mapFile, content);
            return content.toByteArray();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    
    private static String homeDir = null;
    // used for testing only
    public static void setHomeDir(String path) {
    	homeDir = path;
    }
    public static String getHomeDir() {
    	// used for testing only
    	if(homeDir!=null) {
    		return homeDir;
    	}
    	
        String homeDir = System.getenv().get(BcConstants.ENV_HOME);
        if(StringUtils.isEmpty(homeDir)) {
            String msg = "Please make sure environment variable "+BcConstants.ENV_HOME+" is set correctly according to your local folder structure.";
            throw new RuntimeException(msg);
        }
        try {
            BCUtils.testFileExist(homeDir, true);
        } catch (Exception ex) {
            String msg="Please make sure environment variable "+BcConstants.ENV_HOME+" is set correctly according to your local folder structure. cause: " + ex.getMessage();
            throw new RuntimeException(msg);
        }
        return homeDir;
    }
    
    public static boolean needSaveMsgDb() {
    	
    	String saveMsgDb = System.getProperty("bc2.saveMsgDb", "true");
    	
    	// only if value=false, do not save
    	return !"false".equals(saveMsgDb);
    	
    }
    public static boolean needSaveMsgFile() {
    	
    	String saveMsgFile = System.getProperty("bc2.saveMsgFile", "false");
    	
    	// only if value=true, save
    	return "true".equals(saveMsgFile);
    	
    }
    public static void testFileExist(String path, boolean expectDir) {
        File file = new File(path);
        if(!file.exists()) {
            throw new RuntimeException("file path: "+path +" does not exist"); 
        }else if(expectDir && !file.isDirectory()){
            throw new RuntimeException("expect dir but found file for path: "+path);
        }else if(!expectDir && file.isDirectory()){
            throw new RuntimeException("expect file but found dir for path: "+path);
        }
    }
    
    public static String extractOrigMsgId(Object jaxbObj, String opName, Map<String, String> origMsgIdPaths) {
        String oPath = origMsgIdPaths.get(opName);
        if(oPath==null) {
            return null;
        }
        return (String)extractFromJaxbObjByOPath(jaxbObj, oPath);
    }
    public static Object extractFromJaxbObjByOPath(Object jaxbObj, String oPath) {
        // TODO generic objectPath solution
        Object res = null;
        try {
            PropertyDescriptor pd = PropertyUtils.getPropertyDescriptor(jaxbObj, oPath);
            Class clazz = pd.getPropertyType();
            if (XMLGregorianCalendar.class.isAssignableFrom(clazz)) {
                // TODO skip date type... XMLGregorianCalendarconversion is trouble
                res = new Date(); 
            }
            else if (Boolean.class.isAssignableFrom(clazz)) {
                // TODO skip boolean type... public Boolean isBtchBookg() is
                // not a valid getter method
                res = Boolean.FALSE;
            }
            else {
                res = (String)BeanUtils.getProperty(jaxbObj, oPath);    
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return res;
    }
    public static String extractMsgId(Object jaxbObj) {
        // suppose .grpHdr.msgId is common place to store msgID
        String res = null;
        Field[] fields = jaxbObj.getClass().getDeclaredFields();
        String fn = fields[0].getName();
        try {
            res = (String)PropertyUtils.getProperty(jaxbObj, fn+".grpHdr.msgId");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return res;
    }
    
    public static ICfgPortOut findRoute(List<ICfgRouteRule> listRouteRule, OpInfo opInfo) throws CfgAccessException{
        
        // filling in some info of CfgOutPort( which is known) for the next step routing
        // the info can be carried either in a header or property of exchange
        
        
        ICfgRouteRule result = null;
        for(ICfgRouteRule rr : listRouteRule) {
            String operationMask = rr.getOperationMask();
//            ICfgPortIn ip = rr.getInPort();
//            if( operationName.startsWith(operationMask)
            if( opInfo.toString().startsWith(operationMask)
                // TODO need match Inport ?
                // && ip.getName().equals(inPort.getName())
                ) {
                result = rr;
                break;
            }
        }
        if(result==null) {
            throw new RuntimeException("cannot found matching route for operation: "+opInfo);
        }
        ICfgReader cfgReader = CfgImplFactory.loadCfgReader();
        return cfgReader.getOutPortByRR(result);
        
    }
    
    
    public static void initCamelComponentIn(CamelContext camel, ICfgTransIn ti) throws Exception{
        
        String provider = ti.getProvider();
        Component comp = null;
        if(CfgConstants.JMS_PROVIDER_AMQ.equals(provider)) {
            
            // ?? won't work unless define as normal JMSComponent
//            amq.setConnectionFactory(jmsInfo.getConnectionFactory());
            ICfgTransInAMQ amqji = (ICfgTransInAMQ)ti;
            ActiveMQComponent amq = new ActiveMQComponent();
            comp = amq;
            amq.setBrokerURL(amqji.getBrokerUrl());
            
            // extra
            amq.setMaxConcurrentConsumers(amqji.getMaxConsumer());
            logger.debug("adding component: "+ti.getPrefix()+", brokerUrl="+amqji.getBrokerUrl());
        }
        
        else if(CfgConstants.JMS_PROVIDER_IBMMQ.equals(provider)) {
            ICfgTransInIBMMQ ibmmqti = (ICfgTransInIBMMQ)ti;
            // ibm mq
            MQQueueConnectionFactory factory = new MQQueueConnectionFactory(); 
            factory.setHostName(ibmmqti.getHostName()); 
            factory.setPort(ibmmqti.getPort()); 
            factory.setQueueManager(ibmmqti.getQueueManager());
            factory.setChannel(ibmmqti.getChannel()); 
            factory.setTransportType(ibmmqti.getTransportType());
            //Where some_ccsid_int is a Character Code Set identifier. It depends on the system as to what code sets are supported. 819, 1200 and 1208 are good ones to try.
            factory.setCCSID(ibmmqti.getCCSID());
            
            CachingConnectionFactory cf = new CachingConnectionFactory(factory);
            
            JmsConfiguration jc = new JmsConfiguration(cf);
            JmsComponent ibmmq = new JmsComponent(jc);
            comp = ibmmq;
        }
        else if(CfgConstants.HTTP_PROVIDER_JETTY.equals(provider)) {
            ICfgTransInJetty jettyti = (ICfgTransInJetty)ti;
            JettyHttpComponent jetty = new JettyHttpComponent();
            comp = jetty;
            // TODO setting up JettyHttpComponent with jettyti
            
            
        }
        else if(CfgConstants.TCP_PROVIDER_8583.equals(provider)) {
            ICfgTransIn8583 iso8583ti = (ICfgTransIn8583)ti;
            
            MinaComponent mina = new MinaComponent();
            comp = mina;
            MinaConfiguration conf = new MinaConfiguration();
            conf.setCodec(new Iso8583Codec());
            
            //extra
            
            
            mina.setConfiguration(conf);
            // TODO setting up MinaComponent with iso8583ti
        }
        
        if(camel.getComponent(ti.getPrefix())!=null) {
            logger.warn("skip adding existed component: "+ti.getPrefix());
        } else {
            // TODO typing configurations
            logger.info("adding in component: "+ti.getPrefix());
            camel.addComponent(ti.getPrefix(), comp);
        }
    }
    
    public static void initCamelComponentOut(CamelContext camel, ICfgTransOut ti) throws Exception{
        
        String provider = ti.getProvider();
        Component comp = null;
        if(CfgConstants.JMS_PROVIDER_AMQ.equals(provider)) {
            
            // ?? won't work unless define as normal JMSComponent
//            amq.setConnectionFactory(jmsInfo.getConnectionFactory());
            ICfgTransOutAMQ amqji = (ICfgTransOutAMQ)ti;
            ActiveMQComponent amq = new ActiveMQComponent();
            comp = amq;
            amq.setBrokerURL(amqji.getBrokerUrl());
            
            // extra
            amq.setRequestTimeout(amqji.getReqTimeout());
            logger.debug("adding out component: "+ti.getPrefix()+", brokerUrl="+amqji.getBrokerUrl());
        }
        
        else if(CfgConstants.JMS_PROVIDER_IBMMQ.equals(provider)) {
        	throw new RuntimeException("not supportedxxx");
//            ICfgTransInIBMMQ ibmmqti = (ICfgTransInIBMMQ)ti;
//            // ibm mq
//            MQQueueConnectionFactory factory = new MQQueueConnectionFactory(); 
//            factory.setHostName(ibmmqti.getHostName()); 
//            factory.setPort(ibmmqti.getPort()); 
//            factory.setQueueManager(ibmmqti.getQueueManager());
//            factory.setChannel(ibmmqti.getChannel()); 
//            factory.setTransportType(ibmmqti.getTransportType());
//            //Where some_ccsid_int is a Character Code Set identifier. It depends on the system as to what code sets are supported. 819, 1200 and 1208 are good ones to try.
//            factory.setCCSID(ibmmqti.getCCSID());
//            
//            CachingConnectionFactory cf = new CachingConnectionFactory(factory);
//            
//            JmsConfiguration jc = new JmsConfiguration(cf);
//            JmsComponent ibmmq = new JmsComponent(jc);
//            comp = ibmmq;
        }
        else if(CfgConstants.HTTP_PROVIDER_JETTY.equals(provider)) {
        	throw new RuntimeException("not supportedxxx");
        	
//            ICfgTransInJetty jettyti = (ICfgTransInJetty)ti;
//            JettyHttpComponent jetty = new JettyHttpComponent();
//            comp = jetty;
            // TODO setting up JettyHttpComponent with jettyti
            
            
        }
        else if(CfgConstants.TCP_PROVIDER_8583.equals(provider)) {
            ICfgTransOut8583 iso8583ti = (ICfgTransOut8583)ti;
            
            MinaComponent mina = new MinaComponent();
            comp = mina;
            MinaConfiguration conf = new MinaConfiguration();
            conf.setCodec(new Iso8583Codec());
            
            // extra
            conf.setTimeout(iso8583ti.getTimeout());
            
            mina.setConfiguration(conf);
            // TODO setting up MinaComponent with iso8583ti
            
        }
        
        if(camel.getComponent(ti.getPrefix())!=null) {
            logger.warn("skip adding existed component: "+ti.getPrefix());
        } else {
            // TODO typing configurations
            logger.info("adding out component: "+ti.getPrefix());
            camel.addComponent(ti.getPrefix(), comp);
        }
    }
    
    
    public static String getUniqueId(String prefix, int maxLength) {
        String id = prefix+System.nanoTime()+"-"+Math.random()*1000000l;
        if(id.length()>maxLength) {
            id = id.substring(0, maxLength);
        }
        return id;
    }
    
    public static String getUniqueId(String prefix) {
        return getUniqueId(prefix, 100);
    }
    public static String getUniqueDocId() {
        return getUniqueId("doc-", 35);
    }    
    public static String getUniqueTxId() {
        return getUniqueId("tx-", 35);
    }
    public static String getUniqueMesgId() {
        return getUniqueId("m-", 20);
    }   
    
    public static String getFullUrlFromPortIn(ICfgPortIn port, ICfgReader reader, boolean isInOnly) throws CfgAccessException{
        String url = port.getUrl();
        // handle URL prefix
        
        ICfgTransIn ti = reader.getTransByPortIn(port);
        String prefix = ti.getPrefix();
        url = prefix+"://"+url;
        
        if(CfgConstants.TCP_PROVIDER_8583.equals(ti.getProvider())) {
            
            // decide sync parameter: see mina doc on http://camel.apache.org/mina.html
            
//            String isSync = "";
//            if(port instanceof ICfgPortIn) {
//            // TODO more mina configuration
//                ICfg8583InPort in8583 = (ICfg8583InPort)port;
//                isSync = in8583.getIsSync();
//            }else if(port instanceof ICfgPortOut) {
//                ICfg8583OutPort out8583 = (ICfg8583OutPort)port;
//                isSync = out8583.getIsSync();
//            }
//            url+= CfgConstants.BOOLEAN_TRUE.equals(isSync)? "?sync=true" : "?sync=false";
            
            url += isInOnly? "?sync=false" : "?sync=true&disconnectOnNoReply=true&noReplyLogLevel=OFF";
            
//            url+=("&timeout="+BcConstants.CHANNEL_DEFAULT_TIMEOUT);
        }
        
        return url;
    }
    
    public static String getFullUrlFromPortOut(ICfgPortOut port, ICfgReader reader, boolean isInOnly) throws CfgAccessException{
        String url = port.getUrl();
        // handle URL prefix
        
        ICfgTransOut ti = reader.getTransByPortOut(port);
        String prefix = ti.getPrefix();
        url = prefix+"://"+url;
        
        if(CfgConstants.TCP_PROVIDER_8583.equals(ti.getProvider())) {
            // decide sync parameter: see mina doc on http://camel.apache.org/mina.html
//            String isSync = "";
//            if(port instanceof ICfgPortIn) {
//            // TODO more mina configuration
//                ICfg8583InPort in8583 = (ICfg8583InPort)port;
//                isSync = in8583.getIsSync();
//            }else if(port instanceof ICfgPortOut) {
//                ICfg8583OutPort out8583 = (ICfg8583OutPort)port;
//                isSync = out8583.getIsSync();
//            }
//            url+= CfgConstants.BOOLEAN_TRUE.equals(isSync)? "?sync=true" : "?sync=false";
            
            url += isInOnly? "?sync=false" : "?sync=true";
            url+=("&timeout="+BcConstants.CHANNEL_DEFAULT_TIMEOUT);
            url+=("&disconnect=true");
        }
        
        return url;
    }
    
//    public static String getFullUrlFromPortForConsumer(ICfgPortIn port) throws CfgAccessException{
//        boolean isConsumer = true; 
//        boolean isInOnly = false; 
//        ICfgReader reader = CfgImplFactory.loadCfgReader();
//        return getFullUrlFromPortIn(port, reader, isInOnly);
//    }
//    public static String getFullUrlFromPort(ICfgPortOut port, boolean isInOnly) throws CfgAccessException{
//        boolean isConsumer = false;
//        ICfgReader reader = CfgImplFactory.loadCfgReader();
//        return getFullUrlFromPortOut(port, reader, isInOnly);
//    }
}
