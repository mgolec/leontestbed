//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:53 ���� CST 
//


package com.xml.iso20022.camt.v00500104;

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
 *         &lt;element name="GetTx" type="{urn:swift:xsd:camt.005.001.04}GetTransactionV04"/>
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
    "getTx"
})
public class Document {

    @XmlElement(name = "GetTx", required = true)
    protected GetTransactionV04 getTx;

    /**
     * Gets the value of the getTx property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransactionV04 }
     *     
     */
    public GetTransactionV04 getGetTx() {
        return getTx;
    }

    /**
     * Sets the value of the getTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransactionV04 }
     *     
     */
    public void setGetTx(GetTransactionV04 value) {
        this.getTx = value;
    }

}
