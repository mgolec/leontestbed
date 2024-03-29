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
 * Beps41200101OrgnlTx generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_BEPS_412")
public class Beps41200101OrgnlTx  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="stopPmtRspn.stopPmtRspnInf.orgnlInf.orgnlTx[0].instgIndrctPty")
    private String instgIndrctPty;
    
    @JaxbMapping(objPath="stopPmtRspn.stopPmtRspnInf.orgnlInf.orgnlTx[0].instdIndrctPty")
    private String instdIndrctPty;
    
    @JaxbMapping(objPath="stopPmtRspn.stopPmtRspnInf.orgnlInf.orgnlTx[0].orgnlTxId")
    private String orgnlTxId;
    
    @JaxbMapping(objPath="stopPmtRspn.stopPmtRspnInf.orgnlInf.orgnlTx[0].orgnlTxTpCd")
    private String orgnlTxTpCd;
    
	private Beps41200101 fid;
	
    /** default constructor */
    public Beps41200101OrgnlTx() {
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
    
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FID", nullable=false, updatable=false)
	public Beps41200101 getFid() {
		return fid;
	}


	public void setFid(Beps41200101 fid) {
		this.fid = fid;
	}
}    
    
