//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:09 ���� CST 
//


package com.xml.iso20022.camt.v05500101;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingTransaction1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingTransaction1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgnlGrpInfAndCxl" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}OriginalGroupInformation23" minOccurs="0"/>
 *         &lt;element name="OrgnlPmtInfAndCxl" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.01}OriginalPaymentInformation4" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingTransaction1", propOrder = {
    "orgnlGrpInfAndCxl",
    "orgnlPmtInfAndCxl"
})
public class UnderlyingTransaction1 {

    @XmlElement(name = "OrgnlGrpInfAndCxl")
    protected OriginalGroupInformation23 orgnlGrpInfAndCxl;
    @XmlElement(name = "OrgnlPmtInfAndCxl")
    protected List<OriginalPaymentInformation4> orgnlPmtInfAndCxl = new Vector<OriginalPaymentInformation4>();

    /**
     * Gets the value of the orgnlGrpInfAndCxl property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation23 }
     *     
     */
    public OriginalGroupInformation23 getOrgnlGrpInfAndCxl() {
        return orgnlGrpInfAndCxl;
    }

    /**
     * Sets the value of the orgnlGrpInfAndCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation23 }
     *     
     */
    public void setOrgnlGrpInfAndCxl(OriginalGroupInformation23 value) {
        this.orgnlGrpInfAndCxl = value;
    }

    /**
     * Gets the value of the orgnlPmtInfAndCxl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgnlPmtInfAndCxl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlPmtInfAndCxl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalPaymentInformation4 }
     * 
     * 
     */
    public List<OriginalPaymentInformation4> getOrgnlPmtInfAndCxl() {
        if (orgnlPmtInfAndCxl == null) {
            orgnlPmtInfAndCxl = new Vector<OriginalPaymentInformation4>();
        }
        return this.orgnlPmtInfAndCxl;
    }

}
