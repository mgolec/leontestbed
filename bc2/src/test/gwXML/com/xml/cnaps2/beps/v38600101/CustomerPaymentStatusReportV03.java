//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.10 at 12:00:58 ���� CST 
//


package com.xml.cnaps2.beps.v38600101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerPaymentStatusReportV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerPaymentStatusReportV03">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.03}GroupHeader36"/>
 *         &lt;element name="OrgnlGrpInfAndSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.03}OriginalGroupInformation20"/>
 *         &lt;element name="OrgnlPmtInfAndSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.03}OriginalPaymentInformation1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPaymentStatusReportV03", propOrder = {
    "grpHdr",
    "orgnlGrpInfAndSts",
    "orgnlPmtInfAndSts"
})
public class CustomerPaymentStatusReportV03 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader36 grpHdr;
    @XmlElement(name = "OrgnlGrpInfAndSts", required = true)
    protected OriginalGroupInformation20 orgnlGrpInfAndSts;
    @XmlElement(name = "OrgnlPmtInfAndSts")
    protected OriginalPaymentInformation1 orgnlPmtInfAndSts;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader36 }
     *     
     */
    public GroupHeader36 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader36 }
     *     
     */
    public void setGrpHdr(GroupHeader36 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the orgnlGrpInfAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation20 }
     *     
     */
    public OriginalGroupInformation20 getOrgnlGrpInfAndSts() {
        return orgnlGrpInfAndSts;
    }

    /**
     * Sets the value of the orgnlGrpInfAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation20 }
     *     
     */
    public void setOrgnlGrpInfAndSts(OriginalGroupInformation20 value) {
        this.orgnlGrpInfAndSts = value;
    }

    /**
     * Gets the value of the orgnlPmtInfAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalPaymentInformation1 }
     *     
     */
    public OriginalPaymentInformation1 getOrgnlPmtInfAndSts() {
        return orgnlPmtInfAndSts;
    }

    /**
     * Sets the value of the orgnlPmtInfAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalPaymentInformation1 }
     *     
     */
    public void setOrgnlPmtInfAndSts(OriginalPaymentInformation1 value) {
        this.orgnlPmtInfAndSts = value;
    }

}
