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
 * Beps12100101 generated by ParseSampleXml
 */

@Entity
@Table(name = "T_C2_BEPS_121_HDR")
public class Beps12100101 implements java.io.Serializable {

	// Fields
	@JaxbMapping(objPath = "")
	private Integer id;

	@JaxbMapping(objPath = "cstmrCdtTrf.pKGGrpHdr.msgId")
	private String msgId;

	@JaxbMapping(objPath = "cstmrCdtTrf.pKGGrpHdr.creDtTm")
	private Date creDtTm;

	@JaxbMapping(objPath = "cstmrCdtTrf.pKGGrpHdr.instgPty.instgDrctPty")
	private String instgDrctPty;

	@JaxbMapping(objPath = "cstmrCdtTrf.pKGGrpHdr.instdPty.instdDrctPty")
	private String instdDrctPty;

	@JaxbMapping(objPath = "cstmrCdtTrf.pKGGrpHdr.nbOfTxs")
	private String nbOfTxs;

	@JaxbMapping(objPath = "cstmrCdtTrf.pKGGrpHdr.ctrlSum.value")
	private Double ctrlSum;

	@JaxbMapping(objPath = "cstmrCdtTrf.pKGGrpHdr.sysCd")
	private String sysCd;

	@JaxbMapping(objPath = "cstmrCdtTrf.pKGGrpHdr.rmk")
	private String rmk;

	@JaxbMapping(objPath = "cstmrCdtTrf.nPCPrcInf.prcSts")
	private String prcSts;

	@JaxbMapping(objPath = "cstmrCdtTrf.nPCPrcInf.prcCd")
	private String prcCd;

	@JaxbMapping(objPath = "cstmrCdtTrf.nPCPrcInf.rjctInf")
	private String rjctInf;

	@JaxbMapping(objPath = "cstmrCdtTrf.nPCPrcInf.netgDt")
	private Date netgDt;

	@JaxbMapping(objPath = "cstmrCdtTrf.nPCPrcInf.netgRnd")
	private String netgRnd;

	@JaxbMapping(objPath = "cstmrCdtTrf.nPCPrcInf.sttlmDt")
	private Date sttlmDt;

	@JaxbMapping(objPath = "cstmrCdtTrf.nPCPrcInf.rcvTm")
	private Date rcvTm;

	@JaxbMapping(objPath = "cstmrCdtTrf.nPCPrcInf.trnsmtTm")
	private Date trnsmtTm;

	@JaxbMapping(objPath = "cstmrCdtTrf.cstmrCdtTrfInf[0]")
	private java.util.Set<Beps12100101CstmrCdtTrfInf> cstmrCdtTrfInf;

