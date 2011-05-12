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
 * Nets35100101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_NETS_351")
public class Nets35100101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.grpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.grpHdr.instgPty.instgDrctPty")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.grpHdr.instgPty.instgPty")
    private String instgIndrctPty;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.grpHdr.instdPty.instdDrctPty")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.grpHdr.instdPty.instdPty")
    private String instdIndrctPty;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.grpHdr.sysCd")
    private String sysCd;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.grpHdr.rmk")
    private String rmk;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.orgnlGrpHdr.orgnlMsgId")
    private String orgnlMsgId;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.orgnlGrpHdr.orgnlInstgPty")
    private String orgnlInstgDrctPty;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.orgnlGrpHdr.orgnlMT")
    private String orgnlMT;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.npcPrcInf.prcSts")
    private String prcSts;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.npcPrcInf.prcCd")
    private String prcCd;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.npcPrcInf.rjctInf")
    private String rjctInf;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.npcPrcInf.netgDt")
    private Date netgDt;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.npcPrcInf.netgRnd")
    private String netgRnd;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.npcPrcInf.sttlmDt")
    private Date sttlmDt;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.npcPrcInf.rcvTm")
    private Date rcvTm;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.npcPrcInf.trnsmtTm")
    private Date trnsmtTm;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.netDbtLmtInf.mmbId")
    private String mmbId;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.netDbtLmtInf.cdtLd.value")
    private Double cdtLd;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.netDbtLmtInf.ttlPldgVal.value")
    private Double ttlPldgVal;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.netDbtLmtInf.cdtXtnsnLmt.value")
    private Double cdtXtnsnLmt;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.netDbtLmtInf.netDbtLmt.value")
    private Double netDbtLmt;
    
    @JaxbMapping(objPath="netDbtLmtQryRspn.netDbtLmtInf.avlblNetDbt.value")
    private Double avlblNetDbt;
    
    
	
    /** default constructor */
    public Nets35100101() {
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
    public Date getNetgDt() {
        return netgDt;
    }	 
     
  /**
   * Sets the netgDt
   *
   * @param newNetgDt the new netgDt
   */

    public void  setNetgDt(Date newNetgDt) {
        netgDt = newNetgDt;
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
   * Returns the sttlmDt
   * 
   * @return the sttlmDt
   */
    @Column(name = "STTLMDT")
    public Date getSttlmDt() {
        return sttlmDt;
    }	 
     
  /**
   * Sets the sttlmDt
   *
   * @param newSttlmDt the new sttlmDt
   */

    public void  setSttlmDt(Date newSttlmDt) {
        sttlmDt = newSttlmDt;
    }	  
  /**
   * Returns the rcvTm
   * 
   * @return the rcvTm
   */
    @Column(name = "RCVTM")
    public Date getRcvTm() {
        return rcvTm;
    }	 
     
  /**
   * Sets the rcvTm
   *
   * @param newRcvTm the new rcvTm
   */

    public void  setRcvTm(Date newRcvTm) {
        rcvTm = newRcvTm;
    }	  
  /**
   * Returns the trnsmtTm
   * 
   * @return the trnsmtTm
   */
    @Column(name = "TRNSMTTM")
    public Date getTrnsmtTm() {
        return trnsmtTm;
    }	 
     
  /**
   * Sets the trnsmtTm
   *
   * @param newTrnsmtTm the new trnsmtTm
   */

    public void  setTrnsmtTm(Date newTrnsmtTm) {
        trnsmtTm = newTrnsmtTm;
    }	  
  /**
   * Returns the mmbId
   * 
   * @return the mmbId
   */
    @Column(name = "MMBID")
    public String getMmbId() {
        return mmbId;
    }	 
     
  /**
   * Sets the mmbId
   *
   * @param newMmbId the new mmbId
   */

    public void  setMmbId(String newMmbId) {
        mmbId = newMmbId;
    }	  
  /**
   * Returns the cdtLd
   * 
   * @return the cdtLd
   */
    @Column(name = "CDTLD")
    public Double getCdtLd() {
        return cdtLd;
    }	 
     
  /**
   * Sets the cdtLd
   *
   * @param newCdtLd the new cdtLd
   */

    public void  setCdtLd(Double newCdtLd) {
        cdtLd = newCdtLd;
    }	  
  /**
   * Returns the ttlPldgVal
   * 
   * @return the ttlPldgVal
   */
    @Column(name = "TTLPLDGVAL")
    public Double getTtlPldgVal() {
        return ttlPldgVal;
    }	 
     
  /**
   * Sets the ttlPldgVal
   *
   * @param newTtlPldgVal the new ttlPldgVal
   */

    public void  setTtlPldgVal(Double newTtlPldgVal) {
        ttlPldgVal = newTtlPldgVal;
    }	  
  /**
   * Returns the cdtXtnsnLmt
   * 
   * @return the cdtXtnsnLmt
   */
    @Column(name = "CDTXTNSNLMT")
    public Double getCdtXtnsnLmt() {
        return cdtXtnsnLmt;
    }	 
     
  /**
   * Sets the cdtXtnsnLmt
   *
   * @param newCdtXtnsnLmt the new cdtXtnsnLmt
   */

    public void  setCdtXtnsnLmt(Double newCdtXtnsnLmt) {
        cdtXtnsnLmt = newCdtXtnsnLmt;
    }	  
  /**
   * Returns the netDbtLmt
   * 
   * @return the netDbtLmt
   */
    @Column(name = "NETDBTLMT")
    public Double getNetDbtLmt() {
        return netDbtLmt;
    }	 
     
  /**
   * Sets the netDbtLmt
   *
   * @param newNetDbtLmt the new netDbtLmt
   */

    public void  setNetDbtLmt(Double newNetDbtLmt) {
        netDbtLmt = newNetDbtLmt;
    }	  
  /**
   * Returns the avlblNetDbt
   * 
   * @return the avlblNetDbt
   */
    @Column(name = "AVLBLNETDBT")
    public Double getAvlblNetDbt() {
        return avlblNetDbt;
    }	 
     
  /**
   * Sets the avlblNetDbt
   *
   * @param newAvlblNetDbt the new avlblNetDbt
   */

    public void  setAvlblNetDbt(Double newAvlblNetDbt) {
        avlblNetDbt = newAvlblNetDbt;
    }	  
    
    
}    
    