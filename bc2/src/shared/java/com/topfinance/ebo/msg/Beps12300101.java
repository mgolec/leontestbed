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
 * Beps12300101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_BEPS_123")
public class Beps12300101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.grpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.grpHdr.nbOfTxs")
    private String nbOfTxs;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.grpHdr.ctrlSum")
    private Double ctrlSum;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.grpHdr.sttlmInf.sttlmMtd")
    private String settlementMethod;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.pmtId.endToEndId")
    private String endToEndId;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.pmtId.txId")
    private String txId;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.pmtTpInf.ctgyPurp.prtry")
    private String prtry;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.intrBkSttlmAmt.value")
    private Double intrBkSttlmAmt;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.chrgBr")
    private String chargeBearer;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.dbtr.nm")
    private String dbtrNm;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.dbtrAcct.id.othr.id")
    private String dbtrAcctId;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.dbtrAcct.id.othr.issr")
    private String dbtrAcctIssr;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.dbtrAgt.finInstnId.clrSysMmbId.mmbId")
    private String dbtrClrSysMmbId;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.dbtrAgt.brnchId.id")
    private String dbtrAgtBrnchId;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.cdtrAgt.finInstnId.clrSysMmbId.mmbId")
    private String cdtrClrSysMmbId;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.cdtrAgt.brnchId.id")
    private String cdtrAgtBrnchId;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.cdtr.nm")
    private String cdtrNm;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.cdtrAcct.id.othr.id")
    private String cdtrAcctId;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.cdtrAcct.id.othr.issr")
    private String cdtrAcctIssr;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.purp.prtry")
    private String bizCd;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.rmtInf.ustrd[0]")
    private String addInfo;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.rmtInf.ustrd[0]")
    private String rmk;
    
    @JaxbMapping(objPath="fiToFiCstmrCdtTrf.cdtTrfTxInf.rmtInf.strd[0]")
    private String strd;
    
    
	
    /** default constructor */
    public Beps12300101() {
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
   * Returns the settlementMethod
   * 
   * @return the settlementMethod
   */
    @Column(name = "STTLMMTD")
    public String getSettlementMethod() {
        return settlementMethod;
    }	 
     
  /**
   * Sets the settlementMethod
   *
   * @param newSettlementMethod the new settlementMethod
   */

    public void  setSettlementMethod(String newSettlementMethod) {
        settlementMethod = newSettlementMethod;
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
   * Returns the txId
   * 
   * @return the txId
   */
    @Column(name = "TXID")
    public String getTxId() {
        return txId;
    }	 
     
  /**
   * Sets the txId
   *
   * @param newTxId the new txId
   */

    public void  setTxId(String newTxId) {
        txId = newTxId;
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
   * Returns the chargeBearer
   * 
   * @return the chargeBearer
   */
    @Column(name = "CHRGBR")
    public String getChargeBearer() {
        return chargeBearer;
    }	 
     
  /**
   * Sets the chargeBearer
   *
   * @param newChargeBearer the new chargeBearer
   */

    public void  setChargeBearer(String newChargeBearer) {
        chargeBearer = newChargeBearer;
    }	  
  /**
   * Returns the dbtrNm
   * 
   * @return the dbtrNm
   */
    @Column(name = "DBTRNM")
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
   * Returns the dbtrAcctId
   * 
   * @return the dbtrAcctId
   */
    @Column(name = "DBTRACCTID")
    public String getDbtrAcctId() {
        return dbtrAcctId;
    }	 
     
  /**
   * Sets the dbtrAcctId
   *
   * @param newDbtrAcctId the new dbtrAcctId
   */

    public void  setDbtrAcctId(String newDbtrAcctId) {
        dbtrAcctId = newDbtrAcctId;
    }	  
  /**
   * Returns the dbtrAcctIssr
   * 
   * @return the dbtrAcctIssr
   */
    @Column(name = "DBTRACCTISSR")
    public String getDbtrAcctIssr() {
        return dbtrAcctIssr;
    }	 
     
  /**
   * Sets the dbtrAcctIssr
   *
   * @param newDbtrAcctIssr the new dbtrAcctIssr
   */

    public void  setDbtrAcctIssr(String newDbtrAcctIssr) {
        dbtrAcctIssr = newDbtrAcctIssr;
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
   * Returns the bizCd
   * 
   * @return the bizCd
   */
    @Column(name = "BIZCD")
    public String getBizCd() {
        return bizCd;
    }	 
     
  /**
   * Sets the bizCd
   *
   * @param newBizCd the new bizCd
   */

    public void  setBizCd(String newBizCd) {
        bizCd = newBizCd;
    }	  
  /**
   * Returns the addInfo
   * 
   * @return the addInfo
   */
    @Column(name = "ADDINFO")
    public String getAddInfo() {
        return addInfo;
    }	 
     
  /**
   * Sets the addInfo
   *
   * @param newAddInfo the new addInfo
   */

    public void  setAddInfo(String newAddInfo) {
        addInfo = newAddInfo;
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
   * Returns the strd
   * 
   * @return the strd
   */
    @Column(name = "STRD")
    public String getStrd() {
        return strd;
    }	 
     
  /**
   * Sets the strd
   *
   * @param newStrd the new strd
   */

    public void  setStrd(String newStrd) {
        strd = newStrd;
    }	  
    
    
}    
    
