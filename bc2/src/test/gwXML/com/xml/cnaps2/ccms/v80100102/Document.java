//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:10 ���� CST 
//


package com.xml.cnaps2.ccms.v80100102;

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
 *         &lt;element name="SysStsNtfctn" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.801.001.02}SysStsNtfctnV01"/>
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
    "sysStsNtfctn"
})
public class Document {

    @XmlElement(name = "SysStsNtfctn", required = true)
    protected SysStsNtfctnV01 sysStsNtfctn;

    /**
     * Gets the value of the sysStsNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link SysStsNtfctnV01 }
     *     
     */
    public SysStsNtfctnV01 getSysStsNtfctn() {
        return sysStsNtfctn;
    }

    /**
     * Sets the value of the sysStsNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SysStsNtfctnV01 }
     *     
     */
    public void setSysStsNtfctn(SysStsNtfctnV01 value) {
        this.sysStsNtfctn = value;
    }

}
