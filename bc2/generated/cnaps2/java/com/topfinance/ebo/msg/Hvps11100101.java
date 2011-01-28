package com.topfinance.ebo.msg;

import com.topfinance.ebo.msg.JaxbMapping;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Hvps11100101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_MSG_HVPS_111_001_01")
public class Hvps11100101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private String uuid;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.grpHdr.msgId")
    private String grpHdrMsgId;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.grpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.grpHdr.nbOfTxs")
    private String nbOfTxs;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.grpHdr.sttlmInf.sttlmMtd")
    private String sttlmMtd;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].pmtId.endToEndId")
    private String endToEndId;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].pmtId.txId")
    private String pmtIdTxId;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].pmtTpInf.ctgyPurp.prtry")
    private String ctgyPurpPrtry;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].intrBkSttlmAmt.value")
    private Double intrBkSttlmAmtValue;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].intrBkSttlmAmt.@ccy")
    private String intrBkSttlmAmtCcy;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].intrBkSttlmDt")
    private Date intrBkSttlmDt;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].sttlmPrty")
    private String sttlmPrty;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].chrgBr")
    private String chrgBr;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].dbtr.nm")
    private String dbtrNm;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].dbtrAcct.id.othr.id")
    private String dbtrAcctIdOthrId;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].dbtrAcct.id.othr.issr")
    private String dbtrAcctIdOthrIssr;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].dbtrAgt.finInstnId.clrSysMmbId.mmbId")
    private String clrSysMmbIdMmbId;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].dbtrAgt.brnchId.id")
    private String brnchIdId;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].cdtrAgt.finInstnId.clrSysMmbId.mmbId")
    private String clrSysMmbIdMmbId1;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].cdtrAgt.brnchId.id")
    private String brnchIdId1;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].cdtr.nm")
    private String cdtrNm;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].cdtrAcct.id.othr.id")
    private String cdtrAcctIdOthrId;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].cdtrAcct.id.othr.issr")
    private String cdtrAcctIdOthrIssr;
    
    @JaxbMapping(objPath="fiToFICstmrCdtTrf.cdtTrfTxInf[0].purp.prtry")
    private String purpPrtry;
    
    @JaxbMapping(objPath="")
    private java.util.Date ts;
    
    
	
    /** default constructor */
    public Hvps11100101() {
    }
	
	
  /**
   * Returns the uuid
   * 
   * @return the uuid
   */
  @Id
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }	 
     
  /**
   * Sets the uuid
   *
   * @param newUuid the new uuid
   */

    public void  setUuid(String newUuid) {
        uuid = newUuid;
    }	  
  /**
   * Returns the grpHdrMsgId
   * 
   * @return the grpHdrMsgId
   */
    @Column(name = "GRPHDR_MSGID")
    public String getGrpHdrMsgId() {
        return grpHdrMsgId;
    }	 
     
  /**
   * Sets the grpHdrMsgId
   *
   * @param newGrpHdrMsgId the new grpHdrMsgId
   */

    public void  setGrpHdrMsgId(String newGrpHdrMsgId) {
        grpHdrMsgId = newGrpHdrMsgId;
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
   * Returns the sttlmMtd
   * 
   * @return the sttlmMtd
   */
    @Column(name = "STTLMMTD")
    public String getSttlmMtd() {
        return sttlmMtd;
    }	 
     
  /**
   * Sets the sttlmMtd
   *
   * @param newSttlmMtd the new sttlmMtd
   */

    public void  setSttlmMtd(String newSttlmMtd) {
        sttlmMtd = newSttlmMtd;
    }	  
  /**
   * Returns the endToEndId
   * 
   * @return the endToEndId
   */
    @Column(name = "ENDTOENDID")
    public String getEndToEndId() {
        return endToEndId;
    }	 
     
  /**
   * Sets the endToEndId
   *
   * @param newEndToEndId the new endToEndId
   */

    public void  setEndToEndId(String newEndToEndId) {
        endToEndId = newEndToEndId;
    }	  
  /**
   * Returns the pmtIdTxId
   * 
   * @return the pmtIdTxId
   */
    @Column(name = "PMTID_TXID")
    public String getPmtIdTxId() {
        return pmtIdTxId;
    }	 
     
  /**
   * Sets the pmtIdTxId
   *
   * @param newPmtIdTxId the new pmtIdTxId
   */

    public void  setPmtIdTxId(String newPmtIdTxId) {
        pmtIdTxId = newPmtIdTxId;
    }	  
  /**
   * Returns the ctgyPurpPrtry
   * 
   * @return the ctgyPurpPrtry
   */
    @Column(name = "CTGYPURP_PRTRY")
    public String getCtgyPurpPrtry() {
        return ctgyPurpPrtry;
    }	 
     
  /**
   * Sets the ctgyPurpPrtry
   *
   * @param newCtgyPurpPrtry the new ctgyPurpPrtry
   */

    public void  setCtgyPurpPrtry(String newCtgyPurpPrtry) {
        ctgyPurpPrtry = newCtgyPurpPrtry;
    }	  
  /**
   * Returns the intrBkSttlmAmtValue
   * 
   * @return the intrBkSttlmAmtValue
   */
    @Column(name = "INTRBKSTTLMAMT_VALUE")
    public Double getIntrBkSttlmAmtValue() {
        return intrBkSttlmAmtValue;
    }	 
     
  /**
   * Sets the intrBkSttlmAmtValue
   *
   * @param newIntrBkSttlmAmtValue the new intrBkSttlmAmtValue
   */

    public void  setIntrBkSttlmAmtValue(Double newIntrBkSttlmAmtValue) {
        intrBkSttlmAmtValue = newIntrBkSttlmAmtValue;
    }	  
  /**
   * Returns the intrBkSttlmAmtCcy
   * 
   * @return the intrBkSttlmAmtCcy
   */
    @Column(name = "INTRBKSTTLMAMT_CCY")
    public String getIntrBkSttlmAmtCcy() {
        return intrBkSttlmAmtCcy;
    }	 
     
  /**
   * Sets the intrBkSttlmAmtCcy
   *
   * @param newIntrBkSttlmAmtCcy the new intrBkSttlmAmtCcy
   */

    public void  setIntrBkSttlmAmtCcy(String newIntrBkSttlmAmtCcy) {
        intrBkSttlmAmtCcy = newIntrBkSttlmAmtCcy;
    }	  
  /**
   * Returns the intrBkSttlmDt
   * 
   * @return the intrBkSttlmDt
   */
    @Column(name = "INTRBKSTTLMDT")
    public Date getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }	 
     
  /**
   * Sets the intrBkSttlmDt
   *
   * @param newIntrBkSttlmDt the new intrBkSttlmDt
   */

    public void  setIntrBkSttlmDt(Date newIntrBkSttlmDt) {
        intrBkSttlmDt = newIntrBkSttlmDt;
    }	  
  /**
   * Returns the sttlmPrty
   * 
   * @return the sttlmPrty
   */
    @Column(name = "STTLMPRTY")
    public String getSttlmPrty() {
        return sttlmPrty;
    }	 
     
  /**
   * Sets the sttlmPrty
   *
   * @param newSttlmPrty the new sttlmPrty
   */

    public void  setSttlmPrty(String newSttlmPrty) {
        sttlmPrty = newSttlmPrty;
    }	  
  /**
   * Returns the chrgBr
   * 
   * @return the chrgBr
   */
    @Column(name = "CHRGBR")
    public String getChrgBr() {
        return chrgBr;
    }	 
     
  /**
   * Sets the chrgBr
   *
   * @param newChrgBr the new chrgBr
   */

    public void  setChrgBr(String newChrgBr) {
        chrgBr = newChrgBr;
    }	  
  /**
   * Returns the dbtrNm
   * 
   * @return the dbtrNm
   */
    @Column(name = "DBTR_NM")
    public String getDbtrNm() {
        return dbtrNm;
    }	 
     
  /**
   * Sets the dbtrNm
   *
   * @param newDbtrNm the new dbtrNm
   */

    public void  setDbtrNm(String newDbtrNm) {
        dbtrNm = newDbtrNm;
    }	  
  /**
   * Returns the dbtrAcctIdOthrId
   * 
   * @return the dbtrAcctIdOthrId
   */
    @Column(name = "DBTRACCT_ID_OTHR_ID")
    public String getDbtrAcctIdOthrId() {
        return dbtrAcctIdOthrId;
    }	 
     
  /**
   * Sets the dbtrAcctIdOthrId
   *
   * @param newDbtrAcctIdOthrId the new dbtrAcctIdOthrId
   */

    public void  setDbtrAcctIdOthrId(String newDbtrAcctIdOthrId) {
        dbtrAcctIdOthrId = newDbtrAcctIdOthrId;
    }	  
  /**
   * Returns the dbtrAcctIdOthrIssr
   * 
   * @return the dbtrAcctIdOthrIssr
   */
    @Column(name = "DBTRACCT_ID_OTHR_ISSR")
    public String getDbtrAcctIdOthrIssr() {
        return dbtrAcctIdOthrIssr;
    }	 
     
  /**
   * Sets the dbtrAcctIdOthrIssr
   *
   * @param newDbtrAcctIdOthrIssr the new dbtrAcctIdOthrIssr
   */

    public void  setDbtrAcctIdOthrIssr(String newDbtrAcctIdOthrIssr) {
        dbtrAcctIdOthrIssr = newDbtrAcctIdOthrIssr;
    }	  
  /**
   * Returns the clrSysMmbIdMmbId
   * 
   * @return the clrSysMmbIdMmbId
   */
    @Column(name = "CLRSYSMMBID_MMBID")
    public String getClrSysMmbIdMmbId() {
        return clrSysMmbIdMmbId;
    }	 
     
  /**
   * Sets the clrSysMmbIdMmbId
   *
   * @param newClrSysMmbIdMmbId the new clrSysMmbIdMmbId
   */

    public void  setClrSysMmbIdMmbId(String newClrSysMmbIdMmbId) {
        clrSysMmbIdMmbId = newClrSysMmbIdMmbId;
    }	  
  /**
   * Returns the brnchIdId
   * 
   * @return the brnchIdId
   */
    @Column(name = "BRNCHID_ID")
    public String getBrnchIdId() {
        return brnchIdId;
    }	 
     
  /**
   * Sets the brnchIdId
   *
   * @param newBrnchIdId the new brnchIdId
   */

    public void  setBrnchIdId(String newBrnchIdId) {
        brnchIdId = newBrnchIdId;
    }	  
  /**
   * Returns the clrSysMmbIdMmbId1
   * 
   * @return the clrSysMmbIdMmbId1
   */
    @Column(name = "CLRSYSMMBID_MMBID1")
    public String getClrSysMmbIdMmbId1() {
        return clrSysMmbIdMmbId1;
    }	 
     
  /**
   * Sets the clrSysMmbIdMmbId1
   *
   * @param newClrSysMmbIdMmbId1 the new clrSysMmbIdMmbId1
   */

    public void  setClrSysMmbIdMmbId1(String newClrSysMmbIdMmbId1) {
        clrSysMmbIdMmbId1 = newClrSysMmbIdMmbId1;
    }	  
  /**
   * Returns the brnchIdId1
   * 
   * @return the brnchIdId1
   */
    @Column(name = "BRNCHID_ID1")
    public String getBrnchIdId1() {
        return brnchIdId1;
    }	 
     
  /**
   * Sets the brnchIdId1
   *
   * @param newBrnchIdId1 the new brnchIdId1
   */

    public void  setBrnchIdId1(String newBrnchIdId1) {
        brnchIdId1 = newBrnchIdId1;
    }	  
  /**
   * Returns the cdtrNm
   * 
   * @return the cdtrNm
   */
    @Column(name = "CDTR_NM")
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
   * Returns the cdtrAcctIdOthrId
   * 
   * @return the cdtrAcctIdOthrId
   */
    @Column(name = "CDTRACCT_ID_OTHR_ID")
    public String getCdtrAcctIdOthrId() {
        return cdtrAcctIdOthrId;
    }	 
     
  /**
   * Sets the cdtrAcctIdOthrId
   *
   * @param newCdtrAcctIdOthrId the new cdtrAcctIdOthrId
   */

    public void  setCdtrAcctIdOthrId(String newCdtrAcctIdOthrId) {
        cdtrAcctIdOthrId = newCdtrAcctIdOthrId;
    }	  
  /**
   * Returns the cdtrAcctIdOthrIssr
   * 
   * @return the cdtrAcctIdOthrIssr
   */
    @Column(name = "CDTRACCT_ID_OTHR_ISSR")
    public String getCdtrAcctIdOthrIssr() {
        return cdtrAcctIdOthrIssr;
    }	 
     
  /**
   * Sets the cdtrAcctIdOthrIssr
   *
   * @param newCdtrAcctIdOthrIssr the new cdtrAcctIdOthrIssr
   */

    public void  setCdtrAcctIdOthrIssr(String newCdtrAcctIdOthrIssr) {
        cdtrAcctIdOthrIssr = newCdtrAcctIdOthrIssr;
    }	  
  /**
   * Returns the purpPrtry
   * 
   * @return the purpPrtry
   */
    @Column(name = "PURP_PRTRY")
    public String getPurpPrtry() {
        return purpPrtry;
    }	 
     
  /**
   * Sets the purpPrtry
   *
   * @param newPurpPrtry the new purpPrtry
   */

    public void  setPurpPrtry(String newPurpPrtry) {
        purpPrtry = newPurpPrtry;
    }	  
  /**
   * Returns the ts
   * 
   * @return the ts
   */
    @Column(name = "TS")
    public java.util.Date getTs() {
        return ts;
    }	 
     
  /**
   * Sets the ts
   *
   * @param newTs the new ts
   */

    public void  setTs(java.util.Date newTs) {
        ts = newTs;
    }	  
    
    
}    
    
