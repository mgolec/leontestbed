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
 * <p>Java class for PoolIntrBkLnQryRspnV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoolIntrBkLnQryRspnV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.615.001.01}GroupHeader1"/>
 *         &lt;element name="OrgnlGrpHdr" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.615.001.01}OriginalGroupHeader1"/>
 *         &lt;element name="NPCPrcInf" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.615.001.01}NPCProcessInformation1"/>
 *         &lt;element name="PoolIntrBkLnQryRspnInf" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.615.001.01}PoolInterbankLoanQueryResponseInformation1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoolIntrBkLnQryRspnV01", propOrder = {
    "grpHdr",
    "orgnlGrpHdr",
    "npcPrcInf",
    "poolIntrBkLnQryRspnInf"
})
public class PoolIntrBkLnQryRspnV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "OrgnlGrpHdr", required = true)
    protected OriginalGroupHeader1 orgnlGrpHdr;
    @XmlElement(name = "NPCPrcInf", required = true)
    protected NPCProcessInformation1 npcPrcInf;
    @XmlElement(name = "PoolIntrBkLnQryRspnInf")
    protected PoolInterbankLoanQueryResponseInformation1 poolIntrBkLnQryRspnInf;

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
     * Gets the value of the npcPrcInf property.
     * 
     * @return
     *     possible object is
     *     {@link NPCProcessInformation1 }
     *     
     */
    public NPCProcessInformation1 getNPCPrcInf() {
        return npcPrcInf;
    }

    /**
     * Sets the value of the npcPrcInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NPCProcessInformation1 }
     *     
     */
    public void setNPCPrcInf(NPCProcessInformation1 value) {
        this.npcPrcInf = value;
    }

    /**
     * Gets the value of the poolIntrBkLnQryRspnInf property.
     * 
     * @return
     *     possible object is
     *     {@link PoolInterbankLoanQueryResponseInformation1 }
     *     
     */
    public PoolInterbankLoanQueryResponseInformation1 getPoolIntrBkLnQryRspnInf() {
        return poolIntrBkLnQryRspnInf;
    }

    /**
     * Sets the value of the poolIntrBkLnQryRspnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoolInterbankLoanQueryResponseInformation1 }
     *     
     */
    public void setPoolIntrBkLnQryRspnInf(PoolInterbankLoanQueryResponseInformation1 value) {
        this.poolIntrBkLnQryRspnInf = value;
    }

}
