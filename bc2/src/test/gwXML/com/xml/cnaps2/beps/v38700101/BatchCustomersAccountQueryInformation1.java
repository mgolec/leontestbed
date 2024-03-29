//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:24 ���� CST 
//


package com.xml.cnaps2.beps.v38700101;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchCustomersAccountQueryInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchCustomersAccountQueryInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctCnt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.387.001.01}Max8NumericText"/>
 *         &lt;element name="AcctDtls" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.387.001.01}AccountDetails1" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchCustomersAccountQueryInformation1", propOrder = {
    "acctCnt",
    "acctDtls"
})
public class BatchCustomersAccountQueryInformation1 {

    @XmlElement(name = "AcctCnt", required = true)
    protected String acctCnt;
    @XmlElement(name = "AcctDtls", required = true)
    protected List<AccountDetails1> acctDtls = new Vector<AccountDetails1>();

    public void setAcctDtls(List<AccountDetails1> acctDtls) {
		this.acctDtls = acctDtls;
	}

	/**
     * Gets the value of the acctCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCnt() {
        return acctCnt;
    }

    /**
     * Sets the value of the acctCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCnt(String value) {
        this.acctCnt = value;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountDetails1 }
     * 
     * 
     */
    public List<AccountDetails1> getAcctDtls() {
        if (acctDtls == null) {
            acctDtls = new Vector<AccountDetails1>();
        }
        return this.acctDtls;
    }

}
