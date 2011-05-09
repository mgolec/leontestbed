package com.topfinance.ebo.msg;

import com.topfinance.ebo.msg.JaxbMapping;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Hvps71500101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_HVPS_715")
public class Hvps71500101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="txDwnldgRspn.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="txDwnldgRspn.grpHdr.creDtTm")
    private String creDtTm;
    
    @JaxbMapping(objPath="txDwnldgRspn.grpHdr.instgPty.instgDrctPty")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="txDwnldgRspn.grpHdr.instgPty.instgPty")
    private String instgIndrctPty;
    
    @JaxbMapping(objPath="txDwnldgRspn.grpHdr.instdPty.instdDrctPty")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="txDwnldgRspn.grpHdr.instdPty.instdPty")
    private String instdIndrctPty;
    
    @JaxbMapping(objPath="txDwnldgRspn.grpHdr.sysCd")
    private String sysCd;
    
    @JaxbMapping(objPath="txDwnldgRspn.grpHdr.rmk")
    private String rmk;
    
    @JaxbMapping(objPath="txDwnldgRspn.orgnlGrpHdr.orgnlMsgId")
    private String orgnlMsgId;
    
    @JaxbMapping(objPath="txDwnldgRspn.orgnlGrpHdr.orgnlInstgPty")
    private String orgnlInstgDrctPty;
    
    @JaxbMapping(objPath="txDwnldgRspn.orgnlGrpHdr.orgnlMT")
    private String orgnlMT;
    
    @JaxbMapping(objPath="txDwnldgRspn.txDwnldgRspnInf.npcPrcInf.prcSts")
    private String nPCPrcSts;
    
    @JaxbMapping(objPath="txDwnldgRspn.txDwnldgRspnInf.npcPrcInf.prcCd")
    private String nPCPrcCd;
    
    @JaxbMapping(objPath="txDwnldgRspn.txDwnldgRspnInf.npcPrcInf.rjctInf")
    private String nPCRjctInf;
    
    @JaxbMapping(objPath="txDwnldgRspn.txDwnldgRspnInf.npcPrcInf.netgDt")
    private String nPCNetgDt;
    
    @JaxbMapping(objPath="txDwnldgRspn.txDwnldgRspnInf.npcPrcInf.netgRnd")
    private String nPCNetgRnd;
    
    @JaxbMapping(objPath="txDwnldgRspn.txDwnldgRspnInf.npcPrcInf.sttlmDt")
    private String nPCSttlmDt;
    
    @JaxbMapping(objPath="txDwnldgRspn.txDwnldgRspnInf.npcPrcInf.rcvTm")
    private String nPCRcvTm;
    
    @JaxbMapping(objPath="txDwnldgRspn.txDwnldgRspnInf.npcPrcInf.trnsmtTm")
    private String nPCTrnsmtTm;
    
    @JaxbMapping(objPath="txDwnldgRspn.txDwnldgRspnInf.orgnlMsgCntt.cntt")
    private String cntt;
    
    @JaxbMapping(objPath="txDwnldgRspn.txDwnldgRspnInf.orgnlMsgCntt.prcSts")
    private String prcSts;
    
    
	
    /** default constructor */
    public Hvps71500101() {
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
    public String getCreDtTm() {
        return creDtTm;
    }	 
     
  /**
   * Sets the creDtTm
   *
   * @param newCreDtTm the new creDtTm
   */

    public void  setCreDtTm(String newCreDtTm) {
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
    public String getNPCNetgDt() {
        return nPCNetgDt;
    }	 
     
  /**
   * Sets the nPCNetgDt
   *
   * @param newNPCNetgDt the new nPCNetgDt
   */

    public void  setNPCNetgDt(String newNPCNetgDt) {
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
    public String getNPCSttlmDt() {
        return nPCSttlmDt;
    }	 
     
  /**
   * Sets the nPCSttlmDt
   *
   * @param newNPCSttlmDt the new nPCSttlmDt
   */

    public void  setNPCSttlmDt(String newNPCSttlmDt) {
        nPCSttlmDt = newNPCSttlmDt;
    }	  
  /**
   * Returns the nPCRcvTm
   * 
   * @return the nPCRcvTm
   */
    @Column(name = "NPCRCVTM")
    public String getNPCRcvTm() {
        return nPCRcvTm;
    }	 
     
  /**
   * Sets the nPCRcvTm
   *
   * @param newNPCRcvTm the new nPCRcvTm
   */

    public void  setNPCRcvTm(String newNPCRcvTm) {
        nPCRcvTm = newNPCRcvTm;
    }	  
  /**
   * Returns the nPCTrnsmtTm
   * 
   * @return the nPCTrnsmtTm
   */
    @Column(name = "NPCTRNSMTTM")
    public String getNPCTrnsmtTm() {
        return nPCTrnsmtTm;
    }	 
     
  /**
   * Sets the nPCTrnsmtTm
   *
   * @param newNPCTrnsmtTm the new nPCTrnsmtTm
   */

    public void  setNPCTrnsmtTm(String newNPCTrnsmtTm) {
        nPCTrnsmtTm = newNPCTrnsmtTm;
    }	  
  /**
   * Returns the cntt
   * 
   * @return the cntt
   */
    @Column(name = "CNTT")
    public String getCntt() {
        return cntt;
    }	 
     
  /**
   * Sets the cntt
   *
   * @param newCntt the new cntt
   */

    public void  setCntt(String newCntt) {
        cntt = newCntt;
    }	  
  /**
   * Returns the prcSts
   * 
   * @return the prcSts
   */
    @Column(name = "PRCSTS")
    public String getPrcSts() {
        return prcSts;
    }	 
     
  /**
   * Sets the prcSts
   *
   * @param newPrcSts the new prcSts
   */

    public void  setPrcSts(String newPrcSts) {
        prcSts = newPrcSts;
    }	  
    
    
}    
    
