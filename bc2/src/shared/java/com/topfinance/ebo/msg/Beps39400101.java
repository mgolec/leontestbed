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
 * Beps39400101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_BEPS_394")
public class Beps39400101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.grpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.grpHdr.instgPty.instgDrctPty")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.grpHdr.instgPty.instgPty")
    private String instgIndrctPty;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.grpHdr.instdPty.instdDrctPty")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.grpHdr.instdPty.instdPty")
    private String instdIndrctPty;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.grpHdr.sysCd")
    private String sysCd;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.grpHdr.rmk")
    private String rmk;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.orgnlGrpHdr.orgnlMsgId")
    private String orgnlMsgId;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.orgnlGrpHdr.orgnlInstgPty")
    private String orgnlInstgDrctPty;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.orgnlGrpHdr.orgnlMsgTp")
    private String orgnlMsgTp;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.orgnlTxInf.orgnlCtgyPurpCd")
    private String orgnlCtgyPurpCd;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.orgnlTxInf.orgnlChrgId")
    private String orgnlChrgId;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.orgnlTxInf.orgnlCorprtnId")
    private String orgnlCorprtnId;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.orgnlTxInf.orgnlUsrId")
    private String orgnlUsrId;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.cstmrPmtQryRspnInf.rspsnInf.sts")
    private String sts;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.cstmrPmtQryRspnInf.rspsnInf.rjctCd")
    private String rjctCd;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.cstmrPmtQryRspnInf.rspsnInf.rjctInf")
    private String rjctInf;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.cstmrPmtQryRspnInf.rspsnInf.prcPty")
    private String prcPty;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.cstmrPmtQryRspnInf.cstmrPmtDtls.cdtrAgt.fIId.clrSysMmbId.mmbId")
    private String cdtrClrSysMmbId;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.cstmrPmtQryRspnInf.cstmrPmtDtls.cdtrAgt.brnchId.id")
    private String cdtrAgtBrnchId;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.cstmrPmtQryRspnInf.cstmrPmtDtls.cdtr.nm")
    private String cdtrNm;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.cstmrPmtQryRspnInf.cstmrPmtDtls.cdtrAcct.id.othr.id")
    private String cdtrAcctId;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.cstmrPmtQryRspnInf.cstmrPmtDtls.cdtrAcct.id.othr.issr")
    private String cdtrAcctIssr;
    
    @JaxbMapping(objPath="cstmrPmtQryRspn.cstmrPmtQryRspnInf.cstmrPmtDtls.pmtAmt.value")
    private Double pmtAmt;
    
    
	
    /** default constructor */
    public Beps39400101() {
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
   * Returns the orgnlMsgTp
   * 
   * @return the orgnlMsgTp
   */
    @Column(name = "ORGNLMT")
    public String getOrgnlMsgTp() {
        return orgnlMsgTp;
    }	 
     
  /**
   * Sets the orgnlMsgTp
   *
   * @param newOrgnlMsgTp the new orgnlMsgTp
   */

    public void  setOrgnlMsgTp(String newOrgnlMsgTp) {
        orgnlMsgTp = newOrgnlMsgTp;
    }	  
  /**
   * Returns the orgnlCtgyPurpCd
   * 
   * @return the orgnlCtgyPurpCd
   */
    @Column(name = "ORGNLCTGYPURPCD")
    public String getOrgnlCtgyPurpCd() {
        return orgnlCtgyPurpCd;
    }	 
     
  /**
   * Sets the orgnlCtgyPurpCd
   *
   * @param newOrgnlCtgyPurpCd the new orgnlCtgyPurpCd
   */

    public void  setOrgnlCtgyPurpCd(String newOrgnlCtgyPurpCd) {
        orgnlCtgyPurpCd = newOrgnlCtgyPurpCd;
    }	  
  /**
   * Returns the orgnlChrgId
   * 
   * @return the orgnlChrgId
   */
    @Column(name = "ORGNLCHRGID")
    public String getOrgnlChrgId() {
        return orgnlChrgId;
    }	 
     
  /**
   * Sets the orgnlChrgId
   *
   * @param newOrgnlChrgId the new orgnlChrgId
   */

    public void  setOrgnlChrgId(String newOrgnlChrgId) {
        orgnlChrgId = newOrgnlChrgId;
    }	  
  /**
   * Returns the orgnlCorprtnId
   * 
   * @return the orgnlCorprtnId
   */
    @Column(name = "ORGNLCORPRTNID")
    public String getOrgnlCorprtnId() {
        return orgnlCorprtnId;
    }	 
     
  /**
   * Sets the orgnlCorprtnId
   *
   * @param newOrgnlCorprtnId the new orgnlCorprtnId
   */

    public void  setOrgnlCorprtnId(String newOrgnlCorprtnId) {
        orgnlCorprtnId = newOrgnlCorprtnId;
    }	  
  /**
   * Returns the orgnlUsrId
   * 
   * @return the orgnlUsrId
   */
    @Column(name = "ORGNLUSRID")
    public String getOrgnlUsrId() {
        return orgnlUsrId;
    }	 
     
  /**
   * Sets the orgnlUsrId
   *
   * @param newOrgnlUsrId the new orgnlUsrId
   */

    public void  setOrgnlUsrId(String newOrgnlUsrId) {
        orgnlUsrId = newOrgnlUsrId;
    }	  
  /**
   * Returns the sts
   * 
   * @return the sts
   */
    @Column(name = "STS")
    public String getSts() {
        return sts;
    }	 
     
  /**
   * Sets the sts
   *
   * @param newSts the new sts
   */

    public void  setSts(String newSts) {
        sts = newSts;
    }	  
  /**
   * Returns the rjctCd
   * 
   * @return the rjctCd
   */
    @Column(name = "RJCTCD")
    public String getRjctCd() {
        return rjctCd;
    }	 
     
  /**
   * Sets the rjctCd
   *
   * @param newRjctCd the new rjctCd
   */

    public void  setRjctCd(String newRjctCd) {
        rjctCd = newRjctCd;
    }	  
  /**
   * Returns the rjctInf
   * 
   * @return the rjctInf
   */
    @Column(name = "RJCTINF")
    public String getRjctInf() {
        return rjctInf;
    }	 
     
  /**
   * Sets the rjctInf
   *
   * @param newRjctInf the new rjctInf
   */

    public void  setRjctInf(String newRjctInf) {
        rjctInf = newRjctInf;
    }	  
  /**
   * Returns the prcPty
   * 
   * @return the prcPty
   */
    @Column(name = "PRCPTY")
    public String getPrcPty() {
        return prcPty;
    }	 
     
  /**
   * Sets the prcPty
   *
   * @param newPrcPty the new prcPty
   */

    public void  setPrcPty(String newPrcPty) {
        prcPty = newPrcPty;
    }	  
  /**
   * Returns the cdtrClrSysMmbId
   * 
   * @return the cdtrClrSysMmbId
   */
    @Column(name = "CDTRCLRSYSMMBID")
    public String getCdtrClrSysMmbId() {
        return cdtrClrSysMmbId;
    }	 
     
  /**
   * Sets the cdtrClrSysMmbId
   *
   * @param newCdtrClrSysMmbId the new cdtrClrSysMmbId
   */

    public void  setCdtrClrSysMmbId(String newCdtrClrSysMmbId) {
        cdtrClrSysMmbId = newCdtrClrSysMmbId;
    }	  
  /**
   * Returns the cdtrAgtBrnchId
   * 
   * @return the cdtrAgtBrnchId
   */
    @Column(name = "CDTRAGTBRNCHID")
    public String getCdtrAgtBrnchId() {
        return cdtrAgtBrnchId;
    }	 
     
  /**
   * Sets the cdtrAgtBrnchId
   *
   * @param newCdtrAgtBrnchId the new cdtrAgtBrnchId
   */

    public void  setCdtrAgtBrnchId(String newCdtrAgtBrnchId) {
        cdtrAgtBrnchId = newCdtrAgtBrnchId;
    }	  
  /**
   * Returns the cdtrNm
   * 
   * @return the cdtrNm
   */
    @Column(name = "CDTRNM")
    public String getCdtrNm() {
        return cdtrNm;
    }	 
     
  /**
   * Sets the cdtrNm
   *
   * @param newCdtrNm the new cdtrNm
   */

    public void  setCdtrNm(String newCdtrNm) {
        cdtrNm = newCdtrNm;
    }	  
  /**
   * Returns the cdtrAcctId
   * 
   * @return the cdtrAcctId
   */
    @Column(name = "CDTRACCTID")
    public String getCdtrAcctId() {
        return cdtrAcctId;
    }	 
     
  /**
   * Sets the cdtrAcctId
   *
   * @param newCdtrAcctId the new cdtrAcctId
   */

    public void  setCdtrAcctId(String newCdtrAcctId) {
        cdtrAcctId = newCdtrAcctId;
    }	  
  /**
   * Returns the cdtrAcctIssr
   * 
   * @return the cdtrAcctIssr
   */
    @Column(name = "CDTRACCTISSR")
    public String getCdtrAcctIssr() {
        return cdtrAcctIssr;
    }	 
     
  /**
   * Sets the cdtrAcctIssr
   *
   * @param newCdtrAcctIssr the new cdtrAcctIssr
   */

    public void  setCdtrAcctIssr(String newCdtrAcctIssr) {
        cdtrAcctIssr = newCdtrAcctIssr;
    }	  
  /**
   * Returns the pmtAmt
   * 
   * @return the pmtAmt
   */
    @Column(name = "PMTAMT")
    public Double getPmtAmt() {
        return pmtAmt;
    }	 
     
  /**
   * Sets the pmtAmt
   *
   * @param newPmtAmt the new pmtAmt
   */

    public void  setPmtAmt(Double newPmtAmt) {
        pmtAmt = newPmtAmt;
    }	  
    
    
}    
    
