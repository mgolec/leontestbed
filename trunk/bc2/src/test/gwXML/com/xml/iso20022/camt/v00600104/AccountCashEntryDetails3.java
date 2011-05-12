//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:55 ���� CST 
//


package com.xml.iso20022.camt.v00600104;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountCashEntryDetails3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountCashEntryDetails3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctId" type="{urn:swift:xsd:camt.006.001.04}AccountIdentification1Choice"/>
 *         &lt;element name="AcctCcy" type="{urn:swift:xsd:camt.006.001.04}CurrencyCode" minOccurs="0"/>
 *         &lt;element name="AcctTp" type="{urn:swift:xsd:camt.006.001.04}CashAccountType2Code" minOccurs="0"/>
 *         &lt;element name="NtryRef" type="{urn:swift:xsd:camt.006.001.04}Max35Text" minOccurs="0"/>
 *         &lt;element name="NtryAmt" type="{urn:swift:xsd:camt.006.001.04}CurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="NtryDt" type="{urn:swift:xsd:camt.006.001.04}DateAndDateTimeChoice" minOccurs="0"/>
 *         &lt;element name="NtrySts" type="{urn:swift:xsd:camt.006.001.04}EntryStatus1Code" minOccurs="0"/>
 *         &lt;element name="AcctOwnr" type="{urn:swift:xsd:camt.006.001.04}AnyBICIdentifier" minOccurs="0"/>
 *         &lt;element name="AcctSvcr" type="{urn:swift:xsd:camt.006.001.04}BICIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountCashEntryDetails3", propOrder = {
    "acctId",
    "acctCcy",
    "acctTp",
    "ntryRef",
    "ntryAmt",
    "ntryDt",
    "ntrySts",
    "acctOwnr",
    "acctSvcr"
})
public class AccountCashEntryDetails3 {

    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentification1Choice acctId;
    @XmlElement(name = "AcctCcy")
    protected String acctCcy;
    @XmlElement(name = "AcctTp")
    protected String acctTp;
    @XmlElement(name = "NtryRef")
    protected String ntryRef;
    @XmlElement(name = "NtryAmt")
    protected CurrencyAndAmount ntryAmt;
    @XmlElement(name = "NtryDt")
    protected DateAndDateTimeChoice ntryDt;
    @XmlElement(name = "NtrySts")
    protected String ntrySts;
    @XmlElement(name = "AcctOwnr")
    protected String acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected String acctSvcr;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public AccountIdentification1Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public void setAcctId(AccountIdentification1Choice value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCcy() {
        return acctCcy;
    }

    /**
     * Sets the value of the acctCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCcy(String value) {
        this.acctCcy = value;
    }

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTp(String value) {
        this.acctTp = value;
    }

    /**
     * Gets the value of the ntryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtryRef() {
        return ntryRef;
    }

    /**
     * Sets the value of the ntryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtryRef(String value) {
        this.ntryRef = value;
    }

    /**
     * Gets the value of the ntryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getNtryAmt() {
        return ntryAmt;
    }

    /**
     * Sets the value of the ntryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setNtryAmt(CurrencyAndAmount value) {
        this.ntryAmt = value;
    }

    /**
     * Gets the value of the ntryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getNtryDt() {
        return ntryDt;
    }

    /**
     * Sets the value of the ntryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setNtryDt(DateAndDateTimeChoice value) {
        this.ntryDt = value;
    }

    /**
     * Gets the value of the ntrySts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtrySts() {
        return ntrySts;
    }

    /**
     * Sets the value of the ntrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtrySts(String value) {
        this.ntrySts = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctOwnr(String value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSvcr(String value) {
        this.acctSvcr = value;
    }

}