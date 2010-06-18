package com.topfinance.runtime;

import com.topfinance.cfg.ICfgInPort;
import com.topfinance.cfg.ICfgNode;
import com.topfinance.cfg.ICfgOutPort;
import com.topfinance.cfg.ICfgProtocol;
import com.topfinance.cfg.TestDummy;
import com.topfinance.db.AuditTransaction;
import com.topfinance.util.BCUtils;
import org.apache.camel.Exchange;

public abstract class MessageContext {
    
    private boolean isResponse;
    
    private String direction;
    private ICfgProtocol protocol;
//    private String pluginName;
    private ICfgInPort cfgInPort;
    private ICfgOutPort cfgOutPort;
    
    // this is generated by bc when tx started. used to trace the long tx within BC context
    private String txId;
    // this is sent by PP (or optionally generated by bc). to trace tx within PP context
    private String userTxId;
    
    
    // communication layer id, bc will generate it 
    // TODO allow pp to specify with header
    private String mesgId;
    // communication layer reply id, used to handle async ack
    private String origMesgId;
    private String operationName;
    // the identities contains in communication header
    private String origSender;
    private String origReceiver;

    
    // business layer id, extract from TP or PP request
    private String docId;
    // business layer reply id, used to handle async reply
    private String origDocId;
    
    
    private String opType; 
    
    private Exchange srcExchange;
    private Exchange destExchange;
    
    private Object parsedMsg;
    private String packagedMsg;
    
    // the bc configuration info, corresponding to origSender and origReceiver (need swap for inbound msg)
    private String hnName;
    private String pnName;
    private ICfgNode cfgHN;
    private ICfgNode cfgPN;
    
    private AuditTransaction auditTx = new AuditTransaction();
    
    
//    public void createTransactionContext(BCTrace trace) {
//        try {
//            BasePlugin plugin = BasePlugin.loadPlugin(pluginName);
//            TransactionContext context = plugin==null ? null : plugin.createTransactionContext(this, trace);
//            if (context != null)
//            {
//                context.setAuditContext(plugin.createAuditTransactionContext(this));
//                context.setAuditEntry(plugin.createAuditTransactionEntry(this));
//            }
//            mTransactionContext=context;
//
//
//        } catch (Exception e) {
//            //This scenario would never occur as we always create a brand new transaction context.
//            trace.error(e);
//        }
//        try {
//            // If the messaage is a resend, then we insert the resend user name into the
//            // audit transaction context. If for some reason the message does not have
//            // the user name,then ignored.
//            MessageData mData           = getBusinessMsg().getMessage();
//            HashMap msg                 = (HashMap) mData.getMessage();
//            String resendUsername       = (String) msg.get(BCConstants.RS_USERNAME);
//            if (resendUsername != null && resendUsername.length() > 0 )
//                mTransactionContext.mAuditContext.setSummaryField(AuditTransactionContext.RESEND_USERNAME, resendUsername);
//        } catch (Exception e) {
//            // do nothing.
//        }
//    }    
    
    public MessageContext(Exchange exchange) {
        this.srcExchange = exchange;
//        this.protocol = cfgInPort.getProtocol();
//        this.pluginName = cfgInPort.getProtocol().getPluginName();
        this.txId = BCUtils.getUniqueTxId();
    }
    
    // TODO moved to plugin implementation?
    public boolean isAck() {
        return TestDummy.OPERATION_990.equals(getOperationName());
    }
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }



//    public String getPluginName() {
//        return pluginName;
//    }
//
//    public void setPluginName(String pluginName) {
//        this.pluginName = pluginName;
//    }




    public Exchange getSrcExchange() {
        return srcExchange;
    }

    public void setSrcExchange(Exchange srcExchange) {
        this.srcExchange = srcExchange;
    }

    public Exchange getDestExchange() {
        return destExchange;
    }

    public void setDestExchange(Exchange destExchange) {
        this.destExchange = destExchange;
    }



    public ICfgInPort getCfgInPort() {
        return cfgInPort;
    }

    public void setCfgInPort(ICfgInPort cfgInPort) {
        this.cfgInPort = cfgInPort;
    }


    public ICfgOutPort getCfgOutPort() {
        return cfgOutPort;
    }

    public void setCfgOutPort(ICfgOutPort cfgOutPort) {
        this.cfgOutPort = cfgOutPort;
    }



    public ICfgProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(ICfgProtocol protocol) {
        this.protocol = protocol;
    }



    public String getHnName() {
        return hnName;
    }

    public void setHnName(String hnName) {
        this.hnName = hnName;
    }

    public String getPnName() {
        return pnName;
    }

    public void setPnName(String pnName) {
        this.pnName = pnName;
    }

    public ICfgNode getCfgHN() {
        return cfgHN;
    }

    public void setCfgHN(ICfgNode cfgHN) {
        this.cfgHN = cfgHN;
    }

    public ICfgNode getCfgPN() {
        return cfgPN;
    }

    public void setCfgPN(ICfgNode cfgPN) {
        this.cfgPN = cfgPN;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public Object getParsedMsg() {
        return parsedMsg;
    }

    public void setParsedMsg(Object parsedMsg) {
        this.parsedMsg = parsedMsg;
    }

    public String getPackagedMsg() {
        return packagedMsg;
    }

    public void setPackagedMsg(String packagedMsg) {
        this.packagedMsg = packagedMsg;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }



    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public AuditTransaction getAuditTx() {
        return auditTx;
    }

    public void setAuditTx(AuditTransaction auditTx) {
        this.auditTx = auditTx;
    }

    public String getUserTxId() {
        return userTxId;
    }

    public void setUserTxId(String userTxId) {
        this.userTxId = userTxId;
    }

    public String getMesgId() {
        return mesgId;
    }

    public void setMesgId(String mesgId) {
        this.mesgId = mesgId;
    }

    public String getOrigMesgId() {
        return origMesgId;
    }

    public void setOrigMesgId(String origMesgId) {
        this.origMesgId = origMesgId;
    }

    public String getOrigSender() {
        return origSender;
    }

    public void setOrigSender(String origSender) {
        this.origSender = origSender;
    }

    public String getOrigReceiver() {
        return origReceiver;
    }

    public void setOrigReceiver(String origReceiver) {
        this.origReceiver = origReceiver;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getOrigDocId() {
        return origDocId;
    }

    public void setOrigDocId(String origDocId) {
        this.origDocId = origDocId;
    }


    

    
    
}