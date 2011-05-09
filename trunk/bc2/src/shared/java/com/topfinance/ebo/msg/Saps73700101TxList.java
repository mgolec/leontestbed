package com.topfinance.ebo.msg;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Saps73700101TxList generated by ParseSampleXml
 */

@Entity
@Table(name = "t_c2_saps_737")
public class Saps73700101TxList implements java.io.Serializable {

	// Fields
	@JaxbMapping(objPath = "")
	private Integer id;

	@JaxbMapping(objPath = "balWorkDayChckngAppl.balWorkDayChckngApplInf.txList[0].mmbId")
	private String mmbId;

	@JaxbMapping(objPath = "balWorkDayChckngAppl.balWorkDayChckngApplInf.txList[0].mmbId")
	private String initlAmt;

	private Saps73700101 fid;

	/** default constructor */
	public Saps73700101TxList() {
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
	 * @param newid
	 *            the new id
	 */

	public void setid(Integer newid) {
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
	 * @param newMmbId
	 *            the new mmbId
	 */

	public void setMmbId(String newMmbId) {
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
	 * @param newInitlAmt
	 *            the new initlAmt
	 */

	public void setInitlAmt(String newInitlAmt) {
		initlAmt = newInitlAmt;
	}

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FID", nullable=false, updatable=false)
	public Saps73700101 getFid() {
		return fid;
	}


	public void setFid(Saps73700101 fid) {
		this.fid = fid;
	}

	@Override
	public String toString() {
		return "Saps73700101TxList [id=" + id + ", +fid=" + fid.getid() + ", + mmbId=" + mmbId
				+ ", initlAmt=" + initlAmt + "]";
	}

}
