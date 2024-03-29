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
 * Beps13100101EndrsrDtls generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_C2_BEPS_131_APX_PJJL_NM")
public class Beps13100101EndrsrDtls  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="realTmCstmrDrctDbt.realTmCstmrDrctDbtInf.realTmCstmrDrctDbtAddtlInf.realTmBllInf.endrsrDtls[0].nm")
    private String nm;
    
    private Beps13100101RealTmBllInf fid;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FID", nullable=false, updatable=false)
    public Beps13100101RealTmBllInf getFid() {
		return fid;
	}


	public void setFid(Beps13100101RealTmBllInf eid) {
		this.fid = eid;
	}
	
    /** default constructor */
    public Beps13100101EndrsrDtls() {
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
   * Returns the nm
   * 
   * @return the nm
   */
    @Column(name = "NOTENMLIST")
    public String getNm() {
        return nm;
    }	 
     
  /**
   * Sets the nm
   *
   * @param newNm the new nm
   */

    public void  setNm(String newNm) {
        nm = newNm;
    }	  
    
    
}    
    
