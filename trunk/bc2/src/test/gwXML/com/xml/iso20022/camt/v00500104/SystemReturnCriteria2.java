//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 03:04:15 ���� CST 
//


package com.xml.iso20022.camt.v00500104;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemReturnCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemReturnCriteria2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SysIdInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="MmbIdInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="CtryIdInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *         &lt;element name="AcctIdInd" type="{urn:swift:xsd:camt.005.001.04}RequestedIndicator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemReturnCriteria2", propOrder = {
    "sysIdInd",
    "mmbIdInd",
    "ctryIdInd",
    "acctIdInd"
})
public class SystemReturnCriteria2 {

    @XmlElement(name = "SysIdInd")
    protected Boolean sysIdInd;
    @XmlElement(name = "MmbIdInd")
    protected Boolean mmbIdInd;
    @XmlElement(name = "CtryIdInd")
    protected Boolean ctryIdInd;
    @XmlElement(name = "AcctIdInd")
    protected Boolean acctIdInd;

    /**
     * Gets the value of the sysIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSysIdInd() {
        return sysIdInd;
    }

    /**
     * Sets the value of the sysIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSysIdInd(Boolean value) {
        this.sysIdInd = value;
    }

    /**
     * Gets the value of the mmbIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMmbIdInd() {
        return mmbIdInd;
    }

    /**
     * Sets the value of the mmbIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMmbIdInd(Boolean value) {
        this.mmbIdInd = value;
    }

    /**
     * Gets the value of the ctryIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtryIdInd() {
        return ctryIdInd;
    }

    /**
     * Sets the value of the ctryIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCtryIdInd(Boolean value) {
        this.ctryIdInd = value;
    }

    /**
     * Gets the value of the acctIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctIdInd() {
        return acctIdInd;
    }

    /**
     * Sets the value of the acctIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcctIdInd(Boolean value) {
        this.acctIdInd = value;
    }

}
