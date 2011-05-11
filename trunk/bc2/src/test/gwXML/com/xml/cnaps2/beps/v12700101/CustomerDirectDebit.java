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
 * <p>Java class for CustomerDirectDebit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDirectDebit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PKGGrpHdr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.127.001.01}PKGGroupHeader1"/>
 *         &lt;element name="PKGRtrLtdInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.127.001.01}PKGReturnLimitedInformation1"/>
 *         &lt;element name="CstmrDrctDbtInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.127.001.01}CustomerDirectDebitInformation1" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDirectDebit", propOrder = {
    "pkgGrpHdr",
    "pkgRtrLtdInf",
    "cstmrDrctDbtInf"
})
public class CustomerDirectDebit {

    @XmlElement(name = "PKGGrpHdr", required = true)
    protected PKGGroupHeader1 pkgGrpHdr;
    @XmlElement(name = "PKGRtrLtdInf", required = true)
    protected PKGReturnLimitedInformation1 pkgRtrLtdInf;
    @XmlElement(name = "CstmrDrctDbtInf", required = true)
    protected List<CustomerDirectDebitInformation1> cstmrDrctDbtInf = new Vector<CustomerDirectDebitInformation1>();

    /**
     * Gets the value of the pkgGrpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link PKGGroupHeader1 }
     *     
     */
    public PKGGroupHeader1 getPKGGrpHdr() {
        return pkgGrpHdr;
    }

    /**
     * Sets the value of the pkgGrpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PKGGroupHeader1 }
     *     
     */
    public void setPKGGrpHdr(PKGGroupHeader1 value) {
        this.pkgGrpHdr = value;
    }

    /**
     * Gets the value of the pkgRtrLtdInf property.
     * 
     * @return
     *     possible object is
     *     {@link PKGReturnLimitedInformation1 }
     *     
     */
    public PKGReturnLimitedInformation1 getPKGRtrLtdInf() {
        return pkgRtrLtdInf;
    }

    /**
     * Sets the value of the pkgRtrLtdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PKGReturnLimitedInformation1 }
     *     
     */
    public void setPKGRtrLtdInf(PKGReturnLimitedInformation1 value) {
        this.pkgRtrLtdInf = value;
    }

    /**
     * Gets the value of the cstmrDrctDbtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cstmrDrctDbtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstmrDrctDbtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerDirectDebitInformation1 }
     * 
     * 
     */
    public List<CustomerDirectDebitInformation1> getCstmrDrctDbtInf() {
        if (cstmrDrctDbtInf == null) {
            cstmrDrctDbtInf = new Vector<CustomerDirectDebitInformation1>();
        }
        return this.cstmrDrctDbtInf;
    }

}