//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:37 ���� CST 
//


package com.xml.cnaps2.beps.v41200101;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginalInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgnlGrpHdr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.412.001.01}OriginalGroupHeader1"/>
 *         &lt;element name="OrgnlTx" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.412.001.01}OriginalTransaction1" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalInformation1", propOrder = {
    "orgnlGrpHdr",
    "orgnlTx"
})
public class OriginalInformation1 {

    @XmlElement(name = "OrgnlGrpHdr", required = true)
    protected OriginalGroupHeader1 orgnlGrpHdr;
    @XmlElement(name = "OrgnlTx", required = true)
    protected List<OriginalTransaction1> orgnlTx = new Vector<OriginalTransaction1>();

    /**
     * Gets the value of the orgnlGrpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupHeader1 }
     *     
     */
    public OriginalGroupHeader1 getOrgnlGrpHdr() {
        return orgnlGrpHdr;
    }

    /**
     * Sets the value of the orgnlGrpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupHeader1 }
     *     
     */
    public void setOrgnlGrpHdr(OriginalGroupHeader1 value) {
        this.orgnlGrpHdr = value;
    }

    /**
     * Gets the value of the orgnlTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgnlTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalTransaction1 }
     * 
     * 
     */
    public List<OriginalTransaction1> getOrgnlTx() {
        if (orgnlTx == null) {
            orgnlTx = new Vector<OriginalTransaction1>();
        }
        return this.orgnlTx;
    }

	public void setOrgnlTx(List<OriginalTransaction1> orgnlTx) {
		this.orgnlTx = orgnlTx;
	}

}
