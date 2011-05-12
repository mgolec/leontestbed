//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:53 ���� CST 
//


package com.xml.iso20022.camt.v00500104;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentReturnCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentReturnCriteria2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxRefInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="TrfValDtInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="InstrInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="InstrStsRtrCrit" type="{urn:swift:xsd:camt.005.001.04}InstructionStatusReturnCriteria" minOccurs="0"/>
 *         &lt;element name="InstdAmtInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="CdtDbtInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="IntrBkSttlmAmtInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="PrtyInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="PrcgVldtyTmInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="PurpInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="InstrCpyInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="PmtMsgTpInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="PmtTpInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="PmtInstrRefInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="IntrBkValDtInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="RltdRefInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="PmtMtdInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="DbtrInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="FrstAgtInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="InstgAgtCrspdtInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="InstdAgtCrspdtInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="IntrmyInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="FnlAgtInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="CdtrInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReturnCriteria2", propOrder = {
    "txRefInd",
    "trfValDtInd",
    "instrInd",
    "instrStsRtrCrit",
    "instdAmtInd",
    "cdtDbtInd",
    "intrBkSttlmAmtInd",
    "prtyInd",
    "prcgVldtyTmInd",
    "purpInd",
    "instrCpyInd",
    "pmtMsgTpInd",
    "pmtTpInd",
    "pmtInstrRefInd",
    "intrBkValDtInd",
    "rltdRefInd",
    "pmtMtdInd",
    "dbtrInd",
    "frstAgtInd",
    "instgAgtCrspdtInd",
    "instdAgtCrspdtInd",
    "intrmyInd",
    "fnlAgtInd",
    "cdtrInd"
})
public class PaymentReturnCriteria2 {

    @XmlElement(name = "TxRefInd")
    protected Boolean txRefInd;
    @XmlElement(name = "TrfValDtInd")
    protected Boolean trfValDtInd;
    @XmlElement(name = "InstrInd")
    protected Boolean instrInd;
    @XmlElement(name = "InstrStsRtrCrit")
    protected InstructionStatusReturnCriteria instrStsRtrCrit;
    @XmlElement(name = "InstdAmtInd")
    protected Boolean instdAmtInd;
    @XmlElement(name = "CdtDbtInd")
    protected Boolean cdtDbtInd;
    @XmlElement(name = "IntrBkSttlmAmtInd")
    protected Boolean intrBkSttlmAmtInd;
    @XmlElement(name = "PrtyInd")
    protected Boolean prtyInd;
    @XmlElement(name = "PrcgVldtyTmInd")
    protected Boolean prcgVldtyTmInd;
    @XmlElement(name = "PurpInd")
    protected Boolean purpInd;
    @XmlElement(name = "InstrCpyInd")
    protected Boolean instrCpyInd;
    @XmlElement(name = "PmtMsgTpInd")
    protected Boolean pmtMsgTpInd;
    @XmlElement(name = "PmtTpInd")
    protected Boolean pmtTpInd;
    @XmlElement(name = "PmtInstrRefInd")
    protected Boolean pmtInstrRefInd;
    @XmlElement(name = "IntrBkValDtInd")
    protected Boolean intrBkValDtInd;
    @XmlElement(name = "RltdRefInd")
    protected Boolean rltdRefInd;
    @XmlElement(name = "PmtMtdInd")
    protected Boolean pmtMtdInd;
    @XmlElement(name = "DbtrInd")
    protected Boolean dbtrInd;
    @XmlElement(name = "FrstAgtInd")
    protected Boolean frstAgtInd;
    @XmlElement(name = "InstgAgtCrspdtInd")
    protected Boolean instgAgtCrspdtInd;
    @XmlElement(name = "InstdAgtCrspdtInd")
    protected Boolean instdAgtCrspdtInd;
    @XmlElement(name = "IntrmyInd")
    protected Boolean intrmyInd;
    @XmlElement(name = "FnlAgtInd")
    protected Boolean fnlAgtInd;
    @XmlElement(name = "CdtrInd")
    protected Boolean cdtrInd;

    /**
     * Gets the value of the txRefInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTxRefInd() {
        return txRefInd;
    }

    /**
     * Sets the value of the txRefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTxRefInd(Boolean value) {
        this.txRefInd = value;
    }

    /**
     * Gets the value of the trfValDtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrfValDtInd() {
        return trfValDtInd;
    }

    /**
     * Sets the value of the trfValDtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrfValDtInd(Boolean value) {
        this.trfValDtInd = value;
    }

    /**
     * Gets the value of the instrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstrInd() {
        return instrInd;
    }

    /**
     * Sets the value of the instrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstrInd(Boolean value) {
        this.instrInd = value;
    }

    /**
     * Gets the value of the instrStsRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionStatusReturnCriteria }
     *     
     */
    public InstructionStatusReturnCriteria getInstrStsRtrCrit() {
        return instrStsRtrCrit;
    }

