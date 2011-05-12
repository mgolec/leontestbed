//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:53 ���� CST 
//


package com.xml.iso20022.camt.v00500104;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTransactionParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTransactionParty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dbtr" type="{urn:swift:xsd:camt.005.001.04}BICIdentifier" minOccurs="0"/>
 *         &lt;element name="FrstAgt" type="{urn:swift:xsd:camt.005.001.04}BICIdentifier" minOccurs="0"/>
 *         &lt;element name="InstgAgtCrspdt" type="{urn:swift:xsd:camt.005.001.04}BICIdentifier" minOccurs="0"/>
 *         &lt;element name="InstdAgtCrspdt" type="{urn:swift:xsd:camt.005.001.04}BICIdentifier" minOccurs="0"/>
 *         &lt;element name="Intrmy" type="{urn:swift:xsd:camt.005.001.04}BICIdentifier" minOccurs="0"/>
 *         &lt;element name="FnlAgt" type="{urn:swift:xsd:camt.005.001.04}BICIdentifier" minOccurs="0"/>
 *         &lt;element name="Cdtr" type="{urn:swift:xsd:camt.005.001.04}BICIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransactionParty", propOrder = {
    "dbtr",
    "frstAgt",
    "instgAgtCrspdt",
    "instdAgtCrspdt",
    "intrmy",
    "fnlAgt",
    "cdtr"
})
public class PaymentTransactionParty {

    @XmlElement(name = "Dbtr")
    protected String dbtr;
    @XmlElement(name = "FrstAgt")
    protected String frstAgt;
    @XmlElement(name = "InstgAgtCrspdt")
    protected String instgAgtCrspdt;
    @XmlElement(name = "InstdAgtCrspdt")
    protected String instdAgtCrspdt;
    @XmlElement(name = "Intrmy")
    protected String intrmy;
    @XmlElement(name = "FnlAgt")
    protected String fnlAgt;
    @XmlElement(name = "Cdtr")
    protected String cdtr;

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbtr(String value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the frstAgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrstAgt() {
        return frstAgt;
    }

    /**
     * Sets the value of the frstAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrstAgt(String value) {
        this.frstAgt = value;
    }

    /**
     * Gets the value of the instgAgtCrspdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgAgtCrspdt() {
        return instgAgtCrspdt;
    }

    /**
     * Sets the value of the instgAgtCrspdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstgAgtCrspdt(String value) {
        this.instgAgtCrspdt = value;
    }

    /**
     * Gets the value of the instdAgtCrspdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstdAgtCrspdt() {
        return instdAgtCrspdt;
    }

    /**
     * Sets the value of the instdAgtCrspdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstdAgtCrspdt(String value) {
        this.instdAgtCrspdt = value;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrmy(String value) {
        this.intrmy = value;
    }

    /**
     * Gets the value of the fnlAgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnlAgt() {
        return fnlAgt;
    }

    /**
     * Sets the value of the fnlAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFnlAgt(String value) {
        this.fnlAgt = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtr(String value) {
        this.cdtr = value;
    }

}
