//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.20 at 01:35:08 ���� CST 
//


package com.xml.cnaps2.beps.v72200101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailCheckMessageDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailCheckMessageDetails1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SndRcvTp" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.722.001.01}SendReceiveCode1"/>
 *         &lt;element name="MT" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.722.001.01}Max35Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailCheckMessageDetails1", propOrder = {
    "sndRcvTp",
    "mt"
})
public class DetailCheckMessageDetails1 {

    @XmlElement(name = "SndRcvTp", required = true)
    protected String sndRcvTp;
    @XmlElement(name = "MT", required = true)
    protected String mt;

    /**
     * Gets the value of the sndRcvTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndRcvTp() {
        return sndRcvTp;
    }

    /**
     * Sets the value of the sndRcvTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndRcvTp(String value) {
        this.sndRcvTp = value;
    }

    /**
     * Gets the value of the mt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMt() {
        return mt;
    }

    /**
     * Sets the value of the mt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMt(String value) {
        this.mt = value;
    }

}
