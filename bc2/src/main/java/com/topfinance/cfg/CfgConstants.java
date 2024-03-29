package com.topfinance.cfg;

public interface CfgConstants {
    
    public final static String JMS_PROVIDER_IBMMQ = "IBMMQ";
    public final static String JMS_PROVIDER_AMQ = "AMQ";
    public final static String HTTP_PROVIDER_JETTY = "JETTY";
    public final static String TCP_PROVIDER_8583 = "8583";
    
    
    public final static String PROTOCOL_CNAPS2 = "CNAPS2";
    
    public final static String NODETYPE_HOST = "H";
    public final static String NODETYPE_PARTNER = "P";
    
    public final static String DIRECTION_UP = "U";
    public final static String DIRECTION_DOWN = "D";
    
    // for CfgOperation.ppFormat
    public final static String FORMAT_XML = "XML";
    public final static String FORMAT_8583 = "8583";
    
    public final static String OP_REPLY_TYPE_NOTIFY = "N";
    public final static String OP_REPLY_TYPE_SYNC = "S";
    public final static String OP_REPLY_TYPE_ASYNC = "A";

    public final static String OP_ACK_TYPE_SYNC = "SYNC";
    public final static String OP_ACK_TYPE_ASYNC = "ASYNC";
    public final static String OP_ACK_TYPE_NONE = "NONE";
    
    public final static String BOOLEAN_TRUE = "T";
    public final static String BOOLEAN_FALSE = "F";
}
