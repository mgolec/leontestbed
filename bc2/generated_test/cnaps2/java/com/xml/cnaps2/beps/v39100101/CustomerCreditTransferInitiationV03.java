//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:46:42 ���� CST 
//


package com.xml.cnaps2.beps.v39100101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerCreditTransferInitiationV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerCreditTransferInitiationV03">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}GroupHeader32"/>
 *         &lt;element name="PmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PaymentInstructionInformation3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCreditTransferInitiationV03", propOrder = {
    "grpHdr",
    "pmtInf"
})
public class CustomerCreditTransferInitiationV03 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader32 grpHdr;
    @XmlElement(name = "PmtInf", required = true)
    protected PaymentInstructionInformation3 pmtInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader32 }
     *     
     */
    public GroupHeader32 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader32 }
     *     
     */
    public void setGrpHdr(GroupHeader32 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the pmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstructionInformation3 }
     *     
     */
    public PaymentInstructionInformation3 getPmtInf() {
        return pmtInf;
    }

    /**
     * Sets the value of the pmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstructionInformation3 }
     *     
     */
    public void setPmtInf(PaymentInstructionInformation3 value) {
        this.pmtInf = value;
    }

}