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
 * Ccms31800101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_CCMS_318")
public class Ccms31800101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="pmtRtr.txInf[0].orgnlTxId")
    private String orgnlTxId;
    
    @JaxbMapping(objPath="pmtRtr.txInf[0].rtrdIntrBkSttlmAmt")
    private Double rtrdIntrBkSttlmAmt;
    
    @JaxbMapping(objPath="pmtRtr.txInf[0].instgAgt.finInstnId.clrSysMmbId.mmbId")
    private String sDMmbId;
    
    @JaxbMapping(objPath="pmtRtr.txInf[0].instgAgt.brnchId.id")
    private String sInDId;
    
    @JaxbMapping(objPath="pmtRtr.txInf[0].instdAgt.finInstnId.clrSysMmbId.mmbId")
    private String rDMmbId;
    
    @JaxbMapping(objPath="pmtRtr.txInf[0].instdAgt.brnchId.id")
    private String rInDId;
    
    private Ccms31800101Hdr fid;


	/** default constructor */
    public Ccms31800101() {
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
   * Returns the rtrdIntrBkSttlmAmt
   * 
   * @return the rtrdIntrBkSttlmAmt
   */
    @Column(name = "RTRDINTRBKSTTLMAMT")
    public Double getRtrdIntrBkSttlmAmt() {
        return rtrdIntrBkSttlmAmt;
    }	 
     
  /**
   * Sets the rtrdIntrBkSttlmAmt
   *
   * @param newRtrdIntrBkSttlmAmt the new rtrdIntrBkSttlmAmt
   */

    public void  setRtrdIntrBkSttlmAmt(Double newRtrdIntrBkSttlmAmt) {
        rtrdIntrBkSttlmAmt = newRtrdIntrBkSttlmAmt;
    }	  
  /**
   * Returns the sDMmbId
   * 
   * @return the sDMmbId
   */
    @Column(name = "SDMMBID")
    public String getSDMmbId() {
        return sDMmbId;
    }	 
     
  /**
   * Sets the sDMmbId
   *
   * @param newSDMmbId the new sDMmbId
   */

    public void  setSDMmbId(String newSDMmbId) {
        sDMmbId = newSDMmbId;
    }	  
  /**
   * Returns the sInDId
   * 
   * @return the sInDId
   */
    @Column(name = "SINDID")
    public String getSInDId() {
        return sInDId;
    }	 
     
  /**
   * Sets the sInDId
   *
   * @param newSInDId the new sInDId
   */

    public void  setSInDId(String newSInDId) {
        sInDId = newSInDId;
    }	  
  /**
   * Returns the rDMmbId
   * 
   * @return the rDMmbId
   */
    @Column(name = "RDMMBID")
    public String getRDMmbId() {
        return rDMmbId;
    }	 
     
  /**
   * Sets the rDMmbId
   *
   * @param newRDMmbId the new rDMmbId
   */

    public void  setRDMmbId(String newRDMmbId) {
        rDMmbId = newRDMmbId;
    }	  
  /**
   * Returns the rInDId
   * 
   * @return the rInDId
   */
    @Column(name = "RINDID")
    public String getRInDId() {
        return rInDId;
    }	 
     
  /**
   * Sets the rInDId
   *
   * @param newRInDId the new rInDId
   */

    public void  setRInDId(String newRInDId) {
        rInDId = newRInDId;
    }	  
    
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FID", nullable=false, updatable=false)
		public Ccms31800101Hdr getFid() {
		return fid;
	}


	public void setFid(Ccms31800101Hdr fid) {
		this.fid = fid;
	}
}    
    
