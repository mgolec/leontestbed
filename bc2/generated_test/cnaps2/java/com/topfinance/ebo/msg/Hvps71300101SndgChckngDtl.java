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
 * Hvps71300101SndgChckngDtl generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_MSG_HVPS_713_001_01___SndgChckngDtl")
public class Hvps71300101SndgChckngDtl  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="dtlRspn.dtlRspnInf.dtls[0].chckngDtlOfSndg[0].orgnlGrpHdr.orgnlMsgId")
    private String bizSenOrgnlMsgId;
    
    @JaxbMapping(objPath="dtlRspn.dtlRspnInf.dtls[0].chckngDtlOfSndg[0].orgnlGrpHdr.orgnlInstgPty")
    private String bizSenOrgnlInstgDrctPty;
    
    @JaxbMapping(objPath="dtlRspn.dtlRspnInf.dtls[0].chckngDtlOfSndg[0].orgnlGrpHdr.orgnlMT")
    private String bizSenOrgnlMT;
    
    @JaxbMapping(objPath="dtlRspn.dtlRspnInf.dtls[0].chckngDtlOfSndg[0].amt.value")
    private Double bizSenAmt;
    
    @JaxbMapping(objPath="dtlRspn.dtlRspnInf.dtls[0].chckngDtlOfSndg[0].prcSts")
    private String bizSenPrcSts;
    
    
	
    /** default constructor */
    public Hvps71300101SndgChckngDtl() {
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
   * Returns the bizSenOrgnlMsgId
   * 
   * @return the bizSenOrgnlMsgId
   */
    @Column(name = "BIZSENORGNLMSGID")
    public String getBizSenOrgnlMsgId() {
        return bizSenOrgnlMsgId;
    }	 
     
  /**
   * Sets the bizSenOrgnlMsgId
   *
   * @param newBizSenOrgnlMsgId the new bizSenOrgnlMsgId
   */

    public void  setBizSenOrgnlMsgId(String newBizSenOrgnlMsgId) {
        bizSenOrgnlMsgId = newBizSenOrgnlMsgId;
    }	  
  /**
   * Returns the bizSenOrgnlInstgDrctPty
   * 
   * @return the bizSenOrgnlInstgDrctPty
   */
    @Column(name = "BIZSENORGNLINSTGDRCTPTY")
    public String getBizSenOrgnlInstgDrctPty() {
        return bizSenOrgnlInstgDrctPty;
    }	 
     
  /**
   * Sets the bizSenOrgnlInstgDrctPty
   *
   * @param newBizSenOrgnlInstgDrctPty the new bizSenOrgnlInstgDrctPty
   */

    public void  setBizSenOrgnlInstgDrctPty(String newBizSenOrgnlInstgDrctPty) {
        bizSenOrgnlInstgDrctPty = newBizSenOrgnlInstgDrctPty;
    }	  
  /**
   * Returns the bizSenOrgnlMT
   * 
   * @return the bizSenOrgnlMT
   */
    @Column(name = "BIZSENORGNLMT")
    public String getBizSenOrgnlMT() {
        return bizSenOrgnlMT;
    }	 
     
  /**
   * Sets the bizSenOrgnlMT
   *
   * @param newBizSenOrgnlMT the new bizSenOrgnlMT
   */

    public void  setBizSenOrgnlMT(String newBizSenOrgnlMT) {
        bizSenOrgnlMT = newBizSenOrgnlMT;
    }	  
  /**
   * Returns the bizSenAmt
   * 
   * @return the bizSenAmt
   */
    @Column(name = "BIZSENAMT")
    public Double getBizSenAmt() {
        return bizSenAmt;
    }	 
     
  /**
   * Sets the bizSenAmt
   *
   * @param newBizSenAmt the new bizSenAmt
   */

    public void  setBizSenAmt(Double newBizSenAmt) {
        bizSenAmt = newBizSenAmt;
    }	  
  /**
   * Returns the bizSenPrcSts
   * 
   * @return the bizSenPrcSts
   */
    @Column(name = "BIZSENPRCSTS")
    public String getBizSenPrcSts() {
        return bizSenPrcSts;
    }	 
     
  /**
   * Sets the bizSenPrcSts
   *
   * @param newBizSenPrcSts the new bizSenPrcSts
   */

    public void  setBizSenPrcSts(String newBizSenPrcSts) {
        bizSenPrcSts = newBizSenPrcSts;
    }	  
    
    
}    
    