//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:47:00 ���� CST 
//


package com.xml.cnaps2.saps.v37500101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterbankLoanProtocolInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterbankLoanProtocolInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgnlPrtcolNb" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.375.001.01}Max60Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterbankLoanProtocolInformation1", propOrder = {
    "orgnlPrtcolNb"
})
public class InterbankLoanProtocolInformation1 {

    @XmlElement(name = "OrgnlPrtcolNb", required = true)
    protected String orgnlPrtcolNb;

    /**
     * Gets the value of the orgnlPrtcolNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlPrtcolNb() {
        return orgnlPrtcolNb;
    }

    /**
     * Sets the value of the orgnlPrtcolNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlPrtcolNb(String value) {
        this.orgnlPrtcolNb = value;
    }

}
