//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:31 ���� CST 
//


package com.xml.cnaps2.ccms.v91700101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NbInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NbInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChngNb" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.917.001.01}Exact8NumericText"/>
 *         &lt;element name="ChngRcrdNb" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.917.001.01}Max8NumericText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NbInf1", propOrder = {
    "chngNb",
    "chngRcrdNb"
})
public class NbInf1 {

    @XmlElement(name = "ChngNb", required = true)
    protected String chngNb;
    @XmlElement(name = "ChngRcrdNb")
    protected String chngRcrdNb;

    /**
     * Gets the value of the chngNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChngNb() {
        return chngNb;
    }

    /**
     * Sets the value of the chngNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChngNb(String value) {
        this.chngNb = value;
    }

    /**
     * Gets the value of the chngRcrdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChngRcrdNb() {
        return chngRcrdNb;
    }

    /**
     * Sets the value of the chngRcrdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChngRcrdNb(String value) {
        this.chngRcrdNb = value;
    }

}
