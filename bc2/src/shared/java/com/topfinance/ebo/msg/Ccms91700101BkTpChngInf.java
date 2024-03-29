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
 * Ccms91700101BkTpChngInf generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_CCMS_917_APX_BSC")
public class Ccms91700101BkTpChngInf  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="bsisChngNtfctn.bkTpChngInf[0].chngCtrl.chngTp")
    private String bkChngTp;
    
    @JaxbMapping(objPath="bsisChngNtfctn.bkTpChngInf[0].chngCtrl.fctvTp")
    private String bkFctvTp;
    
    @JaxbMapping(objPath="bsisChngNtfctn.bkTpChngInf[0].chngCtrl.fctvDt")
    private Date bkFctvDt;
    
    @JaxbMapping(objPath="bsisChngNtfctn.bkTpChngInf[0].chngCtrl.ifctvDt")
    private Date bkIfctvDt;
    
    @JaxbMapping(objPath="bsisChngNtfctn.bkTpChngInf[0].bkTpCd")
    private String bkTpCd;
    
    @JaxbMapping(objPath="bsisChngNtfctn.bkTpChngInf[0].bkTpNm")
    private String bkTpNm;
    
    @JaxbMapping(objPath="bsisChngNtfctn.bkTpChngInf[0].tpCd")
    private String bkTpCd1;
    
    @JaxbMapping(objPath="bsisChngNtfctn.bkTpChngInf[0].tpNm")
    private String bkTpNm1;
    
    private Ccms91700101 fid;
    
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FID", nullable=false, updatable=false)
    public Ccms91700101 getFid() {
		return fid;
	}


	public void setFid(Ccms91700101 fid) {
		this.fid = fid;
	}


	/** default constructor */
    public Ccms91700101BkTpChngInf() {
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
   * Returns the bkChngTp
   * 
   * @return the bkChngTp
   */
    @Column(name = "BKCHNGTP")
    public String getBkChngTp() {
        return bkChngTp;
    }	 
     
  /**
   * Sets the bkChngTp
   *
   * @param newBkChngTp the new bkChngTp
   */

    public void  setBkChngTp(String newBkChngTp) {
        bkChngTp = newBkChngTp;
    }	  
  /**
   * Returns the bkFctvTp
   * 
   * @return the bkFctvTp
   */
    @Column(name = "BKFCTVTP")
    public String getBkFctvTp() {
        return bkFctvTp;
    }	 
     
  /**
   * Sets the bkFctvTp
   *
   * @param newBkFctvTp the new bkFctvTp
   */

    public void  setBkFctvTp(String newBkFctvTp) {
        bkFctvTp = newBkFctvTp;
    }	  
  /**
   * Returns the bkFctvDt
   * 
   * @return the bkFctvDt
   */
    @Column(name = "BKFCTVDT")
    public Date getBkFctvDt() {
        return bkFctvDt;
    }	 
     
  /**
   * Sets the bkFctvDt
   *
   * @param newBkFctvDt the new bkFctvDt
   */

    public void  setBkFctvDt(Date newBkFctvDt) {
        bkFctvDt = newBkFctvDt;
    }	  
  /**
   * Returns the bkIfctvDt
   * 
   * @return the bkIfctvDt
   */
    @Column(name = "BKIFCTVDT")
    public Date getBkIfctvDt() {
        return bkIfctvDt;
    }	 
     
  /**
   * Sets the bkIfctvDt
   *
   * @param newBkIfctvDt the new bkIfctvDt
   */

    public void  setBkIfctvDt(Date newBkIfctvDt) {
        bkIfctvDt = newBkIfctvDt;
    }	  
  /**
   * Returns the bkTpCd
   * 
   * @return the bkTpCd
   */
    @Column(name = "BKTPCD")
    public String getBkTpCd() {
        return bkTpCd;
    }	 
     
  /**
   * Sets the bkTpCd
   *
   * @param newBkTpCd the new bkTpCd
   */

    public void  setBkTpCd(String newBkTpCd) {
        bkTpCd = newBkTpCd;
    }	  
  /**
   * Returns the bkTpNm
   * 
   * @return the bkTpNm
   */
    @Column(name = "BKTPNM")
    public String getBkTpNm() {
        return bkTpNm;
    }	 
     
  /**
   * Sets the bkTpNm
   *
   * @param newBkTpNm the new bkTpNm
   */

    public void  setBkTpNm(String newBkTpNm) {
        bkTpNm = newBkTpNm;
    }	  
  /**
   * Returns the bkTpCd1
   * 
   * @return the bkTpCd1
   */
    @Column(name = "TPCD")
    public String getBkTpCd1() {
        return bkTpCd1;
    }	 
     
  /**
   * Sets the bkTpCd1
   *
   * @param newBkTpCd1 the new bkTpCd1
   */

    public void  setBkTpCd1(String newBkTpCd1) {
        bkTpCd1 = newBkTpCd1;
    }	  
  /**
   * Returns the bkTpNm1
   * 
   * @return the bkTpNm1
   */
    @Column(name = "TPNM")
    public String getBkTpNm1() {
        return bkTpNm1;
    }	 
     
  /**
   * Sets the bkTpNm1
   *
   * @param newBkTpNm1 the new bkTpNm1
   */

    public void  setBkTpNm1(String newBkTpNm1) {
        bkTpNm1 = newBkTpNm1;
    }	  
    
    
}    
    
