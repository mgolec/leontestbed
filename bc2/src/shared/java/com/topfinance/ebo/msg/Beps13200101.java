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
 * Beps13200101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_BEPS_132")
public class Beps13200101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.grpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.orgnlGrpInfAndSts.orgnlMsgId")
    private String orgnlMsgId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.orgnlGrpInfAndSts.orgnlMsgNmId")
    private String orgnlMsgNmId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.orgnlGrpInfAndSts.stsRsnInf.rsn.prtry")
    private String prtry;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.orgnlGrpInfAndSts.stsRsnInf.addtlInf[0]")
    private String addtlInfSts;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.orgnlGrpInfAndSts.stsRsnInf.addtlInf[0]")
    private Date netgDt;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.orgnlGrpInfAndSts.stsRsnInf.addtlInf[0]")
    private String netgRnd;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.orgnlGrpInfAndSts.stsRsnInf.addtlInf[0]")
    private Date sttlmDt;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.stsId")
    private String stsId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.orgnlTxId")
    private String orgnlTxId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.stsRsnInf.rsn.prtry")
    private String rsnRejCd;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.stsRsnInf.addtlInf[0]")
    private String rsnRejRsn;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.orgnlTxRef.intrBkSttlmAmt.value")
    private Double intrBkSttlmAmt;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.orgnlTxRef.pmtTpInf.ctgyPurp.prtry")
    private String ctgyPurp;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.orgnlTxRef.mndtRltdInf.amdmntInfDtls.orgnlCdtrAgt.finInstnId.clrSysMmbId.mmbId")
    private String mmbId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.orgnlTxRef.mndtRltdInf.amdmntInfDtls.orgnlCdtrAgt.brnchId.id")
    private String orgnlBrnchId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.orgnlTxRef.rmtInf.ustrd[0]")
    private String ustrdFees;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.orgnlTxRef.dbtrAgt.finInstnId.clrSysMmbId.mmbId")
    private String dbtrClrSysMmbId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.orgnlTxRef.dbtrAgt.brnchId.id")
    private String dbtrAgtBrnchId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.orgnlTxRef.cdtrAgt.finInstnId.clrSysMmbId.mmbId")
    private String cdtrClrSysMmbId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.orgnlTxRef.cdtrAgt.brnchId.id")
    private String cdtrAgtBrnchId;
    
    
	
    /** default constructor */
    public Beps13200101() {
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
   * Returns the orgnlMsgNmId
   * 
   * @return the orgnlMsgNmId
   */
    @Column(name = "ORGNLMSGNMID")
    public String getOrgnlMsgNmId() {
        return orgnlMsgNmId;
    }	 
     
  /**
   * Sets the orgnlMsgNmId
   *
   * @param newOrgnlMsgNmId the new orgnlMsgNmId
   */

    public void  setOrgnlMsgNmId(String newOrgnlMsgNmId) {
        orgnlMsgNmId = newOrgnlMsgNmId;
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
   * Returns the addtlInfSts
   * 
   * @return the addtlInfSts
   */
    @Column(name = "ADDTLINFSTS")
    public String getAddtlInfSts() {
        return addtlInfSts;
    }	 
     
  /**
   * Sets the addtlInfSts
   *
   * @param newAddtlInfSts the new addtlInfSts
   */

    public void  setAddtlInfSts(String newAddtlInfSts) {
        addtlInfSts = newAddtlInfSts;
    }	  
  /**
   * Returns the netgDt
   * 
   * @return the netgDt
   */
    @Column(name = "NETGDT")
    public Date getNetgDt() {
        return netgDt;
    }	 
     
  /**
   * Sets the netgDt
   *
   * @param newNetgDt the new netgDt
   */

    public void  setNetgDt(Date newNetgDt) {
        netgDt = newNetgDt;
    }	  
  /**
   * Returns the netgRnd
   * 
   * @return the netgRnd
   */
    @Column(name = "NETGRND")
    public String getNetgRnd() {
        return netgRnd;
    }	 
     
  /**
   * Sets the netgRnd
   *
   * @param newNetgRnd the new netgRnd
   */

    public void  setNetgRnd(String newNetgRnd) {
        netgRnd = newNetgRnd;
    }	  
  /**
   * Returns the sttlmDt
   * 
   * @return the sttlmDt
   */
    @Column(name = "STTLMDT")
    public Date getSttlmDt() {
        return sttlmDt;
    }	 
     
  /**
   * Sets the sttlmDt
   *
   * @param newSttlmDt the new sttlmDt
   */

    public void  setSttlmDt(Date newSttlmDt) {
        sttlmDt = newSttlmDt;
    }	  
  /**
   * Returns the stsId
   * 
   * @return the stsId
   */
    @Column(name = "STSID")
    public String getStsId() {
        return stsId;
    }	 
     
  /**
   * Sets the stsId
   *
   * @param newStsId the new stsId
   */

    public void  setStsId(String newStsId) {
        stsId = newStsId;
    }	  
  /**
   * Returns the orgnlTxId
   * 
   * @return the orgnlTxId
   */
    @Column(name = "ORGNLTXID")
    public String getOrgnlTxId() {
        return orgnlTxId;
    }	 
     
  /**
   * Sets the orgnlTxId
   *
   * @param newOrgnlTxId the new orgnlTxId
   */

    public void  setOrgnlTxId(String newOrgnlTxId) {
        orgnlTxId = newOrgnlTxId;
    }	  
  /**
   * Returns the rsnRejCd
   * 
   * @return the rsnRejCd
   */
    @Column(name = "RSNREJCD")
    public String getRsnRejCd() {
        return rsnRejCd;
    }	 
     
  /**
   * Sets the rsnRejCd
   *
   * @param newRsnRejCd the new rsnRejCd
   */

    public void  setRsnRejCd(String newRsnRejCd) {
        rsnRejCd = newRsnRejCd;
    }	  
  /**
   * Returns the rsnRejRsn
   * 
   * @return the rsnRejRsn
   */
    @Column(name = "RSNREJRSN")
    public String getRsnRejRsn() {
        return rsnRejRsn;
    }	 
     
  /**
   * Sets the rsnRejRsn
   *
   * @param newRsnRejRsn the new rsnRejRsn
   */

    public void  setRsnRejRsn(String newRsnRejRsn) {
        rsnRejRsn = newRsnRejRsn;
    }	  
  /**
   * Returns the intrBkSttlmAmt
   * 
   * @return the intrBkSttlmAmt
   */
    @Column(name = "INTRBKSTTLMAMT")
    public Double getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }	 
     
  /**
   * Sets the intrBkSttlmAmt
   *
   * @param newIntrBkSttlmAmt the new intrBkSttlmAmt
   */

    public void  setIntrBkSttlmAmt(Double newIntrBkSttlmAmt) {
        intrBkSttlmAmt = newIntrBkSttlmAmt;
    }	  
  /**
   * Returns the ctgyPurp
   * 
   * @return the ctgyPurp
   */
    @Column(name = "CTGYPURP")
    public String getCtgyPurp() {
        return ctgyPurp;
    }	 
     
  /**
   * Sets the ctgyPurp
   *
   * @param newCtgyPurp the new ctgyPurp
   */

    public void  setCtgyPurp(String newCtgyPurp) {
        ctgyPurp = newCtgyPurp;
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
   * Returns the orgnlBrnchId
   * 
   * @return the orgnlBrnchId
   */
    @Column(name = "ORGNLBRNCHID")
    public String getOrgnlBrnchId() {
        return orgnlBrnchId;
    }	 
     
  /**
   * Sets the orgnlBrnchId
   *
   * @param newOrgnlBrnchId the new orgnlBrnchId
   */

    public void  setOrgnlBrnchId(String newOrgnlBrnchId) {
        orgnlBrnchId = newOrgnlBrnchId;
    }	  
  /**
   * Returns the ustrdFees
   * 
   * @return the ustrdFees
   */
    @Column(name = "USTRDFEES")
    public String getUstrdFees() {
        return ustrdFees;
    }	 
     
  /**
   * Sets the ustrdFees
   *
   * @param newUstrdFees the new ustrdFees
   */

    public void  setUstrdFees(String newUstrdFees) {
        ustrdFees = newUstrdFees;
    }	  
  /**
   * Returns the dbtrClrSysMmbId
   * 
   * @return the dbtrClrSysMmbId
   */
    @Column(name = "DBTRCLRSYSMMBID")
    public String getDbtrClrSysMmbId() {
        return dbtrClrSysMmbId;
    }	 
     
  /**
   * Sets the dbtrClrSysMmbId
   *
   * @param newDbtrClrSysMmbId the new dbtrClrSysMmbId
   */

    public void  setDbtrClrSysMmbId(String newDbtrClrSysMmbId) {
        dbtrClrSysMmbId = newDbtrClrSysMmbId;
    }	  
  /**
   * Returns the dbtrAgtBrnchId
   * 
   * @return the dbtrAgtBrnchId
   */
    @Column(name = "DBTRAGTBRNCHID")
    public String getDbtrAgtBrnchId() {
        return dbtrAgtBrnchId;
    }	 
     
  /**
   * Sets the dbtrAgtBrnchId
   *
   * @param newDbtrAgtBrnchId the new dbtrAgtBrnchId
   */

    public void  setDbtrAgtBrnchId(String newDbtrAgtBrnchId) {
        dbtrAgtBrnchId = newDbtrAgtBrnchId;
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
    
    
}    
    