//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:32:12 ���� CST 
//


package com.xml.cnaps2.beps.v12700101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebtorAgent1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebtorAgent1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BrnchId" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.127.001.01}BranchIdentification1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtorAgent1", propOrder = {
    "brnchId"
})
public class DebtorAgent1 {

    @XmlElement(name = "BrnchId", required = true)
    protected BranchIdentification1 brnchId;

    /**
     * Gets the value of the brnchId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchIdentification1 }
     *     
     */
    public BranchIdentification1 getBrnchId() {
        return brnchId;
    }

    /**
     * Sets the value of the brnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchIdentification1 }
     *     
     */
    public void setBrnchId(BranchIdentification1 value) {
        this.brnchId = value;
    }

}