//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.13 at 01:14:20 PM CST 
//


package com.xml.cnaps2.camt.v00500104;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateAndDateTimeSearchChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndDateTimeSearchChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="DtTmSch" type="{urn:swift:xsd:camt.005.001.04}DateTimePeriodChoice"/>
 *           &lt;element name="DtSch" type="{urn:swift:xsd:camt.005.001.04}DateSearchChoice"/>
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
@XmlType(name = "DateAndDateTimeSearchChoice", propOrder = {
    "dtTmSch",
    "dtSch"
})
public class DateAndDateTimeSearchChoice {

    @XmlElement(name = "DtTmSch")
    protected DateTimePeriodChoice dtTmSch;
    @XmlElement(name = "DtSch")
    protected DateSearchChoice dtSch;

    /**
     * Gets the value of the dtTmSch property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public DateTimePeriodChoice getDtTmSch() {
        return dtTmSch;
    }

    /**
     * Sets the value of the dtTmSch property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public void setDtTmSch(DateTimePeriodChoice value) {
        this.dtTmSch = value;
    }

    /**
     * Gets the value of the dtSch property.
     * 
     * @return
     *     possible object is
     *     {@link DateSearchChoice }
     *     
     */
    public DateSearchChoice getDtSch() {
        return dtSch;
    }

    /**
     * Sets the value of the dtSch property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateSearchChoice }
     *     
     */
    public void setDtSch(DateSearchChoice value) {
        this.dtSch = value;
    }

}
