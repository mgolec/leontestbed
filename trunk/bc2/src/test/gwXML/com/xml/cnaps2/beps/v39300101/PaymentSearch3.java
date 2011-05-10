//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.10 at 04:00:27 ���� CST 
//


package com.xml.cnaps2.beps.v39300101;

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
 *         &lt;element name="TrfValDt" type="{urn:swift:xsd:camt.005.001.04}DateAndDateTimeSearchChoice" minOccurs="0"/>
 *         &lt;element name="InstrRef" type="{urn:swift:xsd:camt.005.001.04}PaymentIdentification3Choice" minOccurs="0"/>
 *         &lt;element name="InstrSts" type="{urn:swift:xsd:camt.005.001.04}InstructionStatusSearch3" minOccurs="0"/>
 *         &lt;element name="InstdAmt" type="{urn:swift:xsd:camt.005.001.04}AmountRangeChoice" minOccurs="0"/>
 *         &lt;element name="InstdAmtCcy" type="{urn:swift:xsd:camt.005.001.04}CurrencyCode" minOccurs="0"/>
 *         &lt;element name="CdtDbtInd" type="{urn:swift:xsd:camt.005.001.04}CreditDebitCode" minOccurs="0"/>
 *         &lt;element name="IntrBkSttlmAmt" type="{urn:swift:xsd:camt.005.001.04}AmountRangeChoice" minOccurs="0"/>
 *         &lt;element name="IntrBkSttlmAmtCcy" type="{urn:swift:xsd:camt.005.001.04}CurrencyCode" minOccurs="0"/>
 *         &lt;element name="PmtMtd" type="{urn:swift:xsd:camt.005.001.04}PaymentOrigin1Choice" minOccurs="0"/>
 *         &lt;element name="Prty" type="{urn:swift:xsd:camt.005.001.04}PriorityCodeChoice" minOccurs="0"/>
 *         &lt;element name="PrcgVldtyTm" type="{urn:swift:xsd:camt.005.001.04}DateTimePeriodChoice" minOccurs="0"/>
 *         &lt;element name="Instr" type="{urn:swift:xsd:camt.005.001.04}Instruction1Code" minOccurs="0"/>
 *         &lt;element name="PmtTp" type="{urn:swift:xsd:camt.005.001.04}PaymentType2Choice" minOccurs="0"/>
 *         &lt;element name="PmtInstrRef" type="{urn:swift:xsd:camt.005.001.04}Max35Text" minOccurs="0"/>
 *         &lt;element name="IntrBkValDt" type="{urn:swift:xsd:camt.005.001.04}ISODate" minOccurs="0"/>
 *         &lt;element name="RltdRef" type="{urn:swift:xsd:camt.005.001.04}Max35Text" minOccurs="0"/>
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
    protected DateAndDateTimeSearchChoice trfValDt;
    @XmlElement(name = "InstrRef")
    protected PaymentIdentification3Choice instrRef;
    @XmlElement(name = "InstrSts")
    protected InstructionStatusSearch3 instrSts;
    @XmlElement(name = "InstdAmt")
    protected AmountRangeChoice instdAmt;
    @XmlElement(name = "InstdAmtCcy")
    protected String instdAmtCcy;
    @XmlElement(name = "CdtDbtInd")
    protected String cdtDbtInd;
    @XmlElement(name = "IntrBkSttlmAmt")
    protected AmountRangeChoice intrBkSttlmAmt;
    @XmlElement(name = "IntrBkSttlmAmtCcy")
    protected String intrBkSttlmAmtCcy;
    @XmlElement(name = "PmtMtd")
    protected PaymentOrigin1Choice pmtMtd;
    @XmlElement(name = "Prty")
    protected PriorityCodeChoice prty;
    @XmlElement(name = "PrcgVldtyTm")
    protected DateTimePeriodChoice prcgVldtyTm;
    @XmlElement(name = "Instr")
    protected String instr;
    @XmlElement(name = "PmtTp")
    protected PaymentType2Choice pmtTp;
    @XmlElement(name = "PmtInstrRef")
    protected String pmtInstrRef;
    @XmlElement(name = "IntrBkValDt", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date intrBkValDt;
    @XmlElement(name = "RltdRef")
    protected String rltdRef;
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
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearchChoice }
     *     
     */
    public DateAndDateTimeSearchChoice getTrfValDt() {
        return trfValDt;
    }

    /**
     * Sets the value of the trfValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearchChoice }
     *     
     */
    public void setTrfValDt(DateAndDateTimeSearchChoice value) {
        this.trfValDt = value;
    }

    /**
     * Gets the value of the instrRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification3Choice }
     *     
     */
    public PaymentIdentification3Choice getInstrRef() {
        return instrRef;
    }

    /**
     * Sets the value of the instrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification3Choice }
     *     
     */
    public void setInstrRef(PaymentIdentification3Choice value) {
        this.instrRef = value;
    }

    /**
     * Gets the value of the instrSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionStatusSearch3 }
     *     
     */
    public InstructionStatusSearch3 getInstrSts() {
        return instrSts;
    }

    /**
     * Sets the value of the instrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionStatusSearch3 }
     *     
     */
    public void setInstrSts(InstructionStatusSearch3 value) {
        this.instrSts = value;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountRangeChoice }
     *     
     */
    public AmountRangeChoice getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRangeChoice }
     *     
     */
    public void setInstdAmt(AmountRangeChoice value) {
        this.instdAmt = value;
    }

    /**
     * Gets the value of the instdAmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstdAmtCcy() {
        return instdAmtCcy;
    }

    /**
     * Sets the value of the instdAmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstdAmtCcy(String value) {
        this.instdAmtCcy = value;
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
     * @return
     *     possible object is
     *     {@link AmountRangeChoice }
     *     
     */
    public AmountRangeChoice getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    /**
     * Sets the value of the intrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRangeChoice }
     *     
     */
    public void setIntrBkSttlmAmt(AmountRangeChoice value) {
        this.intrBkSttlmAmt = value;
    }

    /**
     * Gets the value of the intrBkSttlmAmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrBkSttlmAmtCcy() {
        return intrBkSttlmAmtCcy;
    }

    /**
     * Sets the value of the intrBkSttlmAmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrBkSttlmAmtCcy(String value) {
        this.intrBkSttlmAmtCcy = value;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOrigin1Choice }
     *     
     */
    public PaymentOrigin1Choice getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOrigin1Choice }
     *     
     */
    public void setPmtMtd(PaymentOrigin1Choice value) {
        this.pmtMtd = value;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityCodeChoice }
     *     
     */
    public PriorityCodeChoice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityCodeChoice }
     *     
     */
    public void setPrty(PriorityCodeChoice value) {
        this.prty = value;
    }

    /**
     * Gets the value of the prcgVldtyTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public DateTimePeriodChoice getPrcgVldtyTm() {
        return prcgVldtyTm;
    }

    /**
     * Sets the value of the prcgVldtyTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public void setPrcgVldtyTm(DateTimePeriodChoice value) {
        this.prcgVldtyTm = value;
    }

    /**
     * Gets the value of the instr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstr() {
        return instr;
    }

    /**
     * Sets the value of the instr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstr(String value) {
        this.instr = value;
    }

    /**
     * Gets the value of the pmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType2Choice }
     *     
     */
    public PaymentType2Choice getPmtTp() {
        return pmtTp;
    }

    /**
     * Sets the value of the pmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType2Choice }
     *     
     */
    public void setPmtTp(PaymentType2Choice value) {
        this.pmtTp = value;
    }

    /**
     * Gets the value of the pmtInstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtInstrRef() {
        return pmtInstrRef;
    }

    /**
     * Sets the value of the pmtInstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtInstrRef(String value) {
        this.pmtInstrRef = value;
    }

    /**
     * Gets the value of the intrBkValDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getIntrBkValDt() {
        return intrBkValDt;
    }

    /**
     * Sets the value of the intrBkValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrBkValDt(Date value) {
        this.intrBkValDt = value;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRltdRef(String value) {
        this.rltdRef = value;
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
