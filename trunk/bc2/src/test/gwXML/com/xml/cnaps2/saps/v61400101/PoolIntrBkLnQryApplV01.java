//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:35:02 ���� CST 
//


package com.xml.cnaps2.saps.v61400101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoolIntrBkLnQryApplV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoolIntrBkLnQryApplV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.614.001.01}GroupHeader1"/>
 *         &lt;element name="PoolIntrBkLnQryApplInf" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.614.001.01}PoolInterbankLoanQueryApplicationInformation1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoolIntrBkLnQryApplV01", propOrder = {
    "grpHdr",
    "poolIntrBkLnQryApplInf"
})
public class PoolIntrBkLnQryApplV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "PoolIntrBkLnQryApplInf", required = true)
    protected PoolInterbankLoanQueryApplicationInformation1 poolIntrBkLnQryApplInf;

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
     * Gets the value of the poolIntrBkLnQryApplInf property.
     * 
     * @return
     *     possible object is
     *     {@link PoolInterbankLoanQueryApplicationInformation1 }
     *     
     */
    public PoolInterbankLoanQueryApplicationInformation1 getPoolIntrBkLnQryApplInf() {
        return poolIntrBkLnQryApplInf;
    }

    /**
     * Sets the value of the poolIntrBkLnQryApplInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoolInterbankLoanQueryApplicationInformation1 }
     *     
     */
    public void setPoolIntrBkLnQryApplInf(PoolInterbankLoanQueryApplicationInformation1 value) {
        this.poolIntrBkLnQryApplInf = value;
    }

}