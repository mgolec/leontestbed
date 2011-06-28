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
 * Beps12700101TxsDtls generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_BEPS_127_APX_HB_MX")
public class Beps12700101TxsDtls1  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="cstmrDrctDbt.cstmrDrctDbtInf[0].cstmrDrctDbtAddtlInf.ntlTrsrInf.txsDtls[0].tpCd")
    private String credTpCd;
    
    @JaxbMapping(objPath="cstmrDrctDbt.cstmrDrctDbtInf[0].cstmrDrctDbtAddtlInf.ntlTrsrInf.txsDtls[0].sbjtCd")
    private String credSbjtCd;
    
    @JaxbMapping(objPath="cstmrDrctDbt.cstmrDrctDbtInf[0].cstmrDrctDbtAddtlInf.ntlTrsrInf.txsDtls[0].amt")
    private Double credAmt;
    
    private Beps12700101NtlTrsrCdtInf fid;
    
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FID", nullable=false, updatable=false)
    public Beps12700101NtlTrsrCdtInf getFid() {
		return fid;
	}


	public void setFid(Beps12700101NtlTrsrCdtInf fid) {
		this.fid = fid;
	}


	/** default constructor */
    public Beps12700101TxsDtls1() {
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
     * Returns the ntlTpCd
     * 
     * @return the ntlTpCd
     */
      @Column(name = "CREDTPCD")
      public String getCredTpCd() {
          return credTpCd;
      }	 
       
    /**
     * Sets the ntlTpCd
     *
     * @param newNtlTpCd the new ntlTpCd
     */

      public void  setCredTpCd(String newNtlTpCd) {
    	  credTpCd = newNtlTpCd;
      }	  
    /**
     * Returns the ntlCptlCd
     * 
     * @return the ntlCptlCd
     */
      @Column(name = "CREDSBJTCD")
      public String getCredSbjtCd() {
          return credSbjtCd;
      }	 
       
    /**
     * Sets the ntlCptlCd
     *
     * @param newNtlCptlCd the new ntlCptlCd
     */

      public void  setCredSbjtCd(String newNtlCptlCd) {
    	  credSbjtCd = newNtlCptlCd;
      }	  
    /**
     * Returns the ntlCptlAmt
     * 
     * @return the ntlCptlAmt
     */
      @Column(name = "CREDAMT")
      public Double getCredAmt() {
          return credAmt;
      }	 
       
    /**
     * Sets the ntlCptlAmt
     *
     * @param newNtlCptlAmt the new ntlCptlAmt
     */

      public void  setCredAmt(Double newNtlCptlAmt) {
    	  credAmt = newNtlCptlAmt;
      }	 
    
}    
    