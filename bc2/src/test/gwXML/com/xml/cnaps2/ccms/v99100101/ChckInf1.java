//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.29 at 02:07:21 ���� CST 
//


package com.xml.cnaps2.ccms.v99100101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChckInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChckInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SndNd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.991.001.01}Max14Text"/>
 *         &lt;element name="SndSvcrNm" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.991.001.01}Max20Text"/>
 *         &lt;element name="SndLineMgrNm" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.991.001.01}Max48Text"/>
 *         &lt;element name="SndRoadNm" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.991.001.01}Max20Text"/>
 *         &lt;element name="SndDt" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.991.001.01}Max23Text"/>
 *         &lt;element name="RcvNd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.991.001.01}Max14Text"/>
 *         &lt;element name="RcvSvcrNm" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.991.001.01}Max20Text"/>
 *         &lt;element name="RcvLineMgr" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.991.001.01}Max48Text"/>
 *         &lt;element name="RspnLineNm" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.991.001.01}Max48Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChckInf1", propOrder = {
    "sndNd",
    "sndSvcrNm",
    "sndLineMgrNm",
    "sndRoadNm",
    "sndDt",
    "rcvNd",
    "rcvSvcrNm",
    "rcvLineMgr",
    "rspnLineNm"
})
public class ChckInf1 {

    @XmlElement(name = "SndNd", required = true)
    protected String sndNd;
    @XmlElement(name = "SndSvcrNm", required = true)
    protected String sndSvcrNm;
    @XmlElement(name = "SndLineMgrNm", required = true)
    protected String sndLineMgrNm;
    @XmlElement(name = "SndRoadNm", required = true)
    protected String sndRoadNm;
    @XmlElement(name = "SndDt", required = true)
    protected String sndDt;
    @XmlElement(name = "RcvNd", required = true)
    protected String rcvNd;
    @XmlElement(name = "RcvSvcrNm", required = true)
    protected String rcvSvcrNm;
    @XmlElement(name = "RcvLineMgr", required = true)
    protected String rcvLineMgr;
    @XmlElement(name = "RspnLineNm", required = true)
    protected String rspnLineNm;

    /**
     * Gets the value of the sndNd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndNd() {
        return sndNd;
    }

    /**
     * Sets the value of the sndNd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndNd(String value) {
        this.sndNd = value;
    }

    /**
     * Gets the value of the sndSvcrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndSvcrNm() {
        return sndSvcrNm;
    }

    /**
     * Sets the value of the sndSvcrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndSvcrNm(String value) {
        this.sndSvcrNm = value;
    }

    /**
     * Gets the value of the sndLineMgrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndLineMgrNm() {
        return sndLineMgrNm;
    }

    /**
     * Sets the value of the sndLineMgrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndLineMgrNm(String value) {
        this.sndLineMgrNm = value;
    }

    /**
     * Gets the value of the sndRoadNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndRoadNm() {
        return sndRoadNm;
    }

    /**
     * Sets the value of the sndRoadNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndRoadNm(String value) {
        this.sndRoadNm = value;
    }

    /**
     * Gets the value of the sndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndDt() {
        return sndDt;
    }

    /**
     * Sets the value of the sndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndDt(String value) {
        this.sndDt = value;
    }

    /**
     * Gets the value of the rcvNd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvNd() {
        return rcvNd;
    }

    /**
     * Sets the value of the rcvNd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvNd(String value) {
        this.rcvNd = value;
    }

    /**
     * Gets the value of the rcvSvcrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvSvcrNm() {
        return rcvSvcrNm;
    }

    /**
     * Sets the value of the rcvSvcrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvSvcrNm(String value) {
        this.rcvSvcrNm = value;
    }

    /**
     * Gets the value of the rcvLineMgr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvLineMgr() {
        return rcvLineMgr;
    }

    /**
     * Sets the value of the rcvLineMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvLineMgr(String value) {
        this.rcvLineMgr = value;
    }

    /**
     * Gets the value of the rspnLineNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnLineNm() {
        return rspnLineNm;
    }

    /**
     * Sets the value of the rspnLineNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspnLineNm(String value) {
        this.rspnLineNm = value;
    }

}