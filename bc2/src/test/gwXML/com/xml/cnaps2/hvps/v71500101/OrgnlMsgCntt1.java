//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:55 ���� CST 
//


package com.xml.cnaps2.hvps.v71500101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrgnlMsgCntt1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgnlMsgCntt1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cntt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrcSts" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.715.001.01}ProcessCode1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgnlMsgCntt1", propOrder = {
    "cntt",
    "prcSts"
})
public class OrgnlMsgCntt1 {

    @XmlElement(name = "Cntt", required = true)
    protected String cntt;
    @XmlElement(name = "PrcSts", required = true)
    protected String prcSts;

    /**
     * Gets the value of the cntt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntt() {
        return cntt;
    }

    /**
     * Sets the value of the cntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntt(String value) {
        this.cntt = value;
    }

    /**
     * Gets the value of the prcSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcSts() {
        return prcSts;
    }

    /**
     * Sets the value of the prcSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcSts(String value) {
        this.prcSts = value;
    }

}
