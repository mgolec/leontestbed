//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 03:04:15 ���� CST 
//


package com.xml.iso20022.camt.v00500104;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountRangeChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountRangeChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ImpldCcyAndAmtRg" type="{urn:swift:xsd:camt.005.001.04}ImpliedCurrencyAndAmountRange"/>
 *           &lt;element name="CcyAndAmtRg" type="{urn:swift:xsd:camt.005.001.04}CurrencyAndAmountRange"/>
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
@XmlType(name = "AmountRangeChoice", propOrder = {
    "impldCcyAndAmtRg",
    "ccyAndAmtRg"
})
public class AmountRangeChoice {

    @XmlElement(name = "ImpldCcyAndAmtRg")
    protected ImpliedCurrencyAndAmountRange impldCcyAndAmtRg;
    @XmlElement(name = "CcyAndAmtRg")
    protected CurrencyAndAmountRange ccyAndAmtRg;

    /**
     * Gets the value of the impldCcyAndAmtRg property.
     * 
     * @return
     *     possible object is
     *     {@link ImpliedCurrencyAndAmountRange }
     *     
     */
    public ImpliedCurrencyAndAmountRange getImpldCcyAndAmtRg() {
        return impldCcyAndAmtRg;
    }

    /**
     * Sets the value of the impldCcyAndAmtRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpliedCurrencyAndAmountRange }
     *     
     */
    public void setImpldCcyAndAmtRg(ImpliedCurrencyAndAmountRange value) {
        this.impldCcyAndAmtRg = value;
    }

    /**
     * Gets the value of the ccyAndAmtRg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmountRange }
     *     
     */
    public CurrencyAndAmountRange getCcyAndAmtRg() {
        return ccyAndAmtRg;
    }

    /**
     * Sets the value of the ccyAndAmtRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmountRange }
     *     
     */
    public void setCcyAndAmtRg(CurrencyAndAmountRange value) {
        this.ccyAndAmtRg = value;
    }

}
