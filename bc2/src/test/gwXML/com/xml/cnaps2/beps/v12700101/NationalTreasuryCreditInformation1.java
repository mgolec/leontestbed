//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:32:12 ���� CST 
//


package com.xml.cnaps2.beps.v12700101;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NationalTreasuryCreditInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NationalTreasuryCreditInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FslInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.127.001.01}FiscalInformation1"/>
 *         &lt;element name="BugtLvl" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.127.001.01}BudgetLevelCode1"/>
 *         &lt;element name="Ind" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.127.001.01}IndicatorCode1"/>
 *         &lt;element name="BugtTp" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.127.001.01}BudgetTypeCode1"/>
 *         &lt;element name="NbOfTxs" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.127.001.01}Max8NumericText"/>
 *         &lt;element name="TxsDtls" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.127.001.01}TransactionsDetails1" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NationalTreasuryCreditInformation1", propOrder = {
    "fslInf",
    "bugtLvl",
    "ind",
    "bugtTp",
    "nbOfTxs",
    "txsDtls"
})
public class NationalTreasuryCreditInformation1 {

    @XmlElement(name = "FslInf", required = true)
    protected FiscalInformation1 fslInf;
    @XmlElement(name = "BugtLvl", required = true)
    protected String bugtLvl;
    @XmlElement(name = "Ind", required = true)
    protected String ind;
    @XmlElement(name = "BugtTp", required = true)
    protected String bugtTp;
    @XmlElement(name = "NbOfTxs", required = true)
    protected String nbOfTxs;
    @XmlElement(name = "TxsDtls", required = true)
    protected List<TransactionsDetails1> txsDtls = new Vector<TransactionsDetails1>();

    /**
     * Gets the value of the fslInf property.
     * 
     * @return
     *     possible object is
     *     {@link FiscalInformation1 }
     *     
     */
    public FiscalInformation1 getFslInf() {
        return fslInf;
    }

    /**
     * Sets the value of the fslInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiscalInformation1 }
     *     
     */
    public void setFslInf(FiscalInformation1 value) {
        this.fslInf = value;
    }

    /**
     * Gets the value of the bugtLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBugtLvl() {
        return bugtLvl;
    }

    /**
     * Sets the value of the bugtLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBugtLvl(String value) {
        this.bugtLvl = value;
    }

    /**
     * Gets the value of the ind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInd() {
        return ind;
    }

    /**
     * Sets the value of the ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInd(String value) {
        this.ind = value;
    }

    /**
     * Gets the value of the bugtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBugtTp() {
        return bugtTp;
    }

    /**
     * Sets the value of the bugtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBugtTp(String value) {
        this.bugtTp = value;
    }

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
     * Gets the value of the txsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionsDetails1 }
     * 
     * 
     */
    public List<TransactionsDetails1> getTxsDtls() {
        if (txsDtls == null) {
            txsDtls = new Vector<TransactionsDetails1>();
        }
        return this.txsDtls;
    }

	public void setTxsDtls(List<TransactionsDetails1> txsDtls) {
		this.txsDtls = txsDtls;
	}

}
