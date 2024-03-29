package com.topfinance.ebo.msg;

import com.topfinance.ebo.msg.JaxbMapping;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Ccms99100101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_CCMS_991")
public class Ccms99100101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="chckReq.chckInf.sndNd")
    private String sndNd;
    
    @JaxbMapping(objPath="chckReq.chckInf.sndSvcrNm")
    private String sndSvcrNm;
    
    @JaxbMapping(objPath="chckReq.chckInf.sndLineMgrNm")
    private String sndLineMgrNm;
    
    @JaxbMapping(objPath="chckReq.chckInf.sndRoadNm")
    private String sndRoadNm;
    
    @JaxbMapping(objPath="chckReq.chckInf.sndDt")
    private String sndDt;
    
    @JaxbMapping(objPath="chckReq.chckInf.rcvNd")
    private String rcvNd;
    
    @JaxbMapping(objPath="chckReq.chckInf.rcvSvcrNm")
    private String rcvSvcrNm;
    
    @JaxbMapping(objPath="chckReq.chckInf.rcvLineMgr")
    private String rcvLineMgr;
    
    @JaxbMapping(objPath="chckReq.chckInf.rspnLineNm")
    private String rspnLineNm;
    
    @JaxbMapping(objPath="chckReq.sndSvcrMgmtInf.sndSvcrRcvSts")
    private String sndSvcrRcvSts;
    
    @JaxbMapping(objPath="chckReq.sndSvcrMgmtInf.sndNdMgmtSts")
    private String sndNdMgmtSts;
    
    @JaxbMapping(objPath="chckReq.sndSvcrMgmtInf.rcvNdMgmtSts")
    private String rcvNdMgmtSts;
    
    
	
    /** default constructor */
    public Ccms99100101() {
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
   * Returns the sndNd
   * 
   * @return the sndNd
   */
    @Column(name = "SNDND")
    public String getSndNd() {
        return sndNd;
    }	 
     
  /**
   * Sets the sndNd
   *
   * @param newSndNd the new sndNd
   */

    public void  setSndNd(String newSndNd) {
        sndNd = newSndNd;
    }	  
  /**
   * Returns the sndSvcrNm
   * 
   * @return the sndSvcrNm
   */
    @Column(name = "SNDSVCRNM")
    public String getSndSvcrNm() {
        return sndSvcrNm;
    }	 
     
  /**
   * Sets the sndSvcrNm
   *
   * @param newSndSvcrNm the new sndSvcrNm
   */

    public void  setSndSvcrNm(String newSndSvcrNm) {
        sndSvcrNm = newSndSvcrNm;
    }	  
  /**
   * Returns the sndLineMgrNm
   * 
   * @return the sndLineMgrNm
   */
    @Column(name = "SNDLINEMGRNM")
    public String getSndLineMgrNm() {
        return sndLineMgrNm;
    }	 
     
  /**
   * Sets the sndLineMgrNm
   *
   * @param newSndLineMgrNm the new sndLineMgrNm
   */

    public void  setSndLineMgrNm(String newSndLineMgrNm) {
        sndLineMgrNm = newSndLineMgrNm;
    }	  
  /**
   * Returns the sndRoadNm
   * 
   * @return the sndRoadNm
   */
    @Column(name = "SNDROADNM")
    public String getSndRoadNm() {
        return sndRoadNm;
    }	 
     
  /**
   * Sets the sndRoadNm
   *
   * @param newSndRoadNm the new sndRoadNm
   */

    public void  setSndRoadNm(String newSndRoadNm) {
        sndRoadNm = newSndRoadNm;
    }	  
  /**
   * Returns the sndDt
   * 
   * @return the sndDt
   */
    @Column(name = "SNDDT")
    public String getSndDt() {
        return sndDt;
    }	 
     
  /**
   * Sets the sndDt
   *
   * @param newSndDt the new sndDt
   */

    public void  setSndDt(String newSndDt) {
        sndDt = newSndDt;
    }	  
  /**
   * Returns the rcvNd
   * 
   * @return the rcvNd
   */
    @Column(name = "RCVND")
    public String getRcvNd() {
        return rcvNd;
    }	 
     
  /**
   * Sets the rcvNd
   *
   * @param newRcvNd the new rcvNd
   */

    public void  setRcvNd(String newRcvNd) {
        rcvNd = newRcvNd;
    }	  
  /**
   * Returns the rcvSvcrNm
   * 
   * @return the rcvSvcrNm
   */
    @Column(name = "RCVSVCRNM")
    public String getRcvSvcrNm() {
        return rcvSvcrNm;
    }	 
     
  /**
   * Sets the rcvSvcrNm
   *
   * @param newRcvSvcrNm the new rcvSvcrNm
   */

    public void  setRcvSvcrNm(String newRcvSvcrNm) {
        rcvSvcrNm = newRcvSvcrNm;
    }	  
  /**
   * Returns the rcvLineMgr
   * 
   * @return the rcvLineMgr
   */
    @Column(name = "RCVLINEMGR")
    public String getRcvLineMgr() {
        return rcvLineMgr;
    }	 
     
  /**
   * Sets the rcvLineMgr
   *
   * @param newRcvLineMgr the new rcvLineMgr
   */

    public void  setRcvLineMgr(String newRcvLineMgr) {
        rcvLineMgr = newRcvLineMgr;
    }	  
  /**
   * Returns the rspnLineNm
   * 
   * @return the rspnLineNm
   */
    @Column(name = "RSPNLINENM")
    public String getRspnLineNm() {
        return rspnLineNm;
    }	 
     
  /**
   * Sets the rspnLineNm
   *
   * @param newRspnLineNm the new rspnLineNm
   */

    public void  setRspnLineNm(String newRspnLineNm) {
        rspnLineNm = newRspnLineNm;
    }	  
  /**
   * Returns the sndSvcrRcvSts
   * 
   * @return the sndSvcrRcvSts
   */
    @Column(name = "SNDSVCRRCVSTS")
    public String getSndSvcrRcvSts() {
        return sndSvcrRcvSts;
    }	 
     
  /**
   * Sets the sndSvcrRcvSts
   *
   * @param newSndSvcrRcvSts the new sndSvcrRcvSts
   */

    public void  setSndSvcrRcvSts(String newSndSvcrRcvSts) {
        sndSvcrRcvSts = newSndSvcrRcvSts;
    }	  
  /**
   * Returns the sndNdMgmtSts
   * 
   * @return the sndNdMgmtSts
   */
    @Column(name = "SNDNDMGMTSTS")
    public String getSndNdMgmtSts() {
        return sndNdMgmtSts;
    }	 
     
  /**
   * Sets the sndNdMgmtSts
   *
   * @param newSndNdMgmtSts the new sndNdMgmtSts
   */

    public void  setSndNdMgmtSts(String newSndNdMgmtSts) {
        sndNdMgmtSts = newSndNdMgmtSts;
    }	  
  /**
   * Returns the rcvNdMgmtSts
   * 
   * @return the rcvNdMgmtSts
   */
    @Column(name = "RCVNDMGMTSTS")
    public String getRcvNdMgmtSts() {
        return rcvNdMgmtSts;
    }	 
     
  /**
   * Sets the rcvNdMgmtSts
   *
   * @param newRcvNdMgmtSts the new rcvNdMgmtSts
   */

    public void  setRcvNdMgmtSts(String newRcvNdMgmtSts) {
        rcvNdMgmtSts = newRcvNdMgmtSts;
    }	  
    
    
}    
    
