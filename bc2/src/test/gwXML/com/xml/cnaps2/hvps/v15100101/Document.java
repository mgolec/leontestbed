//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:55 ���� CST 
//


package com.xml.cnaps2.hvps.v15100101;

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
 *         &lt;element name="ClrBkDrftAppl" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.151.001.01}ClrBkDrftApplV01"/>
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
    "clrBkDrftAppl"
})
public class Document {

    @XmlElement(name = "ClrBkDrftAppl", required = true)
    protected ClrBkDrftApplV01 clrBkDrftAppl;

    /**
     * Gets the value of the clrBkDrftAppl property.
     * 
     * @return
     *     possible object is
     *     {@link ClrBkDrftApplV01 }
     *     
     */
    public ClrBkDrftApplV01 getClrBkDrftAppl() {
        return clrBkDrftAppl;
    }

    /**
     * Sets the value of the clrBkDrftAppl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClrBkDrftApplV01 }
     *     
     */
    public void setClrBkDrftAppl(ClrBkDrftApplV01 value) {
        this.clrBkDrftAppl = value;
    }

}
