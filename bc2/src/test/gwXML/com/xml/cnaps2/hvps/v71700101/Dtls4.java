//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:58 ���� CST 
//


package com.xml.cnaps2.hvps.v71700101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dtls4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dtls4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amt" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.717.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="InstgClrSysMmb" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.717.001.01}Max14Text"/>
 *         &lt;element name="InstgBrnchId" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.717.001.01}Max14Text"/>
 *         &lt;element name="InstdClrSysMmb" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.717.001.01}Max14Text"/>
 *         &lt;element name="InstdBrnchId" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.717.001.01}Max14Text"/>
 *         &lt;element name="TxTp" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.717.001.01}Max4Text"/>
 *         &lt;element name="CtgyPurpCd" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.717.001.01}Max5Text"/>
 *         &lt;element name="IntrBkLnRate" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.717.001.01}Max7Text"/>
 *         &lt;element name="IntrBkLmt" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.717.001.01}Max5Text"/>
 *         &lt;element name="OrgnlMsgId" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.717.001.01}Max35Text"/>
 *         &lt;element name="AddtlInf" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.717.001.01}Max60Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dtls4", propOrder = {
    "amt",
    "instgClrSysMmb",
    "instgBrnchId",
    "instdClrSysMmb",
    "instdBrnchId",
    "txTp",
    "ctgyPurpCd",
    "intrBkLnRate",
    "intrBkLmt",
    "orgnlMsgId",
    "addtlInf"
})
public class Dtls4 {

    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "InstgClrSysMmb", required = true)
    protected String instgClrSysMmb;
    @XmlElement(name = "InstgBrnchId", required = true)
    protected String instgBrnchId;
    @XmlElement(name = "InstdClrSysMmb", required = true)
    protected String instdClrSysMmb;
    @XmlElement(name = "InstdBrnchId", required = true)
    protected String instdBrnchId;
    @XmlElement(name = "TxTp", required = true)
    protected String txTp;
    @XmlElement(name = "CtgyPurpCd", required = true)
    protected String ctgyPurpCd;
    @XmlElement(name = "IntrBkLnRate", required = true)
    protected String intrBkLnRate;
    @XmlElement(name = "IntrBkLmt", required = true)
    protected String intrBkLmt;
    @XmlElement(name = "OrgnlMsgId", required = true)
    protected String orgnlMsgId;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

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
     * Gets the value of the instgClrSysMmb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgClrSysMmb() {
        return instgClrSysMmb;
    }

    /**
     * Sets the value of the instgClrSysMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstgClrSysMmb(String value) {
        this.instgClrSysMmb = value;
    }

    /**
     * Gets the value of the instgBrnchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgBrnchId() {
        return instgBrnchId;
    }

    /**
     * Sets the value of the instgBrnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstgBrnchId(String value) {
        this.instgBrnchId = value;
    }

    /**
     * Gets the value of the instdClrSysMmb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstdClrSysMmb() {
        return instdClrSysMmb;
    }

    /**
     * Sets the value of the instdClrSysMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstdClrSysMmb(String value) {
        this.instdClrSysMmb = value;
    }

    /**
     * Gets the value of the instdBrnchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstdBrnchId() {
        return instdBrnchId;
    }

    /**
     * Sets the value of the instdBrnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstdBrnchId(String value) {
        this.instdBrnchId = value;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxTp(String value) {
        this.txTp = value;
    }

    /**
     * Gets the value of the ctgyPurpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgyPurpCd() {
        return ctgyPurpCd;
    }

    /**
     * Sets the value of the ctgyPurpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtgyPurpCd(String value) {
        this.ctgyPurpCd = value;
    }

    /**
     * Gets the value of the intrBkLnRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrBkLnRate() {
        return intrBkLnRate;
    }

    /**
     * Sets the value of the intrBkLnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrBkLnRate(String value) {
        this.intrBkLnRate = value;
    }

    /**
     * Gets the value of the intrBkLmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrBkLmt() {
        return intrBkLmt;
    }

    /**
     * Sets the value of the intrBkLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrBkLmt(String value) {
        this.intrBkLmt = value;
    }

    /**
     * Gets the value of the orgnlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlMsgId(String value) {
        this.orgnlMsgId = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
