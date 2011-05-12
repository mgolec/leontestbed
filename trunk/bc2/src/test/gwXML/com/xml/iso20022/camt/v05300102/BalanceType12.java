//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:05 ���� CST 
//


package com.xml.iso20022.camt.v05300102;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceType12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceType12">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CdOrPrtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}BalanceType5Choice"/>
 *         &lt;element name="SubTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.02}BalanceSubType1Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceType12", propOrder = {
    "cdOrPrtry",
    "subTp"
})
public class BalanceType12 {

    @XmlElement(name = "CdOrPrtry", required = true)
    protected BalanceType5Choice cdOrPrtry;
    @XmlElement(name = "SubTp")
    protected BalanceSubType1Choice subTp;

    /**
     * Gets the value of the cdOrPrtry property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceType5Choice }
     *     
     */
    public BalanceType5Choice getCdOrPrtry() {
        return cdOrPrtry;
    }

    /**
     * Sets the value of the cdOrPrtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceType5Choice }
     *     
     */
    public void setCdOrPrtry(BalanceType5Choice value) {
        this.cdOrPrtry = value;
    }

    /**
     * Gets the value of the subTp property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSubType1Choice }
     *     
     */
    public BalanceSubType1Choice getSubTp() {
        return subTp;
    }

    /**
     * Sets the value of the subTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSubType1Choice }
     *     
     */
    public void setSubTp(BalanceSubType1Choice value) {
        this.subTp = value;
    }

}
