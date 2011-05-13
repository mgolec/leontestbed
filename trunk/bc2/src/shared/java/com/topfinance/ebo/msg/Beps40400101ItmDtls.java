package com.topfinance.ebo.msg;

import com.topfinance.ebo.msg.JaxbMapping;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 * Beps40400101ItmDtls generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_BEPS_404")
public class Beps40400101ItmDtls  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="invcPrtRspn.invcPrtRspnInf.invcInf.itmDtls[0].nm")
    private String nm;
    
    @JaxbMapping(objPath="invcPrtRspn.invcPrtRspnInf.invcInf.itmDtls[0].amt.value")
    private Double amt;
    
    @JaxbMapping(objPath="invcPrtRspn.invcPrtRspnInf.invcInf.nbOfFldItms")
    private String nbOfFldItms;
    
    private Beps40400101 fid;
	
    /** default constructor */
    public Beps40400101ItmDtls() {
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
   * Returns the nm
   * 
   * @return the nm
   */
    @Column(name = "NM")
    public String getNm() {
        return nm;
    }	 
     
  /**
   * Sets the nm
   *
   * @param newNm the new nm
   */

    public void  setNm(String newNm) {
        nm = newNm;
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
   * Returns the nbOfFldItms
   * 
   * @return the nbOfFldItms
   */
    @Column(name = "NBOFFLDITMS")
    public String getNbOfFldItms() {
        return nbOfFldItms;
    }	 
     
  /**
   * Sets the nbOfFldItms
   *
   * @param newNbOfFldItms the new nbOfFldItms
   */

    public void  setNbOfFldItms(String newNbOfFldItms) {
        nbOfFldItms = newNbOfFldItms;
    }

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FID", nullable=false, updatable=false)
	public Beps40400101 getFid() {
		return fid;
	}
	
	
	public void setFid(Beps40400101 fid) {
		this.fid = fid;
	}	  
    
    
}    
    
