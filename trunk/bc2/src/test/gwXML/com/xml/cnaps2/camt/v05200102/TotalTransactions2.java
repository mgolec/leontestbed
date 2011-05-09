//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:03 ���� CST 
//


package com.xml.cnaps2.camt.v05200102;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalTransactions2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalTransactions2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TtlNtries" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}NumberAndSumOfTransactions2" minOccurs="0"/>
 *         &lt;element name="TtlCdtNtries" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}NumberAndSumOfTransactions1" minOccurs="0"/>
 *         &lt;element name="TtlDbtNtries" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}NumberAndSumOfTransactions1" minOccurs="0"/>
 *         &lt;element name="TtlNtriesPerBkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.02}TotalsPerBankTransactionCode2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalTransactions2", propOrder = {
    "ttlNtries",
    "ttlCdtNtries",
    "ttlDbtNtries",
    "ttlNtriesPerBkTxCd"
})
public class TotalTransactions2 {

    @XmlElement(name = "TtlNtries")
    protected NumberAndSumOfTransactions2 ttlNtries;
    @XmlElement(name = "TtlCdtNtries")
    protected NumberAndSumOfTransactions1 ttlCdtNtries;
    @XmlElement(name = "TtlDbtNtries")
    protected NumberAndSumOfTransactions1 ttlDbtNtries;
    @XmlElement(name = "TtlNtriesPerBkTxCd")
    protected List<TotalsPerBankTransactionCode2> ttlNtriesPerBkTxCd = new Vector<TotalsPerBankTransactionCode2>();

    /**
     * Gets the value of the ttlNtries property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions2 }
     *     
     */
    public NumberAndSumOfTransactions2 getTtlNtries() {
        return ttlNtries;
    }

    /**
     * Sets the value of the ttlNtries property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions2 }
     *     
     */
    public void setTtlNtries(NumberAndSumOfTransactions2 value) {
        this.ttlNtries = value;
    }

    /**
     * Gets the value of the ttlCdtNtries property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public NumberAndSumOfTransactions1 getTtlCdtNtries() {
        return ttlCdtNtries;
    }

    /**
     * Sets the value of the ttlCdtNtries property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public void setTtlCdtNtries(NumberAndSumOfTransactions1 value) {
        this.ttlCdtNtries = value;
    }

    /**
     * Gets the value of the ttlDbtNtries property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public NumberAndSumOfTransactions1 getTtlDbtNtries() {
        return ttlDbtNtries;
    }

    /**
     * Sets the value of the ttlDbtNtries property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public void setTtlDbtNtries(NumberAndSumOfTransactions1 value) {
        this.ttlDbtNtries = value;
    }

    /**
     * Gets the value of the ttlNtriesPerBkTxCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttlNtriesPerBkTxCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlNtriesPerBkTxCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalsPerBankTransactionCode2 }
     * 
     * 
     */
    public List<TotalsPerBankTransactionCode2> getTtlNtriesPerBkTxCd() {
        if (ttlNtriesPerBkTxCd == null) {
            ttlNtriesPerBkTxCd = new Vector<TotalsPerBankTransactionCode2>();
        }
        return this.ttlNtriesPerBkTxCd;
    }

}
