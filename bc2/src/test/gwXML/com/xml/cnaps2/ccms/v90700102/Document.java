//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:24 ���� CST 
//


package com.xml.cnaps2.ccms.v90700102;

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
 *         &lt;element name="SysParamNtfctn" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.907.001.02}SysParamNtfctnV01"/>
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
    "sysParamNtfctn"
})
public class Document {

    @XmlElement(name = "SysParamNtfctn", required = true)
    protected SysParamNtfctnV01 sysParamNtfctn;

    /**
     * Gets the value of the sysParamNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link SysParamNtfctnV01 }
     *     
     */
    public SysParamNtfctnV01 getSysParamNtfctn() {
        return sysParamNtfctn;
    }

    /**
     * Sets the value of the sysParamNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SysParamNtfctnV01 }
     *     
     */
    public void setSysParamNtfctn(SysParamNtfctnV01 value) {
        this.sysParamNtfctn = value;
    }

}
