//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.22 at 08:24:15 ���� CST 
//


package com.topfinance.plugin.cnaps2.v05400102;

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
 *         &lt;element name="BkToCstmrDbtCdtNtfctn" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.02}BankToCustomerDebitCreditNotificationV02"/>
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
    "bkToCstmrDbtCdtNtfctn"
})
public class Document {

    @XmlElement(name = "BkToCstmrDbtCdtNtfctn", required = true)
    protected BankToCustomerDebitCreditNotificationV02 bkToCstmrDbtCdtNtfctn;

    /**
     * Gets the value of the bkToCstmrDbtCdtNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link BankToCustomerDebitCreditNotificationV02 }
     *     
     */
    public BankToCustomerDebitCreditNotificationV02 getBkToCstmrDbtCdtNtfctn() {
        return bkToCstmrDbtCdtNtfctn;
    }

    /**
     * Sets the value of the bkToCstmrDbtCdtNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankToCustomerDebitCreditNotificationV02 }
     *     
     */
    public void setBkToCstmrDbtCdtNtfctn(BankToCustomerDebitCreditNotificationV02 value) {
        this.bkToCstmrDbtCdtNtfctn = value;
    }

}
