package com.topfinance.ebo.msg;

import java.util.Date;

import com.topfinance.ebo.msg.JaxbMapping;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Beps40300101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_BEPS_403")
public class Beps40300101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="invcPrtApply.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="invcPrtApply.grpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="invcPrtApply.grpHdr.instgPty.instgDrctPty")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="invcPrtApply.grpHdr.instgPty.instgPty")
    private String instgIndrctPty;
    
    @JaxbMapping(objPath="invcPrtApply.grpHdr.instdPty.instdDrctPty")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="invcPrtApply.grpHdr.instdPty.instdPty")
    private String instdIndrctPty;
    
    @JaxbMapping(objPath="invcPrtApply.grpHdr.sysCd")
    private String sysCd;
    
    @JaxbMapping(objPath="invcPrtApply.grpHdr.sysCd")
    private String rmk;
    
    @JaxbMapping(objPath="invcPrtApply.invcPrtApplyInf.ctgyPurpCd")
    private String ctgyPurpCd;
    
    @JaxbMapping(objPath="invcPrtApply.invcPrtApplyInf.corprtnId")
    private String corprtnId;
    
    @JaxbMapping(objPath="invcPrtApply.invcPrtApplyInf.usrId")
    private String usrId;
    
    @JaxbMapping(objPath="invcPrtApply.invcPrtApplyInf.invcDt")
    private String invcDt;
    
    @JaxbMapping(objPath="invcPrtApply.invcPrtApplyInf.invcId")
    private String invcId;
    
    
	
    /** default constructor */
    public Beps40300101() {
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
   * Returns the ctgyPurpCd
   * 
   * @return the ctgyPurpCd
   */
    @Column(name = "CTGYPURPCD")
    public String getCtgyPurpCd() {
        return ctgyPurpCd;
    }	 
     
  /**
   * Sets the ctgyPurpCd
   *
   * @param newCtgyPurpCd the new ctgyPurpCd
   */

    public void  setCtgyPurpCd(String newCtgyPurpCd) {
        ctgyPurpCd = newCtgyPurpCd;
    }	  
  /**
   * Returns the corprtnId
   * 
   * @return the corprtnId
   */
    @Column(name = "CORPRTNID")
    public String getCorprtnId() {
        return corprtnId;
    }	 
     
  /**
   * Sets the corprtnId
   *
   * @param newCorprtnId the new corprtnId
   */

    public void  setCorprtnId(String newCorprtnId) {
        corprtnId = newCorprtnId;
    }	  
  /**
   * Returns the usrId
   * 
   * @return the usrId
   */
    @Column(name = "USRID")
    public String getUsrId() {
        return usrId;
    }	 
     
  /**
   * Sets the usrId
   *
   * @param newUsrId the new usrId
   */

    public void  setUsrId(String newUsrId) {
        usrId = newUsrId;
    }	  
  /**
   * Returns the invcDt
   * 
   * @return the invcDt
   */
    @Column(name = "INVCDT")
    public String getInvcDt() {
        return invcDt;
    }	 
     
  /**
   * Sets the invcDt
   *
   * @param newInvcDt the new invcDt
   */

    public void  setInvcDt(String newInvcDt) {
        invcDt = newInvcDt;
    }	  
  /**
   * Returns the invcId
   * 
   * @return the invcId
   */
    @Column(name = "INVCID")
    public String getInvcId() {
        return invcId;
    }	 
     
  /**
   * Sets the invcId
   *
   * @param newInvcId the new invcId
   */

    public void  setInvcId(String newInvcId) {
        invcId = newInvcId;
    }	  
    
    
}    
    
