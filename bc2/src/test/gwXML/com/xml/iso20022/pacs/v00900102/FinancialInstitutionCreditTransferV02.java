//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.14 at 09:59:36 ���� CST 
//


package com.xml.iso20022.pacs.v00900102;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstitutionCreditTransferV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstitutionCreditTransferV02">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.02}GroupHeader35"/>
 *         &lt;element name="CdtTrfTxInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.02}CreditTransferTransactionInformation13"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionCreditTransferV02", propOrder = {
    "grpHdr",
    "cdtTrfTxInf"
})
public class FinancialInstitutionCreditTransferV02 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader35 grpHdr;
    @XmlElement(name = "CdtTrfTxInf", required = true)
    protected CreditTransferTransactionInformation13 cdtTrfTxInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader35 }
     *     
     */
    public GroupHeader35 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader35 }
     *     
     */
    public void setGrpHdr(GroupHeader35 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the cdtTrfTxInf property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferTransactionInformation13 }
     *     
     */
    public CreditTransferTransactionInformation13 getCdtTrfTxInf() {
        return cdtTrfTxInf;
    }

    /**
     * Sets the value of the cdtTrfTxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferTransactionInformation13 }
     *     
     */
    public void setCdtTrfTxInf(CreditTransferTransactionInformation13 value) {
        this.cdtTrfTxInf = value;
    }

}