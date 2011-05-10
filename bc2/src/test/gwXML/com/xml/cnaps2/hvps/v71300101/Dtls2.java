//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:46:04 ���� CST 
//


package com.xml.cnaps2.hvps.v71300101;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dtls2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dtls2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxTpCd" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.713.001.01}Max6Text"/>
 *         &lt;element name="SndgNbOfTxs" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.713.001.01}Max8NumericText"/>
 *         &lt;element name="SndgCtrlSum" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.713.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="RcvgNbOfTxs" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.713.001.01}Max8NumericText"/>
 *         &lt;element name="RcvgCtrlSum" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.713.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="ChckngDtlOfSndg" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.713.001.01}SndgAndRcvg1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChckngDtlOfRcvg" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.713.001.01}SndgAndRcvg1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dtls2", propOrder = {
    "txTpCd",
    "sndgNbOfTxs",
    "sndgCtrlSum",
    "rcvgNbOfTxs",
    "rcvgCtrlSum",
    "chckngDtlOfSndg",
    "chckngDtlOfRcvg"
})
public class Dtls2 {

    @XmlElement(name = "TxTpCd", required = true)
    protected String txTpCd;
    @XmlElement(name = "SndgNbOfTxs", required = true)
    protected String sndgNbOfTxs;
    @XmlElement(name = "SndgCtrlSum", required = true)
    protected ActiveCurrencyAndAmount sndgCtrlSum;
    @XmlElement(name = "RcvgNbOfTxs", required = true)
    protected String rcvgNbOfTxs;
    @XmlElement(name = "RcvgCtrlSum", required = true)
    protected ActiveCurrencyAndAmount rcvgCtrlSum;
    @XmlElement(name = "ChckngDtlOfSndg")
    protected List<SndgAndRcvg1> chckngDtlOfSndg = new Vector<SndgAndRcvg1>();
    @XmlElement(name = "ChckngDtlOfRcvg")
    protected List<SndgAndRcvg1> chckngDtlOfRcvg = new Vector<SndgAndRcvg1>();

    /**
     * Gets the value of the txTpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTpCd() {
        return txTpCd;
    }

    /**
     * Sets the value of the txTpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxTpCd(String value) {
        this.txTpCd = value;
    }

    /**
     * Gets the value of the sndgNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndgNbOfTxs() {
        return sndgNbOfTxs;
    }

    /**
     * Sets the value of the sndgNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndgNbOfTxs(String value) {
        this.sndgNbOfTxs = value;
    }

    /**
     * Gets the value of the sndgCtrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSndgCtrlSum() {
        return sndgCtrlSum;
    }

    /**
     * Sets the value of the sndgCtrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setSndgCtrlSum(ActiveCurrencyAndAmount value) {
        this.sndgCtrlSum = value;
    }

    /**
     * Gets the value of the rcvgNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvgNbOfTxs() {
        return rcvgNbOfTxs;
    }

    /**
     * Sets the value of the rcvgNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvgNbOfTxs(String value) {
        this.rcvgNbOfTxs = value;
    }

    /**
     * Gets the value of the rcvgCtrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRcvgCtrlSum() {
        return rcvgCtrlSum;
    }

    /**
     * Sets the value of the rcvgCtrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRcvgCtrlSum(ActiveCurrencyAndAmount value) {
        this.rcvgCtrlSum = value;
    }

    /**
     * Gets the value of the chckngDtlOfSndg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chckngDtlOfSndg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChckngDtlOfSndg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SndgAndRcvg1 }
     * 
     * 
     */
    public List<SndgAndRcvg1> getChckngDtlOfSndg() {
        if (chckngDtlOfSndg == null) {
            chckngDtlOfSndg = new Vector<SndgAndRcvg1>();
        }
        return this.chckngDtlOfSndg;
    }

    /**
     * Gets the value of the chckngDtlOfRcvg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chckngDtlOfRcvg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChckngDtlOfRcvg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SndgAndRcvg1 }
     * 
     * 
     */
    public List<SndgAndRcvg1> getChckngDtlOfRcvg() {
        if (chckngDtlOfRcvg == null) {
            chckngDtlOfRcvg = new Vector<SndgAndRcvg1>();
        }
        return this.chckngDtlOfRcvg;
    }

}
