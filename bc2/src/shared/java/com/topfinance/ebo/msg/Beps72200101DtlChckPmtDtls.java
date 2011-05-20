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
 * Beps72200101DtlChckPmtDtls generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_BEPS_722_APX_YW")
public class Beps72200101DtlChckPmtDtls  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="dtlChckReq.dtlChckReqInf.dtlChckPmtInf.dtlChckPmtDtls[0].sndRcvTp")
    private String bizSndRcvTp;
    
    @JaxbMapping(objPath="dtlChckReq.dtlChckReqInf.dtlChckPmtInf.dtlChckPmtDtls[0].txNetgDt")
    private Date bizTxNetgDt;
    
    @JaxbMapping(objPath="dtlChckReq.dtlChckReqInf.dtlChckPmtInf.dtlChckPmtDtls[0].txNetgRnd")
    private String bizTxNetgRnd;
    
    @JaxbMapping(objPath="dtlChckReq.dtlChckReqInf.dtlChckPmtInf.dtlChckPmtDtls[0].mt")
    private String bizMT;
    
    @JaxbMapping(objPath="dtlChckReq.dtlChckReqInf.dtlChckMsg.nbOfTxs")
    private String bizNbOfTxs;
    
    private Beps72200101 fid;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FID", nullable=false, updatable=false)
    public Beps72200101 getFid() {
		return fid;
	}


	public void setFid(Beps72200101 fid) {
		this.fid = fid;
	}


	/** default constructor */
    public Beps72200101DtlChckPmtDtls() {
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
   * Returns the bizSndRcvTp
   * 
   * @return the bizSndRcvTp
   */
    @Column(name = "BIZSNDRCVTP")
    public String getBizSndRcvTp() {
        return bizSndRcvTp;
    }	 
     
  /**
   * Sets the bizSndRcvTp
   *
   * @param newBizSndRcvTp the new bizSndRcvTp
   */

    public void  setBizSndRcvTp(String newBizSndRcvTp) {
        bizSndRcvTp = newBizSndRcvTp;
    }	  
  /**
   * Returns the bizTxNetgDt
   * 
   * @return the bizTxNetgDt
   */
    @Column(name = "BIZTXNETGDT")
    public Date getBizTxNetgDt() {
        return bizTxNetgDt;
    }	 
     
  /**
   * Sets the bizTxNetgDt
   *
   * @param newBizTxNetgDt the new bizTxNetgDt
   */

    public void  setBizTxNetgDt(Date newBizTxNetgDt) {
        bizTxNetgDt = newBizTxNetgDt;
    }	  
  /**
   * Returns the bizTxNetgRnd
   * 
   * @return the bizTxNetgRnd
   */
    @Column(name = "BIZTXNETGRND")
    public String getBizTxNetgRnd() {
        return bizTxNetgRnd;
    }	 
     
  /**
   * Sets the bizTxNetgRnd
   *
   * @param newBizTxNetgRnd the new bizTxNetgRnd
   */

    public void  setBizTxNetgRnd(String newBizTxNetgRnd) {
        bizTxNetgRnd = newBizTxNetgRnd;
    }	  
  /**
   * Returns the bizMT
   * 
   * @return the bizMT
   */
    @Column(name = "BIZMT")
    public String getBizMT() {
        return bizMT;
    }	 
     
  /**
   * Sets the bizMT
   *
   * @param newBizMT the new bizMT
   */

    public void  setBizMT(String newBizMT) {
        bizMT = newBizMT;
    }	  
  /**
   * Returns the bizNbOfTxs
   * 
   * @return the bizNbOfTxs
   */
    @Column(name = "BIZNBOFTXS")
    public String getBizNbOfTxs() {
        return bizNbOfTxs;
    }	 
     
  /**
   * Sets the bizNbOfTxs
   *
   * @param newBizNbOfTxs the new bizNbOfTxs
   */

    public void  setBizNbOfTxs(String newBizNbOfTxs) {
        bizNbOfTxs = newBizNbOfTxs;
    }	  
    
    
}    
    
