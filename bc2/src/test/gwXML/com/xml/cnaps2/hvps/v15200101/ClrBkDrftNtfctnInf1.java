//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:44 ���� CST 
//


package com.xml.cnaps2.hvps.v15200101;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ClrBkDrftNtfctnInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClrBkDrftNtfctnInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DrftInf" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}DrftInf1"/>
 *         &lt;element name="ActlSttlmAmt" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="RmndDtPmt" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}ISODate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClrBkDrftNtfctnInf1", propOrder = {
    "drftInf",
    "actlSttlmAmt",
    "rmndDtPmt"
})
public class ClrBkDrftNtfctnInf1 {

    @XmlElement(name = "DrftInf", required = true)
    protected DrftInf1 drftInf;
    @XmlElement(name = "ActlSttlmAmt", required = true)
    protected ActiveCurrencyAndAmount actlSttlmAmt;
    @XmlElement(name = "RmndDtPmt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date rmndDtPmt;

    /**
     * Gets the value of the drftInf property.
     * 
     * @return
     *     possible object is
     *     {@link DrftInf1 }
     *     
     */
    public DrftInf1 getDrftInf() {
        return drftInf;
    }

    /**
     * Sets the value of the drftInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrftInf1 }
     *     
     */
    public void setDrftInf(DrftInf1 value) {
        this.drftInf = value;
    }

    /**
     * Gets the value of the actlSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getActlSttlmAmt() {
        return actlSttlmAmt;
    }

    /**
     * Sets the value of the actlSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setActlSttlmAmt(ActiveCurrencyAndAmount value) {
        this.actlSttlmAmt = value;
    }

    /**
     * Gets the value of the rmndDtPmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRmndDtPmt() {
        return rmndDtPmt;
    }

    /**
     * Sets the value of the rmndDtPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmndDtPmt(Date value) {
        this.rmndDtPmt = value;
    }

}
