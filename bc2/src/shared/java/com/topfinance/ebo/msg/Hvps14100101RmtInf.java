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
 * Hvps14100101RmtInf generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_MSG_HVPS_141_001_01___RmtInf")
public class Hvps14100101RmtInf  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="finInstnCdtTrf.cdtTrfTxInf.rmtInf[0].ustrd[0]")
    private String bizTcCd;
    
    @JaxbMapping(objPath="finInstnCdtTrf.cdtTrfTxInf.rmtInf[0].ustrd[0]")
    private String bizNum;
    
    @JaxbMapping(objPath="finInstnCdtTrf.cdtTrfTxInf.rmtInf[0].ustrd[0]")
    private String rmk;
    
    private Hvps14100101 fid;
    
    
	
    /** default constructor */
    public Hvps14100101RmtInf() {
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
   * Returns the bizTcCd
   * 
   * @return the bizTcCd
   */
    @Column(name = "BIZTCCD")
    public String getBizTcCd() {
        return bizTcCd;
    }	 
     
  /**
   * Sets the bizTcCd
   *
   * @param newBizTcCd the new bizTcCd
   */

    public void  setBizTcCd(String newBizTcCd) {
        bizTcCd = newBizTcCd;
    }	  
  /**
   * Returns the bizNum
   * 
   * @return the bizNum
   */
    @Column(name = "BIZNUM")
    public String getBizNum() {
        return bizNum;
    }	 
     
  /**
   * Sets the bizNum
   *
   * @param newBizNum the new bizNum
   */

    public void  setBizNum(String newBizNum) {
        bizNum = newBizNum;
    }	  
  /**
   * Returns the rmk
   * 
   * @return the rmk
   */
    @Column(name = "RMK")
    public String getRmk() {
        return rmk;
    }	 
     
  /**
   * Sets the rmk
   *
   * @param newRmk the new rmk
   */

    public void  setRmk(String newRmk) {
        rmk = newRmk;
    }	  
    
    
}    
    
