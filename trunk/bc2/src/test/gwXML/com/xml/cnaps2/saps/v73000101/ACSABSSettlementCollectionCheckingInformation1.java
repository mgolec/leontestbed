//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:35:07 ���� CST 
//


package com.xml.cnaps2.saps.v73000101;

import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ACSABSSettlementCollectionCheckingInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACSABSSettlementCollectionCheckingInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChckngDt" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.730.001.01}ISODate"/>
 *         &lt;element name="UnltrlChckng" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.730.001.01}UnilateralChecking1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RvslChckng" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.730.001.01}ReversalChecking1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NetgChckng" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.730.001.01}NettingChecking1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACSABSSettlementCollectionCheckingInformation1", propOrder = {
    "chckngDt",
    "unltrlChckng",
    "rvslChckng",
    "netgChckng"
})
public class ACSABSSettlementCollectionCheckingInformation1 {

    @XmlElement(name = "ChckngDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date chckngDt;
    @XmlElement(name = "UnltrlChckng")
    protected List<UnilateralChecking1> unltrlChckng = new Vector<UnilateralChecking1>();
    @XmlElement(name = "RvslChckng")
    protected List<ReversalChecking1> rvslChckng = new Vector<ReversalChecking1>();
    @XmlElement(name = "NetgChckng")
    protected List<NettingChecking1> netgChckng = new Vector<NettingChecking1>();

    /**
     * Gets the value of the chckngDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getChckngDt() {
        return chckngDt;
    }

    /**
     * Sets the value of the chckngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChckngDt(Date value) {
        this.chckngDt = value;
    }

    /**
     * Gets the value of the unltrlChckng property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unltrlChckng property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnltrlChckng().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnilateralChecking1 }
     * 
     * 
     */
    public List<UnilateralChecking1> getUnltrlChckng() {
        if (unltrlChckng == null) {
            unltrlChckng = new Vector<UnilateralChecking1>();
        }
        return this.unltrlChckng;
    }

    /**
     * Gets the value of the rvslChckng property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rvslChckng property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRvslChckng().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReversalChecking1 }
     * 
     * 
     */
    public List<ReversalChecking1> getRvslChckng() {
        if (rvslChckng == null) {
            rvslChckng = new Vector<ReversalChecking1>();
        }
        return this.rvslChckng;
    }

    /**
     * Gets the value of the netgChckng property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netgChckng property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetgChckng().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NettingChecking1 }
     * 
     * 
     */
    public List<NettingChecking1> getNetgChckng() {
        if (netgChckng == null) {
            netgChckng = new Vector<NettingChecking1>();
        }
        return this.netgChckng;
    }

}