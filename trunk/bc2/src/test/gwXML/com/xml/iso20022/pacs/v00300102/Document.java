//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.18 at 11:14:07 ���� CST 
//


package com.xml.iso20022.pacs.v00300102;

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
 *         &lt;element name="FIToFICstmrDrctDbt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.003.001.02}FIToFICustomerDirectDebitV02"/>
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
    "fIToFICstmrDrctDbt"
})
public class Document {

    @XmlElement(name = "FIToFICstmrDrctDbt", required = true)
    protected FIToFICustomerDirectDebitV02 fIToFICstmrDrctDbt;

    /**
     * Gets the value of the fiToFICstmrDrctDbt property.
     * 
     * @return
     *     possible object is
     *     {@link FIToFICustomerDirectDebitV02 }
     *     
     */
    public FIToFICustomerDirectDebitV02 getFIToFICstmrDrctDbt() {
        return fIToFICstmrDrctDbt;
    }

    /**
     * Sets the value of the fiToFICstmrDrctDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIToFICustomerDirectDebitV02 }
     *     
     */
    public void setFIToFICstmrDrctDbt(FIToFICustomerDirectDebitV02 value) {
        this.fIToFICstmrDrctDbt = value;
    }

}
