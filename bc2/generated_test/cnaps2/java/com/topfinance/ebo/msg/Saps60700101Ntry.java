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
 * Saps60700101Ntry generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_MSG_SAPS_607_001_01___Ntry")
public class Saps60700101Ntry  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="bkToCstmrStmt.stmt.ntry[0].amt.value")
    private Double ntrAmt;
    
    @JaxbMapping(objPath="bkToCstmrStmt.stmt.ntry[0].cdtDbtInd")
    private String entryCdtDbtInd;
    
    @JaxbMapping(objPath="bkToCstmrStmt.stmt.ntry[0].sts")
    private String sts;
    
    @JaxbMapping(objPath="bkToCstmrStmt.stmt.ntry[0].bkTxCd")
    private String bkTxCd;
    
    @JaxbMapping(objPath="bkToCstmrStmt.stmt.ntry[0].amt.value")
    private Double intrstAmt;
    
    @JaxbMapping(objPath="bkToCstmrStmt.stmt.ntry[0].intrst[0].cdtDbtInd")
    private String intrstCdtDbtInd;
    
    @JaxbMapping(objPath="bkToCstmrStmt.stmt.ntry[0].intrst[0].rate[0].tp.pctg")
    private  pctg;
    
    @JaxbMapping(objPath="bkToCstmrStmt.stmt.ntry[0].intrst[0].frToDt.frDtTm")
    private Date frDtTm;
    
    @JaxbMapping(objPath="bkToCstmrStmt.stmt.ntry[0].intrst[0].frToDt.toDtTm")
    private Date toDtTm;
    
    
	
    /** default constructor */
    public Saps60700101Ntry() {
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
   * Returns the ntrAmt
   * 
   * @return the ntrAmt
   */
    @Column(name = "NTRAMT")
    public Double getNtrAmt() {
        return ntrAmt;
    }	 
     
  /**
   * Sets the ntrAmt
   *
   * @param newNtrAmt the new ntrAmt
   */

    public void  setNtrAmt(Double newNtrAmt) {
        ntrAmt = newNtrAmt;
    }	  
  /**
   * Returns the entryCdtDbtInd
   * 
   * @return the entryCdtDbtInd
   */
    @Column(name = "ENTRYCDTDBTIND")
    public String getEntryCdtDbtInd() {
        return entryCdtDbtInd;
    }	 
     
  /**
   * Sets the entryCdtDbtInd
   *
   * @param newEntryCdtDbtInd the new entryCdtDbtInd
   */

    public void  setEntryCdtDbtInd(String newEntryCdtDbtInd) {
        entryCdtDbtInd = newEntryCdtDbtInd;
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
   * Returns the bkTxCd
   * 
   * @return the bkTxCd
   */
    @Column(name = "BKTXCD")
    public String getBkTxCd() {
        return bkTxCd;
    }	 
     
  /**
   * Sets the bkTxCd
   *
   * @param newBkTxCd the new bkTxCd
   */

    public void  setBkTxCd(String newBkTxCd) {
        bkTxCd = newBkTxCd;
    }	  
  /**
   * Returns the intrstAmt
   * 
   * @return the intrstAmt
   */
    @Column(name = "INTRSTAMT")
    public Double getIntrstAmt() {
        return intrstAmt;
    }	 
     
  /**
   * Sets the intrstAmt
   *
   * @param newIntrstAmt the new intrstAmt
   */

    public void  setIntrstAmt(Double newIntrstAmt) {
        intrstAmt = newIntrstAmt;
    }	  
  /**
   * Returns the intrstCdtDbtInd
   * 
   * @return the intrstCdtDbtInd
   */
    @Column(name = "INTRSTCDTDBTIND")
    public String getIntrstCdtDbtInd() {
        return intrstCdtDbtInd;
    }	 
     
  /**
   * Sets the intrstCdtDbtInd
   *
   * @param newIntrstCdtDbtInd the new intrstCdtDbtInd
   */

    public void  setIntrstCdtDbtInd(String newIntrstCdtDbtInd) {
        intrstCdtDbtInd = newIntrstCdtDbtInd;
    }	  
  /**
   * Returns the pctg
   * 
   * @return the pctg
   */
    @Column(name = "PCTG")
    public  getPctg() {
        return pctg;
    }	 
     
  /**
   * Sets the pctg
   *
   * @param newPctg the new pctg
   */

    public void  setPctg( newPctg) {
        pctg = newPctg;
    }	  
  /**
   * Returns the frDtTm
   * 
   * @return the frDtTm
   */
    @Column(name = "FRDTTM")
    public Date getFrDtTm() {
        return frDtTm;
    }	 
     
  /**
   * Sets the frDtTm
   *
   * @param newFrDtTm the new frDtTm
   */

    public void  setFrDtTm(Date newFrDtTm) {
        frDtTm = newFrDtTm;
    }	  
  /**
   * Returns the toDtTm
   * 
   * @return the toDtTm
   */
    @Column(name = "TODTTM")
    public Date getToDtTm() {
        return toDtTm;
    }	 
     
  /**
   * Sets the toDtTm
   *
   * @param newToDtTm the new toDtTm
   */

    public void  setToDtTm(Date newToDtTm) {
        toDtTm = newToDtTm;
    }	  
    
    
}    
    
