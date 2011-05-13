//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.13 at 01:14:20 PM CST 
//


package com.xml.cnaps2.camt.v00500104;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentIdentification3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentIdentification3Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="PmtInstrRef" type="{urn:swift:xsd:camt.005.001.04}Max35Text"/>
 *           &lt;element name="QId" type="{urn:swift:xsd:camt.005.001.04}QueueTransactionIdentificationDetails"/>
 *           &lt;element name="LngBizId" type="{urn:swift:xsd:camt.005.001.04}PaymentInstructionReferenceDetails4"/>
 *           &lt;element name="ShrtBizId" type="{urn:swift:xsd:camt.005.001.04}PaymentInstructionReferenceDetails2"/>
 *           &lt;element name="PrtryRef" type="{urn:swift:xsd:camt.005.001.04}Max70Text"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentIdentification3Choice", propOrder = {
    "pmtInstrRef",
    "qId",
    "lngBizId",
    "shrtBizId",
    "prtryRef"
})
public class PaymentIdentification3Choice {

    @XmlElement(name = "PmtInstrRef")
    protected String pmtInstrRef;
    @XmlElement(name = "QId")
    protected QueueTransactionIdentificationDetails qId;
    @XmlElement(name = "LngBizId")
    protected PaymentInstructionReferenceDetails4 lngBizId;
    @XmlElement(name = "ShrtBizId")
    protected PaymentInstructionReferenceDetails2 shrtBizId;
    @XmlElement(name = "PrtryRef")
    protected String prtryRef;

    /**
     * Gets the value of the pmtInstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtInstrRef() {
        return pmtInstrRef;
    }

    /**
     * Sets the value of the pmtInstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtInstrRef(String value) {
        this.pmtInstrRef = value;
    }

    /**
     * Gets the value of the qId property.
     * 
     * @return
     *     possible object is
     *     {@link QueueTransactionIdentificationDetails }
     *     
     */
    public QueueTransactionIdentificationDetails getQId() {
        return qId;
    }

    /**
     * Sets the value of the qId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueTransactionIdentificationDetails }
     *     
     */
    public void setQId(QueueTransactionIdentificationDetails value) {
        this.qId = value;
    }

    /**
     * Gets the value of the lngBizId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstructionReferenceDetails4 }
     *     
     */
    public PaymentInstructionReferenceDetails4 getLngBizId() {
        return lngBizId;
    }

    /**
     * Sets the value of the lngBizId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstructionReferenceDetails4 }
     *     
     */
    public void setLngBizId(PaymentInstructionReferenceDetails4 value) {
        this.lngBizId = value;
    }

    /**
     * Gets the value of the shrtBizId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstructionReferenceDetails2 }
     *     
     */
    public PaymentInstructionReferenceDetails2 getShrtBizId() {
        return shrtBizId;
    }

    /**
     * Sets the value of the shrtBizId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstructionReferenceDetails2 }
     *     
     */
    public void setShrtBizId(PaymentInstructionReferenceDetails2 value) {
        this.shrtBizId = value;
    }

    /**
     * Gets the value of the prtryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryRef() {
        return prtryRef;
    }

    /**
     * Sets the value of the prtryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtryRef(String value) {
        this.prtryRef = value;
    }

}