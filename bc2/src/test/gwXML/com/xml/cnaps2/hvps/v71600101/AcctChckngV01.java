//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:56 ���� CST 
//


package com.xml.cnaps2.hvps.v71600101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctChckngV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctChckngV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.716.001.01}GroupHeader1"/>
 *         &lt;element name="Prttn" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.716.001.01}Prttn1"/>
 *         &lt;element name="AcctChckngInf" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.716.001.01}AcctChckngInf1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctChckngV01", propOrder = {
    "grpHdr",
    "prttn",
    "acctChckngInf"
})
public class AcctChckngV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "Prttn", required = true)
    protected Prttn1 prttn;
    @XmlElement(name = "AcctChckngInf", required = true)
    protected AcctChckngInf1 acctChckngInf;

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
     * Gets the value of the prttn property.
     * 
     * @return
     *     possible object is
     *     {@link Prttn1 }
     *     
     */
    public Prttn1 getPrttn() {
        return prttn;
    }

    /**
     * Sets the value of the prttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prttn1 }
     *     
     */
    public void setPrttn(Prttn1 value) {
        this.prttn = value;
    }

    /**
     * Gets the value of the acctChckngInf property.
     * 
     * @return
     *     possible object is
     *     {@link AcctChckngInf1 }
     *     
     */
    public AcctChckngInf1 getAcctChckngInf() {
        return acctChckngInf;
    }

    /**
     * Sets the value of the acctChckngInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctChckngInf1 }
     *     
     */
    public void setAcctChckngInf(AcctChckngInf1 value) {
        this.acctChckngInf = value;
    }

}
