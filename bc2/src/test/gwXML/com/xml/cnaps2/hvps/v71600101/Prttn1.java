//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:56 ���� CST 
//


package com.xml.cnaps2.hvps.v71600101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Prttn1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prttn1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TtlNb" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.716.001.01}Max8NumericText"/>
 *         &lt;element name="StartNb" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.716.001.01}Max8NumericText"/>
 *         &lt;element name="EndNb" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.716.001.01}Max8NumericText"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prttn1", propOrder = {
    "ttlNb",
    "startNb",
    "endNb"
})
public class Prttn1 {

    @XmlElement(name = "TtlNb", required = true)
    protected String ttlNb;
    @XmlElement(name = "StartNb", required = true)
    protected String startNb;
    @XmlElement(name = "EndNb", required = true)
    protected String endNb;

    /**
     * Gets the value of the ttlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNb() {
        return ttlNb;
    }

    /**
     * Sets the value of the ttlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlNb(String value) {
        this.ttlNb = value;
    }

    /**
     * Gets the value of the startNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartNb() {
        return startNb;
    }

    /**
     * Sets the value of the startNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartNb(String value) {
        this.startNb = value;
    }

    /**
     * Gets the value of the endNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndNb() {
        return endNb;
    }

    /**
     * Sets the value of the endNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndNb(String value) {
        this.endNb = value;
    }

}
