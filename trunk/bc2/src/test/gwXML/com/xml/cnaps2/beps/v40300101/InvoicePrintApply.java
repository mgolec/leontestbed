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
 * <p>Java class for InvoicePrintApply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoicePrintApply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.403.001.01}GroupHeader1"/>
 *         &lt;element name="InvcPrtApplyInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.403.001.01}InvoicePrintApplyInformation1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoicePrintApply", propOrder = {
    "grpHdr",
    "invcPrtApplyInf"
})
public class InvoicePrintApply {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "InvcPrtApplyInf", required = true)
    protected InvoicePrintApplyInformation1 invcPrtApplyInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader1 }
     *     
     */
    public GroupHeader1 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader1 }
     *     
     */
    public void setGrpHdr(GroupHeader1 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the invcPrtApplyInf property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePrintApplyInformation1 }
     *     
     */
    public InvoicePrintApplyInformation1 getInvcPrtApplyInf() {
        return invcPrtApplyInf;
    }

    /**
     * Sets the value of the invcPrtApplyInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePrintApplyInformation1 }
     *     
     */
    public void setInvcPrtApplyInf(InvoicePrintApplyInformation1 value) {
        this.invcPrtApplyInf = value;
    }

}
