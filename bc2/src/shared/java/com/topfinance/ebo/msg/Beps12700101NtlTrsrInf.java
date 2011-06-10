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
 * Beps12700101NtlTrsrInf generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_BEPS_127_APX_GKZJDF")
public class Beps12700101NtlTrsrInf  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="cstmrDrctDbt.cstmrDrctDbtInf[0].cstmrDrctDbtAddtlInf.ntlTrsrInf.fslInf.flowNb")
    private String ntlFlowNb;
    
    @JaxbMapping(objPath="cstmrDrctDbt.cstmrDrctDbtInf[0].cstmrDrctDbtAddtlInf.ntlTrsrInf.fslInf.amt.value")
    private Double ntlTlAmt;
    
    @JaxbMapping(objPath="cstmrDrctDbt.cstmrDrctDbtInf[0].cstmrDrctDbtAddtlInf.ntlTrsrInf.fslInf.rptCd")
    private String ntlRptCd;
    
    @JaxbMapping(objPath="cstmrDrctDbt.cstmrDrctDbtInf[0].cstmrDrctDbtAddtlInf.ntlTrsrInf.fslInf.rcvCd")
    private String ntlRcvCd;
    
    @JaxbMapping(objPath="cstmrDrctDbt.cstmrDrctDbtInf[0].cstmrDrctDbtAddtlInf.ntlTrsrInf.fslInf.rptFrms")
    private Date ntlRptFrms;
    
    @JaxbMapping(objPath="cstmrDrctDbt.cstmrDrctDbtInf[0].cstmrDrctDbtAddtlInf.ntlTrsrInf.fslInf.rptNb")
    private String ntlRptNb;
    
    @JaxbMapping(objPath="cstmrDrctDbt.cstmrDrctDbtInf[0].cstmrDrctDbtAddtlInf.ntlTrsrInf.nbOfTxs")
    private String ntlNbOfTxs;
    
    @JaxbMapping(objPath="cstmrDrctDbt.cstmrDrctDbtInf[0].cstmrDrctDbtAddtlInf.ntlTrsrInf.txsDtls[0]")
    private java.util.Set<Beps12700101TxsDtls2> txsDtls1;
    
    private Beps12700101CstmrDrctDbtInf fid;
    
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FID", nullable=false, updatable=false)
    public Beps12700101CstmrDrctDbtInf getFid() {
		return fid;
	}


	public void setFid(Beps12700101CstmrDrctDbtInf fid) {
		this.fid = fid;
	}
    
    
    /**
     * Returns the txsDtls1
     * 
     * @return the txsDtls1
     */
    	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL, mappedBy = "fid")
      public java.util.Set<Beps12700101TxsDtls2> getTxsDtls1() {
          return txsDtls1;
      }	 
       
    /**
     * Sets the txsDtls1
     *
     * @param newTxsDtls1 the new txsDtls1
     */

      public void  setTxsDtls1(java.util.Set<Beps12700101TxsDtls2> newTxsDtls1) {
          txsDtls1 = newTxsDtls1;
      }	  
	
    /** default constructor */
    public Beps12700101NtlTrsrInf() {
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
   * Returns the ntlFlowNb
   * 
   * @return the ntlFlowNb
   */
    @Column(name = "NTLFLOWNB")
    public String getNtlFlowNb() {
        return ntlFlowNb;
    }	 
     
  /**
   * Sets the ntlFlowNb
   *
   * @param newNtlFlowNb the new ntlFlowNb
   */

    public void  setNtlFlowNb(String newNtlFlowNb) {
        ntlFlowNb = newNtlFlowNb;
    }	  
  /**
   * Returns the ntlTlAmt
   * 
   * @return the ntlTlAmt
   */
    @Column(name = "NTLTLAMT")
    public Double getNtlTlAmt() {
        return ntlTlAmt;
    }	 
     
  /**
   * Sets the ntlTlAmt
   *
   * @param newNtlTlAmt the new ntlTlAmt
   */

    public void  setNtlTlAmt(Double newNtlTlAmt) {
        ntlTlAmt = newNtlTlAmt;
    }	  
  /**
   * Returns the ntlRptCd
   * 
   * @return the ntlRptCd
   */
    @Column(name = "NTLRPTCD")
    public String getNtlRptCd() {
        return ntlRptCd;
    }	 
     
  /**
   * Sets the ntlRptCd
   *
   * @param newNtlRptCd the new ntlRptCd
   */

    public void  setNtlRptCd(String newNtlRptCd) {
        ntlRptCd = newNtlRptCd;
    }	  
  /**
   * Returns the ntlRcvCd
   * 
   * @return the ntlRcvCd
   */
    @Column(name = "NTLRCVCD")
    public String getNtlRcvCd() {
        return ntlRcvCd;
    }	 
     
  /**
   * Sets the ntlRcvCd
   *
   * @param newNtlRcvCd the new ntlRcvCd
   */

    public void  setNtlRcvCd(String newNtlRcvCd) {
        ntlRcvCd = newNtlRcvCd;
    }	  
  /**
   * Returns the ntlRptFrms
   * 
   * @return the ntlRptFrms
   */
    @Column(name = "NTLRPTFRMS")
    public Date getNtlRptFrms() {
        return ntlRptFrms;
    }	 
     
  /**
   * Sets the ntlRptFrms
   *
   * @param newNtlRptFrms the new ntlRptFrms
   */

    public void  setNtlRptFrms(Date newNtlRptFrms) {
        ntlRptFrms = newNtlRptFrms;
    }	  
  /**
   * Returns the ntlRptNb
   * 
   * @return the ntlRptNb
   */
    @Column(name = "NTLRPTNB")
    public String getNtlRptNb() {
        return ntlRptNb;
    }	 
     
  /**
   * Sets the ntlRptNb
   *
   * @param newNtlRptNb the new ntlRptNb
   */

    public void  setNtlRptNb(String newNtlRptNb) {
        ntlRptNb = newNtlRptNb;
    }	  
  /**
   * Returns the ntlNbOfTxs
   * 
   * @return the ntlNbOfTxs
   */
    @Column(name = "NTLNBOFTXS")
    public String getNtlNbOfTxs() {
        return ntlNbOfTxs;
    }	 
     
  /**
   * Sets the ntlNbOfTxs
   *
   * @param newNtlNbOfTxs the new ntlNbOfTxs
   */

    public void  setNtlNbOfTxs(String newNtlNbOfTxs) {
        ntlNbOfTxs = newNtlNbOfTxs;
    }	  
    
    
}    
    