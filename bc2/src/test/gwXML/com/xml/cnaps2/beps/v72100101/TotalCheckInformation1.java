//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:32:36 ���� CST 
//


package com.xml.cnaps2.beps.v72100101;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TotalCheckInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalCheckInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChckDt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.721.001.01}ISODate"/>
 *         &lt;element name="ChckPmtInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.721.001.01}CheckPaymentInformation1"/>
 *         &lt;element name="ChckMsg" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.721.001.01}CheckMessage1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalCheckInformation1", propOrder = {
    "chckDt",
    "chckPmtInf",
    "chckMsg"
})
public class TotalCheckInformation1 {

    @XmlElement(name = "ChckDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date chckDt;
    @XmlElement(name = "ChckPmtInf", required = true)
    protected CheckPaymentInformation1 chckPmtInf;
    @XmlElement(name = "ChckMsg", required = true)
    protected CheckMessage1 chckMsg;

    /**
     * Gets the value of the chckDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getChckDt() {
        return chckDt;
    }

    /**
     * Sets the value of the chckDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChckDt(Date value) {
        this.chckDt = value;
    }

    /**
     * Gets the value of the chckPmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPaymentInformation1 }
     *     
     */
    public CheckPaymentInformation1 getChckPmtInf() {
        return chckPmtInf;
    }

    /**
     * Sets the value of the chckPmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPaymentInformation1 }
     *     
     */
    public void setChckPmtInf(CheckPaymentInformation1 value) {
        this.chckPmtInf = value;
    }

    /**
     * Gets the value of the chckMsg property.
     * 
     * @return
     *     possible object is
     *     {@link CheckMessage1 }
     *     
     */
    public CheckMessage1 getChckMsg() {
        return chckMsg;
    }

    /**
     * Sets the value of the chckMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckMessage1 }
     *     
     */
    public void setChckMsg(CheckMessage1 value) {
        this.chckMsg = value;
    }

}
