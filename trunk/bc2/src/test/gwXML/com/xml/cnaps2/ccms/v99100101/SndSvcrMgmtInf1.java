//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:13 ���� CST 
//


package com.xml.cnaps2.ccms.v99100101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SndSvcrMgmtInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SndSvcrMgmtInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SndSvcrRcvSts" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.991.001.01}Exact1NumericText"/>
 *         &lt;element name="SndNdMgmtSts" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.991.001.01}Exact1NumericText"/>
 *         &lt;element name="RcvNdMgmtSts" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.991.001.01}Exact1NumericText"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SndSvcrMgmtInf1", propOrder = {
    "sndSvcrRcvSts",
    "sndNdMgmtSts",
    "rcvNdMgmtSts"
})
public class SndSvcrMgmtInf1 {

    @XmlElement(name = "SndSvcrRcvSts", required = true)
    protected String sndSvcrRcvSts;
    @XmlElement(name = "SndNdMgmtSts", required = true)
    protected String sndNdMgmtSts;
    @XmlElement(name = "RcvNdMgmtSts", required = true)
    protected String rcvNdMgmtSts;

    /**
     * Gets the value of the sndSvcrRcvSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndSvcrRcvSts() {
        return sndSvcrRcvSts;
    }

    /**
     * Sets the value of the sndSvcrRcvSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndSvcrRcvSts(String value) {
        this.sndSvcrRcvSts = value;
    }

    /**
     * Gets the value of the sndNdMgmtSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndNdMgmtSts() {
        return sndNdMgmtSts;
    }

    /**
     * Sets the value of the sndNdMgmtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndNdMgmtSts(String value) {
        this.sndNdMgmtSts = value;
    }

    /**
     * Gets the value of the rcvNdMgmtSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvNdMgmtSts() {
        return rcvNdMgmtSts;
    }

    /**
     * Sets the value of the rcvNdMgmtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvNdMgmtSts(String value) {
        this.rcvNdMgmtSts = value;
    }

}
