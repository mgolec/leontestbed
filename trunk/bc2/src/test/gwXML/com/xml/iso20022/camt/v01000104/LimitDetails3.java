//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:58 ���� CST 
//


package com.xml.iso20022.camt.v01000104;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitDetails3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LimitDetails3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amt" type="{urn:swift:xsd:camt.010.001.04}AmountChoice"/>
 *         &lt;element name="CdtDbtInd" type="{urn:swift:xsd:camt.010.001.04}CreditDebitCode"/>
 *         &lt;element name="Sts" type="{urn:swift:xsd:camt.010.001.04}LimitStatus1Code" minOccurs="0"/>
 *         &lt;element name="StartDtTm" type="{urn:swift:xsd:camt.010.001.04}DateAndDateTimeChoice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitDetails3", propOrder = {
    "amt",
    "cdtDbtInd",
    "sts",
    "startDtTm"
})
public class LimitDetails3 {

    @XmlElement(name = "Amt", required = true)
    protected AmountChoice amt;
    @XmlElement(name = "CdtDbtInd", required = true)
    protected String cdtDbtInd;
    @XmlElement(name = "Sts")
    protected String sts;
    @XmlElement(name = "StartDtTm")
    protected DateAndDateTimeChoice startDtTm;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountChoice }
     *     
     */
    public AmountChoice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountChoice }
     *     
     */
    public void setAmt(AmountChoice value) {
        this.amt = value;
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
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSts(String value) {
        this.sts = value;
    }

    /**
     * Gets the value of the startDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getStartDtTm() {
        return startDtTm;
    }

    /**
     * Sets the value of the startDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setStartDtTm(DateAndDateTimeChoice value) {
        this.startDtTm = value;
    }

}