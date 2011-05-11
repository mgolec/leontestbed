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
 * <p>Java class for DrftInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrftInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dt" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}ISODate"/>
 *         &lt;element name="Nb" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}Max32Text"/>
 *         &lt;element name="TstCd" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}Max10NumericText" minOccurs="0"/>
 *         &lt;element name="Tp" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}Max4Text" minOccurs="0"/>
 *         &lt;element name="Amt" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="IssrBk" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}Max14Text"/>
 *         &lt;element name="IssrAcct" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}Max32Text"/>
 *         &lt;element name="IssrNm" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}Max60Text"/>
 *         &lt;element name="RcvrNm" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}Max60Text" minOccurs="0"/>
 *         &lt;element name="HldrBk" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}Max14Text"/>
 *         &lt;element name="HldrAcct" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}Max32Text"/>
 *         &lt;element name="HldrNm" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.152.001.01}Max60Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrftInf1", propOrder = {
    "dt",
    "nb",
    "tstCd",
    "tp",
    "amt",
    "issrBk",
    "issrAcct",
    "issrNm",
    "rcvrNm",
    "hldrBk",
    "hldrAcct",
    "hldrNm"
})
public class DrftInf1 {

    @XmlElement(name = "Dt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date dt;
    @XmlElement(name = "Nb", required = true)
    protected String nb;
    @XmlElement(name = "TstCd")
    protected String tstCd;
    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "IssrBk", required = true)
    protected String issrBk;
    @XmlElement(name = "IssrAcct", required = true)
    protected String issrAcct;
    @XmlElement(name = "IssrNm", required = true)
    protected String issrNm;
    @XmlElement(name = "RcvrNm")
    protected String rcvrNm;
    @XmlElement(name = "HldrBk", required = true)
    protected String hldrBk;
    @XmlElement(name = "HldrAcct", required = true)
    protected String hldrAcct;
    @XmlElement(name = "HldrNm", required = true)
    protected String hldrNm;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDt(Date value) {
        this.dt = value;
    }

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNb(String value) {
        this.nb = value;
    }

    /**
     * Gets the value of the tstCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTstCd() {
        return tstCd;
    }

    /**
     * Sets the value of the tstCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTstCd(String value) {
        this.tstCd = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the issrBk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrBk() {
        return issrBk;
    }

    /**
     * Sets the value of the issrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrBk(String value) {
        this.issrBk = value;
    }

    /**
     * Gets the value of the issrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrAcct() {
        return issrAcct;
    }

    /**
     * Sets the value of the issrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrAcct(String value) {
        this.issrAcct = value;
    }

    /**
     * Gets the value of the issrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrNm() {
        return issrNm;
    }

    /**
     * Sets the value of the issrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrNm(String value) {
        this.issrNm = value;
    }

    /**
     * Gets the value of the rcvrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvrNm() {
        return rcvrNm;
    }

    /**
     * Sets the value of the rcvrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvrNm(String value) {
        this.rcvrNm = value;
    }

    /**
     * Gets the value of the hldrBk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHldrBk() {
        return hldrBk;
    }

    /**
     * Sets the value of the hldrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHldrBk(String value) {
        this.hldrBk = value;
    }

    /**
     * Gets the value of the hldrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHldrAcct() {
        return hldrAcct;
    }

    /**
     * Sets the value of the hldrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHldrAcct(String value) {
        this.hldrAcct = value;
    }

    /**
     * Gets the value of the hldrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHldrNm() {
        return hldrNm;
    }

    /**
     * Sets the value of the hldrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHldrNm(String value) {
        this.hldrNm = value;
    }

}
