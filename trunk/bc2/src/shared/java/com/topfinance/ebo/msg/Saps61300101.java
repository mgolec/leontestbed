package com.topfinance.ebo.msg;

import com.topfinance.ebo.msg.JaxbMapping;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Saps61300101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_SAPS_613")
public class Saps61300101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="acctgErrRvsl.grpHdr.msgId")
    private String msgId;
    
    @JaxbMapping(objPath="acctgErrRvsl.grpHdr.creDtTm")
    private String creDtTm;
    
    @JaxbMapping(objPath="acctgErrRvsl.grpHdr.instgPty.instgDrctPty")
    private String instgDrctPty;
    
    @JaxbMapping(objPath="acctgErrRvsl.grpHdr.instgPty.instgPty")
    private String instgIndrctPty;
    
    @JaxbMapping(objPath="acctgErrRvsl.grpHdr.instdPty.instdDrctPty")
    private String instdDrctPty;
    
    @JaxbMapping(objPath="acctgErrRvsl.grpHdr.instdPty.instdPty")
    private String instdIndrctPty;
    
    @JaxbMapping(objPath="acctgErrRvsl.grpHdr.sysCd")
    private String sysCd;
    
    @JaxbMapping(objPath="acctgErrRvsl.grpHdr.rmk")
    private String rmk;
    
    @JaxbMapping(objPath="acctgErrRvsl.acctgErrRvslInf.bookgId")
    private String bookgId;
    
    @JaxbMapping(objPath="acctgErrRvsl.acctgErrRvslInf.dbtCdtId")
    private String dbtCdtId;
    
    @JaxbMapping(objPath="acctgErrRvsl.acctgErrRvslInf.amt")
    private Double amt;
    
    @JaxbMapping(objPath="acctgErrRvsl.acctgErrRvslInf.plusMnsTp")
    private String plusMnsTp;
    
    @JaxbMapping(objPath="acctgErrRvsl.acctgErrRvslInf.txTp")
    private String txTp;
    
    @JaxbMapping(objPath="acctgErrRvsl.acctgErrRvslInf.ctgyPurpCd")
    private String ctgyPurpCd;
    
    
	
    /** default constructor */
    public Saps61300101() {
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
   * Returns the bookgId
   * 
   * @return the bookgId
   */
    @Column(name = "BOOKGID")
    public String getBookgId() {
        return bookgId;
    }	 
     
  /**
   * Sets the bookgId
   *
   * @param newBookgId the new bookgId
   */

    public void  setBookgId(String newBookgId) {
        bookgId = newBookgId;
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
   * Returns the plusMnsTp
   * 
   * @return the plusMnsTp
   */
    @Column(name = "PLUSMNSTP")
    public String getPlusMnsTp() {
        return plusMnsTp;
    }	 
     
  /**
   * Sets the plusMnsTp
   *
   * @param newPlusMnsTp the new plusMnsTp
   */

    public void  setPlusMnsTp(String newPlusMnsTp) {
        plusMnsTp = newPlusMnsTp;
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
    
    
}    
    
