//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:32 ���� CST 
//


package com.xml.cnaps2.ccms.v90000102;

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
 *         &lt;element name="CmonConf" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.900.001.02}CmonConfV01"/>
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
    "cmonConf"
})
public class Document {

    @XmlElement(name = "CmonConf", required = true)
    protected CmonConfV01 cmonConf;

    /**
     * Gets the value of the cmonConf property.
     * 
     * @return
     *     possible object is
     *     {@link CmonConfV01 }
     *     
     */
    public CmonConfV01 getCmonConf() {
        return cmonConf;
    }

    /**
     * Sets the value of the cmonConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmonConfV01 }
     *     
     */
    public void setCmonConf(CmonConfV01 value) {
        this.cmonConf = value;
    }

}
