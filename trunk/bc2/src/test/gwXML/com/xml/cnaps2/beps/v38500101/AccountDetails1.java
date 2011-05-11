//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:22 ���� CST 
//


package com.xml.cnaps2.beps.v38500101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDetails1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgrmtNb" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.385.001.01}Max60Text" minOccurs="0"/>
 *         &lt;element name="Dbtr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.385.001.01}Debtor1"/>
 *         &lt;element name="DbtrAcct" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.385.001.01}DebtorAccount1"/>
 *         &lt;element name="Cdtr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.385.001.01}Creditor1"/>
 *         &lt;element name="RspsnSts" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.385.001.01}ResponseStatusCode1"/>
 *         &lt;element name="AcctSts" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.385.001.01}AccountStatusCode1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDetails1", propOrder = {
    "agrmtNb",
    "dbtr",
    "dbtrAcct",
    "cdtr",
    "rspsnSts",
    "acctSts"
})
public class AccountDetails1 {

    @XmlElement(name = "AgrmtNb")
    protected String agrmtNb;
    @XmlElement(name = "Dbtr", required = true)
    protected Debtor1 dbtr;
    @XmlElement(name = "DbtrAcct", required = true)
    protected DebtorAccount1 dbtrAcct;
    @XmlElement(name = "Cdtr", required = true)
    protected Creditor1 cdtr;
    @XmlElement(name = "RspsnSts", required = true)
    protected String rspsnSts;
    @XmlElement(name = "AcctSts")
    protected String acctSts;

    /**
     * Gets the value of the agrmtNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrmtNb() {
        return agrmtNb;
    }

    /**
     * Sets the value of the agrmtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgrmtNb(String value) {
        this.agrmtNb = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link Debtor1 }
     *     
     */
    public Debtor1 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Debtor1 }
     *     
     */
    public void setDbtr(Debtor1 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorAccount1 }
     *     
     */
    public DebtorAccount1 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorAccount1 }
     *     
     */
    public void setDbtrAcct(DebtorAccount1 value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link Creditor1 }
     *     
     */
    public Creditor1 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creditor1 }
     *     
     */
    public void setCdtr(Creditor1 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the rspsnSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspsnSts() {
        return rspsnSts;
    }

    /**
     * Sets the value of the rspsnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspsnSts(String value) {
        this.rspsnSts = value;
    }

    /**
     * Gets the value of the acctSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSts() {
        return acctSts;
    }

    /**
     * Sets the value of the acctSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSts(String value) {
        this.acctSts = value;
    }

}