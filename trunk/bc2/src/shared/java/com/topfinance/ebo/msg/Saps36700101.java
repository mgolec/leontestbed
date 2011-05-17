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
 * Saps36700101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_SAPS_367")
public class Saps36700101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="acctInfQryRspn.acctInfQryRspnInf.acctInf[0].ptyCtgy")
    private String ptyCtgy;
    
    @JaxbMapping(objPath="acctInfQryRspn.acctInfQryRspnInf.acctInf[0].mmbId")
    private String mmbId;
    
    @JaxbMapping(objPath="acctInfQryRspn.acctInfQryRspnInf.acctInf[0].issr")
    private String issr;
    
    @JaxbMapping(objPath="acctInfQryRspn.acctInfQryRspnInf.acctInf[0].acctSts")
    private String acctSts;
    
    @JaxbMapping(objPath="acctInfQryRspn.acctInfQryRspnInf.acctInf[0].pldgFincgId")
    private String pldgFincgId;
    
    @JaxbMapping(objPath="acctInfQryRspn.acctInfQryRspnInf.acctInf[0].overdrftLmt.value")
    private Double overdrftLmt;
    
    @JaxbMapping(objPath="acctInfQryRspn.acctInfQryRspnInf.acctInf[0].bal")
    private String bal;
    
    @JaxbMapping(objPath="acctInfQryRspn.acctInfQryRspnInf.acctInf[0].cdtLd.value")
    private Double cdtLd;
    
    @JaxbMapping(objPath="acctInfQryRspn.acctInfQryRspnInf.acctInf[0].rstrctAmtLwrLmt")
    private String rstrctAmtLwrLmt;
    
    private Saps36700101Hdr fid;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FID", nullable=false, updatable=false)
    public Saps36700101Hdr getFid() {
		return fid;
	}


	public void setFid(Saps36700101Hdr fid) {
		this.fid = fid;
	}


	/** default constructor */
    public Saps36700101() {
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
   * Returns the ptyCtgy
   * 
   * @return the ptyCtgy
   */
    @Column(name = "PTYCTGY")
    public String getPtyCtgy() {
        return ptyCtgy;
    }	 
     
  /**
   * Sets the ptyCtgy
   *
   * @param newPtyCtgy the new ptyCtgy
   */

    public void  setPtyCtgy(String newPtyCtgy) {
        ptyCtgy = newPtyCtgy;
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
   * Returns the issr
   * 
   * @return the issr
   */
    @Column(name = "ISSR")
    public String getIssr() {
        return issr;
    }	 
     
  /**
   * Sets the issr
   *
   * @param newIssr the new issr
   */

    public void  setIssr(String newIssr) {
        issr = newIssr;
    }	  
  /**
   * Returns the acctSts
   * 
   * @return the acctSts
   */
    @Column(name = "ACCTSTS")
    public String getAcctSts() {
        return acctSts;
    }	 
     
  /**
   * Sets the acctSts
   *
   * @param newAcctSts the new acctSts
   */

    public void  setAcctSts(String newAcctSts) {
        acctSts = newAcctSts;
    }	  
  /**
   * Returns the pldgFincgId
   * 
   * @return the pldgFincgId
   */
    @Column(name = "PLDGFINCGID")
    public String getPldgFincgId() {
        return pldgFincgId;
    }	 
     
  /**
   * Sets the pldgFincgId
   *
   * @param newPldgFincgId the new pldgFincgId
   */

    public void  setPldgFincgId(String newPldgFincgId) {
        pldgFincgId = newPldgFincgId;
    }	  
  /**
   * Returns the overdrftLmt
   * 
   * @return the overdrftLmt
   */
    @Column(name = "OVERDRFTLMT")
    public Double getOverdrftLmt() {
        return overdrftLmt;
    }	 
     
  /**
   * Sets the overdrftLmt
   *
   * @param newOverdrftLmt the new overdrftLmt
   */

    public void  setOverdrftLmt(Double newOverdrftLmt) {
        overdrftLmt = newOverdrftLmt;
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
   * Returns the rstrctAmtLwrLmt
   * 
   * @return the rstrctAmtLwrLmt
   */
    @Column(name = "RSTRCTAMTLWRLMT")
    public String getRstrctAmtLwrLmt() {
        return rstrctAmtLwrLmt;
    }	 
     
  /**
   * Sets the rstrctAmtLwrLmt
   *
   * @param newRstrctAmtLwrLmt the new rstrctAmtLwrLmt
   */

    public void  setRstrctAmtLwrLmt(String newRstrctAmtLwrLmt) {
        rstrctAmtLwrLmt = newRstrctAmtLwrLmt;
    }	  
    
    
}    
    
