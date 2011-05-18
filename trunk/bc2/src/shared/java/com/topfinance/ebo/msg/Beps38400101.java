package com.topfinance.ebo.msg;

import com.topfinance.ebo.msg.JaxbMapping;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 * Beps38400101 generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_BEPS_384")
public class Beps38400101  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="btchCstmrsCtrctMg.btchCstmrsCtrctMgInf.agrmtDtls[0].chngTpCd")
    private String chngTp;
    
    @JaxbMapping(objPath="btchCstmrsCtrctMg.btchCstmrsCtrctMgInf.agrmtDtls[0].agrmtNb")
    private String agrmtNb;
    
    @JaxbMapping(objPath="btchCstmrsCtrctMg.btchCstmrsCtrctMgInf.agrmtDtls[0].dbtr.nm")
    private String dbtrNm;
    
    @JaxbMapping(objPath="btchCstmrsCtrctMg.btchCstmrsCtrctMgInf.agrmtDtls[0].dbtrAcct.id.othr.id")
    private String dbtrAcctId;
    
    @JaxbMapping(objPath="btchCstmrsCtrctMg.btchCstmrsCtrctMgInf.agrmtDtls[0].dbtrAcct.id.othr.issr")
    private String dbtrAcctIssr;
    
    @JaxbMapping(objPath="btchCstmrsCtrctMg.btchCstmrsCtrctMgInf.agrmtDtls[0].dbtrAgt.fiId.clrSysMmbId.mmbId")
    private String dbtrClrSysMmbId;
    
    @JaxbMapping(objPath="btchCstmrsCtrctMg.btchCstmrsCtrctMgInf.agrmtDtls[0].dbtrAgt.brnchId.id")
    private String dbtrAgtBrnchId;
    
    @JaxbMapping(objPath="btchCstmrsCtrctMg.btchCstmrsCtrctMgInf.agrmtDtls[0].cdtr.nm")
    private String cdtrNm;
    
	private Beps38400101Hdr fid;


	/** default constructor */
    public Beps38400101() {
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
   * Returns the chngTp
   * 
   * @return the chngTp
   */
    @Column(name = "CHNGTP")
    public String getChngTp() {
        return chngTp;
    }	 
     
  /**
   * Sets the chngTp
   *
   * @param newChngTp the new chngTp
   */

    public void  setChngTp(String newChngTp) {
        chngTp = newChngTp;
    }	  
  /**
   * Returns the agrmtNb
   * 
   * @return the agrmtNb
   */
    @Column(name = "AGRMTNB")
    public String getAgrmtNb() {
        return agrmtNb;
    }	 
     
  /**
   * Sets the agrmtNb
   *
   * @param newAgrmtNb the new agrmtNb
   */

    public void  setAgrmtNb(String newAgrmtNb) {
        agrmtNb = newAgrmtNb;
    }	  
  /**
   * Returns the dbtrNm
   * 
   * @return the dbtrNm
   */
    @Column(name = "DBTRNM")
    public String getDbtrNm() {
        return dbtrNm;
    }	 
     
  /**
   * Sets the dbtrNm
   *
   * @param newDbtrNm the new dbtrNm
   */

    public void  setDbtrNm(String newDbtrNm) {
        dbtrNm = newDbtrNm;
    }	  
  /**
   * Returns the dbtrAcctId
   * 
   * @return the dbtrAcctId
   */
    @Column(name = "DBTRACCTID")
    public String getDbtrAcctId() {
        return dbtrAcctId;
    }	 
     
  /**
   * Sets the dbtrAcctId
   *
   * @param newDbtrAcctId the new dbtrAcctId
   */

    public void  setDbtrAcctId(String newDbtrAcctId) {
        dbtrAcctId = newDbtrAcctId;
    }	  
  /**
   * Returns the dbtrAcctIssr
   * 
   * @return the dbtrAcctIssr
   */
    @Column(name = "DBTRACCTISSR")
    public String getDbtrAcctIssr() {
        return dbtrAcctIssr;
    }	 
     
  /**
   * Sets the dbtrAcctIssr
   *
   * @param newDbtrAcctIssr the new dbtrAcctIssr
   */

    public void  setDbtrAcctIssr(String newDbtrAcctIssr) {
        dbtrAcctIssr = newDbtrAcctIssr;
    }	  
  /**
   * Returns the dbtrClrSysMmbId
   * 
   * @return the dbtrClrSysMmbId
   */
    @Column(name = "DBTRCLRSYSMMBID")
    public String getDbtrClrSysMmbId() {
        return dbtrClrSysMmbId;
    }	 
     
  /**
   * Sets the dbtrClrSysMmbId
   *
   * @param newDbtrClrSysMmbId the new dbtrClrSysMmbId
   */

    public void  setDbtrClrSysMmbId(String newDbtrClrSysMmbId) {
        dbtrClrSysMmbId = newDbtrClrSysMmbId;
    }	  
  /**
   * Returns the dbtrAgtBrnchId
   * 
   * @return the dbtrAgtBrnchId
   */
    @Column(name = "DBTRAGTBRNCHID")
    public String getDbtrAgtBrnchId() {
        return dbtrAgtBrnchId;
    }	 
     
  /**
   * Sets the dbtrAgtBrnchId
   *
   * @param newDbtrAgtBrnchId the new dbtrAgtBrnchId
   */

    public void  setDbtrAgtBrnchId(String newDbtrAgtBrnchId) {
        dbtrAgtBrnchId = newDbtrAgtBrnchId;
    }	  
  /**
   * Returns the cdtrNm
   * 
   * @return the cdtrNm
   */
    @Column(name = "CDTRNM")
    public String getCdtrNm() {
        return cdtrNm;
    }	 
     
  /**
   * Sets the cdtrNm
   *
   * @param newCdtrNm the new cdtrNm
   */

    public void  setCdtrNm(String newCdtrNm) {
        cdtrNm = newCdtrNm;
    }	  
    
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FID", nullable=false, updatable=false)
    public Beps38400101Hdr getFid() {
		return fid;
	}


	public void setFid(Beps38400101Hdr fid) {
		this.fid = fid;
	}
    
}    
    