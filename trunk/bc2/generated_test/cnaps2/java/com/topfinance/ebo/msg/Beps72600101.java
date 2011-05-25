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
 * Beps72600101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_MSG_BEPS_726_001_01__")
public class Beps72600101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="acctChck.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="acctChck.grpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="acctChck.grpHdr.instgPty.instgDrctPty")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="acctChck.grpHdr.instgPty.instgPty")
    private String instgIndrctPty;
    
    @JaxbMapping(objPath="acctChck.grpHdr.instdPty.instdDrctPty")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="acctChck.grpHdr.instdPty.instdPty")
    private String instdIndrctPty;
    
    @JaxbMapping(objPath="acctChck.grpHdr.sysCd")
    private String sysCd;
    
    @JaxbMapping(objPath="acctChck.grpHdr.rmk")
    private String rmk;
    
    @JaxbMapping(objPath="acctChck.prttn.ttlNb")
    private String ttlNb;
    
    @JaxbMapping(objPath="acctChck.prttn.startNb")
    private String startNb;
    
    @JaxbMapping(objPath="acctChck.prttn.endNb")
    private String endNb;
    
    @JaxbMapping(objPath="acctChck.acctChckInf.chckDt")
    private Date chckngDt;
    
    @JaxbMapping(objPath="acctChck.acctChckInf.nbOfChckInf1")
    private String nbOfChckInf1;
    
    @JaxbMapping(objPath="acctChck.acctChckInf.chckInfDtls1[0]")
    private java.util.Set<Beps72600101ChckInfDtls1> chckInfDtls1;
    
    @JaxbMapping(objPath="acctChck.acctChckInf.nbOfChckInf2")
    private String nbOfChckInf2;
    
    @JaxbMapping(objPath="acctChck.acctChckInf.chckInfDtls2[0]")
    private java.util.Set<Beps72600101ChckInfDtls2> chckInfDtls2;
    
    
	
    /** default constructor */
    public Beps72600101() {
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
   * Returns the chckngDt
   * 
   * @return the chckngDt
   */
    @Column(name = "CHCKNGDT")
    public Date getChckngDt() {
        return chckngDt;
    }	 
     
  /**
   * Sets the chckngDt
   *
   * @param newChckngDt the new chckngDt
   */

    public void  setChckngDt(Date newChckngDt) {
        chckngDt = newChckngDt;
    }	  
  /**
   * Returns the nbOfChckInf1
   * 
   * @return the nbOfChckInf1
   */
    @Column(name = "NBOFCHCKINF1")
    public String getNbOfChckInf1() {
        return nbOfChckInf1;
    }	 
     
  /**
   * Sets the nbOfChckInf1
   *
   * @param newNbOfChckInf1 the new nbOfChckInf1
   */

    public void  setNbOfChckInf1(String newNbOfChckInf1) {
        nbOfChckInf1 = newNbOfChckInf1;
    }	  
  /**
   * Returns the chckInfDtls1
   * 
   * @return the chckInfDtls1
   */
  	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL, mappedBy = "parent")
    public java.util.Set<Beps72600101ChckInfDtls1> getChckInfDtls1() {
        return chckInfDtls1;
    }	 
     
  /**
   * Sets the chckInfDtls1
   *
   * @param newChckInfDtls1 the new chckInfDtls1
   */

    public void  setChckInfDtls1(java.util.Set<Beps72600101ChckInfDtls1> newChckInfDtls1) {
        chckInfDtls1 = newChckInfDtls1;
    }	  
  /**
   * Returns the nbOfChckInf2
   * 
   * @return the nbOfChckInf2
   */
    @Column(name = "NBOFCHCKINF2")
    public String getNbOfChckInf2() {
        return nbOfChckInf2;
    }	 
     
  /**
   * Sets the nbOfChckInf2
   *
   * @param newNbOfChckInf2 the new nbOfChckInf2
   */

    public void  setNbOfChckInf2(String newNbOfChckInf2) {
        nbOfChckInf2 = newNbOfChckInf2;
    }	  
  /**
   * Returns the chckInfDtls2
   * 
   * @return the chckInfDtls2
   */
  	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL, mappedBy = "parent")
    public java.util.Set<Beps72600101ChckInfDtls2> getChckInfDtls2() {
        return chckInfDtls2;
    }	 
     
  /**
   * Sets the chckInfDtls2
   *
   * @param newChckInfDtls2 the new chckInfDtls2
   */

    public void  setChckInfDtls2(java.util.Set<Beps72600101ChckInfDtls2> newChckInfDtls2) {
        chckInfDtls2 = newChckInfDtls2;
    }	  
    
    
}    
    
