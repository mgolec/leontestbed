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
 * Nets35500101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_NETS_355")
public class Nets35500101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="rtrLmt.bizRpt.curLmt[0].lmtId.tp")
    private String limitTp;
    
    @JaxbMapping(objPath="rtrLmt.bizRpt.curLmt[0].lmtId.acctId.dmstAcct.id")
    private String dmstAcctId;
    
    @JaxbMapping(objPath="rtrLmt.bizRpt.curLmt[0].lmt.amt.amtWthCcy")
    private Double amtWthCcy;
    
    @JaxbMapping(objPath="rtrLmt.bizRpt.curLmt[0].lmt.cdtDbtInd")
    private String cdtDbtInd;
    
    @JaxbMapping(objPath="rtrLmt.bizRpt.curLmt[0].lmt.sts")
    private String sts;
    
    @JaxbMapping(objPath="rtrLmt.bizRpt.dfltLmt[0].lmtId.tp")
    private String lmtIdTp;
    
    @JaxbMapping(objPath="rtrLmt.bizRpt.dfltLmt[0].lmt.amt.amtWthCcy")
    private Double amtWthCcy1;
    
    @JaxbMapping(objPath="rtrLmt.bizRpt.dfltLmt[0].lmt.cdtDbtInd")
    private String lmtCdtDbtInd;
    
    @JaxbMapping(objPath="rtrLmt.msgId.id")
    private String msgId;
    
    
	
    /** default constructor */
    public Nets35500101() {
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
   * Returns the limitTp
   * 
   * @return the limitTp
   */
    @Column(name = "LIMITTP")
    public String getLimitTp() {
        return limitTp;
    }	 
     
  /**
   * Sets the limitTp
   *
   * @param newLimitTp the new limitTp
   */

    public void  setLimitTp(String newLimitTp) {
        limitTp = newLimitTp;
    }	  
  /**
   * Returns the dmstAcctId
   * 
   * @return the dmstAcctId
   */
    @Column(name = "DMSTACCTID")
    public String getDmstAcctId() {
        return dmstAcctId;
    }	 
     
  /**
   * Sets the dmstAcctId
   *
   * @param newDmstAcctId the new dmstAcctId
   */

    public void  setDmstAcctId(String newDmstAcctId) {
        dmstAcctId = newDmstAcctId;
    }	  
  /**
   * Returns the amtWthCcy
   * 
   * @return the amtWthCcy
   */
    @Column(name = "AMTWTHCCY")
    public Double getAmtWthCcy() {
        return amtWthCcy;
    }	 
     
  /**
   * Sets the amtWthCcy
   *
   * @param newAmtWthCcy the new amtWthCcy
   */

    public void  setAmtWthCcy(Double newAmtWthCcy) {
        amtWthCcy = newAmtWthCcy;
    }	  
  /**
   * Returns the cdtDbtInd
   * 
   * @return the cdtDbtInd
   */
    @Column(name = "CDTDBTIND")
    public String getCdtDbtInd() {
        return cdtDbtInd;
    }	 
     
  /**
   * Sets the cdtDbtInd
   *
   * @param newCdtDbtInd the new cdtDbtInd
   */

    public void  setCdtDbtInd(String newCdtDbtInd) {
        cdtDbtInd = newCdtDbtInd;
    }	  
  /**
   * Returns the sts
   * 
   * @return the sts
   */
    @Column(name = "STS")
    public String getSts() {
        return sts;
    }	 
     
  /**
   * Sets the sts
   *
   * @param newSts the new sts
   */

    public void  setSts(String newSts) {
        sts = newSts;
    }	  
  /**
   * Returns the lmtIdTp
   * 
   * @return the lmtIdTp
   */
    @Column(name = "LMTIDTP")
    public String getLmtIdTp() {
        return lmtIdTp;
    }	 
     
  /**
   * Sets the lmtIdTp
   *
   * @param newLmtIdTp the new lmtIdTp
   */

    public void  setLmtIdTp(String newLmtIdTp) {
        lmtIdTp = newLmtIdTp;
    }	  
  /**
   * Returns the amtWthCcy1
   * 
   * @return the amtWthCcy1
   */
    @Column(name = "AMTWTHCCY1")
    public Double getAmtWthCcy1() {
        return amtWthCcy1;
    }	 
     
  /**
   * Sets the amtWthCcy1
   *
   * @param newAmtWthCcy1 the new amtWthCcy1
   */

    public void  setAmtWthCcy1(Double newAmtWthCcy1) {
        amtWthCcy1 = newAmtWthCcy1;
    }	  
  /**
   * Returns the lmtCdtDbtInd
   * 
   * @return the lmtCdtDbtInd
   */
    @Column(name = "LMTCDTDBTIND")
    public String getLmtCdtDbtInd() {
        return lmtCdtDbtInd;
    }	 
     
  /**
   * Sets the lmtCdtDbtInd
   *
   * @param newLmtCdtDbtInd the new lmtCdtDbtInd
   */

    public void  setLmtCdtDbtInd(String newLmtCdtDbtInd) {
        lmtCdtDbtInd = newLmtCdtDbtInd;
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
    
    
}    
    
