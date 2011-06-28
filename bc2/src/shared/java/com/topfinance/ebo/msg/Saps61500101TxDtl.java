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
 * Saps61500101TxDtl generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_SAPS_615")
public class Saps61500101TxDtl  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="poolIntrBkLnQryRspn.poolIntrBkLnQryRspnInf.txList[0].txDtl[0].txId")
    private String txId;
    
    @JaxbMapping(objPath="poolIntrBkLnQryRspn.poolIntrBkLnQryRspnInf.txList[0].txDtl[0].amt")
    private Double amt;
    
    private Saps61500101TxList fid;
    
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FID", nullable=false, updatable=false)
    public Saps61500101TxList getFid() {
		return fid;
	}


	public void setFid(Saps61500101TxList fid) {
		this.fid = fid;
	}


	/** default constructor */
    public Saps61500101TxDtl() {
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
   * Returns the txId
   * 
   * @return the txId
   */
    @Column(name = "TXID")
    public String getTxId() {
        return txId;
    }	 
     
  /**
   * Sets the txId
   *
   * @param newTxId the new txId
   */

    public void  setTxId(String newTxId) {
        txId = newTxId;
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
    
    
}    
    