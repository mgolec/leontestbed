//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:34:59 ���� CST 
//


package com.xml.cnaps2.saps.v61200101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnltrlTxV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnltrlTxV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.612.001.01}GroupHeader1"/>
 *         &lt;element name="UnltrlTxInf" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.612.001.01}UnilateralTransactionInformation1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnltrlTxV01", propOrder = {
    "grpHdr",
    "unltrlTxInf"
})
public class UnltrlTxV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "UnltrlTxInf", required = true)
    protected UnilateralTransactionInformation1 unltrlTxInf;

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
     * Gets the value of the unltrlTxInf property.
     * 
     * @return
     *     possible object is
     *     {@link UnilateralTransactionInformation1 }
     *     
     */
    public UnilateralTransactionInformation1 getUnltrlTxInf() {
        return unltrlTxInf;
    }

    /**
     * Sets the value of the unltrlTxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnilateralTransactionInformation1 }
     *     
     */
    public void setUnltrlTxInf(UnilateralTransactionInformation1 value) {
        this.unltrlTxInf = value;
    }

}
