//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:32:40 ���� CST 
//


package com.xml.cnaps2.beps.v72400101;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionDownloadRequestInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionDownloadRequestInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NbOfTxs" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.724.001.01}Max8NumericText"/>
 *         &lt;element name="DwnldReqTxsDtls" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.724.001.01}DownloadRequestTransactionsDetails1" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDownloadRequestInformation1", propOrder = {
    "nbOfTxs",
    "dwnldReqTxsDtls"
})
public class TransactionDownloadRequestInformation1 {

    @XmlElement(name = "NbOfTxs", required = true)
    protected String nbOfTxs;
    @XmlElement(name = "DwnldReqTxsDtls", required = true)
    protected List<DownloadRequestTransactionsDetails1> dwnldReqTxsDtls = new Vector<DownloadRequestTransactionsDetails1>();


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
     * Gets the value of the dwnldReqTxsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dwnldReqTxsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDwnldReqTxsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DownloadRequestTransactionsDetails1 }
     * 
     * 
     */
    public List<DownloadRequestTransactionsDetails1> getDwnldReqTxsDtls() {
        if (dwnldReqTxsDtls == null) {
            dwnldReqTxsDtls = new Vector<DownloadRequestTransactionsDetails1>();
        }
        return this.dwnldReqTxsDtls;
    }
    
    public void setDwnldReqTxsDtls(
			List<DownloadRequestTransactionsDetails1> dwnldReqTxsDtls) {
		this.dwnldReqTxsDtls = dwnldReqTxsDtls;
	}

}
