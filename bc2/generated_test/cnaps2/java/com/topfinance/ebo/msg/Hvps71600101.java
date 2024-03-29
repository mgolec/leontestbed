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
 * Hvps71600101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_MSG_HVPS_716_001_01__")
public class Hvps71600101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="acctChckng.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="acctChckng.grpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="acctChckng.grpHdr.instgPty.instgDrctPty")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="acctChckng.grpHdr.instgPty.instgPty")
    private String instgIndrctPty;
    
    @JaxbMapping(objPath="acctChckng.grpHdr.instdPty.instdDrctPty")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="acctChckng.grpHdr.instdPty.instdPty")
    private String instdIndrctPty;
    
    @JaxbMapping(objPath="acctChckng.grpHdr.sysCd")
    private String sysCd;
    
    @JaxbMapping(objPath="acctChckng.grpHdr.rmk")
    private String rmk;
    
    @JaxbMapping(objPath="acctChckng.prttn.ttlNb")
    private String ttlNb;
    
    @JaxbMapping(objPath="acctChckng.prttn.startNb")
    private String startNb;
    
    @JaxbMapping(objPath="acctChckng.prttn.endNb")
    private String endNb;
    
    @JaxbMapping(objPath="acctChckng.acctChckngInf.chckDt")
    private Date chckngDt;
    
    @JaxbMapping(objPath="acctChckng.acctChckngInf.ttlCnt")
    private String ttlCnt;
    
    @JaxbMapping(objPath="acctChckng.acctChckngInf.dtls[0]")
    private java.util.Set<Hvps71600101Dtls> dtls;
    
    
	
    /** default constructor */
    public Hvps71600101() {
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
   * Returns the ttlCnt
   * 
   * @return the ttlCnt
   */
    @Column(name = "TTLCNT")
    public String getTtlCnt() {
        return ttlCnt;
    }	 
     
  /**
   * Sets the ttlCnt
   *
   * @param newTtlCnt the new ttlCnt
   */

    public void  setTtlCnt(String newTtlCnt) {
        ttlCnt = newTtlCnt;
    }	  
  /**
   * Returns the dtls
   * 
   * @return the dtls
   */
  	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL, mappedBy = "parent")
    public java.util.Set<Hvps71600101Dtls> getDtls() {
        return dtls;
    }	 
     
  /**
   * Sets the dtls
   *
   * @param newDtls the new dtls
   */

    public void  setDtls(java.util.Set<Hvps71600101Dtls> newDtls) {
        dtls = newDtls;
    }	  
    
    
}    
    