    /**
     * Sets the value of the instrStsRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionStatusReturnCriteria }
     *     
     */
    public void setInstrStsRtrCrit(InstructionStatusReturnCriteria value) {
        this.instrStsRtrCrit = value;
    }

    /**
     * Gets the value of the instdAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstdAmtInd() {
        return instdAmtInd;
    }

    /**
     * Sets the value of the instdAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstdAmtInd(Boolean value) {
        this.instdAmtInd = value;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCdtDbtInd(Boolean value) {
        this.cdtDbtInd = value;
    }

    /**
     * Gets the value of the intrBkSttlmAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrBkSttlmAmtInd() {
        return intrBkSttlmAmtInd;
    }

    /**
     * Sets the value of the intrBkSttlmAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrBkSttlmAmtInd(Boolean value) {
        this.intrBkSttlmAmtInd = value;
    }

    /**
     * Gets the value of the prtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtyInd() {
        return prtyInd;
    }

    /**
     * Sets the value of the prtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrtyInd(Boolean value) {
        this.prtyInd = value;
    }

    /**
     * Gets the value of the prcgVldtyTmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrcgVldtyTmInd() {
        return prcgVldtyTmInd;
    }

    /**
     * Sets the value of the prcgVldtyTmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrcgVldtyTmInd(Boolean value) {
        this.prcgVldtyTmInd = value;
    }

    /**
     * Gets the value of the purpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurpInd() {
        return purpInd;
    }

    /**
     * Sets the value of the purpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurpInd(Boolean value) {
        this.purpInd = value;
    }

    /**
     * Gets the value of the instrCpyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstrCpyInd() {
        return instrCpyInd;
    }

    /**
     * Sets the value of the instrCpyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstrCpyInd(Boolean value) {
        this.instrCpyInd = value;
    }

    /**
     * Gets the value of the pmtMsgTpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtMsgTpInd() {
        return pmtMsgTpInd;
    }

    /**
     * Sets the value of the pmtMsgTpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPmtMsgTpInd(Boolean value) {
        this.pmtMsgTpInd = value;
    }

    /**
     * Gets the value of the pmtTpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtTpInd() {
        return pmtTpInd;
    }

    /**
     * Sets the value of the pmtTpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPmtTpInd(Boolean value) {
        this.pmtTpInd = value;
    }

    /**
     * Gets the value of the pmtInstrRefInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtInstrRefInd() {
        return pmtInstrRefInd;
    }

    /**
     * Sets the value of the pmtInstrRefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPmtInstrRefInd(Boolean value) {
        this.pmtInstrRefInd = value;
    }

    /**
     * Gets the value of the intrBkValDtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrBkValDtInd() {
        return intrBkValDtInd;
    }

    /**
     * Sets the value of the intrBkValDtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrBkValDtInd(Boolean value) {
        this.intrBkValDtInd = value;
    }

    /**
     * Gets the value of the rltdRefInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRltdRefInd() {
        return rltdRefInd;
    }

    /**
     * Sets the value of the rltdRefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRltdRefInd(Boolean value) {
        this.rltdRefInd = value;
    }

    /**
     * Gets the value of the pmtMtdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtMtdInd() {
        return pmtMtdInd;
    }

    /**
     * Sets the value of the pmtMtdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPmtMtdInd(Boolean value) {
        this.pmtMtdInd = value;
    }

    /**
     * Gets the value of the dbtrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDbtrInd() {
        return dbtrInd;
    }

    /**
     * Sets the value of the dbtrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDbtrInd(Boolean value) {
        this.dbtrInd = value;
    }

    /**
     * Gets the value of the frstAgtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrstAgtInd() {
        return frstAgtInd;
    }

    /**
     * Sets the value of the frstAgtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrstAgtInd(Boolean value) {
        this.frstAgtInd = value;
    }

    /**
     * Gets the value of the instgAgtCrspdtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstgAgtCrspdtInd() {
        return instgAgtCrspdtInd;
    }

    /**
     * Sets the value of the instgAgtCrspdtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstgAgtCrspdtInd(Boolean value) {
        this.instgAgtCrspdtInd = value;
    }

    /**
     * Gets the value of the instdAgtCrspdtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstdAgtCrspdtInd() {
        return instdAgtCrspdtInd;
    }

    /**
     * Sets the value of the instdAgtCrspdtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstdAgtCrspdtInd(Boolean value) {
        this.instdAgtCrspdtInd = value;
    }

    /**
     * Gets the value of the intrmyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrmyInd() {
        return intrmyInd;
    }

    /**
     * Sets the value of the intrmyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrmyInd(Boolean value) {
        this.intrmyInd = value;
    }

    /**
     * Gets the value of the fnlAgtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFnlAgtInd() {
        return fnlAgtInd;
    }

    /**
     * Sets the value of the fnlAgtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFnlAgtInd(Boolean value) {
        this.fnlAgtInd = value;
    }

    /**
     * Gets the value of the cdtrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtrInd() {
        return cdtrInd;
    }

    /**
     * Sets the value of the cdtrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCdtrInd(Boolean value) {
        this.cdtrInd = value;
    }

}
