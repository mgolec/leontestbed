//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:35 ���� CST 
//


package com.xml.cnaps2.beps.v40400101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoicePrintResponsionInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoicePrintResponsionInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RspsnInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.404.001.01}ResponsionInformation1"/>
 *         &lt;element name="InvcInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.404.001.01}InvoiceInformation1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoicePrintResponsionInformation1", propOrder = {
    "rspsnInf",
    "invcInf"
})
public class InvoicePrintResponsionInformation1 {

    @XmlElement(name = "RspsnInf", required = true)
    protected ResponsionInformation1 rspsnInf;
    @XmlElement(name = "InvcInf")
    protected InvoiceInformation1 invcInf;

    /**
     * Gets the value of the rspsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsionInformation1 }
     *     
     */
    public ResponsionInformation1 getRspsnInf() {
        return rspsnInf;
    }

    /**
     * Sets the value of the rspsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsionInformation1 }
     *     
     */
    public void setRspsnInf(ResponsionInformation1 value) {
        this.rspsnInf = value;
    }

    /**
     * Gets the value of the invcInf property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInformation1 }
     *     
     */
    public InvoiceInformation1 getInvcInf() {
        return invcInf;
    }

    /**
     * Sets the value of the invcInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInformation1 }
     *     
     */
    public void setInvcInf(InvoiceInformation1 value) {
        this.invcInf = value;
    }

}