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
 * Beps72300101DtlChckMsgRspnDtls generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_MSG_BEPS_723_001_01___DtlChckMsgRspnDtls")
public class Beps72300101DtlChckMsgRspnDtls  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="dtlChckRspn.dtlChckRspnInf.dtlChckMsgRspn.dtlChckMsgRspnDtls[0].sndRcvTp")
    private String infoSndRcvTp;
    
    @JaxbMapping(objPath="dtlChckRspn.dtlChckRspnInf.dtlChckMsgRspn.dtlChckMsgRspnDtls[0].mt")
    private String infoMT;
    
    @JaxbMapping(objPath="dtlChckRspn.dtlChckRspnInf.dtlChckMsgRspn.dtlChckMsgRspnDtls[0].nbOfDtls")
    private String infoNbOfDtls;
    
    @JaxbMapping(objPath="dtlChckRspn.dtlChckRspnInf.dtlChckMsgRspn.dtlChckMsgRspnDtls[0].orgnlMsgDtls[0]")
    private java.util.Set<Beps72300101OrgnlMsgDtls> orgnlMsgDtls;
    
    
	
    /** default constructor */
    public Beps72300101DtlChckMsgRspnDtls() {
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
   * Returns the infoSndRcvTp
   * 
   * @return the infoSndRcvTp
   */
    @Column(name = "INFOSNDRCVTP")
    public String getInfoSndRcvTp() {
        return infoSndRcvTp;
    }	 
     
  /**
   * Sets the infoSndRcvTp
   *
   * @param newInfoSndRcvTp the new infoSndRcvTp
   */

    public void  setInfoSndRcvTp(String newInfoSndRcvTp) {
        infoSndRcvTp = newInfoSndRcvTp;
    }	  
  /**
   * Returns the infoMT
   * 
   * @return the infoMT
   */
    @Column(name = "INFOMT")
    public String getInfoMT() {
        return infoMT;
    }	 
     
  /**
   * Sets the infoMT
   *
   * @param newInfoMT the new infoMT
   */

    public void  setInfoMT(String newInfoMT) {
        infoMT = newInfoMT;
    }	  
  /**
   * Returns the infoNbOfDtls
   * 
   * @return the infoNbOfDtls
   */
    @Column(name = "INFONBOFDTLS")
    public String getInfoNbOfDtls() {
        return infoNbOfDtls;
    }	 
     
  /**
   * Sets the infoNbOfDtls
   *
   * @param newInfoNbOfDtls the new infoNbOfDtls
   */

    public void  setInfoNbOfDtls(String newInfoNbOfDtls) {
        infoNbOfDtls = newInfoNbOfDtls;
    }	  
  /**
   * Returns the orgnlMsgDtls
   * 
   * @return the orgnlMsgDtls
   */
  	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL, mappedBy = "parent")
    public java.util.Set<Beps72300101OrgnlMsgDtls> getOrgnlMsgDtls() {
        return orgnlMsgDtls;
    }	 
     
  /**
   * Sets the orgnlMsgDtls
   *
   * @param newOrgnlMsgDtls the new orgnlMsgDtls
   */

    public void  setOrgnlMsgDtls(java.util.Set<Beps72300101OrgnlMsgDtls> newOrgnlMsgDtls) {
        orgnlMsgDtls = newOrgnlMsgDtls;
    }	  
    
    
}    
    
