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
 * <p>Java class for QueueTransactionIdentificationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueueTransactionIdentificationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QId" type="{urn:swift:xsd:camt.006.001.04}Max16Text"/>
 *         &lt;element name="PosInQ" type="{urn:swift:xsd:camt.006.001.04}Max16Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueTransactionIdentificationDetails", propOrder = {
    "qId",
    "posInQ"
})
public class QueueTransactionIdentificationDetails {

    @XmlElement(name = "QId", required = true)
    protected String qId;
    @XmlElement(name = "PosInQ", required = true)
    protected String posInQ;

    /**
     * Gets the value of the qId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQId() {
        return qId;
    }

    /**
     * Sets the value of the qId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQId(String value) {
        this.qId = value;
    }

    /**
     * Gets the value of the posInQ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosInQ() {
        return posInQ;
    }

    /**
     * Sets the value of the posInQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosInQ(String value) {
        this.posInQ = value;
    }

}
