//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:45:42 ���� CST 
//


package com.xml.cnaps2.ccms.v91600101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChngInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChngInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChngCtrl" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}ChngCtrl1"/>
 *         &lt;element name="BkCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Max14Text"/>
 *         &lt;element name="PtcptTp" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Exact2NumericText"/>
 *         &lt;element name="BkCtgyCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Exact3NumericText"/>
 *         &lt;element name="DrctBkCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Max14Text"/>
 *         &lt;element name="LglPrsn" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Max35Text"/>
 *         &lt;element name="HghPtcpt" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Max14Text" minOccurs="0"/>
 *         &lt;element name="BrBkCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Max14Text" minOccurs="0"/>
 *         &lt;element name="ChrgBkCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Max14Text"/>
 *         &lt;element name="NdCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Exact4NumericText"/>
 *         &lt;element name="CityCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Max6NumericText"/>
 *         &lt;element name="PtcptNm" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Max35Text"/>
 *         &lt;element name="PtcptShrtNm" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Max35Text" minOccurs="0"/>
 *         &lt;element name="Sgn" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Exact10NumericText"/>
 *         &lt;element name="Adr" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Max256Text" minOccurs="0"/>
 *         &lt;element name="PstCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Exact6NumericText" minOccurs="0"/>
 *         &lt;element name="Tel" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Max32Text" minOccurs="0"/>
 *         &lt;element name="Email" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Max60Text" minOccurs="0"/>
 *         &lt;element name="RmkInf" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.916.001.01}Max256Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChngInf1", propOrder = {
    "chngCtrl",
    "bkCd",
    "ptcptTp",
    "bkCtgyCd",
    "drctBkCd",
    "lglPrsn",
    "hghPtcpt",
    "brBkCd",
    "chrgBkCd",
    "ndCd",
    "cityCd",
    "ptcptNm",
    "ptcptShrtNm",
    "sgn",
    "adr",
    "pstCd",
    "tel",
    "email",
    "rmkInf"
})
public class ChngInf1 {

    @XmlElement(name = "ChngCtrl", required = true)
    protected ChngCtrl1 chngCtrl;
    @XmlElement(name = "BkCd", required = true)
    protected String bkCd;
    @XmlElement(name = "PtcptTp", required = true)
    protected String ptcptTp;
    @XmlElement(name = "BkCtgyCd", required = true)
    protected String bkCtgyCd;
    @XmlElement(name = "DrctBkCd", required = true)
    protected String drctBkCd;
    @XmlElement(name = "LglPrsn", required = true)
    protected String lglPrsn;
    @XmlElement(name = "HghPtcpt")
    protected String hghPtcpt;
    @XmlElement(name = "BrBkCd")
    protected String brBkCd;
    @XmlElement(name = "ChrgBkCd", required = true)
    protected String chrgBkCd;
    @XmlElement(name = "NdCd", required = true)
    protected String ndCd;
    @XmlElement(name = "CityCd", required = true)
    protected String cityCd;
    @XmlElement(name = "PtcptNm", required = true)
    protected String ptcptNm;
    @XmlElement(name = "PtcptShrtNm")
    protected String ptcptShrtNm;
    @XmlElement(name = "Sgn", required = true)
    protected String sgn;
    @XmlElement(name = "Adr")
    protected String adr;
    @XmlElement(name = "PstCd")
    protected String pstCd;
    @XmlElement(name = "Tel")
    protected String tel;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "RmkInf")
    protected String rmkInf;

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
     * Gets the value of the bkCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkCd() {
        return bkCd;
    }

    /**
     * Sets the value of the bkCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBkCd(String value) {
        this.bkCd = value;
    }

    /**
     * Gets the value of the ptcptTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtcptTp() {
        return ptcptTp;
    }

    /**
     * Sets the value of the ptcptTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtcptTp(String value) {
        this.ptcptTp = value;
    }

    /**
     * Gets the value of the bkCtgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkCtgyCd() {
        return bkCtgyCd;
    }

    /**
     * Sets the value of the bkCtgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBkCtgyCd(String value) {
        this.bkCtgyCd = value;
    }

    /**
     * Gets the value of the drctBkCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrctBkCd() {
        return drctBkCd;
    }

    /**
     * Sets the value of the drctBkCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrctBkCd(String value) {
        this.drctBkCd = value;
    }

    /**
     * Gets the value of the lglPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglPrsn() {
        return lglPrsn;
    }

    /**
     * Sets the value of the lglPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLglPrsn(String value) {
        this.lglPrsn = value;
    }

    /**
     * Gets the value of the hghPtcpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHghPtcpt() {
        return hghPtcpt;
    }

    /**
     * Sets the value of the hghPtcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHghPtcpt(String value) {
        this.hghPtcpt = value;
    }

    /**
     * Gets the value of the brBkCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrBkCd() {
        return brBkCd;
    }

    /**
     * Sets the value of the brBkCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrBkCd(String value) {
        this.brBkCd = value;
    }

    /**
     * Gets the value of the chrgBkCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrgBkCd() {
        return chrgBkCd;
    }

    /**
     * Sets the value of the chrgBkCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChrgBkCd(String value) {
        this.chrgBkCd = value;
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
     * Gets the value of the ptcptNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtcptNm() {
        return ptcptNm;
    }

    /**
     * Sets the value of the ptcptNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtcptNm(String value) {
        this.ptcptNm = value;
    }

    /**
     * Gets the value of the ptcptShrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtcptShrtNm() {
        return ptcptShrtNm;
    }

    /**
     * Sets the value of the ptcptShrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtcptShrtNm(String value) {
        this.ptcptShrtNm = value;
    }

    /**
     * Gets the value of the sgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgn() {
        return sgn;
    }

    /**
     * Sets the value of the sgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgn(String value) {
        this.sgn = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdr(String value) {
        this.adr = value;
    }

    /**
     * Gets the value of the pstCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstCd() {
        return pstCd;
    }

    /**
     * Sets the value of the pstCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstCd(String value) {
        this.pstCd = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the rmkInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmkInf() {
        return rmkInf;
    }

    /**
     * Sets the value of the rmkInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmkInf(String value) {
        this.rmkInf = value;
    }

}