//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:47:00 ���� CST 
//


package com.xml.cnaps2.saps.v37500101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntrBkLnMgmtRspnV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntrBkLnMgmtRspnV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.375.001.01}GroupHeader1"/>
 *         &lt;element name="OrgnlGrpHdr" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.375.001.01}OriginalGroupHeader1"/>
 *         &lt;element name="RspnInf" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.375.001.01}ResponseInformation1"/>
 *         &lt;element name="IntrBkLnPrtcolInf" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.375.001.01}InterbankLoanProtocolInformation1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntrBkLnMgmtRspnV1", propOrder = {
    "grpHdr",
    "orgnlGrpHdr",
    "rspnInf",
    "intrBkLnPrtcolInf"
})
public class IntrBkLnMgmtRspnV1 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "OrgnlGrpHdr", required = true)
    protected OriginalGroupHeader1 orgnlGrpHdr;
    @XmlElement(name = "RspnInf", required = true)
    protected ResponseInformation1 rspnInf;
    @XmlElement(name = "IntrBkLnPrtcolInf", required = true)
    protected InterbankLoanProtocolInformation1 intrBkLnPrtcolInf;

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
     * Gets the value of the orgnlGrpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupHeader1 }
     *     
     */
    public OriginalGroupHeader1 getOrgnlGrpHdr() {
        return orgnlGrpHdr;
    }

    /**
     * Sets the value of the orgnlGrpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupHeader1 }
     *     
     */
    public void setOrgnlGrpHdr(OriginalGroupHeader1 value) {
        this.orgnlGrpHdr = value;
    }

    /**
     * Gets the value of the rspnInf property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseInformation1 }
     *     
     */
    public ResponseInformation1 getRspnInf() {
        return rspnInf;
    }

    /**
     * Sets the value of the rspnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseInformation1 }
     *     
     */
    public void setRspnInf(ResponseInformation1 value) {
        this.rspnInf = value;
    }

    /**
     * Gets the value of the intrBkLnPrtcolInf property.
     * 
     * @return
     *     possible object is
     *     {@link InterbankLoanProtocolInformation1 }
     *     
     */
    public InterbankLoanProtocolInformation1 getIntrBkLnPrtcolInf() {
        return intrBkLnPrtcolInf;
    }

    /**
     * Sets the value of the intrBkLnPrtcolInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterbankLoanProtocolInformation1 }
     *     
     */
    public void setIntrBkLnPrtcolInf(InterbankLoanProtocolInformation1 value) {
        this.intrBkLnPrtcolInf = value;
    }

}
