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
 * Beps72300101OrgnlMsgDtls generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_BEPS_723_APX_XX_MX")
public class Beps72300101OrgnlMsgDtls  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="dtlChckRspn.dtlChckRspnInf.dtlChckMsgRspn.dtlChckMsgRspnDtls[0].orgnlMsgDtls[0].orgnlGrpHdr.orgnlMsgId")
    private String infoOrgnlMsgId;
    
    @JaxbMapping(objPath="dtlChckRspn.dtlChckRspnInf.dtlChckMsgRspn.dtlChckMsgRspnDtls[0].orgnlMsgDtls[0].orgnlGrpHdr.orgnlInstgPty")
    private String infoOrgnlInstgDrctPty;
    
    @JaxbMapping(objPath="dtlChckRspn.dtlChckRspnInf.dtlChckMsgRspn.dtlChckMsgRspnDtls[0].orgnlMsgDtls[0].orgnlGrpHdr.orgnlMsgTp")
    private String infoOrgnlMT;
    
    @JaxbMapping(objPath="dtlChckRspn.dtlChckRspnInf.dtlChckMsgRspn.dtlChckMsgRspnDtls[0].orgnlMsgDtls[0].prcSts")
    private String infoPrcSts;
    
    private Beps72300101DtlChckMsgRspnDtls fid;
    
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FID", nullable=false, updatable=false)
    public Beps72300101DtlChckMsgRspnDtls getFid() {
		return fid;
	}


	public void setFid(Beps72300101DtlChckMsgRspnDtls fid) {
		this.fid = fid;
	}


	/** default constructor */
    public Beps72300101OrgnlMsgDtls() {
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
   * Returns the infoOrgnlMsgId
   * 
   * @return the infoOrgnlMsgId
   */
    @Column(name = "INFOORGNLMSGID")
    public String getInfoOrgnlMsgId() {
        return infoOrgnlMsgId;
    }	 
     
  /**
   * Sets the infoOrgnlMsgId
   *
   * @param newInfoOrgnlMsgId the new infoOrgnlMsgId
   */

    public void  setInfoOrgnlMsgId(String newInfoOrgnlMsgId) {
        infoOrgnlMsgId = newInfoOrgnlMsgId;
    }	  
  /**
   * Returns the infoOrgnlInstgDrctPty
   * 
   * @return the infoOrgnlInstgDrctPty
   */
    @Column(name = "INFOORGNLINSTGDRCTPTY")
    public String getInfoOrgnlInstgDrctPty() {
        return infoOrgnlInstgDrctPty;
    }	 
     
  /**
   * Sets the infoOrgnlInstgDrctPty
   *
   * @param newInfoOrgnlInstgDrctPty the new infoOrgnlInstgDrctPty
   */

    public void  setInfoOrgnlInstgDrctPty(String newInfoOrgnlInstgDrctPty) {
        infoOrgnlInstgDrctPty = newInfoOrgnlInstgDrctPty;
    }	  
  /**
   * Returns the infoOrgnlMT
   * 
   * @return the infoOrgnlMT
   */
    @Column(name = "INFOORGNLMT")
    public String getInfoOrgnlMT() {
        return infoOrgnlMT;
    }	 
     
  /**
   * Sets the infoOrgnlMT
   *
   * @param newInfoOrgnlMT the new infoOrgnlMT
   */

    public void  setInfoOrgnlMT(String newInfoOrgnlMT) {
        infoOrgnlMT = newInfoOrgnlMT;
    }	  
  /**
   * Returns the infoPrcSts
   * 
   * @return the infoPrcSts
   */
    @Column(name = "INFOPRCSTS")
    public String getInfoPrcSts() {
        return infoPrcSts;
    }	 
     
  /**
   * Sets the infoPrcSts
   *
   * @param newInfoPrcSts the new infoPrcSts
   */

    public void  setInfoPrcSts(String newInfoPrcSts) {
        infoPrcSts = newInfoPrcSts;
    }	  
    
    
}    
    