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
 * Beps38100101PmtInf generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_MSG_BEPS_381_001_01___PmtInf")
public class Beps38100101PmtInf  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].pmtInfId")
    private String pmtInfId;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].pmtMtd")
    private String pmtMtd;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].pmtTpInf.lclInstrm.prtry")
    private String prtryTpCd;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].reqdExctnDt")
    private Date reqdExctnDt;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].dbtr.nm")
    private String dbtrNm;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].dbtrAcct.id.othr.id")
    private String dbtrAcctId;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].dbtrAcct.id.othr.issr")
    private String dbtrAcctIssr;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].dbtrAgt.fInInstnId.clrSysMmbId.mmbId")
    private String dbtrClrSysMmbId;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].dbtrAgt.brnchId.id")
    private String dbtrAgtBrnchId;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf.pmtId.endToEndId")
    private String endToEndId;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf.pmtTpInf.lclInstrm.prtry")
    private String prtry;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf.pmtTpInf.ctgyPurp.prtry")
    private String lclInstrm;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf.amt.instdAmt.value")
    private Double instdAmt;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf.cdtrAgt.fInInstnId.clrSysMmbId.mmbId")
    private String cdtrClrSysMmbId;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf.cdtrAgt.brnchId.id")
    private String cdtrAgtBrnchId;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf.cdtr.nm")
    private String cdtrNm;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf.cdtrAcct.id.othr.id")
    private String cdtrAcctId;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf.cdtrAcct.id.othr.issr")
    private String cdtrAcctIssr;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf.rmtInf.ustrd[0]")
    private String ustrdAddInfo;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf.rmtInf.ustrd[0]")
    private String ustrdCtractId;
    
    @JaxbMapping(objPath="cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf.rmtInf.ustrd[0]")
    private String ustrdCheckId;
    
    
	
    /** default constructor */
    public Beps38100101PmtInf() {
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
   * Returns the pmtInfId
   * 
   * @return the pmtInfId
   */
    @Column(name = "PMTINFID")
    public String getPmtInfId() {
        return pmtInfId;
    }	 
     
  /**
   * Sets the pmtInfId
   *
   * @param newPmtInfId the new pmtInfId
   */

    public void  setPmtInfId(String newPmtInfId) {
        pmtInfId = newPmtInfId;
    }	  
  /**
   * Returns the pmtMtd
   * 
   * @return the pmtMtd
   */
    @Column(name = "PMTMTD")
    public String getPmtMtd() {
        return pmtMtd;
    }	 
     
  /**
   * Sets the pmtMtd
   *
   * @param newPmtMtd the new pmtMtd
   */

    public void  setPmtMtd(String newPmtMtd) {
        pmtMtd = newPmtMtd;
    }	  
  /**
   * Returns the prtryTpCd
   * 
   * @return the prtryTpCd
   */
    @Column(name = "PRTRYTPCD")
    public String getPrtryTpCd() {
        return prtryTpCd;
    }	 
     
  /**
   * Sets the prtryTpCd
   *
   * @param newPrtryTpCd the new prtryTpCd
   */

    public void  setPrtryTpCd(String newPrtryTpCd) {
        prtryTpCd = newPrtryTpCd;
    }	  
  /**
   * Returns the reqdExctnDt
   * 
   * @return the reqdExctnDt
   */
    @Column(name = "REQDEXCTNDT")
    public Date getReqdExctnDt() {
        return reqdExctnDt;
    }	 
     
  /**
   * Sets the reqdExctnDt
   *
   * @param newReqdExctnDt the new reqdExctnDt
   */

    public void  setReqdExctnDt(Date newReqdExctnDt) {
        reqdExctnDt = newReqdExctnDt;
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
   * Returns the lclInstrm
   * 
   * @return the lclInstrm
   */
    @Column(name = "LCLINSTRM")
    public String getLclInstrm() {
        return lclInstrm;
    }	 
     
  /**
   * Sets the lclInstrm
   *
   * @param newLclInstrm the new lclInstrm
   */

    public void  setLclInstrm(String newLclInstrm) {
        lclInstrm = newLclInstrm;
    }	  
  /**
   * Returns the instdAmt
   * 
   * @return the instdAmt
   */
    @Column(name = "INSTDAMT")
    public Double getInstdAmt() {
        return instdAmt;
    }	 
     
  /**
   * Sets the instdAmt
   *
   * @param newInstdAmt the new instdAmt
   */

    public void  setInstdAmt(Double newInstdAmt) {
        instdAmt = newInstdAmt;
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
   * Returns the ustrdAddInfo
   * 
   * @return the ustrdAddInfo
   */
    @Column(name = "USTRDADDINFO")
    public String getUstrdAddInfo() {
        return ustrdAddInfo;
    }	 
     
  /**
   * Sets the ustrdAddInfo
   *
   * @param newUstrdAddInfo the new ustrdAddInfo
   */

    public void  setUstrdAddInfo(String newUstrdAddInfo) {
        ustrdAddInfo = newUstrdAddInfo;
    }	  
  /**
   * Returns the ustrdCtractId
   * 
   * @return the ustrdCtractId
   */
    @Column(name = "USTRDCTRACTID")
    public String getUstrdCtractId() {
        return ustrdCtractId;
    }	 
     
  /**
   * Sets the ustrdCtractId
   *
   * @param newUstrdCtractId the new ustrdCtractId
   */

    public void  setUstrdCtractId(String newUstrdCtractId) {
        ustrdCtractId = newUstrdCtractId;
    }	  
  /**
   * Returns the ustrdCheckId
   * 
   * @return the ustrdCheckId
   */
    @Column(name = "USTRDCHECKID")
    public String getUstrdCheckId() {
        return ustrdCheckId;
    }	 
     
  /**
   * Sets the ustrdCheckId
   *
   * @param newUstrdCheckId the new ustrdCheckId
   */

    public void  setUstrdCheckId(String newUstrdCheckId) {
        ustrdCheckId = newUstrdCheckId;
    }	  
    
    
}    
    
