//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:01 ���� CST 
//


package com.xml.iso20022.camt.v05100102;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LqdtyDbtTfr" type="{urn:swift:xsd:camt.051.001.02}LiquidityDebitTransferV02"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "lqdtyDbtTfr"
})
public class Document {

    @XmlElement(name = "LqdtyDbtTfr", required = true)
    protected LiquidityDebitTransferV02 lqdtyDbtTfr;

    /**
     * Gets the value of the lqdtyDbtTfr property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidityDebitTransferV02 }
     *     
     */
    public LiquidityDebitTransferV02 getLqdtyDbtTfr() {
        return lqdtyDbtTfr;
    }

    /**
     * Sets the value of the lqdtyDbtTfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidityDebitTransferV02 }
     *     
     */
    public void setLqdtyDbtTfr(LiquidityDebitTransferV02 value) {
        this.lqdtyDbtTfr = value;
    }

}
