//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:47:17 ���� CST 
//


package com.xml.cnaps2.saps.v73100101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACSABSSttlmDtlApplV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACSABSSttlmDtlApplV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.731.001.01}GroupHeader1"/>
 *         &lt;element name="ACSABSSttlmDtlApplInf" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.731.001.01}ACSABSSettlementDetailApplicationInformation1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACSABSSttlmDtlApplV01", propOrder = {
    "grpHdr",
    "acsabsSttlmDtlApplInf"
})
public class ACSABSSttlmDtlApplV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "ACSABSSttlmDtlApplInf", required = true)
    protected ACSABSSettlementDetailApplicationInformation1 acsabsSttlmDtlApplInf;

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
     * Gets the value of the acsabsSttlmDtlApplInf property.
     * 
     * @return
     *     possible object is
     *     {@link ACSABSSettlementDetailApplicationInformation1 }
     *     
     */
    public ACSABSSettlementDetailApplicationInformation1 getACSABSSttlmDtlApplInf() {
        return acsabsSttlmDtlApplInf;
    }

    /**
     * Sets the value of the acsabsSttlmDtlApplInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACSABSSettlementDetailApplicationInformation1 }
     *     
     */
    public void setACSABSSttlmDtlApplInf(ACSABSSettlementDetailApplicationInformation1 value) {
        this.acsabsSttlmDtlApplInf = value;
    }

}
