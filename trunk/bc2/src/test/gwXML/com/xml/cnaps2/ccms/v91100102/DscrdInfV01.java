//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:38 ���� CST 
//


package com.xml.cnaps2.ccms.v91100102;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DscrdInfV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DscrdInfV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrigSndr" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.911.001.02}Max14Text"/>
 *         &lt;element name="OrigSndDt" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.911.001.02}Max8Text"/>
 *         &lt;element name="MT" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.911.001.02}Max20Text"/>
 *         &lt;element name="MsgId" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.911.001.02}Max20Text"/>
 *         &lt;element name="MsgRefId" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.911.001.02}Max20Text"/>
 *         &lt;element name="PrcCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.911.001.02}Max8Text"/>
 *         &lt;element name="RjctInf" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.911.001.02}Max105Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DscrdInfV01", propOrder = {
    "origSndr",
    "origSndDt",
    "mt",
    "msgId",
    "msgRefId",
    "prcCd",
    "rjctInf"
})
public class DscrdInfV01 {

    @XmlElement(name = "OrigSndr", required = true)
    protected String origSndr;
    @XmlElement(name = "OrigSndDt", required = true)
    protected String origSndDt;
    @XmlElement(name = "MT", required = true)
    protected String mt;
    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "MsgRefId", required = true)
    protected String msgRefId;
    @XmlElement(name = "PrcCd", required = true)
    protected String prcCd;
    @XmlElement(name = "RjctInf")
    protected String rjctInf;

    /**
     * Gets the value of the origSndr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigSndr() {
        return origSndr;
    }

    /**
     * Sets the value of the origSndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigSndr(String value) {
        this.origSndr = value;
    }

    /**
     * Gets the value of the origSndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigSndDt() {
        return origSndDt;
    }

    /**
     * Sets the value of the origSndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigSndDt(String value) {
        this.origSndDt = value;
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
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the msgRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgRefId() {
        return msgRefId;
    }

    /**
     * Sets the value of the msgRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgRefId(String value) {
        this.msgRefId = value;
    }

    /**
     * Gets the value of the prcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcCd() {
        return prcCd;
    }

    /**
     * Sets the value of the prcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcCd(String value) {
        this.prcCd = value;
    }

    /**
     * Gets the value of the rjctInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctInf() {
        return rjctInf;
    }

    /**
     * Sets the value of the rjctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRjctInf(String value) {
        this.rjctInf = value;
    }

}