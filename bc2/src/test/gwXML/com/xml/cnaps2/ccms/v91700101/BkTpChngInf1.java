//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:31 ���� CST 
//


package com.xml.cnaps2.ccms.v91700101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BkTpChngInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BkTpChngInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChngCtrl" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.917.001.01}ChngCtrl1"/>
 *         &lt;element name="BkTpCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.917.001.01}Exact3NumericText"/>
 *         &lt;element name="BkTpNm" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.917.001.01}Max35Text"/>
 *         &lt;element name="TpCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.917.001.01}Exact1NumericText"/>
 *         &lt;element name="TpNm" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.917.001.01}Max35Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BkTpChngInf1", propOrder = {
    "chngCtrl",
    "bkTpCd",
    "bkTpNm",
    "tpCd",
    "tpNm"
})
public class BkTpChngInf1 {

    @XmlElement(name = "ChngCtrl", required = true)
    protected ChngCtrl1 chngCtrl;
    @XmlElement(name = "BkTpCd", required = true)
    protected String bkTpCd;
    @XmlElement(name = "BkTpNm", required = true)
    protected String bkTpNm;
    @XmlElement(name = "TpCd", required = true)
    protected String tpCd;
    @XmlElement(name = "TpNm", required = true)
    protected String tpNm;

    /**
     * Gets the value of the chngCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link ChngCtrl1 }
     *     
     */
    public ChngCtrl1 getChngCtrl() {
        return chngCtrl;
    }

    /**
     * Sets the value of the chngCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChngCtrl1 }
     *     
     */
    public void setChngCtrl(ChngCtrl1 value) {
        this.chngCtrl = value;
    }

    /**
     * Gets the value of the bkTpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkTpCd() {
        return bkTpCd;
    }

    /**
     * Sets the value of the bkTpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBkTpCd(String value) {
        this.bkTpCd = value;
    }

    /**
     * Gets the value of the bkTpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkTpNm() {
        return bkTpNm;
    }

    /**
     * Sets the value of the bkTpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBkTpNm(String value) {
        this.bkTpNm = value;
    }

    /**
     * Gets the value of the tpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpCd() {
        return tpCd;
    }

    /**
     * Sets the value of the tpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpCd(String value) {
        this.tpCd = value;
    }

    /**
     * Gets the value of the tpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpNm() {
        return tpNm;
    }

    /**
     * Sets the value of the tpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpNm(String value) {
        this.tpNm = value;
    }

}
