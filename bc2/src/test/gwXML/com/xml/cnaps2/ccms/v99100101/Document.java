//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:13 ���� CST 
//


package com.xml.cnaps2.ccms.v99100101;

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
 *         &lt;element name="ChckReq" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.991.001.01}ChckReqV01"/>
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
    "chckReq"
})
public class Document {

    @XmlElement(name = "ChckReq", required = true)
    protected ChckReqV01 chckReq;

    /**
     * Gets the value of the chckReq property.
     * 
     * @return
     *     possible object is
     *     {@link ChckReqV01 }
     *     
     */
    public ChckReqV01 getChckReq() {
        return chckReq;
    }

    /**
     * Sets the value of the chckReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChckReqV01 }
     *     
     */
    public void setChckReq(ChckReqV01 value) {
        this.chckReq = value;
    }

}
