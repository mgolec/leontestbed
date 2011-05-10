//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:47:14 ���� CST 
//


package com.xml.cnaps2.saps.v61600101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransactionList1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionList1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetgDt" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.616.001.01}ISODate"/>
 *         &lt;element name="NetgRnd" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.616.001.01}Max2NumericText"/>
 *         &lt;element name="MmbId" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.616.001.01}Max14Text"/>
 *         &lt;element name="DbtCdtId" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.616.001.01}CreditDebitCode1"/>
 *         &lt;element name="Amt" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.616.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="SttlmDt" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.616.001.01}ISODate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionList1", propOrder = {
    "netgDt",
    "netgRnd",
    "mmbId",
    "dbtCdtId",
    "amt",
    "sttlmDt"
})
public class TransactionList1 {

    @XmlElement(name = "NetgDt", required = true)
    protected XMLGregorianCalendar netgDt;
    @XmlElement(name = "NetgRnd", required = true)
    protected String netgRnd;
    @XmlElement(name = "MmbId", required = true)
    protected String mmbId;
    @XmlElement(name = "DbtCdtId", required = true)
    protected String dbtCdtId;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "SttlmDt", required = true)
    protected XMLGregorianCalendar sttlmDt;

    /**
     * Gets the value of the netgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNetgDt() {
        return netgDt;
    }

    /**
     * Sets the value of the netgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNetgDt(XMLGregorianCalendar value) {
        this.netgDt = value;
    }

    /**
     * Gets the value of the netgRnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetgRnd() {
        return netgRnd;
    }

    /**
     * Sets the value of the netgRnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetgRnd(String value) {
        this.netgRnd = value;
    }

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

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSttlmDt(XMLGregorianCalendar value) {
        this.sttlmDt = value;
    }

}