	/** default constructor */
	public Beps12100101() {
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
	 * Returns the msgId
	 * 
	 * @return the msgId
	 */
	@Column(name = "MSGID")
	public String getMsgId() {
		return msgId;
	}

	/**
	 * Sets the msgId
	 * 
	 * @param newMsgId
	 *            the new msgId
	 */

	public void setMsgId(String newMsgId) {
		msgId = newMsgId;
	}

	/**
	 * Returns the creDtTm
	 * 
	 * @return the creDtTm
	 */
	@Column(name = "CREDTTM")
	public Date getCreDtTm() {
		return creDtTm;
	}

	/**
	 * Sets the creDtTm
	 * 
	 * @param newCreDtTm
	 *            the new creDtTm
	 */

	public void setCreDtTm(Date newCreDtTm) {
		creDtTm = newCreDtTm;
	}

	/**
	 * Returns the instgDrctPty
	 * 
	 * @return the instgDrctPty
	 */
	@Column(name = "INSTGDRCTPTY")
	public String getInstgDrctPty() {
		return instgDrctPty;
	}

	/**
	 * Sets the instgDrctPty
	 * 
	 * @param newInstgDrctPty
	 *            the new instgDrctPty
	 */

	public void setInstgDrctPty(String newInstgDrctPty) {
		instgDrctPty = newInstgDrctPty;
	}

	/**
	 * Returns the instdDrctPty
	 * 
	 * @return the instdDrctPty
	 */
	@Column(name = "INSTDDRCTPTY")
	public String getInstdDrctPty() {
		return instdDrctPty;
	}

	/**
	 * Sets the instdDrctPty
	 * 
	 * @param newInstdDrctPty
	 *            the new instdDrctPty
	 */

	public void setInstdDrctPty(String newInstdDrctPty) {
		instdDrctPty = newInstdDrctPty;
	}

	/**
	 * Returns the nbOfTxs
	 * 
	 * @return the nbOfTxs
	 */
	@Column(name = "NBOFTXS")
	public String getNbOfTxs() {
		return nbOfTxs;
	}

	/**
	 * Sets the nbOfTxs
	 * 
	 * @param newNbOfTxs
	 *            the new nbOfTxs
	 */

	public void setNbOfTxs(String newNbOfTxs) {
		nbOfTxs = newNbOfTxs;
	}

	/**
	 * Returns the ctrlSum
	 * 
	 * @return the ctrlSum
	 */
	@Column(name = "CTRLSUM")
	public Double getCtrlSum() {
		return ctrlSum;
	}

	/**
	 * Sets the ctrlSum
	 * 
	 * @param newCtrlSum
	 *            the new ctrlSum
	 */

	public void setCtrlSum(Double newCtrlSum) {
		ctrlSum = newCtrlSum;
	}

	/**
	 * Returns the sysCd
	 * 
	 * @return the sysCd
	 */
	@Column(name = "SYSCD")
	public String getSysCd() {
		return sysCd;
	}

	/**
	 * Sets the sysCd
	 * 
	 * @param newSysCd
	 *            the new sysCd
	 */

	public void setSysCd(String newSysCd) {
		sysCd = newSysCd;
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
	 * @param newRmk
	 *            the new rmk
	 */

	public void setRmk(String newRmk) {
		rmk = newRmk;
	}

	/**
	 * Returns the prcSts
	 * 
	 * @return the prcSts
	 */
	@Column(name = "PRCSTS")
	public String getPrcSts() {
		return prcSts;
	}

	/**
	 * Sets the prcSts
	 * 
	 * @param newPrcSts
	 *            the new prcSts
	 */

	public void setPrcSts(String newPrcSts) {
		prcSts = newPrcSts;
	}

	/**
	 * Returns the prcCd
	 * 
	 * @return the prcCd
	 */
	@Column(name = "PRCCD")
	public String getPrcCd() {
		return prcCd;
	}

	/**
	 * Sets the prcCd
	 * 
	 * @param newPrcCd
	 *            the new prcCd
	 */

	public void setPrcCd(String newPrcCd) {
		prcCd = newPrcCd;
	}

	/**
	 * Returns the rjctInf
	 * 
	 * @return the rjctInf
	 */
	@Column(name = "RJCTINF")
	public String getRjctInf() {
		return rjctInf;
	}

	/**
	 * Sets the rjctInf
	 * 
	 * @param newRjctInf
	 *            the new rjctInf
	 */

	public void setRjctInf(String newRjctInf) {
		rjctInf = newRjctInf;
	}

	/**
	 * Returns the netgDt
	 * 
	 * @return the netgDt
	 */
	@Column(name = "NETGDT")
	public Date getNetgDt() {
		return netgDt;
	}

	/**
	 * Sets the netgDt
	 * 
	 * @param newNetgDt
	 *            the new netgDt
	 */

	public void setNetgDt(Date newNetgDt) {
		netgDt = newNetgDt;
	}

	/**
	 * Returns the netgRnd
	 * 
	 * @return the netgRnd
	 */
	@Column(name = "NETGRND")
	public String getNetgRnd() {
		return netgRnd;
	}

	/**
	 * Sets the netgRnd
	 * 
	 * @param newNetgRnd
	 *            the new netgRnd
	 */

	public void setNetgRnd(String newNetgRnd) {
		netgRnd = newNetgRnd;
	}

	/**
	 * Returns the sttlmDt
	 * 
	 * @return the sttlmDt
	 */
	@Column(name = "STTLMDT")
	public Date getSttlmDt() {
		return sttlmDt;
	}

	/**
	 * Sets the sttlmDt
	 * 
	 * @param newSttlmDt
	 *            the new sttlmDt
	 */

	public void setSttlmDt(Date newSttlmDt) {
		sttlmDt = newSttlmDt;
	}

	/**
	 * Returns the rcvTm
	 * 
	 * @return the rcvTm
	 */
	@Column(name = "RCVTM")
	public Date getRcvTm() {
		return rcvTm;
	}

	/**
	 * Sets the rcvTm
	 * 
	 * @param newRcvTm
	 *            the new rcvTm
	 */

	public void setRcvTm(Date newRcvTm) {
		rcvTm = newRcvTm;
	}

	/**
	 * Returns the trnsmtTm
	 * 
	 * @return the trnsmtTm
	 */
	@Column(name = "TRNSMTTM")
	public Date getTrnsmtTm() {
		return trnsmtTm;
	}

	/**
	 * Sets the trnsmtTm
	 * 
	 * @param newTrnsmtTm
	 *            the new trnsmtTm
	 */

	public void setTrnsmtTm(Date newTrnsmtTm) {
		trnsmtTm = newTrnsmtTm;
	}

	/**
	 * Returns the cstmrCdtTrfInf
	 * 
	 * @return the cstmrCdtTrfInf
	 */
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "fid")
	public java.util.Set<Beps12100101CstmrCdtTrfInf> getCstmrCdtTrfInf() {
		return cstmrCdtTrfInf;
	}

	/**
	 * Sets the cstmrCdtTrfInf
	 * 
	 * @param newCstmrCdtTrfInf
	 *            the new cstmrCdtTrfInf
	 */

	public void setCstmrCdtTrfInf(
			java.util.Set<Beps12100101CstmrCdtTrfInf> newCstmrCdtTrfInf) {
		cstmrCdtTrfInf = newCstmrCdtTrfInf;
	}
}