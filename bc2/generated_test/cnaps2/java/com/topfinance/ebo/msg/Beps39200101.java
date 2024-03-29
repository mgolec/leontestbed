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
 * Beps39200101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_MSG_BEPS_392_001_01__")
public class Beps39200101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.grpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.grpHdr.initgPty.nm")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.grpHdr.fwdgAgt.finInstnId.clrSysMmbId.mmbId")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.orgnlGrpInfAndSts.orgnlMsgId")
    private String orgnlMsgId;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.orgnlGrpInfAndSts.orgnlMsgNmId")
    private String orgnlMsgNmId;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.orgnlPmtInfAndSts.txInfAndSts[0].stsId")
    private String stsId;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.orgnlPmtInfAndSts.txInfAndSts[0].orgnlInstrId")
    private String orgnlPmtInfId;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.orgnlPmtInfAndSts.txInfAndSts[0].stsRsnInf.rsn.prtry")
    private String rejCd;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.orgnlPmtInfAndSts.txInfAndSts[0].stsRsnInf.addtlInf")
    private String orgnlInstrId;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.orgnlPmtInfAndSts.txInfAndSts[0].orgnlTxRef.intrBkSttlmAmt.value")
    private Double intrBkSttlmAmt;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.orgnlPmtInfAndSts.txInfAndSts[0].orgnlTxRef.pmtTpInf.ctgyPurp.prtry")
    private String orgnlTpCd;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.orgnlPmtInfAndSts.txInfAndSts[0].orgnlTxRef.rmtInf.ustrd")
    private String ustrdAddinfo;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.orgnlPmtInfAndSts.txInfAndSts[0].orgnlTxRef.dbtrAgt.finInstnId.clrSysMmbId.mmbId")
    private String dbtrClrSysMmbId;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.orgnlPmtInfAndSts.txInfAndSts[0].orgnlTxRef.dbtrAgt.brnchId.id")
    private String dbtrAgtBrnchId;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.orgnlPmtInfAndSts.txInfAndSts[0].orgnlTxRef.cdtrAgt.finInstnId.clrSysMmbId.mmbId")
    private String cdtrClrSysMmbId;
    
    @JaxbMapping(objPath="cstmrPmtStsRpt.orgnlPmtInfAndSts.txInfAndSts[0].orgnlTxRef.cdtrAgt.brnchId.id")
    private String cdtrAgtBrnchId;
    
    
	
    /** default constructor */
    public Beps39200101() {
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
   * Returns the orgnlPmtInfId
   * 
   * @return the orgnlPmtInfId
   */
    @Column(name = "ORGNLPMTINFID")
    public String getOrgnlPmtInfId() {
        return orgnlPmtInfId;
    }	 
     
  /**
   * Sets the orgnlPmtInfId
   *
   * @param newOrgnlPmtInfId the new orgnlPmtInfId
   */

    public void  setOrgnlPmtInfId(String newOrgnlPmtInfId) {
        orgnlPmtInfId = newOrgnlPmtInfId;
    }	  
  /**
   * Returns the rejCd
   * 
   * @return the rejCd
   */
    @Column(name = "REJCD")
    public String getRejCd() {
        return rejCd;
    }	 
     
  /**
   * Sets the rejCd
   *
   * @param newRejCd the new rejCd
   */

    public void  setRejCd(String newRejCd) {
        rejCd = newRejCd;
    }	  
  /**
   * Returns the orgnlInstrId
   * 
   * @return the orgnlInstrId
   */
    @Column(name = "ORGNLINSTRID")
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }	 
     
  /**
   * Sets the orgnlInstrId
   *
   * @param newOrgnlInstrId the new orgnlInstrId
   */

    public void  setOrgnlInstrId(String newOrgnlInstrId) {
        orgnlInstrId = newOrgnlInstrId;
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
   * Returns the orgnlTpCd
   * 
   * @return the orgnlTpCd
   */
    @Column(name = "ORGNLTPCD")
    public String getOrgnlTpCd() {
        return orgnlTpCd;
    }	 
     
  /**
   * Sets the orgnlTpCd
   *
   * @param newOrgnlTpCd the new orgnlTpCd
   */

    public void  setOrgnlTpCd(String newOrgnlTpCd) {
        orgnlTpCd = newOrgnlTpCd;
    }	  
  /**
   * Returns the ustrdAddinfo
   * 
   * @return the ustrdAddinfo
   */
    @Column(name = "USTRDADDINFO")
    public String getUstrdAddinfo() {
        return ustrdAddinfo;
    }	 
     
  /**
   * Sets the ustrdAddinfo
   *
   * @param newUstrdAddinfo the new ustrdAddinfo
   */

    public void  setUstrdAddinfo(String newUstrdAddinfo) {
        ustrdAddinfo = newUstrdAddinfo;
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
    
