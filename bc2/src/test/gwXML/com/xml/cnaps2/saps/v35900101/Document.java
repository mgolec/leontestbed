//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:46:38 ���� CST 
//


package com.xml.cnaps2.saps.v35900101;

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
 *         &lt;element name="FincgRqrmntNtfctn" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.359.001.01}FincgRqrmntNtfctnV01"/>
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
    "fincgRqrmntNtfctn"
})
public class Document {

    @XmlElement(name = "FincgRqrmntNtfctn", required = true)
    protected FincgRqrmntNtfctnV01 fincgRqrmntNtfctn;

    /**
     * Gets the value of the fincgRqrmntNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link FincgRqrmntNtfctnV01 }
     *     
     */
    public FincgRqrmntNtfctnV01 getFincgRqrmntNtfctn() {
        return fincgRqrmntNtfctn;
    }

    /**
     * Sets the value of the fincgRqrmntNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FincgRqrmntNtfctnV01 }
     *     
     */
    public void setFincgRqrmntNtfctn(FincgRqrmntNtfctnV01 value) {
        this.fincgRqrmntNtfctn = value;
    }

}