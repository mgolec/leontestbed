//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.13 at 01:14:20 PM CST 
//


package com.xml.cnaps2.camt.v00500104;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberIdentificationChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberIdentificationChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="BIC" type="{urn:swift:xsd:camt.005.001.04}BICIdentifier"/>
 *           &lt;element name="ClrSysMmbId" type="{urn:swift:xsd:camt.005.001.04}ClearingSystemMemberIdentificationChoice"/>
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
@XmlType(name = "MemberIdentificationChoice", propOrder = {
    "bic",
    "clrSysMmbId"
})
public class MemberIdentificationChoice {

    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "ClrSysMmbId")
    protected ClearingSystemMemberIdentificationChoice clrSysMmbId;

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the clrSysMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemMemberIdentificationChoice }
     *     
     */
    public ClearingSystemMemberIdentificationChoice getClrSysMmbId() {
        return clrSysMmbId;
    }

    /**
     * Sets the value of the clrSysMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemMemberIdentificationChoice }
     *     
     */
    public void setClrSysMmbId(ClearingSystemMemberIdentificationChoice value) {
        this.clrSysMmbId = value;
    }

}
