//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 10:55:31 ���� CST 
//


package com.xml.cnaps2.beps.v12300101;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SettlementDateTimeIndication1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementDateTimeIndication1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DbtDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02}ISODateTime" minOccurs="0"/>
 *         &lt;element name="CdtDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02}ISODateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDateTimeIndication1", propOrder = {
    "dbtDtTm",
    "cdtDtTm"
})
public class SettlementDateTimeIndication1 {

    @XmlElement(name = "DbtDtTm", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date dbtDtTm;
    @XmlElement(name = "CdtDtTm", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date cdtDtTm;

    /**
     * Gets the value of the dbtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDbtDtTm() {
        return dbtDtTm;
    }

    /**
     * Sets the value of the dbtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbtDtTm(Date value) {
        this.dbtDtTm = value;
    }

    /**
     * Gets the value of the cdtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCdtDtTm() {
        return cdtDtTm;
    }

    /**
     * Sets the value of the cdtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtDtTm(Date value) {
        this.cdtDtTm = value;
    }

}
