//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.04 at 01:32:45 ���� CST 
//


package com.xml.cnaps2.ccms.v31100101;

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
 *         &lt;element name="CmonNotSgntrInfBizRspn" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.311.001.01}CmonNotSgntrInfBizRspnV01"/>
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
    "cmonNotSgntrInfBizRspn"
})
public class Document {

    @XmlElement(name = "CmonNotSgntrInfBizRspn", required = true)
    protected CmonNotSgntrInfBizRspnV01 cmonNotSgntrInfBizRspn;

    /**
     * Gets the value of the cmonNotSgntrInfBizRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CmonNotSgntrInfBizRspnV01 }
     *     
     */
    public CmonNotSgntrInfBizRspnV01 getCmonNotSgntrInfBizRspn() {
        return cmonNotSgntrInfBizRspn;
    }

    /**
     * Sets the value of the cmonNotSgntrInfBizRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmonNotSgntrInfBizRspnV01 }
     *     
     */
    public void setCmonNotSgntrInfBizRspn(CmonNotSgntrInfBizRspnV01 value) {
        this.cmonNotSgntrInfBizRspn = value;
    }

}
