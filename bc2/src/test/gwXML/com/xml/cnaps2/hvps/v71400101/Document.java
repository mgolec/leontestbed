//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:53 ���� CST 
//


package com.xml.cnaps2.hvps.v71400101;

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
 *         &lt;element name="TxDwnldgReq" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.714.001.01}TxDwnldgReqV01"/>
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
    "txDwnldgReq"
})
public class Document {

    @XmlElement(name = "TxDwnldgReq", required = true)
    protected TxDwnldgReqV01 txDwnldgReq;

    /**
     * Gets the value of the txDwnldgReq property.
     * 
     * @return
     *     possible object is
     *     {@link TxDwnldgReqV01 }
     *     
     */
    public TxDwnldgReqV01 getTxDwnldgReq() {
        return txDwnldgReq;
    }

    /**
     * Sets the value of the txDwnldgReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxDwnldgReqV01 }
     *     
     */
    public void setTxDwnldgReq(TxDwnldgReqV01 value) {
        this.txDwnldgReq = value;
    }

}
