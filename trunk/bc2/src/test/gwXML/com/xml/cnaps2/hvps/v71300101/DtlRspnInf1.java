//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:46:04 ���� CST 
//


package com.xml.cnaps2.hvps.v71300101;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DtlRspnInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DtlRspnInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChckDt" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.713.001.01}ISODate"/>
 *         &lt;element name="NPCPrcInf" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.713.001.01}NPCPrcInf1"/>
 *         &lt;element name="TtlCnt" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.713.001.01}Max8NumericText"/>
 *         &lt;element name="Dtls" type="{urn:cnaps:std:hvps:2010:tech:xsd:hvps.713.001.01}Dtls2" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DtlRspnInf1", propOrder = {
    "chckDt",
    "npcPrcInf",
    "ttlCnt",
    "dtls"
})
public class DtlRspnInf1 {

    @XmlElement(name = "ChckDt", required = true)
    protected XMLGregorianCalendar chckDt;
    @XmlElement(name = "NPCPrcInf", required = true)
    protected NPCPrcInf1 npcPrcInf;
    @XmlElement(name = "TtlCnt", required = true)
    protected String ttlCnt;
    @XmlElement(name = "Dtls", required = true)
    protected List<Dtls2> dtls = new Vector<Dtls2>();

    /**
     * Gets the value of the chckDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChckDt() {
        return chckDt;
    }

    /**
     * Sets the value of the chckDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChckDt(XMLGregorianCalendar value) {
        this.chckDt = value;
    }

    /**
     * Gets the value of the npcPrcInf property.
     * 
     * @return
     *     possible object is
     *     {@link NPCPrcInf1 }
     *     
     */
    public NPCPrcInf1 getNPCPrcInf() {
        return npcPrcInf;
    }

    /**
     * Sets the value of the npcPrcInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NPCPrcInf1 }
     *     
     */
    public void setNPCPrcInf(NPCPrcInf1 value) {
        this.npcPrcInf = value;
    }

    /**
     * Gets the value of the ttlCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlCnt() {
        return ttlCnt;
    }

    /**
     * Sets the value of the ttlCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlCnt(String value) {
        this.ttlCnt = value;
    }

    /**
     * Gets the value of the dtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dtls2 }
     * 
     * 
     */
    public List<Dtls2> getDtls() {
        if (dtls == null) {
            dtls = new Vector<Dtls2>();
        }
        return this.dtls;
    }

}