//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:44 ���� CST 
//


package com.xml.cnaps2.hvps.v15200101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClrBkDrftNtfctnV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClrBkDrftNtfctnV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}GroupHeader1"/>
 *         &lt;element name="ClrBkDrftNtfctnInf" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}ClrBkDrftNtfctnInf1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClrBkDrftNtfctnV01", propOrder = {
    "grpHdr",
    "clrBkDrftNtfctnInf"
})
public class ClrBkDrftNtfctnV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "ClrBkDrftNtfctnInf", required = true)
    protected ClrBkDrftNtfctnInf1 clrBkDrftNtfctnInf;

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
     * Gets the value of the clrBkDrftNtfctnInf property.
     * 
     * @return
     *     possible object is
     *     {@link ClrBkDrftNtfctnInf1 }
     *     
     */
    public ClrBkDrftNtfctnInf1 getClrBkDrftNtfctnInf() {
        return clrBkDrftNtfctnInf;
    }

    /**
     * Sets the value of the clrBkDrftNtfctnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClrBkDrftNtfctnInf1 }
     *     
     */
    public void setClrBkDrftNtfctnInf(ClrBkDrftNtfctnInf1 value) {
        this.clrBkDrftNtfctnInf = value;
    }

}
