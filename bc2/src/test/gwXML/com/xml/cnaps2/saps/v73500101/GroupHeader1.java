//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:47:23 ���� CST 
//


package com.xml.cnaps2.saps.v73500101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GroupHeader1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupHeader1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MsgId" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.735.001.01}Max35Text"/>
 *         &lt;element name="CreDtTm" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.735.001.01}ISODateTime"/>
 *         &lt;element name="InstgPty" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.735.001.01}InstgPty1"/>
 *         &lt;element name="InstdPty" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.735.001.01}InstdPty1"/>
 *         &lt;element name="SysCd" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.735.001.01}SystemCode1"/>
 *         &lt;element name="Rmk" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.735.001.01}Max256Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader1", propOrder = {
    "msgId",
    "creDtTm",
    "instgPty",
    "instdPty",
    "sysCd",
    "rmk"
})
public class GroupHeader1 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true)
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "InstgPty", required = true)
    protected InstgPty1 instgPty;
    @XmlElement(name = "InstdPty", required = true)
    protected InstdPty1 instdPty;
    @XmlElement(name = "SysCd", required = true)
    protected String sysCd;
    @XmlElement(name = "Rmk")
    protected String rmk;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the instgPty property.
     * 
     * @return
     *     possible object is
     *     {@link InstgPty1 }
     *     
     */
    public InstgPty1 getInstgPty() {
        return instgPty;
    }

    /**
     * Sets the value of the instgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstgPty1 }
     *     
     */
    public void setInstgPty(InstgPty1 value) {
        this.instgPty = value;
    }

    /**
     * Gets the value of the instdPty property.
     * 
     * @return
     *     possible object is
     *     {@link InstdPty1 }
     *     
     */
    public InstdPty1 getInstdPty() {
        return instdPty;
    }

    /**
     * Sets the value of the instdPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstdPty1 }
     *     
     */
    public void setInstdPty(InstdPty1 value) {
        this.instdPty = value;
    }

    /**
     * Gets the value of the sysCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysCd() {
        return sysCd;
    }

    /**
     * Sets the value of the sysCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysCd(String value) {
        this.sysCd = value;
    }

    /**
     * Gets the value of the rmk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmk() {
        return rmk;
    }

    /**
     * Sets the value of the rmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmk(String value) {
        this.rmk = value;
    }

}
