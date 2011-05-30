//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 08:59:30 ���� CST 
//


package com.xml.iso20022.camt.v05500101;

import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OriginalGroupInformation23 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginalGroupInformation23">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpCxlId" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}Max35Text" minOccurs="0"/>
 *         &lt;element name="Case" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}Case2" minOccurs="0"/>
 *         &lt;element name="OrgnlMsgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}Max35Text"/>
 *         &lt;element name="OrgnlMsgNmId" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}Max35Text"/>
 *         &lt;element name="OrgnlCreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}ISODateTime" minOccurs="0"/>
 *         &lt;element name="NbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}Max15NumericText" minOccurs="0"/>
 *         &lt;element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}DecimalNumber" minOccurs="0"/>
 *         &lt;element name="GrpCxl" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}GroupCancellationIndicator" minOccurs="0"/>
 *         &lt;element name="CxlRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}CancellationReasonInformation3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalGroupInformation23", propOrder = {
    "grpCxlId",
    "Case",
    "orgnlMsgId",
    "orgnlMsgNmId",
    "orgnlCreDtTm",
    "nbOfTxs",
    "ctrlSum",
    "grpCxl",
    "cxlRsnInf"
})
public class OriginalGroupInformation23 {

    @XmlElement(name = "GrpCxlId")
    protected String grpCxlId;
    @XmlElement(name = "Case")
    protected Case2 Case;
    @XmlElement(name = "OrgnlMsgId", required = true)
    protected String orgnlMsgId;
    @XmlElement(name = "OrgnlMsgNmId", required = true)
    protected String orgnlMsgNmId;
    @XmlElement(name = "OrgnlCreDtTm", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date orgnlCreDtTm;
    @XmlElement(name = "NbOfTxs")
    protected String nbOfTxs;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "GrpCxl")
    protected Boolean grpCxl;
    @XmlElement(name = "CxlRsnInf")
    protected CancellationReasonInformation3 cxlRsnInf;

    /**
     * Gets the value of the grpCxlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpCxlId() {
        return grpCxlId;
    }

    /**
     * Sets the value of the grpCxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpCxlId(String value) {
        this.grpCxlId = value;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case2 }
     *     
     */
    public Case2 getCase() {
        return Case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case2 }
     *     
     */
    public void setCase(Case2 value) {
        this.Case = value;
    }

    /**
     * Gets the value of the orgnlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlMsgId(String value) {
        this.orgnlMsgId = value;
    }

    /**
     * Gets the value of the orgnlMsgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgNmId() {
        return orgnlMsgNmId;
    }

    /**
     * Sets the value of the orgnlMsgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlMsgNmId(String value) {
        this.orgnlMsgNmId = value;
    }

    /**
     * Gets the value of the orgnlCreDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getOrgnlCreDtTm() {
        return orgnlCreDtTm;
    }

    /**
     * Sets the value of the orgnlCreDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlCreDtTm(Date value) {
        this.orgnlCreDtTm = value;
    }

    /**
     * Gets the value of the nbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfTxs() {
        return nbOfTxs;
    }

    /**
     * Sets the value of the nbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfTxs(String value) {
        this.nbOfTxs = value;
    }

    /**
     * Gets the value of the ctrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrlSum() {
        return ctrlSum;
    }

    /**
     * Sets the value of the ctrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
    }

    /**
     * Gets the value of the grpCxl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGrpCxl() {
        return grpCxl;
    }

    /**
     * Sets the value of the grpCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGrpCxl(Boolean value) {
        this.grpCxl = value;
    }

    /**
     * Gets the value of the cxlRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReasonInformation3 }
     *     
     */
    public CancellationReasonInformation3 getCxlRsnInf() {
        return cxlRsnInf;
    }

    /**
     * Sets the value of the cxlRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReasonInformation3 }
     *     
     */
    public void setCxlRsnInf(CancellationReasonInformation3 value) {
        this.cxlRsnInf = value;
    }

}
