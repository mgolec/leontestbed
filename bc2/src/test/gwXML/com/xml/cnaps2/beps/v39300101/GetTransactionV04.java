//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.10 at 04:00:27 ���� CST 
//


package com.xml.cnaps2.beps.v39300101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTransactionV04 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransactionV04">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MsgId" type="{urn:swift:xsd:camt.005.001.04}MessageIdentification"/>
 *         &lt;element name="ReqTp" type="{urn:swift:xsd:camt.005.001.04}RequestType1Choice" minOccurs="0"/>
 *         &lt;element name="TxQryDef" type="{urn:swift:xsd:camt.005.001.04}TransactionQueryDefinition4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransactionV04", propOrder = {
    "msgId",
    "reqTp",
    "txQryDef"
})
public class GetTransactionV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "ReqTp")
    protected RequestType1Choice reqTp;
    @XmlElement(name = "TxQryDef")
    protected TransactionQueryDefinition4 txQryDef;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification }
     *     
     */
    public MessageIdentification getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification }
     *     
     */
    public void setMsgId(MessageIdentification value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the reqTp property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType1Choice }
     *     
     */
    public RequestType1Choice getReqTp() {
        return reqTp;
    }

    /**
     * Sets the value of the reqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType1Choice }
     *     
     */
    public void setReqTp(RequestType1Choice value) {
        this.reqTp = value;
    }

    /**
     * Gets the value of the txQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionQueryDefinition4 }
     *     
     */
    public TransactionQueryDefinition4 getTxQryDef() {
        return txQryDef;
    }

    /**
     * Sets the value of the txQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionQueryDefinition4 }
     *     
     */
    public void setTxQryDef(TransactionQueryDefinition4 value) {
        this.txQryDef = value;
    }

}
