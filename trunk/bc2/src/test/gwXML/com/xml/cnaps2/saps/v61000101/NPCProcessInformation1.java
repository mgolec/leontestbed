//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:34:56 ���� CST 
//


package com.xml.cnaps2.saps.v61000101;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NPCProcessInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NPCProcessInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrcSts" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.610.001.01}Max4Text"/>
 *         &lt;element name="PrcCd" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.610.001.01}Max8Text"/>
 *         &lt;element name="RjctInf" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.610.001.01}Max105Text" minOccurs="0"/>
 *         &lt;element name="NetgDt" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.610.001.01}ISODate" minOccurs="0"/>
 *         &lt;element name="NetgRnd" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.610.001.01}Max2Text" minOccurs="0"/>
 *         &lt;element name="SttlmDt" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.610.001.01}ISODate" minOccurs="0"/>
 *         &lt;element name="RcvTm" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.610.001.01}ISODateTime" minOccurs="0"/>
 *         &lt;element name="TrnsmtTm" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.610.001.01}ISODateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NPCProcessInformation1", propOrder = {
    "prcSts",
    "prcCd",
    "rjctInf",
    "netgDt",
    "netgRnd",
    "sttlmDt",
    "rcvTm",
    "trnsmtTm"
})
public class NPCProcessInformation1 {

    @XmlElement(name = "PrcSts", required = true)
    protected String prcSts;
    @XmlElement(name = "PrcCd", required = true)
    protected String prcCd;
    @XmlElement(name = "RjctInf")
    protected String rjctInf;
    @XmlElement(name = "NetgDt", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date netgDt;
    @XmlElement(name = "NetgRnd")
    protected String netgRnd;
    @XmlElement(name = "SttlmDt", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date sttlmDt;
    @XmlElement(name = "RcvTm", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date rcvTm;
    @XmlElement(name = "TrnsmtTm", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date trnsmtTm;

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

    /**
     * Gets the value of the netgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getNetgDt() {
        return netgDt;
    }

    /**
     * Sets the value of the netgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetgDt(Date value) {
        this.netgDt = value;
    }

    /**
     * Gets the value of the netgRnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetgRnd() {
        return netgRnd;
    }

    /**
     * Sets the value of the netgRnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetgRnd(String value) {
        this.netgRnd = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmDt(Date value) {
        this.sttlmDt = value;
    }

    /**
     * Gets the value of the rcvTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRcvTm() {
        return rcvTm;
    }

    /**
     * Sets the value of the rcvTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvTm(Date value) {
        this.rcvTm = value;
    }

    /**
     * Gets the value of the trnsmtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTrnsmtTm() {
        return trnsmtTm;
    }

    /**
     * Sets the value of the trnsmtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnsmtTm(Date value) {
        this.trnsmtTm = value;
    }

}
