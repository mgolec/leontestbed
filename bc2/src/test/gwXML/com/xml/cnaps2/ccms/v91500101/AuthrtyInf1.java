//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:28 ���� CST 
//


package com.xml.cnaps2.ccms.v91500101;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthrtyInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthrtyInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChngCtrl" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.915.001.01}ChngCtrl1"/>
 *         &lt;element name="InitPtcpt" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.915.001.01}Max14Text"/>
 *         &lt;element name="RcvPtcpt" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.915.001.01}Max14Text"/>
 *         &lt;element name="BizAuthrtyInf" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.915.001.01}BizAuthrtyInf1" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthrtyInf1", propOrder = {
    "chngCtrl",
    "initPtcpt",
    "rcvPtcpt",
    "bizAuthrtyInf"
})
public class AuthrtyInf1 {

    @XmlElement(name = "ChngCtrl", required = true)
    protected ChngCtrl1 chngCtrl;
    @XmlElement(name = "InitPtcpt", required = true)
    protected String initPtcpt;
    @XmlElement(name = "RcvPtcpt", required = true)
    protected String rcvPtcpt;
    @XmlElement(name = "BizAuthrtyInf", required = true)
    protected List<BizAuthrtyInf1> bizAuthrtyInf = new Vector<BizAuthrtyInf1>();

    /**
     * Gets the value of the chngCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link ChngCtrl1 }
     *     
     */
    public ChngCtrl1 getChngCtrl() {
        return chngCtrl;
    }

    /**
     * Sets the value of the chngCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChngCtrl1 }
     *     
     */
    public void setChngCtrl(ChngCtrl1 value) {
        this.chngCtrl = value;
    }

    /**
     * Gets the value of the initPtcpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitPtcpt() {
        return initPtcpt;
    }

    /**
     * Sets the value of the initPtcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitPtcpt(String value) {
        this.initPtcpt = value;
    }

    /**
     * Gets the value of the rcvPtcpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvPtcpt() {
        return rcvPtcpt;
    }

    /**
     * Sets the value of the rcvPtcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvPtcpt(String value) {
        this.rcvPtcpt = value;
    }

    /**
     * Gets the value of the bizAuthrtyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bizAuthrtyInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBizAuthrtyInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BizAuthrtyInf1 }
     * 
     * 
     */
    public List<BizAuthrtyInf1> getBizAuthrtyInf() {
        if (bizAuthrtyInf == null) {
            bizAuthrtyInf = new Vector<BizAuthrtyInf1>();
        }
        return this.bizAuthrtyInf;
    }

	public void setBizAuthrtyInf(List<BizAuthrtyInf1> bizAuthrtyInf) {
		this.bizAuthrtyInf = bizAuthrtyInf;
	}

}
