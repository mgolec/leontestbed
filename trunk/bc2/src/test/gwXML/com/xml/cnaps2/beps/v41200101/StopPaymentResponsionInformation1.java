//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:37 ���� CST 
//


package com.xml.cnaps2.beps.v41200101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopPaymentResponsionInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopPaymentResponsionInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StopPmtTp" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.412.001.01}StopPaymentTypeCode1"/>
 *         &lt;element name="StopPmtSts" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.412.001.01}StopPaymentStatusCode1"/>
 *         &lt;element name="OrgnlInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.412.001.01}OriginalInformation1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPaymentResponsionInformation1", propOrder = {
    "stopPmtTp",
    "stopPmtSts",
    "orgnlInf"
})
public class StopPaymentResponsionInformation1 {

    @XmlElement(name = "StopPmtTp", required = true)
    protected String stopPmtTp;
    @XmlElement(name = "StopPmtSts", required = true)
    protected String stopPmtSts;
    @XmlElement(name = "OrgnlInf")
    protected OriginalInformation1 orgnlInf;

    /**
     * Gets the value of the stopPmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopPmtTp() {
        return stopPmtTp;
    }

    /**
     * Sets the value of the stopPmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopPmtTp(String value) {
        this.stopPmtTp = value;
    }

    /**
     * Gets the value of the stopPmtSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopPmtSts() {
        return stopPmtSts;
    }

    /**
     * Sets the value of the stopPmtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopPmtSts(String value) {
        this.stopPmtSts = value;
    }

    /**
     * Gets the value of the orgnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalInformation1 }
     *     
     */
    public OriginalInformation1 getOrgnlInf() {
        return orgnlInf;
    }

    /**
     * Sets the value of the orgnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalInformation1 }
     *     
     */
    public void setOrgnlInf(OriginalInformation1 value) {
        this.orgnlInf = value;
    }

}