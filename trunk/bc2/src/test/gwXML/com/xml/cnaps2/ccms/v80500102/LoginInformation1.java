//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:13 ���� CST 
//


package com.xml.cnaps2.ccms.v80500102;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoginOprTp" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.805.001.02}LoginOperationTypeCode1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginInformation1", propOrder = {
    "loginOprTp"
})
public class LoginInformation1 {

    @XmlElement(name = "LoginOprTp", required = true)
    protected String loginOprTp;

    /**
     * Gets the value of the loginOprTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginOprTp() {
        return loginOprTp;
    }

    /**
     * Sets the value of the loginOprTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginOprTp(String value) {
        this.loginOprTp = value;
    }

}
