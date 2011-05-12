//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 03:04:15 ���� CST 
//


package com.xml.iso20022.camt.v00500104;

import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PaymentSearch3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentSearch3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxRef" type="{urn:swift:xsd:camt.005.001.04}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TrfValDt" type="{urn:swift:xsd:camt.005.001.04}DateAndDateTimeSearchChoice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InstrRef" type="{urn:swift:xsd:camt.005.001.04}PaymentIdentification3Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InstrSts" type="{urn:swift:xsd:camt.005.001.04}InstructionStatusSearch3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InstdAmt" type="{urn:swift:xsd:camt.005.001.04}AmountRangeChoice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InstdAmtCcy" type="{urn:swift:xsd:camt.005.001.04}CurrencyCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CdtDbtInd" type="{urn:swift:xsd:camt.005.001.04}CreditDebitCode" minOccurs="0"/>
 *         &lt;element name="IntrBkSttlmAmt" type="{urn:swift:xsd:camt.005.001.04}AmountRangeChoice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IntrBkSttlmAmtCcy" type="{urn:swift:xsd:camt.005.001.04}CurrencyCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PmtMtd" type="{urn:swift:xsd:camt.005.001.04}PaymentOrigin1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Prty" type="{urn:swift:xsd:camt.005.001.04}PriorityCodeChoice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrcgVldtyTm" type="{urn:swift:xsd:camt.005.001.04}DateTimePeriodChoice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Instr" type="{urn:swift:xsd:camt.005.001.04}Instruction1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PmtTp" type="{urn:swift:xsd:camt.005.001.04}PaymentType2Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PmtInstrRef" type="{urn:swift:xsd:camt.005.001.04}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IntrBkValDt" type="{urn:swift:xsd:camt.005.001.04}ISODate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RltdRef" type="{urn:swift:xsd:camt.005.001.04}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PmtTxPty" type="{urn:swift:xsd:camt.005.001.04}PaymentTransactionParty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSearch3", propOrder = {
    "txRef",
    "trfValDt",
    "instrRef",
    "instrSts",
    "instdAmt",
    "instdAmtCcy",
    "cdtDbtInd",
    "intrBkSttlmAmt",
    "intrBkSttlmAmtCcy",
    "pmtMtd",
    "prty",
    "prcgVldtyTm",
    "instr",
    "pmtTp",
    "pmtInstrRef",
    "intrBkValDt",
    "rltdRef",
    "pmtTxPty"
})
public class PaymentSearch3 {

