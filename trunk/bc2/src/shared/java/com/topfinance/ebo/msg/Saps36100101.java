package com.topfinance.ebo.msg;

import com.topfinance.ebo.msg.JaxbMapping;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Saps36100101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_SAPS_361")
public class Saps36100101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="balWrngSetng.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="balWrngSetng.grpHdr.creDtTm")
    private String creDtTm;
    
    @JaxbMapping(objPath="balWrngSetng.grpHdr.instgPty.instgDrctPty")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="balWrngSetng.grpHdr.instgPty.instgPty")
    private String instgIndrctPty;
    
    @JaxbMapping(objPath="balWrngSetng.grpHdr.instdPty.instdDrctPty")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="balWrngSetng.grpHdr.instdPty.instdPty")
    private String instdIndrctPty;
    
    @JaxbMapping(objPath="balWrngSetng.grpHdr.sysCd")
    private String sysCd;
    
    @JaxbMapping(objPath="balWrngSetng.grpHdr.rmk")
    private String rmk;
    
    @JaxbMapping(objPath="balWrngSetng.balWrngSetngInf.mmbId")
    private String mmbId;
    
    @JaxbMapping(objPath="balWrngSetng.balWrngSetngInf.swtchTp")
    private String swtchTp;
    
    @JaxbMapping(objPath="balWrngSetng.balWrngSetngInf.acctWrngVal")
    private Double acctWrngVal;
    
    @JaxbMapping(objPath="balWrngSetng.balWrngSetngInf.wrngPlusMnsTp")
    private String wrngPlusMnsTp;
    
    
	
    /** default constructor */
    public Saps36100101() {
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
    public String getCreDtTm() {
        return creDtTm;
    }	 
     
  /**
   * Sets the creDtTm
   *
   * @param newCreDtTm the new creDtTm
   */

    public void  setCreDtTm(String newCreDtTm) {
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
   * Returns the mmbId
   * 
   * @return the mmbId
   */
    @Column(name = "MMBID")
    public String getMmbId() {
        return mmbId;
    }	 
     
  /**
   * Sets the mmbId
   *
   * @param newMmbId the new mmbId
   */

    public void  setMmbId(String newMmbId) {
        mmbId = newMmbId;
    }	  
  /**
   * Returns the swtchTp
   * 
   * @return the swtchTp
   */
    @Column(name = "SWTCHTP")
    public String getSwtchTp() {
        return swtchTp;
    }	 
     
  /**
   * Sets the swtchTp
   *
   * @param newSwtchTp the new swtchTp
   */

    public void  setSwtchTp(String newSwtchTp) {
        swtchTp = newSwtchTp;
    }	  
  /**
   * Returns the acctWrngVal
   * 
   * @return the acctWrngVal
   */
    @Column(name = "ACCTWRNGVAL")
    public Double getAcctWrngVal() {
        return acctWrngVal;
    }	 
     
  /**
   * Sets the acctWrngVal
   *
   * @param newAcctWrngVal the new acctWrngVal
   */

    public void  setAcctWrngVal(Double newAcctWrngVal) {
        acctWrngVal = newAcctWrngVal;
    }	  
  /**
   * Returns the wrngPlusMnsTp
   * 
   * @return the wrngPlusMnsTp
   */
    @Column(name = "WRNGPLUSMNSTP")
    public String getWrngPlusMnsTp() {
        return wrngPlusMnsTp;
    }	 
     
  /**
   * Sets the wrngPlusMnsTp
   *
   * @param newWrngPlusMnsTp the new wrngPlusMnsTp
   */

    public void  setWrngPlusMnsTp(String newWrngPlusMnsTp) {
        wrngPlusMnsTp = newWrngPlusMnsTp;
    }	  
    
    
}    
    