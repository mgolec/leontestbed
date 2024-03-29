package com.topfinance.cfg.xml;

import com.topfinance.cfg.ICfgInPort;
import com.topfinance.cfg.ICfgOutPort;
import com.topfinance.cfg.ICfgRouteRule;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class OmCfgRouteRule implements ICfgRouteRule{
    @Attribute(required=false)
    private String oid;
    @Attribute(required=false)
    private String name;
    @Element(required=false)
    private ICfgOutPort outPort;
//    @Element(required=false)
//    private ICfgInPort inPort;
    @Attribute(required=false)
    private String operationMask;
    @Attribute(required=false)
    private int sequence;
    
//    @Element(required=false)
//    private ICfgProtocolBinding protocolBinding;
    
    @Attribute(required=false)
    private String direction;
    
    public String getOid() {
        return oid;
    }
    public void setOid(String oid) {
        this.oid = oid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOperationMask() {
        return operationMask;
    }
    public void setOperationMask(String operationMask) {
        this.operationMask = operationMask;
    }
    public int getSequence() {
        return sequence;
    }
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }


    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }
    public ICfgOutPort getOutPort() {
        return outPort;
    }
    public void setOutPort(ICfgOutPort outPort) {
        this.outPort = outPort;
    }
    
    
    
}
