//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:51 ���� CST 
//


package com.xml.cnaps2.beps.v72600101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiveDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiveDetails1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgnlGrpHdr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.726.001.01}OriginalGroupHeader1"/>
 *         &lt;element name="TtlCnt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.726.001.01}Max8NumericText"/>
 *         &lt;element name="CtrlSum" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.726.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="PrcSts" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.726.001.01}Max4Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiveDetails1", propOrder = {
    "orgnlGrpHdr",
    "ttlCnt",
    "ctrlSum",
    "prcSts"
})
public class ReceiveDetails1 {

    @XmlElement(name = "OrgnlGrpHdr", required = true)
    protected OriginalGroupHeader1 orgnlGrpHdr;
    @XmlElement(name = "TtlCnt", required = true)
    protected String ttlCnt;
    @XmlElement(name = "CtrlSum", required = true)
    protected ActiveCurrencyAndAmount ctrlSum;
    @XmlElement(name = "PrcSts", required = true)
    protected String prcSts;

    /**
     * Gets the value of the orgnlGrpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupHeader1 }
     *     
     */
    public OriginalGroupHeader1 getOrgnlGrpHdr() {
        return orgnlGrpHdr;
    }

    /**
     * Sets the value of the orgnlGrpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupHeader1 }
     *     
     */
    public void setOrgnlGrpHdr(OriginalGroupHeader1 value) {
        this.orgnlGrpHdr = value;
    }

    /**
     * Gets the value of the ttlCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlCnt() {
        return ttlCnt;
    }

    /**
     * Sets the value of the ttlCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlCnt(String value) {
        this.ttlCnt = value;
    }

    /**
     * Gets the value of the ctrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCtrlSum() {
        return ctrlSum;
    }

    /**
     * Sets the value of the ctrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCtrlSum(ActiveCurrencyAndAmount value) {
        this.ctrlSum = value;
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
