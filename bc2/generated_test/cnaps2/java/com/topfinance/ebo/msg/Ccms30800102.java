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
 * Ccms30800102 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_CCMS_308")
public class Ccms30800102  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.grpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.grpHdr.instgAgt.finInstnId.othr.id")
    private String senPId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.grpHdr.instdAgt.finInstnId.othr.id")
    private String recPId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.orgnlGrpInfAndSts.orgnlMsgId")
    private String orgnlMsgId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.orgnlGrpInfAndSts.orgnlMsgNmId")
    private String orgnlMsgNmId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.orgnlGrpInfAndSts.stsRsnInf.addtlInf[0]")
    private String prcCd;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.orgnlGrpInfAndSts.stsRsnInf.addtlInf[0]")
    private String nPCPrc;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.stsId")
    private String stsId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.orgnlInstrId")
    private String orgnlInstrId;
    
    @JaxbMapping(objPath="fiToFiPmtStsRpt.txInfAndSts.clrSysRef")
    private Date clrSysRef;
    
    
	
    /** default constructor */
    public Ccms30800102() {
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
   * Returns the senPId
   * 
   * @return the senPId
   */
    @Column(name = "SENPID")
    public String getSenPId() {
        return senPId;
    }	 
     
  /**
   * Sets the senPId
   *
   * @param newSenPId the new senPId
   */

    public void  setSenPId(String newSenPId) {
        senPId = newSenPId;
    }	  
  /**
   * Returns the recPId
   * 
   * @return the recPId
   */
    @Column(name = "RECPID")
    public String getRecPId() {
        return recPId;
    }	 
     
  /**
   * Sets the recPId
   *
   * @param newRecPId the new recPId
   */

    public void  setRecPId(String newRecPId) {
        recPId = newRecPId;
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
   * Returns the prcCd
   * 
   * @return the prcCd
   */
    @Column(name = "PRCCD")
    public String getPrcCd() {
        return prcCd;
    }	 
     
  /**
   * Sets the prcCd
   *
   * @param newPrcCd the new prcCd
   */

    public void  setPrcCd(String newPrcCd) {
        prcCd = newPrcCd;
    }	  
  /**
   * Returns the nPCPrc
   * 
   * @return the nPCPrc
   */
    @Column(name = "NPCPRC")
    public String getNPCPrc() {
        return nPCPrc;
    }	 
     
  /**
   * Sets the nPCPrc
   *
   * @param newNPCPrc the new nPCPrc
   */

    public void  setNPCPrc(String newNPCPrc) {
        nPCPrc = newNPCPrc;
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
   * Returns the clrSysRef
   * 
   * @return the clrSysRef
   */
    @Column(name = "CLRSYSREF")
    public Date getClrSysRef() {
        return clrSysRef;
    }	 
     
  /**
   * Sets the clrSysRef
   *
   * @param newClrSysRef the new clrSysRef
   */

    public void  setClrSysRef(Date newClrSysRef) {
        clrSysRef = newClrSysRef;
    }	  
    
    
}    
    
