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
 * <p>Java class for RealTimeCustomerDirectDebitAdditionalInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealTimeCustomerDirectDebitAdditionalInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="WthdrwngInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.131.001.01}WithdrawingInformation1"/>
 *           &lt;element name="RealTmBllInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.131.001.01}RealTimeBillInformation1"/>
 *           &lt;element name="RealTmColltnInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.131.001.01}RealTimeCollectionInformation1"/>
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
@XmlType(name = "RealTimeCustomerDirectDebitAdditionalInformation1", propOrder = {
    "wthdrwngInf",
    "realTmBllInf",
    "realTmColltnInf"
})
public class RealTimeCustomerDirectDebitAdditionalInformation1 {

    @XmlElement(name = "WthdrwngInf")
    protected WithdrawingInformation1 wthdrwngInf;
    @XmlElement(name = "RealTmBllInf")
    protected RealTimeBillInformation1 realTmBllInf;
    @XmlElement(name = "RealTmColltnInf")
    protected RealTimeCollectionInformation1 realTmColltnInf;

    /**
     * Gets the value of the wthdrwngInf property.
     * 
     * @return
     *     possible object is
     *     {@link WithdrawingInformation1 }
     *     
     */
    public WithdrawingInformation1 getWthdrwngInf() {
        return wthdrwngInf;
    }

    /**
     * Sets the value of the wthdrwngInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithdrawingInformation1 }
     *     
     */
    public void setWthdrwngInf(WithdrawingInformation1 value) {
        this.wthdrwngInf = value;
    }

    /**
     * Gets the value of the realTmBllInf property.
     * 
     * @return
     *     possible object is
     *     {@link RealTimeBillInformation1 }
     *     
     */
    public RealTimeBillInformation1 getRealTmBllInf() {
        return realTmBllInf;
    }

    /**
     * Sets the value of the realTmBllInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealTimeBillInformation1 }
     *     
     */
    public void setRealTmBllInf(RealTimeBillInformation1 value) {
        this.realTmBllInf = value;
    }

    /**
     * Gets the value of the realTmColltnInf property.
     * 
     * @return
     *     possible object is
     *     {@link RealTimeCollectionInformation1 }
     *     
     */
    public RealTimeCollectionInformation1 getRealTmColltnInf() {
        return realTmColltnInf;
    }

    /**
     * Sets the value of the realTmColltnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealTimeCollectionInformation1 }
     *     
     */
    public void setRealTmColltnInf(RealTimeCollectionInformation1 value) {
        this.realTmColltnInf = value;
    }

}
