//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:35:10 ���� CST 
//


package com.xml.cnaps2.saps.v73200101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACSABSSttlmDtlRspnV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACSABSSttlmDtlRspnV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.732.001.01}GroupHeader1"/>
 *         &lt;element name="Prttn" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.732.001.01}Partition1"/>
 *         &lt;element name="OrgnlGrpHdr" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.732.001.01}OriginalGroupHeader1"/>
 *         &lt;element name="NPCPrcInf" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.732.001.01}NPCProcessInformation1"/>
 *         &lt;element name="ACSABSSttlmDtlRspnInf" type="{urn:cnaps:std:saps:2010:tech:xsd:saps.732.001.01}ACSABSSettlementDetailResponseInformation1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACSABSSttlmDtlRspnV01", propOrder = {
    "grpHdr",
    "prttn",
    "orgnlGrpHdr",
    "npcPrcInf",
    "acsAbsSttlmDtlRspnInf"
})
public class ACSABSSttlmDtlRspnV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "Prttn", required = true)
    protected Partition1 prttn;
    @XmlElement(name = "OrgnlGrpHdr", required = true)
    protected OriginalGroupHeader1 orgnlGrpHdr;
    @XmlElement(name = "NPCPrcInf", required = true)
    protected NPCProcessInformation1 npcPrcInf;
    @XmlElement(name = "ACSABSSttlmDtlRspnInf", required = true)
    protected ACSABSSettlementDetailResponseInformation1 acsAbsSttlmDtlRspnInf;

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
     *     {@link Partition1 }
     *     
     */
    public Partition1 getPrttn() {
        return prttn;
    }

    /**
     * Sets the value of the prttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Partition1 }
     *     
     */
    public void setPrttn(Partition1 value) {
        this.prttn = value;
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
    public NPCProcessInformation1 getNpcPrcInf() {
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
    public void setNpcPrcInf(NPCProcessInformation1 value) {
        this.npcPrcInf = value;
    }

    /**
     * Gets the value of the acsabsSttlmDtlRspnInf property.
     * 
     * @return
     *     possible object is
     *     {@link ACSABSSettlementDetailResponseInformation1 }
     *     
     */
    public ACSABSSettlementDetailResponseInformation1 getACSABSSttlmDtlRspnInf() {
        return acsAbsSttlmDtlRspnInf;
    }

    /**
     * Sets the value of the acsabsSttlmDtlRspnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACSABSSettlementDetailResponseInformation1 }
     *     
     */
    public void setACSABSSttlmDtlRspnInf(ACSABSSettlementDetailResponseInformation1 value) {
        this.acsAbsSttlmDtlRspnInf = value;
    }

	public ACSABSSettlementDetailResponseInformation1 getAcsAbsSttlmDtlRspnInf() {
		return acsAbsSttlmDtlRspnInf;
	}

	public void setAcsAbsSttlmDtlRspnInf(
			ACSABSSettlementDetailResponseInformation1 acsAbsSttlmDtlRspnInf) {
		this.acsAbsSttlmDtlRspnInf = acsAbsSttlmDtlRspnInf;
	}

}
