//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:46:15 ���� CST 
//


package com.xml.cnaps2.nets.v35600101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationContent1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationContent1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="NetDbtMgmt" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}NetDebitManagement1"/>
 *           &lt;element name="NetDbtWrngSetng" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}NetDebitWarningSetting1"/>
 *           &lt;element name="RclmPldg" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}ReclaimPledge1"/>
 *           &lt;element name="CdtXtnsnMgmt" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}CreditExtensionManagement1"/>
 *           &lt;element name="ForceDwnErr" type="{urn:cnaps:std:nets:2010:tech:xsd:nets.356.001.01}ForceDownError1"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationContent1", propOrder = {
    "netDbtMgmt",
    "netDbtWrngSetng",
    "rclmPldg",
    "cdtXtnsnMgmt",
    "forceDwnErr"
})
public class NotificationContent1 {

    @XmlElement(name = "NetDbtMgmt")
    protected NetDebitManagement1 netDbtMgmt;
    @XmlElement(name = "NetDbtWrngSetng")
    protected NetDebitWarningSetting1 netDbtWrngSetng;
    @XmlElement(name = "RclmPldg")
    protected ReclaimPledge1 rclmPldg;
    @XmlElement(name = "CdtXtnsnMgmt")
    protected CreditExtensionManagement1 cdtXtnsnMgmt;
    @XmlElement(name = "ForceDwnErr")
    protected ForceDownError1 forceDwnErr;

    /**
     * Gets the value of the netDbtMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link NetDebitManagement1 }
     *     
     */
    public NetDebitManagement1 getNetDbtMgmt() {
        return netDbtMgmt;
    }

    /**
     * Sets the value of the netDbtMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetDebitManagement1 }
     *     
     */
    public void setNetDbtMgmt(NetDebitManagement1 value) {
        this.netDbtMgmt = value;
    }

    /**
     * Gets the value of the netDbtWrngSetng property.
     * 
     * @return
     *     possible object is
     *     {@link NetDebitWarningSetting1 }
     *     
     */
    public NetDebitWarningSetting1 getNetDbtWrngSetng() {
        return netDbtWrngSetng;
    }

    /**
     * Sets the value of the netDbtWrngSetng property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetDebitWarningSetting1 }
     *     
     */
    public void setNetDbtWrngSetng(NetDebitWarningSetting1 value) {
        this.netDbtWrngSetng = value;
    }

    /**
     * Gets the value of the rclmPldg property.
     * 
     * @return
     *     possible object is
     *     {@link ReclaimPledge1 }
     *     
     */
    public ReclaimPledge1 getRclmPldg() {
        return rclmPldg;
    }

    /**
     * Sets the value of the rclmPldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReclaimPledge1 }
     *     
     */
    public void setRclmPldg(ReclaimPledge1 value) {
        this.rclmPldg = value;
    }

    /**
     * Gets the value of the cdtXtnsnMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditExtensionManagement1 }
     *     
     */
    public CreditExtensionManagement1 getCdtXtnsnMgmt() {
        return cdtXtnsnMgmt;
    }

    /**
     * Sets the value of the cdtXtnsnMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditExtensionManagement1 }
     *     
     */
    public void setCdtXtnsnMgmt(CreditExtensionManagement1 value) {
        this.cdtXtnsnMgmt = value;
    }

    /**
     * Gets the value of the forceDwnErr property.
     * 
     * @return
     *     possible object is
     *     {@link ForceDownError1 }
     *     
     */
    public ForceDownError1 getForceDwnErr() {
        return forceDwnErr;
    }

    /**
     * Sets the value of the forceDwnErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceDownError1 }
     *     
     */
    public void setForceDwnErr(ForceDownError1 value) {
        this.forceDwnErr = value;
    }

}