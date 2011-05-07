package com.topfinance.ebo.msg;

import com.topfinance.ebo.msg.JaxbMapping;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Saps73700101TxList generated by ParseSampleXml
 */
 
@Entity
@Table(name = "T_MSG_SAPS_737_001_01___TxList")
public class Saps73700101TxList  implements java.io.Serializable {

    // Fields 
    @JaxbMapping(objPath="")
    private Integer id;
    
    @JaxbMapping(objPath="balWorkDayChckngAppl.balWorkDayChckngApplInf.txList[0].mmbId")
    private String mmbId;
    
    @JaxbMapping(objPath="balWorkDayChckngAppl.balWorkDayChckngApplInf.txList[0].mmbId")
    private String initlAmt;
    
    
	
    /** default constructor */
    public Saps73700101TxList() {
    }
	
	
  /**
   * Returns the id
   * 
   * @return the id
   */
  @Id
    @Column(name = "ID")
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
   * Returns the mmbId
   * 
   * @return the mmbId
   */
    @Column(name = "MMBID")
    public String getMmbId() {
        return mmbId;
    }	 
     
  /**
   * Sets the mmbId
   *
   * @param newMmbId the new mmbId
   */

    public void  setMmbId(String newMmbId) {
        mmbId = newMmbId;
    }	  
  /**
   * Returns the initlAmt
   * 
   * @return the initlAmt
   */
    @Column(name = "INITLAMT")
    public String getInitlAmt() {
        return initlAmt;
    }	 
     
  /**
   * Sets the initlAmt
   *
   * @param newInitlAmt the new initlAmt
   */

    public void  setInitlAmt(String newInitlAmt) {
        initlAmt = newInitlAmt;
    }


@Override
public String toString() {
	return "Saps73700101TxList [id=" + id + ", mmbId=" + mmbId + ", initlAmt="
			+ initlAmt + "]";
}	  
    
    
}    
    
