//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:46:41 ���� CST 
//


package com.xml.cnaps2.saps.v36200101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceWarningNotificationInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceWarningNotificationInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MmbId" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.362.001.01}Max14Text"/>
 *         &lt;element name="WrngTp" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.362.001.01}WarningTypeCode1"/>
 *         &lt;element name="WrngVal" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.362.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="WrngPlusMnsTp" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.362.001.01}PlusMinusTypeCode1"/>
 *         &lt;element name="CurBal" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.362.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="PlusMnsTp" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.362.001.01}PlusMinusTypeCode1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceWarningNotificationInformation1", propOrder = {
    "mmbId",
    "wrngTp",
    "wrngVal",
    "wrngPlusMnsTp",
    "curBal",
    "plusMnsTp"
})
public class BalanceWarningNotificationInformation1 {

    @XmlElement(name = "MmbId", required = true)
    protected String mmbId;
    @XmlElement(name = "WrngTp", required = true)
    protected String wrngTp;
    @XmlElement(name = "WrngVal", required = true)
    protected ActiveCurrencyAndAmount wrngVal;
    @XmlElement(name = "WrngPlusMnsTp", required = true)
    protected String wrngPlusMnsTp;
    @XmlElement(name = "CurBal", required = true)
    protected ActiveCurrencyAndAmount curBal;
    @XmlElement(name = "PlusMnsTp", required = true)
    protected String plusMnsTp;

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
     * Gets the value of the wrngTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrngTp() {
        return wrngTp;
    }

    /**
     * Sets the value of the wrngTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrngTp(String value) {
        this.wrngTp = value;
    }

    /**
     * Gets the value of the wrngVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getWrngVal() {
        return wrngVal;
    }

    /**
     * Sets the value of the wrngVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setWrngVal(ActiveCurrencyAndAmount value) {
        this.wrngVal = value;
    }

    /**
     * Gets the value of the wrngPlusMnsTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrngPlusMnsTp() {
        return wrngPlusMnsTp;
    }

    /**
     * Sets the value of the wrngPlusMnsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrngPlusMnsTp(String value) {
        this.wrngPlusMnsTp = value;
    }

    /**
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCurBal(ActiveCurrencyAndAmount value) {
        this.curBal = value;
    }

    /**
     * Gets the value of the plusMnsTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlusMnsTp() {
        return plusMnsTp;
    }

    /**
     * Sets the value of the plusMnsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlusMnsTp(String value) {
        this.plusMnsTp = value;
    }

}