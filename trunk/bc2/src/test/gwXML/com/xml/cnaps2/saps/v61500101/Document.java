//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:47:12 ���� CST 
//


package com.xml.cnaps2.saps.v61500101;

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
 *         &lt;element name="PoolIntrBkLnQryRspn" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.615.001.01}PoolIntrBkLnQryRspnV01"/>
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
    "poolIntrBkLnQryRspn"
})
public class Document {

    @XmlElement(name = "PoolIntrBkLnQryRspn", required = true)
    protected PoolIntrBkLnQryRspnV01 poolIntrBkLnQryRspn;

    /**
     * Gets the value of the poolIntrBkLnQryRspn property.
     * 
     * @return
     *     possible object is
     *     {@link PoolIntrBkLnQryRspnV01 }
     *     
     */
    public PoolIntrBkLnQryRspnV01 getPoolIntrBkLnQryRspn() {
        return poolIntrBkLnQryRspn;
    }

    /**
     * Sets the value of the poolIntrBkLnQryRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoolIntrBkLnQryRspnV01 }
     *     
     */
    public void setPoolIntrBkLnQryRspn(PoolIntrBkLnQryRspnV01 value) {
        this.poolIntrBkLnQryRspn = value;
    }

}