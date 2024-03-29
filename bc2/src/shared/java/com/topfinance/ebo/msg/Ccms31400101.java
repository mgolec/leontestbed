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
 * Ccms31400101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_CCMS_314")
public class Ccms31400101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="bizQry.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="bizQry.grpHdr.creDtTm")
    private Date creDtTm;
    
    @JaxbMapping(objPath="bizQry.grpHdr.instgPty.instgDrctPty")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="bizQry.grpHdr.instgPty.instgPty")
    private String instgIndrctPty;
    
    @JaxbMapping(objPath="bizQry.grpHdr.instdPty.instdDrctPty")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="bizQry.grpHdr.instdPty.instdPty")
    private String instdIndrctPty;
    
    @JaxbMapping(objPath="bizQry.grpHdr.sysCd")
    private String sysCd;
    
    @JaxbMapping(objPath="bizQry.grpHdr.rmk")
    private String rmk;
    
    @JaxbMapping(objPath="bizQry.bizQryInf.qryTp")
    private String qryTp;
    
    @JaxbMapping(objPath="bizQry.bizQryInf.orgnlInf.orgnlGrpHdr.orgnlMsgId")
    private String orgnlMsgId;
    
    @JaxbMapping(objPath="bizQry.bizQryInf.orgnlInf.orgnlGrpHdr.orgnlInstgPty")
    private String orgnlInstgDrctPty;
    
    @JaxbMapping(objPath="bizQry.bizQryInf.orgnlInf.orgnlGrpHdr.orgnlMsgTp")
    private String orgnlMT;
    
    @JaxbMapping(objPath="bizQry.bizQryInf.orgnlInf.orgnlTx.instgIndrctPty")
    private String orgnlInstgIndrctPty;
    
    @JaxbMapping(objPath="bizQry.bizQryInf.orgnlInf.orgnlTx.instdIndrctPty")
    private String orgnlInstdIndrctPty;
    
    @JaxbMapping(objPath="bizQry.bizQryInf.orgnlInf.orgnlTx.orgnlTxId")
    private String orgnlTxId;
    
    @JaxbMapping(objPath="bizQry.bizQryInf.orgnlInf.orgnlTx.orgnlTxTpCd")
    private String orgnlTxTpCd;
    
    @JaxbMapping(objPath="bizQry.bizQryInf.orgnlInf.amt")
    private Double amt;
    
    @JaxbMapping(objPath="bizQry.bizQryInf.cntt")
    private String cntt;
    
    
	
    /** default constructor */
    public Ccms31400101() {
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
   * Returns the qryTp
   * 
   * @return the qryTp
   */
    @Column(name = "QRYTP")
    public String getQryTp() {
        return qryTp;
    }	 
     
  /**
   * Sets the qryTp
   *
   * @param newQryTp the new qryTp
   */

    public void  setQryTp(String newQryTp) {
        qryTp = newQryTp;
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
   * Returns the orgnlInstgIndrctPty
   * 
   * @return the orgnlInstgIndrctPty
   */
    @Column(name = "ORGNLINSTGINDRCTPTY")
    public String getOrgnlInstgIndrctPty() {
        return orgnlInstgIndrctPty;
    }	 
     
  /**
   * Sets the orgnlInstgIndrctPty
   *
   * @param newOrgnlInstgIndrctPty the new orgnlInstgIndrctPty
   */

    public void  setOrgnlInstgIndrctPty(String newOrgnlInstgIndrctPty) {
        orgnlInstgIndrctPty = newOrgnlInstgIndrctPty;
    }	  
  /**
   * Returns the orgnlInstdIndrctPty
   * 
   * @return the orgnlInstdIndrctPty
   */
    @Column(name = "ORGNLINSTDINDRCTPTY")
    public String getOrgnlInstdIndrctPty() {
        return orgnlInstdIndrctPty;
    }	 
     
  /**
   * Sets the orgnlInstdIndrctPty
   *
   * @param newOrgnlInstdIndrctPty the new orgnlInstdIndrctPty
   */

    public void  setOrgnlInstdIndrctPty(String newOrgnlInstdIndrctPty) {
        orgnlInstdIndrctPty = newOrgnlInstdIndrctPty;
    }	  
  /**
   * Returns the orgnlTxId
   * 
   * @return the orgnlTxId
   */
    @Column(name = "ORGNLTXID")
    public String getOrgnlTxId() {
        return orgnlTxId;
    }	 
     
  /**
   * Sets the orgnlTxId
   *
   * @param newOrgnlTxId the new orgnlTxId
   */

    public void  setOrgnlTxId(String newOrgnlTxId) {
        orgnlTxId = newOrgnlTxId;
    }	  
  /**
   * Returns the orgnlTxTpCd
   * 
   * @return the orgnlTxTpCd
   */
    @Column(name = "ORGNLTXTPCD")
    public String getOrgnlTxTpCd() {
        return orgnlTxTpCd;
    }	 
     
  /**
   * Sets the orgnlTxTpCd
   *
   * @param newOrgnlTxTpCd the new orgnlTxTpCd
   */

    public void  setOrgnlTxTpCd(String newOrgnlTxTpCd) {
        orgnlTxTpCd = newOrgnlTxTpCd;
    }	  
  /**
   * Returns the amt
   * 
   * @return the amt
   */
    @Column(name = "AMT")
    public Double getAmt() {
        return amt;
    }	 
     
  /**
   * Sets the amt
   *
   * @param newAmt the new amt
   */

    public void  setAmt(Double newAmt) {
        amt = newAmt;
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
    
    
}    
    
