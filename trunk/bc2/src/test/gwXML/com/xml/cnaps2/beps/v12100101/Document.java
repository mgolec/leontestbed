//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:14 ���� CST 
//


package com.xml.cnaps2.beps.v12100101;

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
 *         &lt;element name="CstmrCdtTrf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.121.001.01}CustomerCreditTransfer"/>
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
    "cstmrCdtTrf"
})
public class Document {

    @XmlElement(name = "CstmrCdtTrf", required = true)
    protected CustomerCreditTransfer cstmrCdtTrf;

    /**
     * Gets the value of the cstmrCdtTrf property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCreditTransfer }
     *     
     */
    public CustomerCreditTransfer getCstmrCdtTrf() {
        return cstmrCdtTrf;
    }

    /**
     * Sets the value of the cstmrCdtTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCreditTransfer }
     *     
     */
    public void setCstmrCdtTrf(CustomerCreditTransfer value) {
        this.cstmrCdtTrf = value;
    }

}
