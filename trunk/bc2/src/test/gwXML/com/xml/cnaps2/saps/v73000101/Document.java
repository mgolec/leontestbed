//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:35:07 ���� CST 
//


package com.xml.cnaps2.saps.v73000101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACSABSSttlmColltnChckng" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.730.001.01}ACSABSSttlmColltnChckngV01"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acsabsSttlmColltnChckng"
})
public class Document {

    @XmlElement(name = "ACSABSSttlmColltnChckng", required = true)
    protected ACSABSSttlmColltnChckngV01 acsabsSttlmColltnChckng;

    /**
     * Gets the value of the acsabsSttlmColltnChckng property.
     * 
     * @return
     *     possible object is
     *     {@link ACSABSSttlmColltnChckngV01 }
     *     
     */
    public ACSABSSttlmColltnChckngV01 getACSABSSttlmColltnChckng() {
        return acsabsSttlmColltnChckng;
    }

    /**
     * Sets the value of the acsabsSttlmColltnChckng property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACSABSSttlmColltnChckngV01 }
     *     
     */
    public void setACSABSSttlmColltnChckng(ACSABSSttlmColltnChckngV01 value) {
        this.acsabsSttlmColltnChckng = value;
    }

}
