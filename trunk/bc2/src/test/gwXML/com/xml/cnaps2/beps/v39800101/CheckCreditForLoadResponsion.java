//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.10 at 10:05:28 ���� CST 
//


package com.xml.cnaps2.beps.v39800101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckCreditForLoadResponsion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckCreditForLoadResponsion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.398.001.01}GroupHeader1"/>
 *         &lt;element name="OrgnlGrpHdr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.398.001.01}OriginalGroupHeader1"/>
 *         &lt;element name="ChckCdtForLdRspnInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.398.001.01}CheckCreditForLoadResponsionInformation1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckCreditForLoadResponsion", propOrder = {
    "grpHdr",
    "orgnlGrpHdr",
    "chckCdtForLdRspnInf"
})
public class CheckCreditForLoadResponsion {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "OrgnlGrpHdr", required = true)
    protected OriginalGroupHeader1 orgnlGrpHdr;
    @XmlElement(name = "ChckCdtForLdRspnInf", required = true)
    protected CheckCreditForLoadResponsionInformation1 chckCdtForLdRspnInf;

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
     * Gets the value of the orgnlGrpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupHeader1 }
     *     
     */
    public OriginalGroupHeader1 getOrgnlGrpHdr() {
        return orgnlGrpHdr;
    }

    /**
     * Sets the value of the orgnlGrpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupHeader1 }
     *     
     */
    public void setOrgnlGrpHdr(OriginalGroupHeader1 value) {
        this.orgnlGrpHdr = value;
    }

    /**
     * Gets the value of the chckCdtForLdRspnInf property.
     * 
     * @return
     *     possible object is
     *     {@link CheckCreditForLoadResponsionInformation1 }
     *     
     */
    public CheckCreditForLoadResponsionInformation1 getChckCdtForLdRspnInf() {
        return chckCdtForLdRspnInf;
    }

    /**
     * Sets the value of the chckCdtForLdRspnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckCreditForLoadResponsionInformation1 }
     *     
     */
    public void setChckCdtForLdRspnInf(CheckCreditForLoadResponsionInformation1 value) {
        this.chckCdtForLdRspnInf = value;
    }

}