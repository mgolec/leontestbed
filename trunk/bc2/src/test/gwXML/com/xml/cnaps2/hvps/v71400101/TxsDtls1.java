//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:46:05 ���� CST 
//


package com.xml.cnaps2.hvps.v71400101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TxsDtls1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxsDtls1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SndRcvTp" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.714.001.01}SendReceiveCode1"/>
 *         &lt;element name="OrgnlGrpHdr" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.714.001.01}OrgnlGrpHdr1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxsDtls1", propOrder = {
    "sndRcvTp",
    "orgnlGrpHdr"
})
public class TxsDtls1 {

    @XmlElement(name = "SndRcvTp", required = true)
    protected String sndRcvTp;
    @XmlElement(name = "OrgnlGrpHdr", required = true)
    protected OrgnlGrpHdr1 orgnlGrpHdr;

    /**
     * Gets the value of the sndRcvTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndRcvTp() {
        return sndRcvTp;
    }

    /**
     * Sets the value of the sndRcvTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndRcvTp(String value) {
        this.sndRcvTp = value;
    }

    /**
     * Gets the value of the orgnlGrpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link OrgnlGrpHdr1 }
     *     
     */
    public OrgnlGrpHdr1 getOrgnlGrpHdr() {
        return orgnlGrpHdr;
    }

    /**
     * Sets the value of the orgnlGrpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgnlGrpHdr1 }
     *     
     */
    public void setOrgnlGrpHdr(OrgnlGrpHdr1 value) {
        this.orgnlGrpHdr = value;
    }

}
