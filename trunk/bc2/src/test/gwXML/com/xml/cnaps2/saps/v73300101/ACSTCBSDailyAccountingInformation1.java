//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:35:11 ���� CST 
//


package com.xml.cnaps2.saps.v73300101;

import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ACSTCBSDailyAccountingInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACSTCBSDailyAccountingInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkDt" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.733.001.01}ISODate"/>
 *         &lt;element name="NbOfTx" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.733.001.01}Max8NumericText"/>
 *         &lt;element name="ChckngList" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.733.001.01}CheckingList1" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACSTCBSDailyAccountingInformation1", propOrder = {
    "workDt",
    "nbOfTx",
    "chckngList"
})
public class ACSTCBSDailyAccountingInformation1 {

    @XmlElement(name = "WorkDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date workDt;
    @XmlElement(name = "NbOfTx", required = true)
    protected String nbOfTx;
    @XmlElement(name = "ChckngList", required = true)
    protected List<CheckingList1> chckngList = new Vector<CheckingList1>();

    /**
     * Gets the value of the workDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getWorkDt() {
        return workDt;
    }

    /**
     * Sets the value of the workDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkDt(Date value) {
        this.workDt = value;
    }

    /**
     * Gets the value of the nbOfTx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfTx() {
        return nbOfTx;
    }

    /**
     * Sets the value of the nbOfTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfTx(String value) {
        this.nbOfTx = value;
    }

    /**
     * Gets the value of the chckngList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chckngList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChckngList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckingList1 }
     * 
     * 
     */
    public List<CheckingList1> getChckngList() {
        if (chckngList == null) {
            chckngList = new Vector<CheckingList1>();
        }
        return this.chckngList;
    }

}
