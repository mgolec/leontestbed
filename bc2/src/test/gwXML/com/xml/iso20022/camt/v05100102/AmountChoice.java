//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:01 ���� CST 
//


package com.xml.iso20022.camt.v05100102;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="AmtWthCcy" type="{urn:swift:xsd:camt.051.001.02}CurrencyAndAmount"/>
 *           &lt;element name="AmtWthtCcy" type="{urn:swift:xsd:camt.051.001.02}ImpliedCurrencyAndAmount"/>
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
@XmlType(name = "AmountChoice", propOrder = {
    "amtWthCcy",
    "amtWthtCcy"
})
public class AmountChoice {

    @XmlElement(name = "AmtWthCcy")
    protected CurrencyAndAmount amtWthCcy;
    @XmlElement(name = "AmtWthtCcy")
    protected BigDecimal amtWthtCcy;

    /**
     * Gets the value of the amtWthCcy property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmtWthCcy() {
        return amtWthCcy;
    }

    /**
     * Sets the value of the amtWthCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setAmtWthCcy(CurrencyAndAmount value) {
        this.amtWthCcy = value;
    }

    /**
     * Gets the value of the amtWthtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtWthtCcy() {
        return amtWthtCcy;
    }

    /**
     * Sets the value of the amtWthtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtWthtCcy(BigDecimal value) {
        this.amtWthtCcy = value;
    }

}
