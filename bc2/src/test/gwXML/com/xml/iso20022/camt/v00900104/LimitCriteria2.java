//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:57 ���� CST 
//


package com.xml.iso20022.camt.v00900104;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LimitCriteria2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewQryNm" type="{urn:swift:xsd:camt.009.001.04}Max35Text" minOccurs="0"/>
 *         &lt;element name="SchCrit" type="{urn:swift:xsd:camt.009.001.04}LimitSearchCriteria2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RtrCrit" type="{urn:swift:xsd:camt.009.001.04}LimitReturnCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitCriteria2", propOrder = {
    "newQryNm",
    "schCrit",
    "rtrCrit"
})
public class LimitCriteria2 {

    @XmlElement(name = "NewQryNm")
    protected String newQryNm;
    @XmlElement(name = "SchCrit")
    protected List<LimitSearchCriteria2> schCrit = new Vector<LimitSearchCriteria2>();
    @XmlElement(name = "RtrCrit")
    protected LimitReturnCriteria rtrCrit;

    /**
     * Gets the value of the newQryNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewQryNm() {
        return newQryNm;
    }

    /**
     * Sets the value of the newQryNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewQryNm(String value) {
        this.newQryNm = value;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schCrit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchCrit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitSearchCriteria2 }
     * 
     * 
     */
    public List<LimitSearchCriteria2> getSchCrit() {
        if (schCrit == null) {
            schCrit = new Vector<LimitSearchCriteria2>();
        }
        return this.schCrit;
    }

    /**
     * Gets the value of the rtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link LimitReturnCriteria }
     *     
     */
    public LimitReturnCriteria getRtrCrit() {
        return rtrCrit;
    }

    /**
     * Sets the value of the rtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitReturnCriteria }
     *     
     */
    public void setRtrCrit(LimitReturnCriteria value) {
        this.rtrCrit = value;
    }

}
