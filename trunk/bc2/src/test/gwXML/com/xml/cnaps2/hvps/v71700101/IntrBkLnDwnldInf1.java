//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:58 ���� CST 
//


package com.xml.cnaps2.hvps.v71700101;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntrBkLnDwnldInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntrBkLnDwnldInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TtlAmt" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.717.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="TtlCnt" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.717.001.01}Max8NumericText"/>
 *         &lt;element name="Dtls" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.717.001.01}Dtls4" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntrBkLnDwnldInf1", propOrder = {
    "ttlAmt",
    "ttlCnt",
    "dtls"
})
public class IntrBkLnDwnldInf1 {

    @XmlElement(name = "TtlAmt", required = true)
    protected ActiveCurrencyAndAmount ttlAmt;
    @XmlElement(name = "TtlCnt", required = true)
    protected String ttlCnt;
    @XmlElement(name = "Dtls", required = true)
    protected List<Dtls4> dtls = new Vector<Dtls4>();

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlAmt(ActiveCurrencyAndAmount value) {
        this.ttlAmt = value;
    }

    /**
     * Gets the value of the ttlCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlCnt() {
        return ttlCnt;
    }

    /**
     * Sets the value of the ttlCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlCnt(String value) {
        this.ttlCnt = value;
    }

    /**
     * Gets the value of the dtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dtls4 }
     * 
     * 
     */
    public List<Dtls4> getDtls() {
        if (dtls == null) {
            dtls = new Vector<Dtls4>();
        }
        return this.dtls;
    }

}