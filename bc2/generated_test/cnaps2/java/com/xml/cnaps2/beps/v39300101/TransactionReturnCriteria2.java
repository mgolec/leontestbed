//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.10 at 04:20:34 ���� CST 
//


package com.xml.cnaps2.beps.v39300101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionReturnCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionReturnCriteria2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PmtToRtrCrit" type="{urn:swift:xsd:camt.005.001.04}SystemReturnCriteria2" minOccurs="0"/>
 *         &lt;element name="PmtFrRtrCrit" type="{urn:swift:xsd:camt.005.001.04}SystemReturnCriteria2" minOccurs="0"/>
 *         &lt;element name="AcctCshNtryRtrCrit" type="{urn:swift:xsd:camt.005.001.04}AccountCashEntryReturnCriteria2" minOccurs="0"/>
 *         &lt;element name="PmtRtrCrit" type="{urn:swift:xsd:camt.005.001.04}PaymentReturnCriteria2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReturnCriteria2", propOrder = {
    "pmtToRtrCrit",
    "pmtFrRtrCrit",
    "acctCshNtryRtrCrit",
    "pmtRtrCrit"
})
public class TransactionReturnCriteria2 {

    @XmlElement(name = "PmtToRtrCrit")
    protected SystemReturnCriteria2 pmtToRtrCrit;
    @XmlElement(name = "PmtFrRtrCrit")
    protected SystemReturnCriteria2 pmtFrRtrCrit;
    @XmlElement(name = "AcctCshNtryRtrCrit")
    protected AccountCashEntryReturnCriteria2 acctCshNtryRtrCrit;
    @XmlElement(name = "PmtRtrCrit")
    protected PaymentReturnCriteria2 pmtRtrCrit;

    /**
     * Gets the value of the pmtToRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SystemReturnCriteria2 }
     *     
     */
    public SystemReturnCriteria2 getPmtToRtrCrit() {
        return pmtToRtrCrit;
    }

    /**
     * Sets the value of the pmtToRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemReturnCriteria2 }
     *     
     */
    public void setPmtToRtrCrit(SystemReturnCriteria2 value) {
        this.pmtToRtrCrit = value;
    }

    /**
     * Gets the value of the pmtFrRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SystemReturnCriteria2 }
     *     
     */
    public SystemReturnCriteria2 getPmtFrRtrCrit() {
        return pmtFrRtrCrit;
    }

    /**
     * Sets the value of the pmtFrRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemReturnCriteria2 }
     *     
     */
    public void setPmtFrRtrCrit(SystemReturnCriteria2 value) {
        this.pmtFrRtrCrit = value;
    }

    /**
     * Gets the value of the acctCshNtryRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link AccountCashEntryReturnCriteria2 }
     *     
     */
    public AccountCashEntryReturnCriteria2 getAcctCshNtryRtrCrit() {
        return acctCshNtryRtrCrit;
    }

    /**
     * Sets the value of the acctCshNtryRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCashEntryReturnCriteria2 }
     *     
     */
    public void setAcctCshNtryRtrCrit(AccountCashEntryReturnCriteria2 value) {
        this.acctCshNtryRtrCrit = value;
    }

    /**
     * Gets the value of the pmtRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReturnCriteria2 }
     *     
     */
    public PaymentReturnCriteria2 getPmtRtrCrit() {
        return pmtRtrCrit;
    }

    /**
     * Sets the value of the pmtRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReturnCriteria2 }
     *     
     */
    public void setPmtRtrCrit(PaymentReturnCriteria2 value) {
        this.pmtRtrCrit = value;
    }

}
