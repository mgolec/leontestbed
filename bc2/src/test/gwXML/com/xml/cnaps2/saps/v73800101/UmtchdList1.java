//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:47:27 ���� CST 
//


package com.xml.cnaps2.saps.v73800101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UmtchdList1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UmtchdList1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MmbId" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.738.001.01}Max14Text"/>
 *         &lt;element name="ACSInitlAmt" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.738.001.01}SummaryAmountText"/>
 *         &lt;element name="SAPSInitlAmt" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.738.001.01}SummaryAmountText"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UmtchdList1", propOrder = {
    "mmbId",
    "acsInitlAmt",
    "sapsInitlAmt"
})
public class UmtchdList1 {

    @XmlElement(name = "MmbId", required = true)
    protected String mmbId;
    @XmlElement(name = "ACSInitlAmt", required = true)
    protected String acsInitlAmt;
    @XmlElement(name = "SAPSInitlAmt", required = true)
    protected String sapsInitlAmt;

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
     * Gets the value of the acsInitlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSInitlAmt() {
        return acsInitlAmt;
    }

    /**
     * Sets the value of the acsInitlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSInitlAmt(String value) {
        this.acsInitlAmt = value;
    }

    /**
     * Gets the value of the sapsInitlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPSInitlAmt() {
        return sapsInitlAmt;
    }

    /**
     * Sets the value of the sapsInitlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPSInitlAmt(String value) {
        this.sapsInitlAmt = value;
    }

}
