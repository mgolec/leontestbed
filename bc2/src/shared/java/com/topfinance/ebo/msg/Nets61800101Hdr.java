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
 * Nets61800101Hdr generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_NETS_618_HDR")
public class Nets61800101Hdr  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="bepsNetgRspn.bepsNetgRspnInf.txList[0]")
    private java.util.Set<Nets61800101> txList;
    
    @JaxbMapping(objPath="bepsNetgRspn.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="bepsNetgRspn.grpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="bepsNetgRspn.grpHdr.instgPty.instgDrctPty")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="bepsNetgRspn.grpHdr.instgPty.instgPty")
    private String instgIndrctPty;
    
    @JaxbMapping(objPath="bepsNetgRspn.grpHdr.instdPty.instdDrctPty")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="bepsNetgRspn.grpHdr.instdPty.instdPty")
    private String instdIndrctPty;
    
    @JaxbMapping(objPath="bepsNetgRspn.grpHdr.sysCd")
    private String sysCd;
    
    @JaxbMapping(objPath="bepsNetgRspn.grpHdr.rmk")
    private String rmk;
    
    @JaxbMapping(objPath="bepsNetgRspn.prttn.ttlNb")
    private String ttlNb;
    
    @JaxbMapping(objPath="bepsNetgRspn.prttn.startNb")
    private String startNb;
    
    @JaxbMapping(objPath="bepsNetgRspn.prttn.endNb")
    private String endNb;
    
    @JaxbMapping(objPath="bepsNetgRspn.orgnlGrpHdr.orgnlMsgId")
    private String orgnlMsgId;
    
    @JaxbMapping(objPath="bepsNetgRspn.orgnlGrpHdr.orgnlInstgPty")
    private String orgnlInstgDrctPty;
    
    @JaxbMapping(objPath="bepsNetgRspn.orgnlGrpHdr.orgnlMT")
    private String orgnlMT;
    
    @JaxbMapping(objPath="bepsNetgRspn.npcPrcInf.prcSts")
    private String nPCPrcSts;
    
    @JaxbMapping(objPath="bepsNetgRspn.npcPrcInf.prcCd")
    private String nPCPrcCd;
    
    @JaxbMapping(objPath="bepsNetgRspn.npcPrcInf.rjctInf")
    private String nPCRjctInf;
    
    @JaxbMapping(objPath="bepsNetgRspn.npcPrcInf.netgDt")
    private Date nPCNetgDt;
    
    @JaxbMapping(objPath="bepsNetgRspn.npcPrcInf.netgRnd")
    private String nPCNetgRnd;
    
    @JaxbMapping(objPath="bepsNetgRspn.npcPrcInf.sttlmDt")
    private Date nPCSttlmDt;
    
    @JaxbMapping(objPath="bepsNetgRspn.npcPrcInf.rcvTm")
    private Date nPCRcvTm;
    
    @JaxbMapping(objPath="bepsNetgRspn.npcPrcInf.trnsmtTm")
    private Date nPCTrnsmtTm;
    
    @JaxbMapping(objPath="bepsNetgRspn.bepsNetgRspnInf.netgDt")
    private Date resNetgDt;
    
    @JaxbMapping(objPath="bepsNetgRspn.bepsNetgRspnInf.nbOfTx")
    private String nbOfTx;
    
    
	
    /** default constructor */
    public Nets61800101Hdr() {
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
   * Returns the txList
   * 
   * @return the txList
   */
  	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL, mappedBy = "fid")
    public java.util.Set<Nets61800101> getTxList() {
        return txList;
    }	 
     
  /**
   * Sets the txList
   *
   * @param newTxList the new txList
   */

    public void  setTxList(java.util.Set<Nets61800101> newTxList) {
        txList = newTxList;
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
   * Returns the instgIndrctPty
   * 
   * @return the instgIndrctPty
   */
    @Column(name = "INSTGINDRCTPTY")
    public String getInstgIndrctPty() {
        return instgIndrctPty;
    }	 
     
  /**
   * Sets the instgIndrctPty
   *
   * @param newInstgIndrctPty the new instgIndrctPty
   */

    public void  setInstgIndrctPty(String newInstgIndrctPty) {
        instgIndrctPty = newInstgIndrctPty;
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
   * Returns the instdIndrctPty
   * 
   * @return the instdIndrctPty
   */
    @Column(name = "INSTDINDRCTPTY")
    public String getInstdIndrctPty() {
        return instdIndrctPty;
    }	 
     
  /**
   * Sets the instdIndrctPty
   *
   * @param newInstdIndrctPty the new instdIndrctPty
   */

    public void  setInstdIndrctPty(String newInstdIndrctPty) {
        instdIndrctPty = newInstdIndrctPty;
    }	  
  /**
   * Returns the sysCd
   * 
   * @return the sysCd
   */
    @Column(name = "SYSCD")
    public String getSysCd() {
        return sysCd;
    }	 
     
  /**
   * Sets the sysCd
   *
   * @param newSysCd the new sysCd
   */

    public void  setSysCd(String newSysCd) {
        sysCd = newSysCd;
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
   * Returns the ttlNb
   * 
   * @return the ttlNb
   */
    @Column(name = "TTLNB")
    public String getTtlNb() {
        return ttlNb;
    }	 
     
  /**
   * Sets the ttlNb
   *
   * @param newTtlNb the new ttlNb
   */

    public void  setTtlNb(String newTtlNb) {
        ttlNb = newTtlNb;
    }	  
  /**
   * Returns the startNb
   * 
   * @return the startNb
   */
    @Column(name = "STARTNB")
    public String getStartNb() {
        return startNb;
    }	 
     
  /**
   * Sets the startNb
   *
   * @param newStartNb the new startNb
   */

    public void  setStartNb(String newStartNb) {
        startNb = newStartNb;
    }	  
  /**
   * Returns the endNb
   * 
   * @return the endNb
   */
    @Column(name = "ENDNB")
    public String getEndNb() {
        return endNb;
    }	 
     
  /**
   * Sets the endNb
   *
   * @param newEndNb the new endNb
   */

    public void  setEndNb(String newEndNb) {
        endNb = newEndNb;
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
  /**
   * Returns the nPCPrcSts
   * 
   * @return the nPCPrcSts
   */
    @Column(name = "NPCPRCSTS")
    public String getNPCPrcSts() {
        return nPCPrcSts;
    }	 
     
  /**
   * Sets the nPCPrcSts
   *
   * @param newNPCPrcSts the new nPCPrcSts
   */

    public void  setNPCPrcSts(String newNPCPrcSts) {
        nPCPrcSts = newNPCPrcSts;
    }	  
  /**
   * Returns the nPCPrcCd
   * 
   * @return the nPCPrcCd
   */
    @Column(name = "NPCPRCCD")
    public String getNPCPrcCd() {
        return nPCPrcCd;
    }	 
     
  /**
   * Sets the nPCPrcCd
   *
   * @param newNPCPrcCd the new nPCPrcCd
   */

    public void  setNPCPrcCd(String newNPCPrcCd) {
        nPCPrcCd = newNPCPrcCd;
    }	  
  /**
   * Returns the nPCRjctInf
   * 
   * @return the nPCRjctInf
   */
    @Column(name = "NPCRJCTINF")
    public String getNPCRjctInf() {
        return nPCRjctInf;
    }	 
     
  /**
   * Sets the nPCRjctInf
   *
   * @param newNPCRjctInf the new nPCRjctInf
   */

    public void  setNPCRjctInf(String newNPCRjctInf) {
        nPCRjctInf = newNPCRjctInf;
    }	  
  /**
   * Returns the nPCNetgDt
   * 
   * @return the nPCNetgDt
   */
    @Column(name = "NPCNETGDT")
    public Date getNPCNetgDt() {
        return nPCNetgDt;
    }	 
     
  /**
   * Sets the nPCNetgDt
   *
   * @param newNPCNetgDt the new nPCNetgDt
   */

    public void  setNPCNetgDt(Date newNPCNetgDt) {
        nPCNetgDt = newNPCNetgDt;
    }	  
  /**
   * Returns the nPCNetgRnd
   * 
   * @return the nPCNetgRnd
   */
    @Column(name = "NPCNETGRND")
    public String getNPCNetgRnd() {
        return nPCNetgRnd;
    }	 
     
  /**
   * Sets the nPCNetgRnd
   *
   * @param newNPCNetgRnd the new nPCNetgRnd
   */

    public void  setNPCNetgRnd(String newNPCNetgRnd) {
        nPCNetgRnd = newNPCNetgRnd;
    }	  
  /**
   * Returns the nPCSttlmDt
   * 
   * @return the nPCSttlmDt
   */
    @Column(name = "NPCSTTLMDT")
    public Date getNPCSttlmDt() {
        return nPCSttlmDt;
    }	 
     
  /**
   * Sets the nPCSttlmDt
   *
   * @param newNPCSttlmDt the new nPCSttlmDt
   */

    public void  setNPCSttlmDt(Date newNPCSttlmDt) {
        nPCSttlmDt = newNPCSttlmDt;
    }	  
  /**
   * Returns the nPCRcvTm
   * 
   * @return the nPCRcvTm
   */
    @Column(name = "NPCRCVTM")
    public Date getNPCRcvTm() {
        return nPCRcvTm;
    }	 
     
  /**
   * Sets the nPCRcvTm
   *
   * @param newNPCRcvTm the new nPCRcvTm
   */

    public void  setNPCRcvTm(Date newNPCRcvTm) {
        nPCRcvTm = newNPCRcvTm;
    }	  
  /**
   * Returns the nPCTrnsmtTm
   * 
   * @return the nPCTrnsmtTm
   */
    @Column(name = "NPCTRNSMTTM")
    public Date getNPCTrnsmtTm() {
        return nPCTrnsmtTm;
    }	 
     
  /**
   * Sets the nPCTrnsmtTm
   *
   * @param newNPCTrnsmtTm the new nPCTrnsmtTm
   */

    public void  setNPCTrnsmtTm(Date newNPCTrnsmtTm) {
        nPCTrnsmtTm = newNPCTrnsmtTm;
    }	  
  /**
   * Returns the resNetgDt
   * 
   * @return the resNetgDt
   */
    @Column(name = "RESNETGDT")
    public Date getResNetgDt() {
        return resNetgDt;
    }	 
     
  /**
   * Sets the resNetgDt
   *
   * @param newResNetgDt the new resNetgDt
   */

    public void  setResNetgDt(Date newResNetgDt) {
        resNetgDt = newResNetgDt;
    }	  
  /**
   * Returns the nbOfTx
   * 
   * @return the nbOfTx
   */
    @Column(name = "NBOFTX")
    public String getNbOfTx() {
        return nbOfTx;
    }	 
     
  /**
   * Sets the nbOfTx
   *
   * @param newNbOfTx the new nbOfTx
   */

    public void  setNbOfTx(String newNbOfTx) {
        nbOfTx = newNbOfTx;
    }	  
    
    
}    
    
