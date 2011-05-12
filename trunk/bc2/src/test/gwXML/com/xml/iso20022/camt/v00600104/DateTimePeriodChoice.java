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
 * <p>Java class for DateTimePeriodChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimePeriodChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="FrDtTm" type="{urn:swift:xsd:camt.006.001.04}ISODateTime"/>
 *           &lt;element name="ToDtTm" type="{urn:swift:xsd:camt.006.001.04}ISODateTime"/>
 *           &lt;element name="DtTmRg" type="{urn:swift:xsd:camt.006.001.04}DateTimePeriodDetails"/>
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
@XmlType(name = "DateTimePeriodChoice", propOrder = {
    "frDtTm",
    "toDtTm",
    "dtTmRg"
})
public class DateTimePeriodChoice {

    @XmlElement(name = "FrDtTm", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date frDtTm;
    @XmlElement(name = "ToDtTm", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date toDtTm;
    @XmlElement(name = "DtTmRg")
    protected DateTimePeriodDetails dtTmRg;

    /**
     * Gets the value of the frDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFrDtTm() {
        return frDtTm;
    }

    /**
     * Sets the value of the frDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrDtTm(Date value) {
        this.frDtTm = value;
    }

    /**
     * Gets the value of the toDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getToDtTm() {
        return toDtTm;
    }

    /**
     * Sets the value of the toDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDtTm(Date value) {
        this.toDtTm = value;
    }

    /**
     * Gets the value of the dtTmRg property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetails }
     *     
     */
    public DateTimePeriodDetails getDtTmRg() {
        return dtTmRg;
    }

    /**
     * Sets the value of the dtTmRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails }
     *     
     */
    public void setDtTmRg(DateTimePeriodDetails value) {
        this.dtTmRg = value;
    }

}
