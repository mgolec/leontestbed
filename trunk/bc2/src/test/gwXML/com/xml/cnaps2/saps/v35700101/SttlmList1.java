//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:46:36 ���� CST 
//


package com.xml.cnaps2.saps.v35700101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SttlmList1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SttlmList1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MmbId" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.357.001.01}Max14Text"/>
 *         &lt;element name="PldgFincgId" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.357.001.01}PledgeFinancingIdentificationCode1"/>
 *         &lt;element name="StartgPt" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.357.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SttlmList1", propOrder = {
    "mmbId",
    "pldgFincgId",
    "startgPt"
})
public class SttlmList1 {

    @XmlElement(name = "MmbId", required = true)
    protected String mmbId;
    @XmlElement(name = "PldgFincgId", required = true)
    protected String pldgFincgId;
    @XmlElement(name = "StartgPt")
    protected ActiveCurrencyAndAmount startgPt;

    /**
     * Gets the value of the mmbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmbId(String value) {
        this.mmbId = value;
    }

    /**
     * Gets the value of the pldgFincgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPldgFincgId() {
        return pldgFincgId;
    }

    /**
     * Sets the value of the pldgFincgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPldgFincgId(String value) {
        this.pldgFincgId = value;
    }

    /**
     * Gets the value of the startgPt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getStartgPt() {
        return startgPt;
    }

    /**
     * Sets the value of the startgPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setStartgPt(ActiveCurrencyAndAmount value) {
        this.startgPt = value;
    }

}