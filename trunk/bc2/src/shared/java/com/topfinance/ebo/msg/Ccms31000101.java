package com.topfinance.ebo.msg;

import com.topfinance.ebo.msg.JaxbMapping;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Ccms31000101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_CCMS_310")
public class Ccms31000101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="cmonNotSgntrInfBiz.grpHdr.instdPty.instdPty")
    private String instdIndrctPty;
    
    @JaxbMapping(objPath="cmonNotSgntrInfBiz.grpHdr.sysCd")
    private String sysCd;
    
    @JaxbMapping(objPath="cmonNotSgntrInfBiz.grpHdr.rmk")
    private String rmk;
    
    @JaxbMapping(objPath="cmonNotSgntrInfBiz.cmonNotSgntrInfBizInf.txTpCd")
    private String prtry;
    
    @JaxbMapping(objPath="cmonNotSgntrInfBiz.cmonNotSgntrInfBizInf.titl")
    private String titl;
    
    @JaxbMapping(objPath="cmonNotSgntrInfBiz.cmonNotSgntrInfBizInf.cntt")
    private String msgCntt;
    
    @JaxbMapping(objPath="cmonNotSgntrInfBiz.cmonNotSgntrInfBizInf.attchmtLen")
    private String attchmtLen;
    
    @JaxbMapping(objPath="cmonNotSgntrInfBiz.cmonNotSgntrInfBizInf.attchmtNm")
    private String attchmtNm;
    
    @JaxbMapping(objPath="cmonNotSgntrInfBiz.cmonNotSgntrInfBizInf.attchmtCntt")
    private String cntt;
    
    @JaxbMapping(objPath="cmonNotSgntrInfBiz.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="cmonNotSgntrInfBiz.grpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="cmonNotSgntrInfBiz.grpHdr.instgPty.instgDrctPty")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="cmonNotSgntrInfBiz.grpHdr.instgPty.instgPty")
    private String instgIndrctPty;
    
    @JaxbMapping(objPath="cmonNotSgntrInfBiz.grpHdr.instdPty.instdDrctPty")
    private String instdDrctPty;
    
    
	
    /** default constructor */
    public Ccms31000101() {
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
    public Integer getid() {
        return id;
    }	 
     
  /**
   * Sets the id
   *
   * @param newid the new id
   */

    public void  setid(Integer newid) {
        id = newid;
    }	  
  /**
   * Returns the instdIndrctPty
   * 
   * @return the instdIndrctPty
   */
    @Column(name = "INSTDINDRCTPTY")
    public String getInstdIndrctPty() {
        return instdIndrctPty;
    }	 
     
  /**
   * Sets the instdIndrctPty
   *
   * @param newInstdIndrctPty the new instdIndrctPty
   */

    public void  setInstdIndrctPty(String newInstdIndrctPty) {
        instdIndrctPty = newInstdIndrctPty;
    }	  
  /**
   * Returns the sysCd
   * 
   * @return the sysCd
   */
    @Column(name = "SYSCD")
    public String getSysCd() {
        return sysCd;
    }	 
     
  /**
   * Sets the sysCd
   *
   * @param newSysCd the new sysCd
   */

    public void  setSysCd(String newSysCd) {
        sysCd = newSysCd;
    }	  
  /**
   * Returns the rmk
   * 
   * @return the rmk
   */
    @Column(name = "RMK")
    public String getRmk() {
        return rmk;
    }	 
     
  /**
   * Sets the rmk
   *
   * @param newRmk the new rmk
   */

    public void  setRmk(String newRmk) {
        rmk = newRmk;
    }	  
  /**
   * Returns the prtry
   * 
   * @return the prtry
   */
    @Column(name = "PRTRY")
    public String getPrtry() {
        return prtry;
    }	 
     
  /**
   * Sets the prtry
   *
   * @param newPrtry the new prtry
   */

    public void  setPrtry(String newPrtry) {
        prtry = newPrtry;
    }	  
  /**
   * Returns the titl
   * 
   * @return the titl
   */
    @Column(name = "TITL")
    public String getTitl() {
        return titl;
    }	 
     
  /**
   * Sets the titl
   *
   * @param newTitl the new titl
   */

    public void  setTitl(String newTitl) {
        titl = newTitl;
    }	  
  /**
   * Returns the msgCntt
   * 
   * @return the msgCntt
   */
    @Column(name = "MSGCNTT")
    public String getMsgCntt() {
        return msgCntt;
    }	 
     
  /**
   * Sets the msgCntt
   *
   * @param newMsgCntt the new msgCntt
   */

    public void  setMsgCntt(String newMsgCntt) {
        msgCntt = newMsgCntt;
    }	  
  /**
   * Returns the attchmtLen
   * 
   * @return the attchmtLen
   */
    @Column(name = "ATTCHMTLEN")
    public String getAttchmtLen() {
        return attchmtLen;
    }	 
     
  /**
   * Sets the attchmtLen
   *
   * @param newAttchmtLen the new attchmtLen
   */

    public void  setAttchmtLen(String newAttchmtLen) {
        attchmtLen = newAttchmtLen;
    }	  
  /**
   * Returns the attchmtNm
   * 
   * @return the attchmtNm
   */
    @Column(name = "ATTCHMTNM")
    public String getAttchmtNm() {
        return attchmtNm;
    }	 
     
  /**
   * Sets the attchmtNm
   *
   * @param newAttchmtNm the new attchmtNm
   */

    public void  setAttchmtNm(String newAttchmtNm) {
        attchmtNm = newAttchmtNm;
    }	  
  /**
   * Returns the cntt
   * 
   * @return the cntt
   */
    @Column(name = "CNTT")
    public String getCntt() {
        return cntt;
    }	 
     
  /**
   * Sets the cntt
   *
   * @param newCntt the new cntt
   */

    public void  setCntt(String newCntt) {
        cntt = newCntt;
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
   * Returns the creDtTm
   * 
   * @return the creDtTm
   */
    @Column(name = "CREDTTM")
    public Date getCreDtTm() {
        return creDtTm;
    }	 
     
  /**
   * Sets the creDtTm
   *
   * @param newCreDtTm the new creDtTm
   */

    public void  setCreDtTm(Date newCreDtTm) {
        creDtTm = newCreDtTm;
    }	  
  /**
   * Returns the instgDrctPty
   * 
   * @return the instgDrctPty
   */
    @Column(name = "INSTGDRCTPTY")
    public String getInstgDrctPty() {
        return instgDrctPty;
    }	 
     
  /**
   * Sets the instgDrctPty
   *
   * @param newInstgDrctPty the new instgDrctPty
   */

    public void  setInstgDrctPty(String newInstgDrctPty) {
        instgDrctPty = newInstgDrctPty;
    }	  
  /**
   * Returns the instgIndrctPty
   * 
   * @return the instgIndrctPty
   */
    @Column(name = "INSTGINDRCTPTY")
    public String getInstgIndrctPty() {
        return instgIndrctPty;
    }	 
     
  /**
   * Sets the instgIndrctPty
   *
   * @param newInstgIndrctPty the new instgIndrctPty
   */

    public void  setInstgIndrctPty(String newInstgIndrctPty) {
        instgIndrctPty = newInstgIndrctPty;
    }	  
  /**
   * Returns the instdDrctPty
   * 
   * @return the instdDrctPty
   */
    @Column(name = "INSTDDRCTPTY")
    public String getInstdDrctPty() {
        return instdDrctPty;
    }	 
     
  /**
   * Sets the instdDrctPty
   *
   * @param newInstdDrctPty the new instdDrctPty
   */

    public void  setInstdDrctPty(String newInstdDrctPty) {
        instdDrctPty = newInstdDrctPty;
    }	  
    
    
}    
    
