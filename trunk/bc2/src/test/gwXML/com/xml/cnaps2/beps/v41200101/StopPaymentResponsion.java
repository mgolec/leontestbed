//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:37 ���� CST 
//


package com.xml.cnaps2.beps.v41200101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopPaymentResponsion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopPaymentResponsion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.412.001.01}GroupHeader1"/>
 *         &lt;element name="OrgnlGrpHdr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.412.001.01}OriginalGroupHeader1"/>
 *         &lt;element name="StopPmtRspnInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.412.001.01}StopPaymentResponsionInformation1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPaymentResponsion", propOrder = {
    "grpHdr",
    "orgnlGrpHdr",
    "stopPmtRspnInf"
})
public class StopPaymentResponsion {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "OrgnlGrpHdr", required = true)
    protected OriginalGroupHeader1 orgnlGrpHdr;
    @XmlElement(name = "StopPmtRspnInf", required = true)
    protected StopPaymentResponsionInformation1 stopPmtRspnInf;

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
     * Gets the value of the stopPmtRspnInf property.
     * 
     * @return
     *     possible object is
     *     {@link StopPaymentResponsionInformation1 }
     *     
     */
    public StopPaymentResponsionInformation1 getStopPmtRspnInf() {
        return stopPmtRspnInf;
    }

    /**
     * Sets the value of the stopPmtRspnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPaymentResponsionInformation1 }
     *     
     */
    public void setStopPmtRspnInf(StopPaymentResponsionInformation1 value) {
        this.stopPmtRspnInf = value;
    }

}
