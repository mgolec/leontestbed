//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:34:23 ���� CST 
//


package com.xml.cnaps2.saps.v35700101;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PledgeFinancingManagementInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PledgeFinancingManagementInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NbOfMmb" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.357.001.01}Max8NumericText"/>
 *         &lt;element name="SttlmList" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.357.001.01}SttlmList1" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PledgeFinancingManagementInformation1", propOrder = {
    "nbOfMmb",
    "sttlmList"
})
public class PledgeFinancingManagementInformation1 {

    @XmlElement(name = "NbOfMmb", required = true)
    protected String nbOfMmb;
    @XmlElement(name = "SttlmList", required = true)
    protected List<SttlmList1> sttlmList = new Vector<SttlmList1>();

    /**
     * Gets the value of the nbOfMmb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfMmb() {
        return nbOfMmb;
    }

    /**
     * Sets the value of the nbOfMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfMmb(String value) {
        this.nbOfMmb = value;
    }

    /**
     * Gets the value of the sttlmList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttlmList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SttlmList1 }
     * 
     * 
     */
    public List<SttlmList1> getSttlmList() {
        if (sttlmList == null) {
            sttlmList = new Vector<SttlmList1>();
        }
        return this.sttlmList;
    }

}