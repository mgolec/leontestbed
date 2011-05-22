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
 * <p>Java class for CheckPaymentInformationDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPaymentInformationDetails1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxNetgDt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.721.001.01}ISODate"/>
 *         &lt;element name="TxNetgRnd" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.721.001.01}Max2NumericText"/>
 *         &lt;element name="MT" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.721.001.01}Max35Text"/>
 *         &lt;element name="SndTtlCnt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.721.001.01}Max8NumericText"/>
 *         &lt;element name="SndTtlAmt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.721.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="RcvTtlCnt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.721.001.01}Max8NumericText"/>
 *         &lt;element name="RcvTtlAmt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.721.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="PrcSts" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.721.001.01}Max4Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPaymentInformationDetails1", propOrder = {
    "txNetgDt",
    "txNetgRnd",
    "mt",
    "sndTtlCnt",
    "sndTtlAmt",
    "rcvTtlCnt",
    "rcvTtlAmt",
    "prcSts"
})
public class CheckPaymentInformationDetails1 {

    @XmlElement(name = "TxNetgDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date txNetgDt;
    @XmlElement(name = "TxNetgRnd", required = true)
    protected String txNetgRnd;
    @XmlElement(name = "MT", required = true)
    protected String mt;
    @XmlElement(name = "SndTtlCnt", required = true)
    protected String sndTtlCnt;
    @XmlElement(name = "SndTtlAmt", required = true)
    protected ActiveCurrencyAndAmount sndTtlAmt;
    @XmlElement(name = "RcvTtlCnt", required = true)
    protected String rcvTtlCnt;
    @XmlElement(name = "RcvTtlAmt", required = true)
    protected ActiveCurrencyAndAmount rcvTtlAmt;
    @XmlElement(name = "PrcSts", required = true)
    protected String prcSts;

    /**
     * Gets the value of the txNetgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTxNetgDt() {
        return txNetgDt;
    }

    /**
     * Sets the value of the txNetgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxNetgDt(Date value) {
        this.txNetgDt = value;
    }

    /**
     * Gets the value of the txNetgRnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxNetgRnd() {
        return txNetgRnd;
    }

    /**
     * Sets the value of the txNetgRnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxNetgRnd(String value) {
        this.txNetgRnd = value;
    }

    /**
     * Gets the value of the mt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMT() {
        return mt;
    }

    /**
     * Sets the value of the mt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMT(String value) {
        this.mt = value;
    }

    /**
     * Gets the value of the sndTtlCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndTtlCnt() {
        return sndTtlCnt;
    }

    /**
     * Sets the value of the sndTtlCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndTtlCnt(String value) {
        this.sndTtlCnt = value;
    }

    /**
     * Gets the value of the sndTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSndTtlAmt() {
        return sndTtlAmt;
    }

    /**
     * Sets the value of the sndTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setSndTtlAmt(ActiveCurrencyAndAmount value) {
        this.sndTtlAmt = value;
    }

    /**
     * Gets the value of the rcvTtlCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvTtlCnt() {
        return rcvTtlCnt;
    }

    /**
     * Sets the value of the rcvTtlCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvTtlCnt(String value) {
        this.rcvTtlCnt = value;
    }

    /**
     * Gets the value of the rcvTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRcvTtlAmt() {
        return rcvTtlAmt;
    }

    /**
     * Sets the value of the rcvTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRcvTtlAmt(ActiveCurrencyAndAmount value) {
        this.rcvTtlAmt = value;
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
