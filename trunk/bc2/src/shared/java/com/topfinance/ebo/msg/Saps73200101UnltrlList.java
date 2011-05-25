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
 * Saps73200101UnltrlList generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_SAPS_732_DB")
public class Saps73200101UnltrlList  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="acsAbsSttlmDtlRspn.acsAbsSttlmDtlRspnInf.chckngInf.unltrlList[0].msgId")
    private String dbMsgId;
    
    @JaxbMapping(objPath="acsAbsSttlmDtlRspn.acsAbsSttlmDtlRspnInf.chckngInf.unltrlList[0].bookgId")
    private String dbBookgId;
    
    @JaxbMapping(objPath="acsAbsSttlmDtlRspn.acsAbsSttlmDtlRspnInf.chckngInf.unltrlList[0].dbtCdtId")
    private String dbtCdtId;
    
    @JaxbMapping(objPath="acsAbsSttlmDtlRspn.acsAbsSttlmDtlRspnInf.chckngInf.unltrlList[0].amt")
    private Double dbAmt;
    
    @JaxbMapping(objPath="acsAbsSttlmDtlRspn.acsAbsSttlmDtlRspnInf.chckngInf.unltrlList[0].ctgyPurpCd")
    private String dbCtgyPurpCd;
    
    @JaxbMapping(objPath="acsAbsSttlmDtlRspn.acsAbsSttlmDtlRspnInf.chckngInf.unltrlList[0].rspnSts")
    private String dbRspnSts;
    
    private Saps73200101 fid;
    
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FID", nullable=false, updatable=false)
    public Saps73200101 getFid() {
		return fid;
	}


	public void setFid(Saps73200101 fid) {
		this.fid = fid;
	}
	
    /** default constructor */
    public Saps73200101UnltrlList() {
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
   * Returns the dbMsgId
   * 
   * @return the dbMsgId
   */
    @Column(name = "DBMSGID")
    public String getDbMsgId() {
        return dbMsgId;
    }	 
     
  /**
   * Sets the dbMsgId
   *
   * @param newDbMsgId the new dbMsgId
   */

    public void  setDbMsgId(String newDbMsgId) {
        dbMsgId = newDbMsgId;
    }	  
  /**
   * Returns the dbBookgId
   * 
   * @return the dbBookgId
   */
    @Column(name = "DBBOOKGID")
    public String getDbBookgId() {
        return dbBookgId;
    }	 
     
  /**
   * Sets the dbBookgId
   *
   * @param newDbBookgId the new dbBookgId
   */

    public void  setDbBookgId(String newDbBookgId) {
        dbBookgId = newDbBookgId;
    }	  
  /**
   * Returns the dbtCdtId
   * 
   * @return the dbtCdtId
   */
    @Column(name = "DBTCDTID")
    public String getDbtCdtId() {
        return dbtCdtId;
    }	 
     
  /**
   * Sets the dbtCdtId
   *
   * @param newDbtCdtId the new dbtCdtId
   */

    public void  setDbtCdtId(String newDbtCdtId) {
        dbtCdtId = newDbtCdtId;
    }	  
  /**
   * Returns the dbAmt
   * 
   * @return the dbAmt
   */
    @Column(name = "DBAMT")
    public Double getDbAmt() {
        return dbAmt;
    }	 
     
  /**
   * Sets the dbAmt
   *
   * @param newDbAmt the new dbAmt
   */

    public void  setDbAmt(Double newDbAmt) {
        dbAmt = newDbAmt;
    }	  
  /**
   * Returns the dbCtgyPurpCd
   * 
   * @return the dbCtgyPurpCd
   */
    @Column(name = "DBCTGYPURPCD")
    public String getDbCtgyPurpCd() {
        return dbCtgyPurpCd;
    }	 
     
  /**
   * Sets the dbCtgyPurpCd
   *
   * @param newDbCtgyPurpCd the new dbCtgyPurpCd
   */

    public void  setDbCtgyPurpCd(String newDbCtgyPurpCd) {
        dbCtgyPurpCd = newDbCtgyPurpCd;
    }	  
  /**
   * Returns the dbRspnSts
   * 
   * @return the dbRspnSts
   */
    @Column(name = "DBRSPNSTS")
    public String getDbRspnSts() {
        return dbRspnSts;
    }	 
     
  /**
   * Sets the dbRspnSts
   *
   * @param newDbRspnSts the new dbRspnSts
   */

    public void  setDbRspnSts(String newDbRspnSts) {
        dbRspnSts = newDbRspnSts;
    }	  
    
    
}    
    
