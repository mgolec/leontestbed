//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:34 ���� CST 
//


package com.xml.cnaps2.beps.v40300101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvcPrtApply" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.403.001.01}InvoicePrintApply"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "invcPrtApply"
})
public class Document {

    @XmlElement(name = "InvcPrtApply", required = true)
    protected InvoicePrintApply invcPrtApply;

    /**
     * Gets the value of the invcPrtApply property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePrintApply }
     *     
     */
    public InvoicePrintApply getInvcPrtApply() {
        return invcPrtApply;
    }

    /**
     * Sets the value of the invcPrtApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePrintApply }
     *     
     */
    public void setInvcPrtApply(InvoicePrintApply value) {
        this.invcPrtApply = value;
    }

}