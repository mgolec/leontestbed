//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:47:14 ���� CST 
//


package com.xml.cnaps2.saps.v61600101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetgListDwnLdV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetgListDwnLdV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.616.001.01}GroupHeader1"/>
 *         &lt;element name="NetgListDwnLdInf" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.616.001.01}NettingListDownLoadInformation1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetgListDwnLdV01", propOrder = {
    "grpHdr",
    "netgListDwnLdInf"
})
public class NetgListDwnLdV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "NetgListDwnLdInf", required = true)
    protected NettingListDownLoadInformation1 netgListDwnLdInf;

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
     * Gets the value of the netgListDwnLdInf property.
     * 
     * @return
     *     possible object is
     *     {@link NettingListDownLoadInformation1 }
     *     
     */
    public NettingListDownLoadInformation1 getNetgListDwnLdInf() {
        return netgListDwnLdInf;
    }

    /**
     * Sets the value of the netgListDwnLdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingListDownLoadInformation1 }
     *     
     */
    public void setNetgListDwnLdInf(NettingListDownLoadInformation1 value) {
        this.netgListDwnLdInf = value;
    }

}
