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
 * <p>Java class for NetDebitLimitInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetDebitLimitInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MmbId" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}Max14Text"/>
 *         &lt;element name="CdtLd" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="TtlPldgVal" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="CdtXtnsnLmt" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="NetDbtLmt" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="AvlblNetDbt" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}ActiveCurrencyAndAmount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetDebitLimitInformation1", propOrder = {
    "mmbId",
    "cdtLd",
    "ttlPldgVal",
    "cdtXtnsnLmt",
    "netDbtLmt",
    "avlblNetDbt"
})
public class NetDebitLimitInformation1 {

    @XmlElement(name = "MmbId", required = true)
    protected String mmbId;
    @XmlElement(name = "CdtLd", required = true)
    protected ActiveCurrencyAndAmount cdtLd;
    @XmlElement(name = "TtlPldgVal", required = true)
    protected ActiveCurrencyAndAmount ttlPldgVal;
    @XmlElement(name = "CdtXtnsnLmt", required = true)
    protected ActiveCurrencyAndAmount cdtXtnsnLmt;
    @XmlElement(name = "NetDbtLmt", required = true)
    protected ActiveCurrencyAndAmount netDbtLmt;
    @XmlElement(name = "AvlblNetDbt", required = true)
    protected ActiveCurrencyAndAmount avlblNetDbt;

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
     * Gets the value of the cdtLd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCdtLd() {
        return cdtLd;
    }

    /**
     * Sets the value of the cdtLd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCdtLd(ActiveCurrencyAndAmount value) {
        this.cdtLd = value;
    }

    /**
     * Gets the value of the ttlPldgVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlPldgVal() {
        return ttlPldgVal;
    }

    /**
     * Sets the value of the ttlPldgVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlPldgVal(ActiveCurrencyAndAmount value) {
        this.ttlPldgVal = value;
    }

    /**
     * Gets the value of the cdtXtnsnLmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCdtXtnsnLmt() {
        return cdtXtnsnLmt;
    }

    /**
     * Sets the value of the cdtXtnsnLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCdtXtnsnLmt(ActiveCurrencyAndAmount value) {
        this.cdtXtnsnLmt = value;
    }

    /**
     * Gets the value of the netDbtLmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetDbtLmt() {
        return netDbtLmt;
    }

    /**
     * Sets the value of the netDbtLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNetDbtLmt(ActiveCurrencyAndAmount value) {
        this.netDbtLmt = value;
    }

    /**
     * Gets the value of the avlblNetDbt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAvlblNetDbt() {
        return avlblNetDbt;
    }

    /**
     * Sets the value of the avlblNetDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAvlblNetDbt(ActiveCurrencyAndAmount value) {
        this.avlblNetDbt = value;
    }

}