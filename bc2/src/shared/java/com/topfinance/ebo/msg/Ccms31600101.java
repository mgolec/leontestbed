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
 * Ccms31600101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_CCMS_316")
public class Ccms31600101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="getTx.msgId.id")
    private String msgId;
    
    @JaxbMapping(objPath="getTx.txQryDef.txCrit.newCrit.schCrit.pmtSch.instrRef[0]")
    private String orgnlMsgId;
    
    @JaxbMapping(objPath="getTx.txQryDef.txCrit.newCrit.schCrit.pmtSch.instrRef[0]")
    private String orgnlInstgDrctPty;
    
    @JaxbMapping(objPath="getTx.txQryDef.txCrit.newCrit.schCrit.pmtSch.instrRef[0]")
    private String orgnlMT;
    
    
	
    /** default constructor */
    public Ccms31600101() {
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
    
    
}    
    
