//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.22 at 05:26:20 PM CST 
//


package com.xml.iso20022.saps.v60400101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstgPty1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstgPty1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstgDrctPty" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.604.001.01}Max14Text"/>
 *         &lt;element name="InstgIndrctPty" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.604.001.01}Max14Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstgPty1", propOrder = {
    "instgDrctPty",
    "instgIndrctPty"
})
public class InstgPty1 {

    @XmlElement(name = "InstgDrctPty", required = true)
    protected String instgDrctPty;
    @XmlElement(name = "InstgIndrctPty")
    protected String instgIndrctPty;

    /**
     * Gets the value of the instgDrctPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgDrctPty() {
        return instgDrctPty;
    }

    /**
     * Sets the value of the instgDrctPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstgDrctPty(String value) {
        this.instgDrctPty = value;
    }

    /**
     * Gets the value of the instgIndrctPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgIndrctPty() {
        return instgIndrctPty;
    }

    /**
     * Sets the value of the instgIndrctPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstgIndrctPty(String value) {
        this.instgIndrctPty = value;
    }

}
