//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:40 ���� CST 
//


package com.xml.cnaps2.hvps.v14300101;

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
 *         &lt;element name="SttlAcctsReq" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.143.001.01}SttlAcctsReqV01"/>
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
    "sttlAcctsReq"
})
public class Document {

    @XmlElement(name = "SttlAcctsReq", required = true)
    protected SttlAcctsReqV01 sttlAcctsReq;

    /**
     * Gets the value of the sttlAcctsReq property.
     * 
     * @return
     *     possible object is
     *     {@link SttlAcctsReqV01 }
     *     
     */
    public SttlAcctsReqV01 getSttlAcctsReq() {
        return sttlAcctsReq;
    }

    /**
     * Sets the value of the sttlAcctsReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SttlAcctsReqV01 }
     *     
     */
    public void setSttlAcctsReq(SttlAcctsReqV01 value) {
        this.sttlAcctsReq = value;
    }

}
