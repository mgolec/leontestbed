//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:52 ���� CST 
//


package com.xml.cnaps2.hvps.v14300101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SttlAcctsReqV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SttlAcctsReqV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.143.001.01}GroupHeader1"/>
 *         &lt;element name="SttlAcctsReqInf" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.143.001.01}SttlAcctsReqInf1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SttlAcctsReqV01", propOrder = {
    "grpHdr",
    "sttlAcctsReqInf"
})
public class SttlAcctsReqV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "SttlAcctsReqInf", required = true)
    protected SttlAcctsReqInf1 sttlAcctsReqInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader1 }
     *     
     */
    public GroupHeader1 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader1 }
     *     
     */
    public void setGrpHdr(GroupHeader1 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the sttlAcctsReqInf property.
     * 
     * @return
     *     possible object is
     *     {@link SttlAcctsReqInf1 }
     *     
     */
    public SttlAcctsReqInf1 getSttlAcctsReqInf() {
        return sttlAcctsReqInf;
    }

    /**
     * Sets the value of the sttlAcctsReqInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SttlAcctsReqInf1 }
     *     
     */
    public void setSttlAcctsReqInf(SttlAcctsReqInf1 value) {
        this.sttlAcctsReqInf = value;
    }

}