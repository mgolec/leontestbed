//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:24 ���� CST 
//


package com.xml.cnaps2.beps.v38700101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchCustomersAccountQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchCustomersAccountQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.387.001.01}GroupHeader1"/>
 *         &lt;element name="BtchCstmrsAcctQryInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.387.001.01}BatchCustomersAccountQueryInformation1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchCustomersAccountQuery", propOrder = {
    "grpHdr",
    "btchCstmrsAcctQryInf"
})
public class BatchCustomersAccountQuery {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "BtchCstmrsAcctQryInf", required = true)
    protected BatchCustomersAccountQueryInformation1 btchCstmrsAcctQryInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader1 }
     *     
     */
    public GroupHeader1 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader1 }
     *     
     */
    public void setGrpHdr(GroupHeader1 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the btchCstmrsAcctQryInf property.
     * 
     * @return
     *     possible object is
     *     {@link BatchCustomersAccountQueryInformation1 }
     *     
     */
    public BatchCustomersAccountQueryInformation1 getBtchCstmrsAcctQryInf() {
        return btchCstmrsAcctQryInf;
    }

    /**
     * Sets the value of the btchCstmrsAcctQryInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchCustomersAccountQueryInformation1 }
     *     
     */
    public void setBtchCstmrsAcctQryInf(BatchCustomersAccountQueryInformation1 value) {
        this.btchCstmrsAcctQryInf = value;
    }

}