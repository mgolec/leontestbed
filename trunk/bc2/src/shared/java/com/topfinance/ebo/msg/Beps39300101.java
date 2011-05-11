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
 * Beps39300101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_BEPS_393")
public class Beps39300101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="getTx.msgId.id")
    private String msgId;
    
    @JaxbMapping(objPath="getTx.txQryDef.txCrit.newCrit.schCrit.pmtSch.txRef[0]")
    private String senDerPId;
    
    @JaxbMapping(objPath="getTx.txQryDef.txCrit.newCrit.schCrit.pmtSch.txRef[1]")
    private String senInDerPId;
    
    @JaxbMapping(objPath="getTx.txQryDef.txCrit.newCrit.schCrit.pmtSch.txRef[2]")
    private String recDerPId;
    
    @JaxbMapping(objPath="getTx.txQryDef.txCrit.newCrit.schCrit.pmtSch.txRef[3]")
    private String bizTp;
    
    @JaxbMapping(objPath="getTx.txQryDef.txCrit.newCrit.schCrit.pmtSch.txRef[4]")
    private String fees;
    
    @JaxbMapping(objPath="getTx.txQryDef.txCrit.newCrit.schCrit.pmtSch.txRef[5]")
    private String enterpriseMark;
    
    @JaxbMapping(objPath="getTx.txQryDef.txCrit.newCrit.schCrit.pmtSch.txRef[6]")
    private String customMark;
    
    
	
    /** default constructor */
    public Beps39300101() {
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
   * Returns the senDerPId
   * 
   * @return the senDerPId
   */
    @Column(name = "SENDERPID")
    public String getSenDerPId() {
        return senDerPId;
    }	 
     
  /**
   * Sets the senDerPId
   *
   * @param newSenDerPId the new senDerPId
   */

    public void  setSenDerPId(String newSenDerPId) {
        senDerPId = newSenDerPId;
    }	  
  /**
   * Returns the senInDerPId
   * 
   * @return the senInDerPId
   */
    @Column(name = "SENINDERPID")
    public String getSenInDerPId() {
        return senInDerPId;
    }	 
     
  /**
   * Sets the senInDerPId
   *
   * @param newSenInDerPId the new senInDerPId
   */

    public void  setSenInDerPId(String newSenInDerPId) {
        senInDerPId = newSenInDerPId;
    }	  
  /**
   * Returns the recDerPId
   * 
   * @return the recDerPId
   */
    @Column(name = "RECDERPID")
    public String getRecDerPId() {
        return recDerPId;
    }	 
     
  /**
   * Sets the recDerPId
   *
   * @param newRecDerPId the new recDerPId
   */

    public void  setRecDerPId(String newRecDerPId) {
        recDerPId = newRecDerPId;
    }	  
  /**
   * Returns the bizTp
   * 
   * @return the bizTp
   */
    @Column(name = "BIZTP")
    public String getBizTp() {
        return bizTp;
    }	 
     
  /**
   * Sets the bizTp
   *
   * @param newBizTp the new bizTp
   */

    public void  setBizTp(String newBizTp) {
        bizTp = newBizTp;
    }	  
  /**
   * Returns the fees
   * 
   * @return the fees
   */
    @Column(name = "FEES")
    public String getFees() {
        return fees;
    }	 
     
  /**
   * Sets the fees
   *
   * @param newFees the new fees
   */

    public void  setFees(String newFees) {
        fees = newFees;
    }	  
  /**
   * Returns the enterpriseMark
   * 
   * @return the enterpriseMark
   */
    @Column(name = "ENTERPRISEMARK")
    public String getEnterpriseMark() {
        return enterpriseMark;
    }	 
     
  /**
   * Sets the enterpriseMark
   *
   * @param newEnterpriseMark the new enterpriseMark
   */

    public void  setEnterpriseMark(String newEnterpriseMark) {
        enterpriseMark = newEnterpriseMark;
    }	  
  /**
   * Returns the customMark
   * 
   * @return the customMark
   */
    @Column(name = "CUSTOMMARK")
    public String getCustomMark() {
        return customMark;
    }	 
     
  /**
   * Sets the customMark
   *
   * @param newCustomMark the new customMark
   */

    public void  setCustomMark(String newCustomMark) {
        customMark = newCustomMark;
    }	  
    
    
}    
    