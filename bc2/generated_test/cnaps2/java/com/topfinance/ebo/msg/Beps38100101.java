package com.topfinance.ebo.msg;

import com.topfinance.ebo.msg.JaxbMapping;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;


/**
 * Beps38100101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_MSG_BEPS_381_001_01__")
public class Beps38100101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.grpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.grpHdr.nbOfTxs")
    private String nbOfTxs;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.grpHdr.ctrlSum")
    private Double ctrlSum;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.grpHdr.initgPty.nm")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.grpHdr.fwdgAgt.fInInstnId.clrSysMmbId.mmbId")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0]")
    private java.util.Set<Beps38100101PmtInf> pmtInf;
    
    
	
    /** default constructor */
    public Beps38100101() {
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
   * Returns the ctrlSum
   * 
   * @return the ctrlSum
   */
    @Column(name = "CTRLSUM")
    public Double getCtrlSum() {
        return ctrlSum;
    }	 
     
  /**
   * Sets the ctrlSum
   *
   * @param newCtrlSum the new ctrlSum
   */

    public void  setCtrlSum(Double newCtrlSum) {
        ctrlSum = newCtrlSum;
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
   * Returns the pmtInf
   * 
   * @return the pmtInf
   */
  	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL, mappedBy = "parent")
    public java.util.Set<Beps38100101PmtInf> getPmtInf() {
        return pmtInf;
    }	 
     
  /**
   * Sets the pmtInf
   *
   * @param newPmtInf the new pmtInf
   */

    public void  setPmtInf(java.util.Set<Beps38100101PmtInf> newPmtInf) {
        pmtInf = newPmtInf;
    }	  
    
    
}    
    
