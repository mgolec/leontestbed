//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:46:15 ���� CST 
//


package com.xml.cnaps2.nets.v35600101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditExtensionManagement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditExtensionManagement1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MgrId" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}Max14Text"/>
 *         &lt;element name="NtfctnTp" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}Max4Text"/>
 *         &lt;element name="OrgnlNotDstrbtn" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="OrgnlIsDstrbtn" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="NotDstrbtn" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="IsDstrbtn" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}ActiveCurrencyAndAmount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditExtensionManagement1", propOrder = {
    "mgrId",
    "ntfctnTp",
    "orgnlNotDstrbtn",
    "orgnlIsDstrbtn",
    "notDstrbtn",
    "isDstrbtn"
})
public class CreditExtensionManagement1 {

    @XmlElement(name = "MgrId", required = true)
    protected String mgrId;
    @XmlElement(name = "NtfctnTp", required = true)
    protected String ntfctnTp;
    @XmlElement(name = "OrgnlNotDstrbtn", required = true)
    protected ActiveCurrencyAndAmount orgnlNotDstrbtn;
    @XmlElement(name = "OrgnlIsDstrbtn", required = true)
    protected ActiveCurrencyAndAmount orgnlIsDstrbtn;
    @XmlElement(name = "NotDstrbtn", required = true)
    protected ActiveCurrencyAndAmount notDstrbtn;
    @XmlElement(name = "IsDstrbtn", required = true)
    protected ActiveCurrencyAndAmount isDstrbtn;

    /**
     * Gets the value of the mgrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMgrId() {
        return mgrId;
    }

    /**
     * Sets the value of the mgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMgrId(String value) {
        this.mgrId = value;
    }

    /**
     * Gets the value of the ntfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtfctnTp() {
        return ntfctnTp;
    }

    /**
     * Sets the value of the ntfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtfctnTp(String value) {
        this.ntfctnTp = value;
    }

    /**
     * Gets the value of the orgnlNotDstrbtn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOrgnlNotDstrbtn() {
        return orgnlNotDstrbtn;
    }

    /**
     * Sets the value of the orgnlNotDstrbtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setOrgnlNotDstrbtn(ActiveCurrencyAndAmount value) {
        this.orgnlNotDstrbtn = value;
    }

    /**
     * Gets the value of the orgnlIsDstrbtn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOrgnlIsDstrbtn() {
        return orgnlIsDstrbtn;
    }

    /**
     * Sets the value of the orgnlIsDstrbtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setOrgnlIsDstrbtn(ActiveCurrencyAndAmount value) {
        this.orgnlIsDstrbtn = value;
    }

    /**
     * Gets the value of the notDstrbtn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNotDstrbtn() {
        return notDstrbtn;
    }

    /**
     * Sets the value of the notDstrbtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNotDstrbtn(ActiveCurrencyAndAmount value) {
        this.notDstrbtn = value;
    }

    /**
     * Gets the value of the isDstrbtn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIsDstrbtn() {
        return isDstrbtn;
    }

    /**
     * Sets the value of the isDstrbtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIsDstrbtn(ActiveCurrencyAndAmount value) {
        this.isDstrbtn = value;
    }

}