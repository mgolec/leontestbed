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

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 * Saps73300101Hdr generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_SAPS_733_HDR")
public class Saps73300101Hdr  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="acstcbsDailyAcctg.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="acstcbsDailyAcctg.grpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="acstcbsDailyAcctg.grpHdr.instgPty.instgDrctPty")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="acstcbsDailyAcctg.grpHdr.instgPty.instgPty")
    private String instgIndrctPty;
    
    @JaxbMapping(objPath="acstcbsDailyAcctg.grpHdr.instdPty.instdDrctPty")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="acstcbsDailyAcctg.grpHdr.instdPty.instdPty")
    private String instdIndrctPty;
    
    @JaxbMapping(objPath="acstcbsDailyAcctg.grpHdr.sysCd")
    private String sysCd;
    
    @JaxbMapping(objPath="acstcbsDailyAcctg.grpHdr.rmk")
    private String rmk;
    
    @JaxbMapping(objPath="acstcbsDailyAcctg.prttn.ttlNb")
    private String ttlNb;
    
    @JaxbMapping(objPath="acstcbsDailyAcctg.prttn.startNb")
    private String startNb;
    
    @JaxbMapping(objPath="acstcbsDailyAcctg.prttn.startNb")
    private String endNb;
    
    @JaxbMapping(objPath="acstcbsDailyAcctg.acstcbsDailyAcctgInf.workDt")
    private Date workDt;
    
    @JaxbMapping(objPath="acstcbsDailyAcctg.acstcbsDailyAcctgInf.nbOfTx")
    private String nbOfTxs;
    
    @JaxbMapping(objPath="acstcbsDailyAcctg.acstcbsDailyAcctgInf.chckngList[0]")
    private java.util.Set<Saps73300101> chckngList;
    
    
	
    /** default constructor */
    public Saps73300101Hdr() {
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
   * Returns the ttlNb
   * 
   * @return the ttlNb
   */
    @Column(name = "TTLNB")
    public String getTtlNb() {
        return ttlNb;
    }	 
     
  /**
   * Sets the ttlNb
   *
   * @param newTtlNb the new ttlNb
   */

    public void  setTtlNb(String newTtlNb) {
        ttlNb = newTtlNb;
    }	  
  /**
   * Returns the startNb
   * 
   * @return the startNb
   */
    @Column(name = "STARTNB")
    public String getStartNb() {
        return startNb;
    }	 
     
  /**
   * Sets the startNb
   *
   * @param newStartNb the new startNb
   */

    public void  setStartNb(String newStartNb) {
        startNb = newStartNb;
    }	  
  /**
   * Returns the endNb
   * 
   * @return the endNb
   */
    @Column(name = "ENDNB")
    public String getEndNb() {
        return endNb;
    }	 
     
  /**
   * Sets the endNb
   *
   * @param newEndNb the new endNb
   */

    public void  setEndNb(String newEndNb) {
        endNb = newEndNb;
    }	  
  /**
   * Returns the workDt
   * 
   * @return the workDt
   */
    @Column(name = "WORKDT")
    public Date getWorkDt() {
        return workDt;
    }	 
     
  /**
   * Sets the workDt
   *
   * @param newWorkDt the new workDt
   */

    public void  setWorkDt(Date newWorkDt) {
        workDt = newWorkDt;
    }	  
  /**
   * Returns the nbOfTxs
   * 
   * @return the nbOfTxs
   */
    @Column(name = "NBOFTXS")
    public String getNbOfTxs() {
        return nbOfTxs;
    }	 
     
  /**
   * Sets the nbOfTxs
   *
   * @param newNbOfTxs the new nbOfTxs
   */

    public void  setNbOfTxs(String newNbOfTxs) {
        nbOfTxs = newNbOfTxs;
    }	  
  /**
   * Returns the chckngList
   * 
   * @return the chckngList
   */
  	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL, mappedBy = "fid")
    public java.util.Set<Saps73300101> getChckngList() {
        return chckngList;
    }	 
     
  /**
   * Sets the chckngList
   *
   * @param newChckngList the new chckngList
   */

    public void  setChckngList(java.util.Set<Saps73300101> newChckngList) {
        chckngList = newChckngList;
    }	  
    
    
}    
    
