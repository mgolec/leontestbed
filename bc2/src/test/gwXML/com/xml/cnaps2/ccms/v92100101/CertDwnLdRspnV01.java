//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:46 ���� CST 
//


package com.xml.cnaps2.ccms.v92100101;

import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertDwnLdRspnV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertDwnLdRspnV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.921.001.01}GroupHeader1"/>
 *         &lt;element name="Prttn" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.921.001.01}Prttn1"/>
 *         &lt;element name="OrgnlMsgInf" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.921.001.01}OrgnlMsgInf1"/>
 *         &lt;element name="CertfctnList" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.921.001.01}CertfctnList1" maxOccurs="100"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertDwnLdRspnV01", propOrder = {
    "grpHdr",
    "prttn",
    "orgnlMsgInf",
    "certfctnList"
})
public class CertDwnLdRspnV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "Prttn", required = true)
    protected Prttn1 prttn;
    @XmlElement(name = "OrgnlMsgInf", required = true)
    protected OrgnlMsgInf1 orgnlMsgInf;
    @XmlElement(name = "CertfctnList", required = true)
    protected List<CertfctnList1> certfctnList = new Vector<CertfctnList1>();

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader1 }
     *     
     */
    public GroupHeader1 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader1 }
     *     
     */
    public void setGrpHdr(GroupHeader1 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the prttn property.
     * 
     * @return
     *     possible object is
     *     {@link Prttn1 }
     *     
     */
    public Prttn1 getPrttn() {
        return prttn;
    }

    /**
     * Sets the value of the prttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prttn1 }
     *     
     */
    public void setPrttn(Prttn1 value) {
        this.prttn = value;
    }

    /**
     * Gets the value of the orgnlMsgInf property.
     * 
     * @return
     *     possible object is
     *     {@link OrgnlMsgInf1 }
     *     
     */
    public OrgnlMsgInf1 getOrgnlMsgInf() {
        return orgnlMsgInf;
    }

    /**
     * Sets the value of the orgnlMsgInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgnlMsgInf1 }
     *     
     */
    public void setOrgnlMsgInf(OrgnlMsgInf1 value) {
        this.orgnlMsgInf = value;
    }

    /**
     * Gets the value of the certfctnList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certfctnList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertfctnList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertfctnList1 }
     * 
     * 
     */
    public List<CertfctnList1> getCertfctnList() {
        if (certfctnList == null) {
            certfctnList = new Vector<CertfctnList1>();
        }
        return this.certfctnList;
    }

}