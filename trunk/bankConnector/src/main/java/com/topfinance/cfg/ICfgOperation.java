package com.topfinance.cfg;

public interface ICfgOperation extends ICfgItem {
//    public ICfgProtocol getProtocol();
//    public void setProtocol(ICfgProtocol protocol);
    
    public String getUpIsEnabled();
    public void setUpIsEnabled(String upIsEnabled);
    public String getUpReplyType();
    public void setUpReplyType(String upReplyType);
    public String getUpIsReply();
    public void setUpIsReply(String upIsReply);
    public String getUpAckType();
    public void setUpAckType(String upAckType);
    
    public String getUpPpReplyType();
    public void setUpPpReplyType(String upPpReplyType);
    
    public String getDownIsEnabled();
    public void setDownIsEnabled(String downIsEnabled);
    public String getDownReplyType();
    public void setDownReplyType(String downReplyType);
    public String getDownIsReply();
    public void setDownIsReply(String downIsReply);
    public String getDownAckType();
    public void setDownAckType(String downAckType);
    
    public String getDownPpReplyType();
    public void setDownPpReplyType(String upPpReplyType);
}
