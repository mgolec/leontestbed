//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:43 ���� CST 
//


package com.xml.cnaps2.ccms.v91700101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CityChngInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CityChngInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChngCtrl" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.917.001.01}ChngCtrl1"/>
 *         &lt;element name="CityCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.917.001.01}Max6NumericText"/>
 *         &lt;element name="CityNm" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.917.001.01}Max35Text"/>
 *         &lt;element name="CityTp" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.917.001.01}Max8Text" minOccurs="0"/>
 *         &lt;element name="NdCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.917.001.01}Exact4NumericText"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityChngInf1", propOrder = {
    "chngCtrl",
    "cityCd",
    "cityNm",
    "cityTp",
    "ndCd"
})
public class CityChngInf1 {

    @XmlElement(name = "ChngCtrl", required = true)
    protected ChngCtrl1 chngCtrl;
    @XmlElement(name = "CityCd", required = true)
    protected String cityCd;
    @XmlElement(name = "CityNm", required = true)
    protected String cityNm;
    @XmlElement(name = "CityTp")
    protected String cityTp;
    @XmlElement(name = "NdCd", required = true)
    protected String ndCd;

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
     * Gets the value of the cityCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCd() {
        return cityCd;
    }

    /**
     * Sets the value of the cityCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCd(String value) {
        this.cityCd = value;
    }

    /**
     * Gets the value of the cityNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityNm() {
        return cityNm;
    }

    /**
     * Sets the value of the cityNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityNm(String value) {
        this.cityNm = value;
    }

    /**
     * Gets the value of the cityTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityTp() {
        return cityTp;
    }

    /**
     * Sets the value of the cityTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityTp(String value) {
        this.cityTp = value;
    }

    /**
     * Gets the value of the ndCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdCd() {
        return ndCd;
    }

    /**
     * Sets the value of the ndCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdCd(String value) {
        this.ndCd = value;
    }

}
