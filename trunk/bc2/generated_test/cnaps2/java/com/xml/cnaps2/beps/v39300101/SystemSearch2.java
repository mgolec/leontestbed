//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.10 at 04:20:34 ���� CST 
//


package com.xml.cnaps2.beps.v39300101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemSearch2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemSearch2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SysId" type="{urn:swift:xsd:camt.005.001.04}CashClearingSystem1Code" minOccurs="0"/>
 *         &lt;element name="MmbId" type="{urn:swift:xsd:camt.005.001.04}MemberIdentificationChoice" minOccurs="0"/>
 *         &lt;element name="Ctry" type="{urn:swift:xsd:camt.005.001.04}CountryCode" minOccurs="0"/>
 *         &lt;element name="AcctId" type="{urn:swift:xsd:camt.005.001.04}AccountIdentification1Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemSearch2", propOrder = {
    "sysId",
    "mmbId",
    "ctry",
    "acctId"
})
public class SystemSearch2 {

    @XmlElement(name = "SysId")
    protected String sysId;
    @XmlElement(name = "MmbId")
    protected MemberIdentificationChoice mmbId;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "AcctId")
    protected AccountIdentification1Choice acctId;

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysId(String value) {
        this.sysId = value;
    }

    /**
     * Gets the value of the mmbId property.
     * 
     * @return
     *     possible object is
     *     {@link MemberIdentificationChoice }
     *     
     */
    public MemberIdentificationChoice getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberIdentificationChoice }
     *     
     */
    public void setMmbId(MemberIdentificationChoice value) {
        this.mmbId = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

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

}
