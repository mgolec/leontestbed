package com.topfinance.ebo.msg;

import com.topfinance.ebo.msg.JaxbMapping;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;


/**
 * Beps13100101WthdrwngInf generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_MSG_BEPS_131_001_01___WthdrwngInf")
public class Beps13100101WthdrwngInf  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="realTmCstmrDrctDbt.realTmCstmrDrctDbtInf.realTmCstmrDrctDbtAddtlInf.wthdrwngInf.dbtrAcctTp.acctPmtTp")
    private String acctPmtTp;
    
    @JaxbMapping(objPath="realTmCstmrDrctDbt.realTmCstmrDrctDbtInf.realTmCstmrDrctDbtAddtlInf.wthdrwngInf.cdtrAcctTp.acctPmtTp")
    private String recAcctPmtTp;
    
    @JaxbMapping(objPath="realTmCstmrDrctDbt.realTmCstmrDrctDbtInf.realTmCstmrDrctDbtAddtlInf.wthdrwngInf.chckMd")
    private String chckMd;
    
    @JaxbMapping(objPath="realTmCstmrDrctDbt.realTmCstmrDrctDbtInf.realTmCstmrDrctDbtAddtlInf.wthdrwngInf.chckCdLen")
    private String chckCdLen;
    
    @JaxbMapping(objPath="realTmCstmrDrctDbt.realTmCstmrDrctDbtInf.realTmCstmrDrctDbtAddtlInf.wthdrwngInf.chckCd.cntt")
    private String cntt;
    
    
	
    /** default constructor */
    public Beps13100101WthdrwngInf() {
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
   * Returns the acctPmtTp
   * 
   * @return the acctPmtTp
   */
    @Column(name = "ACCTPMTTP")
    public String getAcctPmtTp() {
        return acctPmtTp;
    }	 
     
  /**
   * Sets the acctPmtTp
   *
   * @param newAcctPmtTp the new acctPmtTp
   */

    public void  setAcctPmtTp(String newAcctPmtTp) {
        acctPmtTp = newAcctPmtTp;
    }	  
  /**
   * Returns the recAcctPmtTp
   * 
   * @return the recAcctPmtTp
   */
    @Column(name = "RECACCTPMTTP")
    public String getRecAcctPmtTp() {
        return recAcctPmtTp;
    }	 
     
  /**
   * Sets the recAcctPmtTp
   *
   * @param newRecAcctPmtTp the new recAcctPmtTp
   */

    public void  setRecAcctPmtTp(String newRecAcctPmtTp) {
        recAcctPmtTp = newRecAcctPmtTp;
    }	  
  /**
   * Returns the chckMd
   * 
   * @return the chckMd
   */
    @Column(name = "CHCKMD")
    public String getChckMd() {
        return chckMd;
    }	 
     
  /**
   * Sets the chckMd
   *
   * @param newChckMd the new chckMd
   */

    public void  setChckMd(String newChckMd) {
        chckMd = newChckMd;
    }	  
  /**
   * Returns the chckCdLen
   * 
   * @return the chckCdLen
   */
    @Column(name = "CHCKCDLEN")
    public String getChckCdLen() {
        return chckCdLen;
    }	 
     
  /**
   * Sets the chckCdLen
   *
   * @param newChckCdLen the new chckCdLen
   */

    public void  setChckCdLen(String newChckCdLen) {
        chckCdLen = newChckCdLen;
    }	  
  /**
   * Returns the cntt
   * 
   * @return the cntt
   */
    @Column(name = "CNTT")
    public String getCntt() {
        return cntt;
    }	 
     
  /**
   * Sets the cntt
   *
   * @param newCntt the new cntt
   */

    public void  setCntt(String newCntt) {
        cntt = newCntt;
    }	  
    
    
}    
    
