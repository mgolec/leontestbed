//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:32:14 ���� CST 
//


package com.xml.cnaps2.beps.v13100101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditorAccountType1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditorAccountType1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctPmtTp" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.131.001.01}AccountPaymentTypeCode1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorAccountType1", propOrder = {
    "acctPmtTp"
})
public class CreditorAccountType1 {

    @XmlElement(name = "AcctPmtTp", required = true)
    protected String acctPmtTp;

    /**
     * Gets the value of the acctPmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctPmtTp() {
        return acctPmtTp;
    }

    /**
     * Sets the value of the acctPmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctPmtTp(String value) {
        this.acctPmtTp = value;
    }

}
