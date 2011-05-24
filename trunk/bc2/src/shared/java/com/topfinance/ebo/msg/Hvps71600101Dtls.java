package com.topfinance.ebo.msg;

import com.topfinance.ebo.msg.JaxbMapping;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;


/**
 * Hvps71600101Dtls generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_HVPS_716_EXT_GEINFO")
public class Hvps71600101Dtls  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="acctChckng.acctChckngInf.dtls[0].txTpCd")
    private String prtry;
    
    @JaxbMapping(objPath="acctChckng.acctChckngInf.dtls[0].sndgNbOfTxs")
    private String sndgNbOfTxs;
    
    @JaxbMapping(objPath="acctChckng.acctChckngInf.dtls[0].sndgCtrlSum.value")
    private Double sndgCtrlSum;
    
    @JaxbMapping(objPath="acctChckng.acctChckngInf.dtls[0].rcvgNbOfTxs")
    private String rcvgNbOfTxs;
    
    @JaxbMapping(objPath="acctChckng.acctChckngInf.dtls[0].rcvgCtrlSum.value")
    private Double rcvgCtrlSum;
    
    @JaxbMapping(objPath="acctChckng.acctChckngInf.dtls[0].chckngDtlOfSndg[0]")
    private java.util.Set<Hvps71600101ChckngDtlOfSndg> chckngDtlOfSndg;
    
    @JaxbMapping(objPath="acctChckng.acctChckngInf.dtls[0].chckngDtlOfRcvg[0]")
    private java.util.Set<Hvps71600101ChckngDtlOfRcvg> chckngDtlOfRcvg;
    
    private Hvps71600101 fid;
    
    
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FID", nullable=false, updatable=false)
    public Hvps71600101 getFid() {
		return fid;
	}


	public void setFid(Hvps71600101 fid) {
		this.fid = fid;
	}


	/** default constructor */
    public Hvps71600101Dtls() {
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
   * Returns the prtry
   * 
   * @return the prtry
   */
    @Column(name = "PRTRY")
    public String getPrtry() {
        return prtry;
    }	 
     
  /**
   * Sets the prtry
   *
   * @param newPrtry the new prtry
   */

    public void  setPrtry(String newPrtry) {
        prtry = newPrtry;
    }	  
  /**
   * Returns the sndgNbOfTxs
   * 
   * @return the sndgNbOfTxs
   */
    @Column(name = "SNDGNBOFTXS")
    public String getSndgNbOfTxs() {
        return sndgNbOfTxs;
    }	 
     
  /**
   * Sets the sndgNbOfTxs
   *
   * @param newSndgNbOfTxs the new sndgNbOfTxs
   */

    public void  setSndgNbOfTxs(String newSndgNbOfTxs) {
        sndgNbOfTxs = newSndgNbOfTxs;
    }	  
  /**
   * Returns the sndgCtrlSum
   * 
   * @return the sndgCtrlSum
   */
    @Column(name = "SNDGCTRLSUM")
    public Double getSndgCtrlSum() {
        return sndgCtrlSum;
    }	 
     
  /**
   * Sets the sndgCtrlSum
   *
   * @param newSndgCtrlSum the new sndgCtrlSum
   */

    public void  setSndgCtrlSum(Double newSndgCtrlSum) {
        sndgCtrlSum = newSndgCtrlSum;
    }	  
  /**
   * Returns the rcvgNbOfTxs
   * 
   * @return the rcvgNbOfTxs
   */
    @Column(name = "RCVGNBOFTXS")
    public String getRcvgNbOfTxs() {
        return rcvgNbOfTxs;
    }	 
     
  /**
   * Sets the rcvgNbOfTxs
   *
   * @param newRcvgNbOfTxs the new rcvgNbOfTxs
   */

    public void  setRcvgNbOfTxs(String newRcvgNbOfTxs) {
        rcvgNbOfTxs = newRcvgNbOfTxs;
    }	  
  /**
   * Returns the rcvgCtrlSum
   * 
   * @return the rcvgCtrlSum
   */
    @Column(name = "RCVGCTRLSUM")
    public Double getRcvgCtrlSum() {
        return rcvgCtrlSum;
    }	 
     
  /**
   * Sets the rcvgCtrlSum
   *
   * @param newRcvgCtrlSum the new rcvgCtrlSum
   */

    public void  setRcvgCtrlSum(Double newRcvgCtrlSum) {
        rcvgCtrlSum = newRcvgCtrlSum;
    }	  
  /**
   * Returns the chckngDtlOfSndg
   * 
   * @return the chckngDtlOfSndg
   */
  	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL, mappedBy = "fid")
    public java.util.Set<Hvps71600101ChckngDtlOfSndg> getChckngDtlOfSndg() {
        return chckngDtlOfSndg;
    }	 
     
  /**
   * Sets the chckngDtlOfSndg
   *
   * @param newChckngDtlOfSndg the new chckngDtlOfSndg
   */

    public void  setChckngDtlOfSndg(java.util.Set<Hvps71600101ChckngDtlOfSndg> newChckngDtlOfSndg) {
        chckngDtlOfSndg = newChckngDtlOfSndg;
    }	  
  /**
   * Returns the chckngDtlOfRcvg
   * 
   * @return the chckngDtlOfRcvg
   */
  	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL, mappedBy = "fid")
    public java.util.Set<Hvps71600101ChckngDtlOfRcvg> getChckngDtlOfRcvg() {
        return chckngDtlOfRcvg;
    }	 
     
  /**
   * Sets the chckngDtlOfRcvg
   *
   * @param newChckngDtlOfRcvg the new chckngDtlOfRcvg
   */

    public void  setChckngDtlOfRcvg(java.util.Set<Hvps71600101ChckngDtlOfRcvg> newChckngDtlOfRcvg) {
        chckngDtlOfRcvg = newChckngDtlOfRcvg;
    }	  
    
    
}    
    
