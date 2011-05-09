package com.topfinance.ebo.msg;

import com.topfinance.ebo.msg.JaxbMapping;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Saps60600101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_SAPS_606")
public class Saps60600101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="acctBookgNtfctn.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="acctBookgNtfctn.grpHdr.creDtTm")
    private String creDtTm;
    
    @JaxbMapping(objPath="acctBookgNtfctn.grpHdr.instgPty.instgDrctPty")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="acctBookgNtfctn.grpHdr.instgPty.instgPty")
    private String instgIndrctPty;
    
    @JaxbMapping(objPath="acctBookgNtfctn.grpHdr.instdPty.instdDrctPty")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="acctBookgNtfctn.grpHdr.instdPty.instdPty")
    private String instdIndrctPty;
    
    @JaxbMapping(objPath="acctBookgNtfctn.grpHdr.sysCd")
    private String sysCd;
    
    @JaxbMapping(objPath="acctBookgNtfctn.grpHdr.rmk")
    private String rmk;
    
    @JaxbMapping(objPath="acctBookgNtfctn.orgnlGrpHdr.orgnlMsgId")
    private String orgnlMsgId;
    
    @JaxbMapping(objPath="acctBookgNtfctn.orgnlGrpHdr.orgnlInstgPty")
    private String orgnlInstgDrctPty;
    
    @JaxbMapping(objPath="acctBookgNtfctn.orgnlGrpHdr.orgnlMT")
    private String orgnlMT;
    
    @JaxbMapping(objPath="acctBookgNtfctn.npcPrcInf.prcSts")
    private String prcSts;
    
    @JaxbMapping(objPath="acctBookgNtfctn.npcPrcInf.prcCd")
    private String prcCd;
    
    @JaxbMapping(objPath="acctBookgNtfctn.npcPrcInf.rjctInf")
    private String rjctInf;
    
    @JaxbMapping(objPath="acctBookgNtfctn.npcPrcInf.netgDt")
    private String netgDt;
    
    @JaxbMapping(objPath="acctBookgNtfctn.npcPrcInf.netgRnd")
    private String npcNetgRnd;
    
    @JaxbMapping(objPath="acctBookgNtfctn.npcPrcInf.sttlmDt")
    private String sttlmDt;
    
    @JaxbMapping(objPath="acctBookgNtfctn.npcPrcInf.rcvTm")
    private String rcvTm;
    
    @JaxbMapping(objPath="acctBookgNtfctn.npcPrcInf.trnsmtTm")
    private String trnsmtTm;
    
    @JaxbMapping(objPath="acctBookgNtfctn.acctBookgNtfctnInf.txTp")
    private String txTp;
    
    @JaxbMapping(objPath="acctBookgNtfctn.acctBookgNtfctnInf.ctgyPurpCd")
    private String ctgyPurpCd;
    
    @JaxbMapping(objPath="acctBookgNtfctn.acctBookgNtfctnInf.netgRnd")
    private String netgRnd;
    
    @JaxbMapping(objPath="acctBookgNtfctn.acctBookgNtfctnInf.dbtCdtId")
    private String dbtCdtId;
    
    @JaxbMapping(objPath="acctBookgNtfctn.acctBookgNtfctnInf.amt")
    private String amt;
    
    @JaxbMapping(objPath="acctBookgNtfctn.acctBookgNtfctnInf.bal")
    private String bal;
    
    
	
    /** default constructor */
    public Saps60600101() {
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
   * Returns the rjctInf
   * 
   * @return the rjctInf
   */
    @Column(name = "RJCTINF")
    public String getRjctInf() {
        return rjctInf;
    }	 
     
  /**
   * Sets the rjctInf
   *
   * @param newRjctInf the new rjctInf
   */

    public void  setRjctInf(String newRjctInf) {
        rjctInf = newRjctInf;
    }	  
  /**
   * Returns the netgDt
   * 
   * @return the netgDt
   */
    @Column(name = "NETGDT")
    public String getNetgDt() {
        return netgDt;
    }	 
     
  /**
   * Sets the netgDt
   *
   * @param newNetgDt the new netgDt
   */

    public void  setNetgDt(String newNetgDt) {
        netgDt = newNetgDt;
    }	  
  /**
   * Returns the npcNetgRnd
   * 
   * @return the npcNetgRnd
   */
    @Column(name = "NPCNETGRND")
    public String getNpcNetgRnd() {
        return npcNetgRnd;
    }	 
     
  /**
   * Sets the npcNetgRnd
   *
   * @param newNpcNetgRnd the new npcNetgRnd
   */

    public void  setNpcNetgRnd(String newNpcNetgRnd) {
        npcNetgRnd = newNpcNetgRnd;
    }	  
  /**
   * Returns the sttlmDt
   * 
   * @return the sttlmDt
   */
    @Column(name = "STTLMDT")
    public String getSttlmDt() {
        return sttlmDt;
    }	 
     
  /**
   * Sets the sttlmDt
   *
   * @param newSttlmDt the new sttlmDt
   */

    public void  setSttlmDt(String newSttlmDt) {
        sttlmDt = newSttlmDt;
    }	  
  /**
   * Returns the rcvTm
   * 
   * @return the rcvTm
   */
    @Column(name = "RCVTM")
    public String getRcvTm() {
        return rcvTm;
    }	 
     
  /**
   * Sets the rcvTm
   *
   * @param newRcvTm the new rcvTm
   */

    public void  setRcvTm(String newRcvTm) {
        rcvTm = newRcvTm;
    }	  
  /**
   * Returns the trnsmtTm
   * 
   * @return the trnsmtTm
   */
    @Column(name = "TRNSMTTM")
    public String getTrnsmtTm() {
        return trnsmtTm;
    }	 
     
  /**
   * Sets the trnsmtTm
   *
   * @param newTrnsmtTm the new trnsmtTm
   */

    public void  setTrnsmtTm(String newTrnsmtTm) {
        trnsmtTm = newTrnsmtTm;
    }	  
  /**
   * Returns the txTp
   * 
   * @return the txTp
   */
    @Column(name = "TXTP")
    public String getTxTp() {
        return txTp;
    }	 
     
  /**
   * Sets the txTp
   *
   * @param newTxTp the new txTp
   */

    public void  setTxTp(String newTxTp) {
        txTp = newTxTp;
    }	  
  /**
   * Returns the ctgyPurpCd
   * 
   * @return the ctgyPurpCd
   */
    @Column(name = "CTGYPURPCD")
    public String getCtgyPurpCd() {
        return ctgyPurpCd;
    }	 
     
  /**
   * Sets the ctgyPurpCd
   *
   * @param newCtgyPurpCd the new ctgyPurpCd
   */

    public void  setCtgyPurpCd(String newCtgyPurpCd) {
        ctgyPurpCd = newCtgyPurpCd;
    }	  
  /**
   * Returns the netgRnd
   * 
   * @return the netgRnd
   */
    @Column(name = "NETGRND")
    public String getNetgRnd() {
        return netgRnd;
    }	 
     
  /**
   * Sets the netgRnd
   *
   * @param newNetgRnd the new netgRnd
   */

    public void  setNetgRnd(String newNetgRnd) {
        netgRnd = newNetgRnd;
    }	  
  /**
   * Returns the dbtCdtId
   * 
   * @return the dbtCdtId
   */
    @Column(name = "DBTCDTID")
    public String getDbtCdtId() {
        return dbtCdtId;
    }	 
     
  /**
   * Sets the dbtCdtId
   *
   * @param newDbtCdtId the new dbtCdtId
   */

    public void  setDbtCdtId(String newDbtCdtId) {
        dbtCdtId = newDbtCdtId;
    }	  
  /**
   * Returns the amt
   * 
   * @return the amt
   */
    @Column(name = "AMT")
    public String getAmt() {
        return amt;
    }	 
     
  /**
   * Sets the amt
   *
   * @param newAmt the new amt
   */

    public void  setAmt(String newAmt) {
        amt = newAmt;
    }	  
  /**
   * Returns the bal
   * 
   * @return the bal
   */
    @Column(name = "BAL")
    public String getBal() {
        return bal;
    }	 
     
  /**
   * Sets the bal
   *
   * @param newBal the new bal
   */

    public void  setBal(String newBal) {
        bal = newBal;
    }	  
    
    
}    
    