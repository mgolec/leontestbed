//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:47:15 ���� CST 
//


package com.xml.cnaps2.saps.v73000101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnilateralChecking1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnilateralChecking1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RspnSts" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.730.001.01}Max4Text"/>
 *         &lt;element name="TtlNb" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.730.001.01}Max8NumericText"/>
 *         &lt;element name="NbOfDbt" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.730.001.01}Max8NumericText"/>
 *         &lt;element name="DbtAmt" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.730.001.01}SummaryAmountText"/>
 *         &lt;element name="NbOfCdt" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.730.001.01}Max8NumericText"/>
 *         &lt;element name="CdtAmt" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.730.001.01}SummaryAmountText"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnilateralChecking1", propOrder = {
    "rspnSts",
    "ttlNb",
    "nbOfDbt",
    "dbtAmt",
    "nbOfCdt",
    "cdtAmt"
})
public class UnilateralChecking1 {

    @XmlElement(name = "RspnSts", required = true)
    protected String rspnSts;
    @XmlElement(name = "TtlNb", required = true)
    protected String ttlNb;
    @XmlElement(name = "NbOfDbt", required = true)
    protected String nbOfDbt;
    @XmlElement(name = "DbtAmt", required = true)
    protected String dbtAmt;
    @XmlElement(name = "NbOfCdt", required = true)
    protected String nbOfCdt;
    @XmlElement(name = "CdtAmt", required = true)
    protected String cdtAmt;

    /**
     * Gets the value of the rspnSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnSts() {
        return rspnSts;
    }

    /**
     * Sets the value of the rspnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspnSts(String value) {
        this.rspnSts = value;
    }

    /**
     * Gets the value of the ttlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNb() {
        return ttlNb;
    }

    /**
     * Sets the value of the ttlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlNb(String value) {
        this.ttlNb = value;
    }

    /**
     * Gets the value of the nbOfDbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfDbt() {
        return nbOfDbt;
    }

    /**
     * Sets the value of the nbOfDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfDbt(String value) {
        this.nbOfDbt = value;
    }

    /**
     * Gets the value of the dbtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtAmt() {
        return dbtAmt;
    }

    /**
     * Sets the value of the dbtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbtAmt(String value) {
        this.dbtAmt = value;
    }

    /**
     * Gets the value of the nbOfCdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfCdt() {
        return nbOfCdt;
    }

    /**
     * Sets the value of the nbOfCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfCdt(String value) {
        this.nbOfCdt = value;
    }

    /**
     * Gets the value of the cdtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtAmt() {
        return cdtAmt;
    }

    /**
     * Sets the value of the cdtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtAmt(String value) {
        this.cdtAmt = value;
    }

}