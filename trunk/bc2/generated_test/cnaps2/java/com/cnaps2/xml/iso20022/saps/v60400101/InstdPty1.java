//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.25 at 10:43:01 AM CST 
//


package com.cnaps2.xml.iso20022.saps.v60400101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstdPty1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstdPty1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstdDrctPty" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.604.001.01}Max14Text"/>
 *         &lt;element name="InstdIndrctPty" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.604.001.01}Max14Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstdPty1", propOrder = {
    "instdDrctPty",
    "instdIndrctPty"
})
public class InstdPty1 {

    @XmlElement(name = "InstdDrctPty", required = true)
    protected String instdDrctPty;
    @XmlElement(name = "InstdIndrctPty")
    protected String instdIndrctPty;

    /**
     * Gets the value of the instdDrctPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstdDrctPty() {
        return instdDrctPty;
    }

    /**
     * Sets the value of the instdDrctPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstdDrctPty(String value) {
        this.instdDrctPty = value;
    }

    /**
     * Gets the value of the instdIndrctPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstdIndrctPty() {
        return instdIndrctPty;
    }

    /**
     * Sets the value of the instdIndrctPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstdIndrctPty(String value) {
        this.instdIndrctPty = value;
    }

}