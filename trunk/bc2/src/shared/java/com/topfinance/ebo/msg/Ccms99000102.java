package com.topfinance.ebo.msg;

import com.topfinance.ebo.msg.JaxbMapping;
import javax.persistence.*;

/**
 * Ccms99000102 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_MSG_CCMS_990_001_02__")
public class Ccms99000102  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="comConf.confInf.origSndr")
    private String origSndr;
    
    @JaxbMapping(objPath="comConf.confInf.origSndDt")
    private String origSndDt;
    
    @JaxbMapping(objPath="comConf.confInf.origSndDt")
    private String mT;
    
    @JaxbMapping(objPath="comConf.confInf.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="comConf.confInf.msgRefId")
    private String msgRefId;
    
    @JaxbMapping(objPath="comConf.confInf.msgPrcCd")
    private String msgPrcCd;    
    
    /** default constructor */
    public Ccms99000102() {
    }
	
  /**
   * Returns the id
   * 
   * @return the id
   */    
    @Id
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	@SequenceGenerator(name = "CFG_SEQUNCE_GEN", sequenceName = "S_CFG_SEQUNCE")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CFG_SEQUNCE_GEN")
    public Integer getId() {
        return id;
    }	 
     
  /**
   * Sets the id
   *
   * @param newUuid the new id
   */

    public void  setId(Integer newId) {
        id = newId;
    }	  

  /**
   * Returns the origSndr
   * 
   * @return the origSndr
   */
    @Column(name = "ORIGSNDR")
    public String getOrigSndr() {
        return origSndr;
    }	 
     
  /**
   * Sets the origSndr
   *
   * @param newOrigSndr the new origSndr
   */

    public void  setOrigSndr(String newOrigSndr) {
        origSndr = newOrigSndr;
    }
    
  /**
   * Returns the origSndDt
   * 
   * @return the origSndDt
   */
    @Column(name = "ORIGSNDDT")
    public String getOrigSndDt() {
        return origSndDt;
    }	 
     
  /**
   * Sets the origSndDt
   *
   * @param newOrigSndDt the new origSndDt
   */

    public void  setOrigSndDt(String newOrigSndDt) {
        origSndDt = newOrigSndDt;
    }
    
  /**
   * Returns the mT
   * 
   * @return the mT
   */
    @Column(name = "MT")
    public String getMT() {
        return mT;
    }
     
  /**
   * Sets the mT
   *
   * @param newMT the new mT
   */

    public void  setMT(String newMT) {
        mT = newMT;
    }	  
  /**
   * Returns the msgId
   * 
   * @return the msgId
   */
    @Column(name = "MSGID")
    public String getMsgId() {
        return msgId;
    }	 
     
  /**
   * Sets the msgId
   *
   * @param newMsgId the new msgId
   */

    public void  setMsgId(String newMsgId) {
        msgId = newMsgId;
    }	  
  /**
   * Returns the msgRefId
   * 
   * @return the msgRefId
   */
    @Column(name = "MSGREFID")
    public String getMsgRefId() {
        return msgRefId;
    }	 
     
  /**
   * Sets the msgRefId
   *
   * @param newMsgRefId the new msgRefId
   */

    public void  setMsgRefId(String newMsgRefId) {
        msgRefId = newMsgRefId;
    }
    
  /**
   * Returns the msgPrcCd
   * 
   * @return the msgPrcCd
   */
    @Column(name = "MSGPRCCD")
    public String getMsgPrcCd() {
        return msgPrcCd;
    }	 
     
  /**
   * Sets the msgPrcCd
   *
   * @param newMsgPrcCd the new msgPrcCd
   */

    public void  setMsgPrcCd(String newMsgPrcCd) {
        msgPrcCd = newMsgPrcCd;
    }
    
}
    
