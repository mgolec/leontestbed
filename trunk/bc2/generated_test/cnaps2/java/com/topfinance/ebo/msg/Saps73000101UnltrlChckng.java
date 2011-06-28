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
 * Saps73000101UnltrlChckng generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_MSG_SAPS_730_001_01___UnltrlChckng")
public class Saps73000101UnltrlChckng  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="acsAbsSttlmColltnChckng.acsAbsSttlmColltnChckngInf.unltrlChckng[0].rspnSts")
    private String rspnSts;
    
    @JaxbMapping(objPath="acsAbsSttlmColltnChckng.acsAbsSttlmColltnChckngInf.unltrlChckng[0].ttlNb")
    private String ttlNb;
    
    @JaxbMapping(objPath="acsAbsSttlmColltnChckng.acsAbsSttlmColltnChckngInf.unltrlChckng[0].nbOfDbt")
    private String nbOfDbt;
    
    @JaxbMapping(objPath="acsAbsSttlmColltnChckng.acsAbsSttlmColltnChckngInf.unltrlChckng[0].dbtAmt")
    private String dbtAmt;
    
    @JaxbMapping(objPath="acsAbsSttlmColltnChckng.acsAbsSttlmColltnChckngInf.unltrlChckng[0].nbOfCdt")
    private String nbOfCdt;
    
    @JaxbMapping(objPath="acsAbsSttlmColltnChckng.acsAbsSttlmColltnChckngInf.unltrlChckng[0].cdtAmt")
    private String cdtAmt;
    
    
	
    /** default constructor */
    public Saps73000101UnltrlChckng() {
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
   * Returns the rspnSts
   * 
   * @return the rspnSts
   */
    @Column(name = "RSPNSTS")
    public String getRspnSts() {
        return rspnSts;
    }	 
     
  /**
   * Sets the rspnSts
   *
   * @param newRspnSts the new rspnSts
   */

    public void  setRspnSts(String newRspnSts) {
        rspnSts = newRspnSts;
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
   * Returns the nbOfDbt
   * 
   * @return the nbOfDbt
   */
    @Column(name = "NBOFDBT")
    public String getNbOfDbt() {
        return nbOfDbt;
    }	 
     
  /**
   * Sets the nbOfDbt
   *
   * @param newNbOfDbt the new nbOfDbt
   */

    public void  setNbOfDbt(String newNbOfDbt) {
        nbOfDbt = newNbOfDbt;
    }	  
  /**
   * Returns the dbtAmt
   * 
   * @return the dbtAmt
   */
    @Column(name = "DBTAMT")
    public String getDbtAmt() {
        return dbtAmt;
    }	 
     
  /**
   * Sets the dbtAmt
   *
   * @param newDbtAmt the new dbtAmt
   */

    public void  setDbtAmt(String newDbtAmt) {
        dbtAmt = newDbtAmt;
    }	  
  /**
   * Returns the nbOfCdt
   * 
   * @return the nbOfCdt
   */
    @Column(name = "NBOFCDT")
    public String getNbOfCdt() {
        return nbOfCdt;
    }	 
     
  /**
   * Sets the nbOfCdt
   *
   * @param newNbOfCdt the new nbOfCdt
   */

    public void  setNbOfCdt(String newNbOfCdt) {
        nbOfCdt = newNbOfCdt;
    }	  
  /**
   * Returns the cdtAmt
   * 
   * @return the cdtAmt
   */
    @Column(name = "CDTAMT")
    public String getCdtAmt() {
        return cdtAmt;
    }	 
     
  /**
   * Sets the cdtAmt
   *
   * @param newCdtAmt the new cdtAmt
   */

    public void  setCdtAmt(String newCdtAmt) {
        cdtAmt = newCdtAmt;
    }	  
    
    
}    
    