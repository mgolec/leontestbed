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
 * Beps12700101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_BEPS_127_HDR")
public class Beps12700101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="cstmrDrctDbt.pKGGrpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="cstmrDrctDbt.pKGGrpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="cstmrDrctDbt.pKGGrpHdr.instgPty.instgDrctPty")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="cstmrDrctDbt.pKGGrpHdr.instdPty.instdDrctPty")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="cstmrDrctDbt.pKGGrpHdr.nbOfTxs")
    private String nbOfTxs;
    
    @JaxbMapping(objPath="cstmrDrctDbt.pKGGrpHdr.ctrlSum.value")
    private Double ctrlSum;
    
    @JaxbMapping(objPath="cstmrDrctDbt.pKGGrpHdr.sysCd")
    private String sysCd;
    
    @JaxbMapping(objPath="cstmrDrctDbt.pKGGrpHdr.rmk")
    private String rmk;
    
    @JaxbMapping(objPath="cstmrDrctDbt.pKGRtrLtdInf.pKGRtrLtd")
    private String pKGRtrLtd;
    
    @JaxbMapping(objPath="cstmrDrctDbt.cstmrDrctDbtInf[0]")
    private java.util.Set<Beps12700101CstmrDrctDbtInf> cstmrDrctDbtInf;
    
    
	
    /** default constructor */
    public Beps12700101() {
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
   * Returns the pKGRtrLtd
   * 
   * @return the pKGRtrLtd
   */
    @Column(name = "PKGRTRLTD")
    public String getPKGRtrLtd() {
        return pKGRtrLtd;
    }	 
     
  /**
   * Sets the pKGRtrLtd
   *
   * @param newPKGRtrLtd the new pKGRtrLtd
   */

    public void  setPKGRtrLtd(String newPKGRtrLtd) {
        pKGRtrLtd = newPKGRtrLtd;
    }	  
  /**
   * Returns the cstmrDrctDbtInf
   * 
   * @return the cstmrDrctDbtInf
   */
  	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL, mappedBy = "fid")
    public java.util.Set<Beps12700101CstmrDrctDbtInf> getCstmrDrctDbtInf() {
        return cstmrDrctDbtInf;
    }	 
     
  /**
   * Sets the cstmrDrctDbtInf
   *
   * @param newCstmrDrctDbtInf the new cstmrDrctDbtInf
   */

    public void  setCstmrDrctDbtInf(java.util.Set<Beps12700101CstmrDrctDbtInf> newCstmrDrctDbtInf) {
        cstmrDrctDbtInf = newCstmrDrctDbtInf;
    }	  
    
    
}    
    
