//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:24 ���� CST 
//


package com.xml.cnaps2.beps.v38700101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDetails1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.387.001.01}Max32Text"/>
 *         &lt;element name="Nm" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.387.001.01}Max60Text"/>
 *         &lt;element name="InstgPty" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.387.001.01}Max14Text" minOccurs="0"/>
 *         &lt;element name="AcctBk" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.387.001.01}Max14Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDetails1", propOrder = {
    "id",
    "nm",
    "instgPty",
    "acctBk"
})
public class AccountDetails1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "InstgPty")
    protected String instgPty;
    @XmlElement(name = "AcctBk")
    protected String acctBk;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the instgPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgPty() {
        return instgPty;
    }

    /**
     * Sets the value of the instgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstgPty(String value) {
        this.instgPty = value;
    }

    /**
     * Gets the value of the acctBk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctBk() {
        return acctBk;
    }

    /**
     * Sets the value of the acctBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctBk(String value) {
        this.acctBk = value;
    }

}
