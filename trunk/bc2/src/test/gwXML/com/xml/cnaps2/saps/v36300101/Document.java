//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:34:33 ���� CST 
//


package com.xml.cnaps2.saps.v36300101;

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
 *         &lt;element name="QQryAppl" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.363.001.01}QQryApplV01"/>
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
    "qQryAppl"
})
public class Document {

    @XmlElement(name = "QQryAppl", required = true)
    protected QQryApplV01 qQryAppl;

    /**
     * Gets the value of the qQryAppl property.
     * 
     * @return
     *     possible object is
     *     {@link QQryApplV01 }
     *     
     */
    public QQryApplV01 getQQryAppl() {
        return qQryAppl;
    }

    /**
     * Sets the value of the qQryAppl property.
     * 
     * @param value
     *     allowed object is
     *     {@link QQryApplV01 }
     *     
     */
    public void setQQryAppl(QQryApplV01 value) {
        this.qQryAppl = value;
    }

}