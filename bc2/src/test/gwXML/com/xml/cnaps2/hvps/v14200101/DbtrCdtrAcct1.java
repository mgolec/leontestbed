//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:51 ���� CST 
//


package com.xml.cnaps2.hvps.v14200101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DbtrCdtrAcct1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DbtrCdtrAcct1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.142.001.01}Id1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DbtrCdtrAcct1", propOrder = {
    "id"
})
public class DbtrCdtrAcct1 {

    @XmlElement(name = "Id", required = true)
    protected Id1 id;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Id1 }
     *     
     */
    public Id1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id1 }
     *     
     */
    public void setId(Id1 value) {
        this.id = value;
    }

}
