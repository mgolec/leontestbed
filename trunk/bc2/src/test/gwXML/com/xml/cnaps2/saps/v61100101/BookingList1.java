//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:47:07 ���� CST 
//


package com.xml.cnaps2.saps.v61100101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingList1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingList1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookgId" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.611.001.01}Max14Text"/>
 *         &lt;element name="DbtCdtId" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.611.001.01}CreditDebitCode1"/>
 *         &lt;element name="Amt" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.611.001.01}ActiveCurrencyAndAmount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingList1", propOrder = {
    "bookgId",
    "dbtCdtId",
    "amt"
})
public class BookingList1 {

    @XmlElement(name = "BookgId", required = true)
    protected String bookgId;
    @XmlElement(name = "DbtCdtId", required = true)
    protected String dbtCdtId;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;

    /**
     * Gets the value of the bookgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookgId() {
        return bookgId;
    }

    /**
     * Sets the value of the bookgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookgId(String value) {
        this.bookgId = value;
    }

    /**
     * Gets the value of the dbtCdtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtCdtId() {
        return dbtCdtId;
    }

    /**
     * Sets the value of the dbtCdtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbtCdtId(String value) {
        this.dbtCdtId = value;
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

}
