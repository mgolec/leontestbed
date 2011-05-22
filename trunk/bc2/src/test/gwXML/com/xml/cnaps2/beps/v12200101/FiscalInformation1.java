//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:32:10 ���� CST 
//


package com.xml.cnaps2.beps.v12200101;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FiscalInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiscalInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlowNb" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.122.001.01}Max20Text"/>
 *         &lt;element name="Amt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.122.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="RptCd" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.122.001.01}Max10NumericText"/>
 *         &lt;element name="RcvCd" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.122.001.01}Max10NumericText"/>
 *         &lt;element name="RptFrms" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.122.001.01}ISODate"/>
 *         &lt;element name="RptNb" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.122.001.01}Max10NumericText"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiscalInformation1", propOrder = {
    "flowNb",
    "amt",
    "rptCd",
    "rcvCd",
    "rptFrms",
    "rptNb"
})
public class FiscalInformation1 {

    @XmlElement(name = "FlowNb", required = true)
    protected String flowNb;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "RptCd", required = true)
    protected String rptCd;
    @XmlElement(name = "RcvCd", required = true)
    protected String rcvCd;
    @XmlElement(name = "RptFrms", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date rptFrms;
    @XmlElement(name = "RptNb", required = true)
    protected String rptNb;

    /**
     * Gets the value of the flowNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowNb() {
        return flowNb;
    }

    /**
     * Sets the value of the flowNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowNb(String value) {
        this.flowNb = value;
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
     * Gets the value of the rptCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptCd() {
        return rptCd;
    }

    /**
     * Sets the value of the rptCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptCd(String value) {
        this.rptCd = value;
    }

    /**
     * Gets the value of the rcvCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvCd() {
        return rcvCd;
    }

    /**
     * Sets the value of the rcvCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvCd(String value) {
        this.rcvCd = value;
    }

    /**
     * Gets the value of the rptFrms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRptFrms() {
        return rptFrms;
    }

    /**
     * Sets the value of the rptFrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptFrms(Date value) {
        this.rptFrms = value;
    }

    /**
     * Gets the value of the rptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptNb() {
        return rptNb;
    }

    /**
     * Sets the value of the rptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptNb(String value) {
        this.rptNb = value;
    }

}
