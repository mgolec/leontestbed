//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:58 ���� CST 
//


package com.xml.cnaps2.hvps.v15300101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RtrgBkDrftCptlApplInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RtrgBkDrftCptlApplInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DrftInf" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.153.001.01}DrftInf1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RtrgBkDrftCptlApplInf1", propOrder = {
    "drftInf"
})
public class RtrgBkDrftCptlApplInf1 {

    @XmlElement(name = "DrftInf", required = true)
    protected DrftInf1 drftInf;

    /**
     * Gets the value of the drftInf property.
     * 
     * @return
     *     possible object is
     *     {@link DrftInf1 }
     *     
     */
    public DrftInf1 getDrftInf() {
        return drftInf;
    }

    /**
     * Sets the value of the drftInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrftInf1 }
     *     
     */
    public void setDrftInf(DrftInf1 value) {
        this.drftInf = value;
    }

}
