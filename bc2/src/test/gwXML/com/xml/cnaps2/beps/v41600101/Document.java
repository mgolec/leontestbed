//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.10 at 01:01:40 ���� CST 
//


package com.xml.cnaps2.beps.v41600101;

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
 *         &lt;element name="CstmrPmtCxlReq" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}CustomerPaymentCancellationRequestV01"/>
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
    "cstmrPmtCxlReq"
})
public class Document {

    @XmlElement(name = "CstmrPmtCxlReq", required = true)
    protected CustomerPaymentCancellationRequestV01 cstmrPmtCxlReq;

    /**
     * Gets the value of the cstmrPmtCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPaymentCancellationRequestV01 }
     *     
     */
    public CustomerPaymentCancellationRequestV01 getCstmrPmtCxlReq() {
        return cstmrPmtCxlReq;
    }

    /**
     * Sets the value of the cstmrPmtCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPaymentCancellationRequestV01 }
     *     
     */
    public void setCstmrPmtCxlReq(CustomerPaymentCancellationRequestV01 value) {
        this.cstmrPmtCxlReq = value;
    }

}
