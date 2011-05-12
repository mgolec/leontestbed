//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:09 ���� CST 
//


package com.xml.iso20022.camt.v05500101;

import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalPaymentInformation4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginalPaymentInformation4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PmtCxlId" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}Max35Text" minOccurs="0"/>
 *         &lt;element name="Case" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}Case2" minOccurs="0"/>
 *         &lt;element name="OrgnlPmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}Max35Text"/>
 *         &lt;element name="OrgnlGrpInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}OriginalGroupInformation3" minOccurs="0"/>
 *         &lt;element name="NbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}Max15NumericText" minOccurs="0"/>
 *         &lt;element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}DecimalNumber" minOccurs="0"/>
 *         &lt;element name="PmtInfCxl" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}GroupCancellationIndicator" minOccurs="0"/>
 *         &lt;element name="CxlRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}CancellationReasonInformation3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TxInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}PaymentTransactionInformation30" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalPaymentInformation4", propOrder = {
    "pmtCxlId",
    "_case",
    "orgnlPmtInfId",
    "orgnlGrpInf",
    "nbOfTxs",
    "ctrlSum",
    "pmtInfCxl",
    "cxlRsnInf",
    "txInf"
})
public class OriginalPaymentInformation4 {

    @XmlElement(name = "PmtCxlId")
    protected String pmtCxlId;
    @XmlElement(name = "Case")
    protected Case2 _case;
    @XmlElement(name = "OrgnlPmtInfId", required = true)
    protected String orgnlPmtInfId;
    @XmlElement(name = "OrgnlGrpInf")
    protected OriginalGroupInformation3 orgnlGrpInf;
    @XmlElement(name = "NbOfTxs")
    protected String nbOfTxs;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "PmtInfCxl")
    protected Boolean pmtInfCxl;
    @XmlElement(name = "CxlRsnInf")
    protected List<CancellationReasonInformation3> cxlRsnInf = new Vector<CancellationReasonInformation3>();
    @XmlElement(name = "TxInf")
    protected List<PaymentTransactionInformation30> txInf = new Vector<PaymentTransactionInformation30>();

    /**
     * Gets the value of the pmtCxlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtCxlId() {
        return pmtCxlId;
    }

    /**
     * Sets the value of the pmtCxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtCxlId(String value) {
        this.pmtCxlId = value;
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
        return _case;
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
        this._case = value;
    }

    /**
     * Gets the value of the orgnlPmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlPmtInfId() {
        return orgnlPmtInfId;
    }

    /**
     * Sets the value of the orgnlPmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlPmtInfId(String value) {
        this.orgnlPmtInfId = value;
    }

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation3 }
     *     
     */
    public OriginalGroupInformation3 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation3 }
     *     
     */
    public void setOrgnlGrpInf(OriginalGroupInformation3 value) {
        this.orgnlGrpInf = value;
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
     * Gets the value of the pmtInfCxl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtInfCxl() {
        return pmtInfCxl;
    }

    /**
     * Sets the value of the pmtInfCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPmtInfCxl(Boolean value) {
        this.pmtInfCxl = value;
    }

    /**
     * Gets the value of the cxlRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxlRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxlRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancellationReasonInformation3 }
     * 
     * 
     */
    public List<CancellationReasonInformation3> getCxlRsnInf() {
        if (cxlRsnInf == null) {
            cxlRsnInf = new Vector<CancellationReasonInformation3>();
        }
        return this.cxlRsnInf;
    }

    /**
     * Gets the value of the txInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransactionInformation30 }
     * 
     * 
     */
    public List<PaymentTransactionInformation30> getTxInf() {
        if (txInf == null) {
            txInf = new Vector<PaymentTransactionInformation30>();
        }
        return this.txInf;
    }

}
