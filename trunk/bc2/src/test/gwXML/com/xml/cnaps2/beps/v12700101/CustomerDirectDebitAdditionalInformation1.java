//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:32:12 ���� CST 
//


package com.xml.cnaps2.beps.v12700101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDirectDebitAdditionalInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDirectDebitAdditionalInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="NtlTrsrCdtInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.127.001.01}NationalTreasuryCreditInformation1"/>
 *           &lt;element name="NtlTrsrInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.127.001.01}NationalTreasuryInformation1"/>
 *           &lt;element name="ChqInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.127.001.01}ChequeInformation1"/>
 *           &lt;element name="BllInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.127.001.01}BillInformation1"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDirectDebitAdditionalInformation1", propOrder = {
    "ntlTrsrCdtInf",
    "ntlTrsrInf",
    "chqInf",
    "bllInf"
})
public class CustomerDirectDebitAdditionalInformation1 {

    @XmlElement(name = "NtlTrsrCdtInf")
    protected NationalTreasuryCreditInformation1 ntlTrsrCdtInf;
    @XmlElement(name = "NtlTrsrInf")
    protected NationalTreasuryInformation1 ntlTrsrInf;
    @XmlElement(name = "ChqInf")
    protected ChequeInformation1 chqInf;
    @XmlElement(name = "BllInf")
    protected BillInformation1 bllInf;

    /**
     * Gets the value of the ntlTrsrCdtInf property.
     * 
     * @return
     *     possible object is
     *     {@link NationalTreasuryCreditInformation1 }
     *     
     */
    public NationalTreasuryCreditInformation1 getNtlTrsrCdtInf() {
        return ntlTrsrCdtInf;
    }

    /**
     * Sets the value of the ntlTrsrCdtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalTreasuryCreditInformation1 }
     *     
     */
    public void setNtlTrsrCdtInf(NationalTreasuryCreditInformation1 value) {
        this.ntlTrsrCdtInf = value;
    }

    /**
     * Gets the value of the ntlTrsrInf property.
     * 
     * @return
     *     possible object is
     *     {@link NationalTreasuryInformation1 }
     *     
     */
    public NationalTreasuryInformation1 getNtlTrsrInf() {
        return ntlTrsrInf;
    }

    /**
     * Sets the value of the ntlTrsrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalTreasuryInformation1 }
     *     
     */
    public void setNtlTrsrInf(NationalTreasuryInformation1 value) {
        this.ntlTrsrInf = value;
    }

    /**
     * Gets the value of the chqInf property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeInformation1 }
     *     
     */
    public ChequeInformation1 getChqInf() {
        return chqInf;
    }

    /**
     * Sets the value of the chqInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeInformation1 }
     *     
     */
    public void setChqInf(ChequeInformation1 value) {
        this.chqInf = value;
    }

    /**
     * Gets the value of the bllInf property.
     * 
     * @return
     *     possible object is
     *     {@link BillInformation1 }
     *     
     */
    public BillInformation1 getBllInf() {
        return bllInf;
    }

    /**
     * Sets the value of the bllInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillInformation1 }
     *     
     */
    public void setBllInf(BillInformation1 value) {
        this.bllInf = value;
    }

}
