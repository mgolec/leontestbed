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
 * Saps73000101RvslChckng generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_MSG_SAPS_730_001_01___RvslChckng")
public class Saps73000101RvslChckng  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="acsAbsSttlmColltnChckng.acsAbsSttlmColltnChckngInf.rvslChckng[0].rspnSts")
    private String errRspnSts;
    
    @JaxbMapping(objPath="acsAbsSttlmColltnChckng.acsAbsSttlmColltnChckngInf.rvslChckng[0].rspnSts")
    private String errTtlNb;
    
    @JaxbMapping(objPath="acsAbsSttlmColltnChckng.acsAbsSttlmColltnChckngInf.rvslChckng[0].nbOfDbt")
    private String errNbOfDbt;
    
    @JaxbMapping(objPath="acsAbsSttlmColltnChckng.acsAbsSttlmColltnChckngInf.rvslChckng[0].dbtAmt")
    private String errDbtAmt;
    
    @JaxbMapping(objPath="acsAbsSttlmColltnChckng.acsAbsSttlmColltnChckngInf.rvslChckng[0].nbOfCdt")
    private String errNbOfCdt;
    
    @JaxbMapping(objPath="acsAbsSttlmColltnChckng.acsAbsSttlmColltnChckngInf.rvslChckng[0].cdtAmt")
    private String errCdtAmt;
    
    
	
    /** default constructor */
    public Saps73000101RvslChckng() {
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
   * Returns the errRspnSts
   * 
   * @return the errRspnSts
   */
    @Column(name = "ERRRSPNSTS")
    public String getErrRspnSts() {
        return errRspnSts;
    }	 
     
  /**
   * Sets the errRspnSts
   *
   * @param newErrRspnSts the new errRspnSts
   */

    public void  setErrRspnSts(String newErrRspnSts) {
        errRspnSts = newErrRspnSts;
    }	  
  /**
   * Returns the errTtlNb
   * 
   * @return the errTtlNb
   */
    @Column(name = "ERRTTLNB")
    public String getErrTtlNb() {
        return errTtlNb;
    }	 
     
  /**
   * Sets the errTtlNb
   *
   * @param newErrTtlNb the new errTtlNb
   */

    public void  setErrTtlNb(String newErrTtlNb) {
        errTtlNb = newErrTtlNb;
    }	  
  /**
   * Returns the errNbOfDbt
   * 
   * @return the errNbOfDbt
   */
    @Column(name = "ERRNBOFDBT")
    public String getErrNbOfDbt() {
        return errNbOfDbt;
    }	 
     
  /**
   * Sets the errNbOfDbt
   *
   * @param newErrNbOfDbt the new errNbOfDbt
   */

    public void  setErrNbOfDbt(String newErrNbOfDbt) {
        errNbOfDbt = newErrNbOfDbt;
    }	  
  /**
   * Returns the errDbtAmt
   * 
   * @return the errDbtAmt
   */
    @Column(name = "ERRDBTAMT")
    public String getErrDbtAmt() {
        return errDbtAmt;
    }	 
     
  /**
   * Sets the errDbtAmt
   *
   * @param newErrDbtAmt the new errDbtAmt
   */

    public void  setErrDbtAmt(String newErrDbtAmt) {
        errDbtAmt = newErrDbtAmt;
    }	  
  /**
   * Returns the errNbOfCdt
   * 
   * @return the errNbOfCdt
   */
    @Column(name = "ERRNBOFCDT")
    public String getErrNbOfCdt() {
        return errNbOfCdt;
    }	 
     
  /**
   * Sets the errNbOfCdt
   *
   * @param newErrNbOfCdt the new errNbOfCdt
   */

    public void  setErrNbOfCdt(String newErrNbOfCdt) {
        errNbOfCdt = newErrNbOfCdt;
    }	  
  /**
   * Returns the errCdtAmt
   * 
   * @return the errCdtAmt
   */
    @Column(name = "ERRCDTAMT")
    public String getErrCdtAmt() {
        return errCdtAmt;
    }	 
     
  /**
   * Sets the errCdtAmt
   *
   * @param newErrCdtAmt the new errCdtAmt
   */

    public void  setErrCdtAmt(String newErrCdtAmt) {
        errCdtAmt = newErrCdtAmt;
    }	  
    
    
}    
    
