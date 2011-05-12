//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:58 ���� CST 
//


package com.xml.iso20022.camt.v01000104;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitReport3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LimitReport3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LmtId" type="{urn:swift:xsd:camt.010.001.04}LimitIdentificationDetails2"/>
 *         &lt;choice>
 *           &lt;element name="Lmt" type="{urn:swift:xsd:camt.010.001.04}LimitDetails3"/>
 *           &lt;element name="BizErr" type="{urn:swift:xsd:camt.010.001.04}ErrorHandling3"/>
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
@XmlType(name = "LimitReport3", propOrder = {
    "lmtId",
    "lmt",
    "bizErr"
})
public class LimitReport3 {

    @XmlElement(name = "LmtId", required = true)
    protected LimitIdentificationDetails2 lmtId;
    @XmlElement(name = "Lmt")
    protected LimitDetails3 lmt;
    @XmlElement(name = "BizErr")
    protected ErrorHandling3 bizErr;

    /**
     * Gets the value of the lmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentificationDetails2 }
     *     
     */
    public LimitIdentificationDetails2 getLmtId() {
        return lmtId;
    }

    /**
     * Sets the value of the lmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentificationDetails2 }
     *     
     */
    public void setLmtId(LimitIdentificationDetails2 value) {
        this.lmtId = value;
    }

    /**
     * Gets the value of the lmt property.
     * 
     * @return
     *     possible object is
     *     {@link LimitDetails3 }
     *     
     */
    public LimitDetails3 getLmt() {
        return lmt;
    }

    /**
     * Sets the value of the lmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitDetails3 }
     *     
     */
    public void setLmt(LimitDetails3 value) {
        this.lmt = value;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ErrorHandling3 getBizErr() {
        return bizErr;
    }

    /**
     * Sets the value of the bizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling3 }
     *     
     */
    public void setBizErr(ErrorHandling3 value) {
        this.bizErr = value;
    }

}
