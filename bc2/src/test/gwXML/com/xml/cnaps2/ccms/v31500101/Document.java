//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:21 ���� CST 
//


package com.xml.cnaps2.ccms.v31500101;

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
 *         &lt;element name="BizRspn" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.315.001.01}BizRspnV01"/>
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
    "bizRspn"
})
public class Document {

    @XmlElement(name = "BizRspn", required = true)
    protected BizRspnV01 bizRspn;

    /**
     * Gets the value of the bizRspn property.
     * 
     * @return
     *     possible object is
     *     {@link BizRspnV01 }
     *     
     */
    public BizRspnV01 getBizRspn() {
        return bizRspn;
    }

    /**
     * Sets the value of the bizRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BizRspnV01 }
     *     
     */
    public void setBizRspn(BizRspnV01 value) {
        this.bizRspn = value;
    }

}
