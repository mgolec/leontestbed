//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 01:56:25 ���� CST 
//


package com.xml.iso20022.camt.v00600104;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transactions4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transactions4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PmtCmonInf" type="{urn:swift:xsd:camt.006.001.04}PaymentCommonDetails4" minOccurs="0"/>
 *         &lt;element name="TxsSummry" type="{urn:swift:xsd:camt.006.001.04}NumberAndSumOfTransactions2" minOccurs="0"/>
 *         &lt;element name="TxRpt" type="{urn:swift:xsd:camt.006.001.04}TransactionReportDetails5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transactions4", propOrder = {
    "pmtCmonInf",
    "txsSummry",
    "txRpt"
})
public class Transactions4 {

    @XmlElement(name = "PmtCmonInf")
    protected PaymentCommonDetails4 pmtCmonInf;
    @XmlElement(name = "TxsSummry")
    protected NumberAndSumOfTransactions2 txsSummry;
    @XmlElement(name = "TxRpt", required = true)
    protected TransactionReportDetails5 txRpt;

    /**
     * Gets the value of the pmtCmonInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCommonDetails4 }
     *     
     */
    public PaymentCommonDetails4 getPmtCmonInf() {
        return pmtCmonInf;
    }

    /**
     * Sets the value of the pmtCmonInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCommonDetails4 }
     *     
     */
    public void setPmtCmonInf(PaymentCommonDetails4 value) {
        this.pmtCmonInf = value;
    }

    /**
     * Gets the value of the txsSummry property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions2 }
     *     
     */
    public NumberAndSumOfTransactions2 getTxsSummry() {
        return txsSummry;
    }

    /**
     * Sets the value of the txsSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions2 }
     *     
     */
    public void setTxsSummry(NumberAndSumOfTransactions2 value) {
        this.txsSummry = value;
    }

    /**
     * Gets the value of the txRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReportDetails5 }
     *     
     */
    public TransactionReportDetails5 getTxRpt() {
        return txRpt;
    }

    /**
     * Sets the value of the txRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReportDetails5 }
     *     
     */
    public void setTxRpt(TransactionReportDetails5 value) {
        this.txRpt = value;
    }

}
