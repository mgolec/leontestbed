//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 01:56:25 ���� CST 
//


package com.xml.iso20022.camt.v00600104;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PaymentInstructionReferenceDetails2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInstructionReferenceDetails2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PmtInstrRef" type="{urn:swift:xsd:camt.006.001.04}Max35Text"/>
 *         &lt;element name="IntrBkValDt" type="{urn:swift:xsd:camt.006.001.04}ISODate"/>
 *         &lt;element name="InstgAgtId" type="{urn:swift:xsd:camt.006.001.04}BICIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstructionReferenceDetails2", propOrder = {
    "pmtInstrRef",
    "intrBkValDt",
    "instgAgtId"
})
public class PaymentInstructionReferenceDetails2 {

    @XmlElement(name = "PmtInstrRef", required = true)
    protected String pmtInstrRef;
    @XmlElement(name = "IntrBkValDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date intrBkValDt;
    @XmlElement(name = "InstgAgtId", required = true)
    protected String instgAgtId;

    /**
     * Gets the value of the pmtInstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtInstrRef() {
        return pmtInstrRef;
    }

    /**
     * Sets the value of the pmtInstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtInstrRef(String value) {
        this.pmtInstrRef = value;
    }

    /**
     * Gets the value of the intrBkValDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getIntrBkValDt() {
        return intrBkValDt;
    }

    /**
     * Sets the value of the intrBkValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrBkValDt(Date value) {
        this.intrBkValDt = value;
    }

    /**
     * Gets the value of the instgAgtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgAgtId() {
        return instgAgtId;
    }

    /**
     * Sets the value of the instgAgtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstgAgtId(String value) {
        this.instgAgtId = value;
    }

}
