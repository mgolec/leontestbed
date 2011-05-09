//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:14 ���� CST 
//


package com.xml.cnaps2.beps.v12100101;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NationalTreasuryInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NationalTreasuryInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FslInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.121.001.01}FiscalInformation1"/>
 *         &lt;element name="NbOfTxs" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.121.001.01}Max8NumericText"/>
 *         &lt;element name="NtlTrsrInfDtls" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.121.001.01}NationalTreasuryInformationDetails1" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NationalTreasuryInformation1", propOrder = {
    "fslInf",
    "nbOfTxs",
    "ntlTrsrInfDtls"
})
public class NationalTreasuryInformation1 {

    @XmlElement(name = "FslInf", required = true)
    protected FiscalInformation1 fslInf;
    @XmlElement(name = "NbOfTxs", required = true)
    protected String nbOfTxs;
    @XmlElement(name = "NtlTrsrInfDtls", required = true)
    protected List<NationalTreasuryInformationDetails1> ntlTrsrInfDtls = new Vector<NationalTreasuryInformationDetails1>();

    /**
     * Gets the value of the fslInf property.
     * 
     * @return
     *     possible object is
     *     {@link FiscalInformation1 }
     *     
     */
    public FiscalInformation1 getFslInf() {
        return fslInf;
    }

    /**
     * Sets the value of the fslInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiscalInformation1 }
     *     
     */
    public void setFslInf(FiscalInformation1 value) {
        this.fslInf = value;
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
     * Gets the value of the ntlTrsrInfDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ntlTrsrInfDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlTrsrInfDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationalTreasuryInformationDetails1 }
     * 
     * 
     */
    public List<NationalTreasuryInformationDetails1> getNtlTrsrInfDtls() {
        if (ntlTrsrInfDtls == null) {
            ntlTrsrInfDtls = new Vector<NationalTreasuryInformationDetails1>();
        }
        return this.ntlTrsrInfDtls;
    }

}
