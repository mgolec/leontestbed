//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:14 ���� CST 
//


package com.xml.cnaps2.ccms.v31000101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CmonNotSgntrInfBizV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmonNotSgntrInfBizV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.310.001.01}GroupHeader1"/>
 *         &lt;element name="CmonNotSgntrInfBizInf" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.310.001.01}CmonNotSgntrInfBizInf1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmonNotSgntrInfBizV01", propOrder = {
    "grpHdr",
    "cmonNotSgntrInfBizInf"
})
public class CmonNotSgntrInfBizV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "CmonNotSgntrInfBizInf", required = true)
    protected CmonNotSgntrInfBizInf1 cmonNotSgntrInfBizInf;

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
     * Gets the value of the cmonNotSgntrInfBizInf property.
     * 
     * @return
     *     possible object is
     *     {@link CmonNotSgntrInfBizInf1 }
     *     
     */
    public CmonNotSgntrInfBizInf1 getCmonNotSgntrInfBizInf() {
        return cmonNotSgntrInfBizInf;
    }

    /**
     * Sets the value of the cmonNotSgntrInfBizInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmonNotSgntrInfBizInf1 }
     *     
     */
    public void setCmonNotSgntrInfBizInf(CmonNotSgntrInfBizInf1 value) {
        this.cmonNotSgntrInfBizInf = value;
    }

}
