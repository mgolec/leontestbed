//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:47:18 ���� CST 
//


package com.xml.cnaps2.saps.v73200101;

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
 *         &lt;element name="ACSABSSttlmDtlRspn" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.732.001.01}ACSABSSttlmDtlRspnV01"/>
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
    "acsabsSttlmDtlRspn"
})
public class Document {

    @XmlElement(name = "ACSABSSttlmDtlRspn", required = true)
    protected ACSABSSttlmDtlRspnV01 acsabsSttlmDtlRspn;

    /**
     * Gets the value of the acsabsSttlmDtlRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ACSABSSttlmDtlRspnV01 }
     *     
     */
    public ACSABSSttlmDtlRspnV01 getACSABSSttlmDtlRspn() {
        return acsabsSttlmDtlRspn;
    }

    /**
     * Sets the value of the acsabsSttlmDtlRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACSABSSttlmDtlRspnV01 }
     *     
     */
    public void setACSABSSttlmDtlRspn(ACSABSSttlmDtlRspnV01 value) {
        this.acsabsSttlmDtlRspn = value;
    }

}
