//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.10 at 04:00:27 ���� CST 
//


package com.xml.cnaps2.beps.v39300101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionStatusSearch3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstructionStatusSearch3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PmtInstrSts" type="{urn:swift:xsd:camt.005.001.04}PaymentStatusCodeSearch2Choice" minOccurs="0"/>
 *         &lt;element name="PmtInstrStsDtTm" type="{urn:swift:xsd:camt.005.001.04}DateTimePeriodChoice" minOccurs="0"/>
 *         &lt;element name="PrtryStsRsn" type="{urn:swift:xsd:camt.005.001.04}Max4AlphaNumericText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionStatusSearch3", propOrder = {
    "pmtInstrSts",
    "pmtInstrStsDtTm",
    "prtryStsRsn"
})
public class InstructionStatusSearch3 {

    @XmlElement(name = "PmtInstrSts")
    protected PaymentStatusCodeSearch2Choice pmtInstrSts;
    @XmlElement(name = "PmtInstrStsDtTm")
    protected DateTimePeriodChoice pmtInstrStsDtTm;
    @XmlElement(name = "PrtryStsRsn")
    protected String prtryStsRsn;

    /**
     * Gets the value of the pmtInstrSts property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusCodeSearch2Choice }
     *     
     */
    public PaymentStatusCodeSearch2Choice getPmtInstrSts() {
        return pmtInstrSts;
    }

    /**
     * Sets the value of the pmtInstrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusCodeSearch2Choice }
     *     
     */
    public void setPmtInstrSts(PaymentStatusCodeSearch2Choice value) {
        this.pmtInstrSts = value;
    }

    /**
     * Gets the value of the pmtInstrStsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public DateTimePeriodChoice getPmtInstrStsDtTm() {
        return pmtInstrStsDtTm;
    }

    /**
     * Sets the value of the pmtInstrStsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public void setPmtInstrStsDtTm(DateTimePeriodChoice value) {
        this.pmtInstrStsDtTm = value;
    }

    /**
     * Gets the value of the prtryStsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryStsRsn() {
        return prtryStsRsn;
    }

    /**
     * Sets the value of the prtryStsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtryStsRsn(String value) {
        this.prtryStsRsn = value;
    }

}
