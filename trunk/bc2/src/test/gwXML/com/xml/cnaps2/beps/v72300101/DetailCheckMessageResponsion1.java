//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:47 ���� CST 
//


package com.xml.cnaps2.beps.v72300101;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailCheckMessageResponsion1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailCheckMessageResponsion1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NbOfTxs" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.723.001.01}Max8NumericText"/>
 *         &lt;element name="DtlChckMsgRspnDtls" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.723.001.01}DetailCheckMessageResponsionDetails1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailCheckMessageResponsion1", propOrder = {
    "nbOfTxs",
    "dtlChckMsgRspnDtls"
})
public class DetailCheckMessageResponsion1 {

    @XmlElement(name = "NbOfTxs", required = true)
    protected String nbOfTxs;
    @XmlElement(name = "DtlChckMsgRspnDtls")
    protected List<DetailCheckMessageResponsionDetails1> dtlChckMsgRspnDtls = new Vector<DetailCheckMessageResponsionDetails1>();

    /**
     * Gets the value of the nbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfTxs() {
        return nbOfTxs;
    }

    /**
     * Sets the value of the nbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfTxs(String value) {
        this.nbOfTxs = value;
    }

    /**
     * Gets the value of the dtlChckMsgRspnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtlChckMsgRspnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtlChckMsgRspnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailCheckMessageResponsionDetails1 }
     * 
     * 
     */
    public List<DetailCheckMessageResponsionDetails1> getDtlChckMsgRspnDtls() {
        if (dtlChckMsgRspnDtls == null) {
            dtlChckMsgRspnDtls = new Vector<DetailCheckMessageResponsionDetails1>();
        }
        return this.dtlChckMsgRspnDtls;
    }

}
