//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.27 at 06:59:34 ���� CST 
//


package com.xml.cnaps2.ccms;

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
 *         &lt;element name="ComConf" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.990.001.02}ComConfV01"/>
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
    "comConf"
})
public class Document {

    @XmlElement(name = "ComConf", required = true)
    protected ComConfV01 comConf;

    /**
     * Gets the value of the comConf property.
     * 
     * @return
     *     possible object is
     *     {@link ComConfV01 }
     *     
     */
    public ComConfV01 getComConf() {
        return comConf;
    }

    /**
     * Sets the value of the comConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComConfV01 }
     *     
     */
    public void setComConf(ComConfV01 value) {
        this.comConf = value;
    }

}