    @XmlElement(name = "TxRef")
    protected List<String> txRef = new Vector<String>();
    @XmlElement(name = "TrfValDt")
    protected List<DateAndDateTimeSearchChoice> trfValDt = new Vector<DateAndDateTimeSearchChoice>();
    @XmlElement(name = "InstrRef")
    protected List<PaymentIdentification3Choice> instrRef = new Vector<PaymentIdentification3Choice>();
    @XmlElement(name = "InstrSts")
    protected List<InstructionStatusSearch3> instrSts = new Vector<InstructionStatusSearch3>();
    @XmlElement(name = "InstdAmt")
    protected List<AmountRangeChoice> instdAmt = new Vector<AmountRangeChoice>();
    @XmlElement(name = "InstdAmtCcy")
    protected List<String> instdAmtCcy = new Vector<String>();
    @XmlElement(name = "CdtDbtInd")
    protected String cdtDbtInd;
    @XmlElement(name = "IntrBkSttlmAmt")
    protected List<AmountRangeChoice> intrBkSttlmAmt = new Vector<AmountRangeChoice>();
    @XmlElement(name = "IntrBkSttlmAmtCcy")
    protected List<String> intrBkSttlmAmtCcy = new Vector<String>();
    @XmlElement(name = "PmtMtd")
    protected List<PaymentOrigin1Choice> pmtMtd = new Vector<PaymentOrigin1Choice>();
    @XmlElement(name = "Prty")
    protected List<PriorityCodeChoice> prty = new Vector<PriorityCodeChoice>();
    @XmlElement(name = "PrcgVldtyTm")
    protected List<DateTimePeriodChoice> prcgVldtyTm = new Vector<DateTimePeriodChoice>();
    @XmlElement(name = "Instr")
    protected List<String> instr = new Vector<String>();
    @XmlElement(name = "PmtTp")
    protected List<PaymentType2Choice> pmtTp = new Vector<PaymentType2Choice>();
    @XmlElement(name = "PmtInstrRef")
    protected List<String> pmtInstrRef = new Vector<String>();
    @XmlElement(name = "IntrBkValDt", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected List<Date> intrBkValDt = new Vector<Date>();
    @XmlElement(name = "RltdRef")
    protected List<String> rltdRef = new Vector<String>();
    @XmlElement(name = "PmtTxPty")
    protected PaymentTransactionParty pmtTxPty;

    /**
     * Gets the value of the txRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTxRef() {
        if (txRef == null) {
            txRef = new Vector<String>();
        }
        return this.txRef;
    }

    /**
     * Gets the value of the trfValDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trfValDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrfValDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndDateTimeSearchChoice }
     * 
     * 
     */
    public List<DateAndDateTimeSearchChoice> getTrfValDt() {
        if (trfValDt == null) {
            trfValDt = new Vector<DateAndDateTimeSearchChoice>();
        }
        return this.trfValDt;
    }

    /**
     * Gets the value of the instrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentIdentification3Choice }
     * 
     * 
     */
    public List<PaymentIdentification3Choice> getInstrRef() {
        if (instrRef == null) {
            instrRef = new Vector<PaymentIdentification3Choice>();
        }
        return this.instrRef;
    }

    /**
     * Gets the value of the instrSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionStatusSearch3 }
     * 
     * 
     */
    public List<InstructionStatusSearch3> getInstrSts() {
        if (instrSts == null) {
            instrSts = new Vector<InstructionStatusSearch3>();
        }
        return this.instrSts;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountRangeChoice }
     * 
     * 
     */
    public List<AmountRangeChoice> getInstdAmt() {
        if (instdAmt == null) {
            instdAmt = new Vector<AmountRangeChoice>();
        }
        return this.instdAmt;
    }

    /**
     * Gets the value of the instdAmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instdAmtCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstdAmtCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInstdAmtCcy() {
        if (instdAmtCcy == null) {
            instdAmtCcy = new Vector<String>();
        }
        return this.instdAmtCcy;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtDbtInd(String value) {
        this.cdtDbtInd = value;
    }

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrBkSttlmAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrBkSttlmAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountRangeChoice }
     * 
     * 
     */
    public List<AmountRangeChoice> getIntrBkSttlmAmt() {
        if (intrBkSttlmAmt == null) {
            intrBkSttlmAmt = new Vector<AmountRangeChoice>();
        }
        return this.intrBkSttlmAmt;
    }

    /**
     * Gets the value of the intrBkSttlmAmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrBkSttlmAmtCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrBkSttlmAmtCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIntrBkSttlmAmtCcy() {
        if (intrBkSttlmAmtCcy == null) {
            intrBkSttlmAmtCcy = new Vector<String>();
        }
        return this.intrBkSttlmAmtCcy;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtMtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtMtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentOrigin1Choice }
     * 
     * 
     */
    public List<PaymentOrigin1Choice> getPmtMtd() {
        if (pmtMtd == null) {
            pmtMtd = new Vector<PaymentOrigin1Choice>();
        }
        return this.pmtMtd;
    }

    /**
     * Gets the value of the prty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorityCodeChoice }
     * 
     * 
     */
    public List<PriorityCodeChoice> getPrty() {
        if (prty == null) {
            prty = new Vector<PriorityCodeChoice>();
        }
        return this.prty;
    }

    /**
     * Gets the value of the prcgVldtyTm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prcgVldtyTm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrcgVldtyTm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimePeriodChoice }
     * 
     * 
     */
    public List<DateTimePeriodChoice> getPrcgVldtyTm() {
        if (prcgVldtyTm == null) {
            prcgVldtyTm = new Vector<DateTimePeriodChoice>();
        }
        return this.prcgVldtyTm;
    }

    /**
     * Gets the value of the instr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInstr() {
        if (instr == null) {
            instr = new Vector<String>();
        }
        return this.instr;
    }

    /**
     * Gets the value of the pmtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentType2Choice }
     * 
     * 
     */
    public List<PaymentType2Choice> getPmtTp() {
        if (pmtTp == null) {
            pmtTp = new Vector<PaymentType2Choice>();
        }
        return this.pmtTp;
    }

    /**
     * Gets the value of the pmtInstrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtInstrRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInstrRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPmtInstrRef() {
        if (pmtInstrRef == null) {
            pmtInstrRef = new Vector<String>();
        }
        return this.pmtInstrRef;
    }

    /**
     * Gets the value of the intrBkValDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrBkValDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrBkValDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<Date> getIntrBkValDt() {
        if (intrBkValDt == null) {
            intrBkValDt = new Vector<Date>();
        }
        return this.intrBkValDt;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRltdRef() {
        if (rltdRef == null) {
            rltdRef = new Vector<String>();
        }
        return this.rltdRef;
    }

    /**
     * Gets the value of the pmtTxPty property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionParty }
     *     
     */
    public PaymentTransactionParty getPmtTxPty() {
        return pmtTxPty;
    }

    /**
     * Sets the value of the pmtTxPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionParty }
     *     
     */
    public void setPmtTxPty(PaymentTransactionParty value) {
        this.pmtTxPty = value;
    }

}
