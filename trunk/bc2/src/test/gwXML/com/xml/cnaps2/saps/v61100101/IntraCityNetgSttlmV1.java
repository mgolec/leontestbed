//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:47:07 ���� CST 
//


package com.xml.cnaps2.saps.v61100101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraCityNetgSttlmV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntraCityNetgSttlmV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.611.001.01}GroupHeader1"/>
 *         &lt;element name="IntraCityNetgSttlmInf" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.611.001.01}IntraCityNettingSettlementInformation1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraCityNetgSttlmV1", propOrder = {
    "grpHdr",
    "intraCityNetgSttlmInf"
})
public class IntraCityNetgSttlmV1 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "IntraCityNetgSttlmInf", required = true)
    protected IntraCityNettingSettlementInformation1 intraCityNetgSttlmInf;

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
     * Gets the value of the intraCityNetgSttlmInf property.
     * 
     * @return
     *     possible object is
     *     {@link IntraCityNettingSettlementInformation1 }
     *     
     */
    public IntraCityNettingSettlementInformation1 getIntraCityNetgSttlmInf() {
        return intraCityNetgSttlmInf;
    }

    /**
     * Sets the value of the intraCityNetgSttlmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraCityNettingSettlementInformation1 }
     *     
     */
    public void setIntraCityNetgSttlmInf(IntraCityNettingSettlementInformation1 value) {
        this.intraCityNetgSttlmInf = value;
    }

}
