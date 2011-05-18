//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:34:35 ���� CST 
//


package com.xml.cnaps2.saps.v36400101;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueueInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueueInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NbOfTxs" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.364.001.01}Max8NumericText"/>
 *         &lt;element name="QInstrInf" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.364.001.01}QueueInstructionInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueInformation1", propOrder = {
    "nbOfTxs",
    "qInstrInf"
})
public class QueueInformation1 {

    @XmlElement(name = "NbOfTxs", required = true)
    protected String nbOfTxs;
    @XmlElement(name = "QInstrInf")
    protected List<QueueInstructionInformation1> qInstrInf = new Vector<QueueInstructionInformation1>();


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
     * Gets the value of the qInstrInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qInstrInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQInstrInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueueInstructionInformation1 }
     * 
     * 
     */
    public List<QueueInstructionInformation1> getQInstrInf() {
        if (qInstrInf == null) {
            qInstrInf = new Vector<QueueInstructionInformation1>();
        }
        return this.qInstrInf;
    }


	public void setQInstrInf(List<QueueInstructionInformation1> qInstrInf) {
		this.qInstrInf = qInstrInf;
	}
	
}
