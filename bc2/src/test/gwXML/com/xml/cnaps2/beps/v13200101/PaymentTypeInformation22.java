//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 05:12:17 ���� CST 
//


package com.xml.cnaps2.beps.v13200101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTypeInformation22 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTypeInformation22">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.03}Priority2Code" minOccurs="0"/>
 *         &lt;element name="ClrChanl" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.03}ClearingChannel2Code" minOccurs="0"/>
 *         &lt;element name="SvcLvl" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.03}ServiceLevel8Choice" minOccurs="0"/>
 *         &lt;element name="LclInstrm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.03}LocalInstrument2Choice" minOccurs="0"/>
 *         &lt;element name="SeqTp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.03}SequenceType1Code" minOccurs="0"/>
 *         &lt;element name="CtgyPurp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.03}CategoryPurpose1Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeInformation22", propOrder = {
    "instrPrty",
    "clrChanl",
    "svcLvl",
    "lclInstrm",
    "seqTp",
    "ctgyPurp"
})
public class PaymentTypeInformation22 {

    @XmlElement(name = "InstrPrty")
    protected String instrPrty;
    @XmlElement(name = "ClrChanl")
    protected String clrChanl;
    @XmlElement(name = "SvcLvl")
    protected ServiceLevel8Choice svcLvl;
    @XmlElement(name = "LclInstrm")
    protected LocalInstrument2Choice lclInstrm;
    @XmlElement(name = "SeqTp")
    protected String seqTp;
    @XmlElement(name = "CtgyPurp")
    protected CategoryPurpose1Choice ctgyPurp;

    /**
     * Gets the value of the instrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrPrty() {
        return instrPrty;
    }

    /**
     * Sets the value of the instrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrPrty(String value) {
        this.instrPrty = value;
    }

    /**
     * Gets the value of the clrChanl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrChanl() {
        return clrChanl;
    }

    /**
     * Sets the value of the clrChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrChanl(String value) {
        this.clrChanl = value;
    }

    /**
     * Gets the value of the svcLvl property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevel8Choice }
     *     
     */
    public ServiceLevel8Choice getSvcLvl() {
        return svcLvl;
    }

    /**
     * Sets the value of the svcLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevel8Choice }
     *     
     */
    public void setSvcLvl(ServiceLevel8Choice value) {
        this.svcLvl = value;
    }

    /**
     * Gets the value of the lclInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    public LocalInstrument2Choice getLclInstrm() {
        return lclInstrm;
    }

    /**
     * Sets the value of the lclInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    public void setLclInstrm(LocalInstrument2Choice value) {
        this.lclInstrm = value;
    }

    /**
     * Gets the value of the seqTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqTp() {
        return seqTp;
    }

    /**
     * Sets the value of the seqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqTp(String value) {
        this.seqTp = value;
    }

    /**
     * Gets the value of the ctgyPurp property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryPurpose1Choice }
     *     
     */
    public CategoryPurpose1Choice getCtgyPurp() {
        return ctgyPurp;
    }

    /**
     * Sets the value of the ctgyPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryPurpose1Choice }
     *     
     */
    public void setCtgyPurp(CategoryPurpose1Choice value) {
        this.ctgyPurp = value;
    }

}
