//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:34:04 ���� CST 
//


package com.xml.cnaps2.nets.v35600101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetDebitWarningSetting1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetDebitWarningSetting1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SwtchTp" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}SwitchTypeCode1"/>
 *         &lt;element name="MmbId" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}Max14Text"/>
 *         &lt;element name="AvlblNetDbtWrngVal" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetDebitWarningSetting1", propOrder = {
    "swtchTp",
    "mmbId",
    "avlblNetDbtWrngVal"
})
public class NetDebitWarningSetting1 {

    @XmlElement(name = "SwtchTp", required = true)
    protected String swtchTp;
    @XmlElement(name = "MmbId", required = true)
    protected String mmbId;
    @XmlElement(name = "AvlblNetDbtWrngVal")
    protected ActiveCurrencyAndAmount avlblNetDbtWrngVal;

    /**
     * Gets the value of the swtchTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwtchTp() {
        return swtchTp;
    }

    /**
     * Sets the value of the swtchTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwtchTp(String value) {
        this.swtchTp = value;
    }

    /**
     * Gets the value of the mmbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmbId(String value) {
        this.mmbId = value;
    }

    /**
     * Gets the value of the avlblNetDbtWrngVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAvlblNetDbtWrngVal() {
        return avlblNetDbtWrngVal;
    }

    /**
     * Sets the value of the avlblNetDbtWrngVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAvlblNetDbtWrngVal(ActiveCurrencyAndAmount value) {
        this.avlblNetDbtWrngVal = value;
    }

}
