//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:27 ���� CST 
//


package com.xml.cnaps2.ccms.v91300101;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ChngCtrl1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChngCtrl1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChngTp" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.913.001.01}ChangeCode1"/>
 *         &lt;element name="FctvTp" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.913.001.01}EffectiveCode1"/>
 *         &lt;element name="FctvDt" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.913.001.01}ISODate" minOccurs="0"/>
 *         &lt;element name="IfctvDt" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.913.001.01}ISODate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChngCtrl1", propOrder = {
    "chngTp",
    "fctvTp",
    "fctvDt",
    "ifctvDt"
})
public class ChngCtrl1 {

    @XmlElement(name = "ChngTp", required = true)
    protected String chngTp;
    @XmlElement(name = "FctvTp", required = true)
    protected String fctvTp;
    @XmlElement(name = "FctvDt", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date fctvDt;
    @XmlElement(name = "IfctvDt", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date ifctvDt;

    /**
     * Gets the value of the chngTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChngTp() {
        return chngTp;
    }

    /**
     * Sets the value of the chngTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChngTp(String value) {
        this.chngTp = value;
    }

    /**
     * Gets the value of the fctvTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFctvTp() {
        return fctvTp;
    }

    /**
     * Sets the value of the fctvTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFctvTp(String value) {
        this.fctvTp = value;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFctvDt(Date value) {
        this.fctvDt = value;
    }

    /**
     * Gets the value of the ifctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getIfctvDt() {
        return ifctvDt;
    }

    /**
     * Sets the value of the ifctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfctvDt(Date value) {
        this.ifctvDt = value;
    }

}