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
 * Beps39700101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_BEPS_397")
public class Beps39700101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="chckCdtForLd.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="chckCdtForLd.grpHdr.creDtTm")
    private String creDtTm;
    
    @JaxbMapping(objPath="chckCdtForLd.grpHdr.instgPty.instgDrctPty")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="chckCdtForLd.grpHdr.instgPty.instgPty")
    private String instgIndrctPty;
    
    @JaxbMapping(objPath="chckCdtForLd.grpHdr.instdPty.instdDrctPty")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="chckCdtForLd.grpHdr.instdPty.instdPty")
    private String instdIndrctPty;
    
    @JaxbMapping(objPath="chckCdtForLd.grpHdr.sysCd")
    private String sysCd;
    
    @JaxbMapping(objPath="chckCdtForLd.grpHdr.rmk")
    private String rmk;
    
    @JaxbMapping(objPath="chckCdtForLd.orgnlGrpHdr.orgnlMsgId")
    private String orgnlMsgId;
    
    @JaxbMapping(objPath="chckCdtForLd.orgnlGrpHdr.orgnlInstgPty")
    private String orgnlInstgDrctPty;
    
    @JaxbMapping(objPath="chckCdtForLd.orgnlGrpHdr.orgnlMsgTp")
    private String orgnlMT;
    
    @JaxbMapping(objPath="chckCdtForLd.chckCdtForLdInf.applyOrCclTp")
    private String applyOrCclTp;
    
    @JaxbMapping(objPath="chckCdtForLd.chckCdtForLdInf.isseDt")
    private String isseDt;
    
    @JaxbMapping(objPath="chckCdtForLd.chckCdtForLdInf.nb")
    private String nb;
    
    @JaxbMapping(objPath="chckCdtForLd.ChckCdtForLdInf.id")
    private String bid;
    
    @JaxbMapping(objPath="chckCdtForLd.chckCdtForLdInf.acctNb")
    private String acctNb;
    
    @JaxbMapping(objPath="chckCdtForLd.chckCdtForLdInf.amt.value")
    private Double amt;
    
    @JaxbMapping(objPath="chckCdtForLd.chckCdtForLdInf.chckMd")
    private String chckMd;
    
    @JaxbMapping(objPath="chckCdtForLd.chckCdtForLdInf.chckCd")
    private String chckCd;
    
    @JaxbMapping(objPath="chckCdtForLd.chckCdtForLdInf.imgFrntLen")
    private String imgFrntLen;
    
    @JaxbMapping(objPath="chckCdtForLd.chckCdtForLdInf.cntt")
    private String cntt;
    
    
	
    /** default constructor */
    public Beps39700101() {
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
   * Returns the orgnlMsgId
   * 
   * @return the orgnlMsgId
   */
    @Column(name = "ORGNLMSGID")
    public String getOrgnlMsgId() {
        return orgnlMsgId;
    }	 
     
  /**
   * Sets the orgnlMsgId
   *
   * @param newOrgnlMsgId the new orgnlMsgId
   */

    public void  setOrgnlMsgId(String newOrgnlMsgId) {
        orgnlMsgId = newOrgnlMsgId;
    }	  
  /**
   * Returns the orgnlInstgDrctPty
   * 
   * @return the orgnlInstgDrctPty
   */
    @Column(name = "ORGNLINSTGDRCTPTY")
    public String getOrgnlInstgDrctPty() {
        return orgnlInstgDrctPty;
    }	 
     
  /**
   * Sets the orgnlInstgDrctPty
   *
   * @param newOrgnlInstgDrctPty the new orgnlInstgDrctPty
   */

    public void  setOrgnlInstgDrctPty(String newOrgnlInstgDrctPty) {
        orgnlInstgDrctPty = newOrgnlInstgDrctPty;
    }	  
  /**
   * Returns the orgnlMT
   * 
   * @return the orgnlMT
   */
    @Column(name = "ORGNLMT")
    public String getOrgnlMT() {
        return orgnlMT;
    }	 
     
  /**
   * Sets the orgnlMT
   *
   * @param newOrgnlMT the new orgnlMT
   */

    public void  setOrgnlMT(String newOrgnlMT) {
        orgnlMT = newOrgnlMT;
    }	  
  /**
   * Returns the applyOrCclTp
   * 
   * @return the applyOrCclTp
   */
    @Column(name = "APPLYORCCLTP")
    public String getApplyOrCclTp() {
        return applyOrCclTp;
    }	 
     
  /**
   * Sets the applyOrCclTp
   *
   * @param newApplyOrCclTp the new applyOrCclTp
   */

    public void  setApplyOrCclTp(String newApplyOrCclTp) {
        applyOrCclTp = newApplyOrCclTp;
    }	  
  /**
   * Returns the isseDt
   * 
   * @return the isseDt
   */
    @Column(name = "ISSEDT")
    public String getIsseDt() {
        return isseDt;
    }	 
     
  /**
   * Sets the isseDt
   *
   * @param newIsseDt the new isseDt
   */

    public void  setIsseDt(String newIsseDt) {
        isseDt = newIsseDt;
    }	  
  /**
   * Returns the nb
   * 
   * @return the nb
   */
    @Column(name = "NB")
    public String getNb() {
        return nb;
    }	 
     
  /**
   * Sets the nb
   *
   * @param newNb the new nb
   */

    public void  setNb(String newNb) {
        nb = newNb;
    }	  
  /**
   * Returns the id
   * 
   * @return the id
   */
    @Column(name = "BID")
    public String getBid() {
        return bid;
    }	 
     
  /**
   * Sets the id
   *
   * @param newId the new id
   */

    public void  setBid(String newId) {
        bid = newId;
    }	  
  /**
   * Returns the acctNb
   * 
   * @return the acctNb
   */
    @Column(name = "ACCTNB")
    public String getAcctNb() {
        return acctNb;
    }	 
     
  /**
   * Sets the acctNb
   *
   * @param newAcctNb the new acctNb
   */

    public void  setAcctNb(String newAcctNb) {
        acctNb = newAcctNb;
    }	  
  /**
   * Returns the amt
   * 
   * @return the amt
   */
    @Column(name = "AMT")
    public Double getAmt() {
        return amt;
    }	 
     
  /**
   * Sets the amt
   *
   * @param newAmt the new amt
   */

    public void  setAmt(Double newAmt) {
        amt = newAmt;
    }	  
  /**
   * Returns the chckMd
   * 
   * @return the chckMd
   */
    @Column(name = "CHCKMD")
    public String getChckMd() {
        return chckMd;
    }	 
     
  /**
   * Sets the chckMd
   *
   * @param newChckMd the new chckMd
   */

    public void  setChckMd(String newChckMd) {
        chckMd = newChckMd;
    }	  
  /**
   * Returns the chckCd
   * 
   * @return the chckCd
   */
    @Column(name = "CHCKCD")
    public String getChckCd() {
        return chckCd;
    }	 
     
  /**
   * Sets the chckCd
   *
   * @param newChckCd the new chckCd
   */

    public void  setChckCd(String newChckCd) {
        chckCd = newChckCd;
    }	  
  /**
   * Returns the imgFrntLen
   * 
   * @return the imgFrntLen
   */
    @Column(name = "IMGFRNTLEN")
    public String getImgFrntLen() {
        return imgFrntLen;
    }	 
     
  /**
   * Sets the imgFrntLen
   *
   * @param newImgFrntLen the new imgFrntLen
   */

    public void  setImgFrntLen(String newImgFrntLen) {
        imgFrntLen = newImgFrntLen;
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
    
    
}    
    
