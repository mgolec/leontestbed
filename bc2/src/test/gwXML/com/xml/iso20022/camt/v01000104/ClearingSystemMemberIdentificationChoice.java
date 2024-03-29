//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:58 ���� CST 
//


package com.xml.iso20022.camt.v01000104;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingSystemMemberIdentificationChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearingSystemMemberIdentificationChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="USCHU" type="{urn:swift:xsd:camt.010.001.04}CHIPSUniversalIdentifier"/>
 *           &lt;element name="NZNCC" type="{urn:swift:xsd:camt.010.001.04}NewZealandNCCIdentifier"/>
 *           &lt;element name="IENSC" type="{urn:swift:xsd:camt.010.001.04}IrishNSCIdentifier"/>
 *           &lt;element name="GBSC" type="{urn:swift:xsd:camt.010.001.04}UKDomesticSortCodeIdentifier"/>
 *           &lt;element name="USCH" type="{urn:swift:xsd:camt.010.001.04}CHIPSParticipantIdentifier"/>
 *           &lt;element name="CHBC" type="{urn:swift:xsd:camt.010.001.04}SwissBCIdentifier"/>
 *           &lt;element name="USFW" type="{urn:swift:xsd:camt.010.001.04}FedwireRoutingNumberIdentifier"/>
 *           &lt;element name="PTNCC" type="{urn:swift:xsd:camt.010.001.04}PortugueseNCCIdentifier"/>
 *           &lt;element name="RUCB" type="{urn:swift:xsd:camt.010.001.04}RussianCentralBankIdentificationCodeIdentifier"/>
 *           &lt;element name="ITNCC" type="{urn:swift:xsd:camt.010.001.04}ItalianDomesticIdentifier"/>
 *           &lt;element name="ATBLZ" type="{urn:swift:xsd:camt.010.001.04}AustrianBankleitzahlIdentifier"/>
 *           &lt;element name="CACPA" type="{urn:swift:xsd:camt.010.001.04}CanadianPaymentsARNIdentifier"/>
 *           &lt;element name="CHSIC" type="{urn:swift:xsd:camt.010.001.04}SwissSICIdentifier"/>
 *           &lt;element name="DEBLZ" type="{urn:swift:xsd:camt.010.001.04}GermanBankleitzahlIdentifier"/>
 *           &lt;element name="ESNCC" type="{urn:swift:xsd:camt.010.001.04}SpanishDomesticInterbankingIdentifier"/>
 *           &lt;element name="ZANCC" type="{urn:swift:xsd:camt.010.001.04}SouthAfricanNCCIdentifier"/>
 *           &lt;element name="HKNCC" type="{urn:swift:xsd:camt.010.001.04}HongKongBankIdentifier"/>
 *           &lt;element name="AUBSBx" type="{urn:swift:xsd:camt.010.001.04}ExtensiveBranchNetworkIdentifier"/>
 *           &lt;element name="AUBSBs" type="{urn:swift:xsd:camt.010.001.04}SmallNetworkIdentifier"/>
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
@XmlType(name = "ClearingSystemMemberIdentificationChoice", propOrder = {
    "uschu",
    "nzncc",
    "iensc",
    "gbsc",
    "usch",
    "chbc",
    "usfw",
    "ptncc",
    "rucb",
    "itncc",
    "atblz",
    "cacpa",
    "chsic",
    "deblz",
    "esncc",
    "zancc",
    "hkncc",
    "aubsBx",
    "aubsBs"
})
public class ClearingSystemMemberIdentificationChoice {

    @XmlElement(name = "USCHU")
    protected String uschu;
    @XmlElement(name = "NZNCC")
    protected String nzncc;
    @XmlElement(name = "IENSC")
    protected String iensc;
    @XmlElement(name = "GBSC")
    protected String gbsc;
    @XmlElement(name = "USCH")
    protected String usch;
    @XmlElement(name = "CHBC")
    protected String chbc;
    @XmlElement(name = "USFW")
    protected String usfw;
    @XmlElement(name = "PTNCC")
    protected String ptncc;
    @XmlElement(name = "RUCB")
    protected String rucb;
    @XmlElement(name = "ITNCC")
    protected String itncc;
    @XmlElement(name = "ATBLZ")
    protected String atblz;
    @XmlElement(name = "CACPA")
    protected String cacpa;
    @XmlElement(name = "CHSIC")
    protected String chsic;
    @XmlElement(name = "DEBLZ")
    protected String deblz;
    @XmlElement(name = "ESNCC")
    protected String esncc;
    @XmlElement(name = "ZANCC")
    protected String zancc;
    @XmlElement(name = "HKNCC")
    protected String hkncc;
    @XmlElement(name = "AUBSBx")
    protected String aubsBx;
    @XmlElement(name = "AUBSBs")
    protected String aubsBs;

    /**
     * Gets the value of the uschu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSCHU() {
        return uschu;
    }

    /**
     * Sets the value of the uschu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSCHU(String value) {
        this.uschu = value;
    }

    /**
     * Gets the value of the nzncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNZNCC() {
        return nzncc;
    }

    /**
     * Sets the value of the nzncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNZNCC(String value) {
        this.nzncc = value;
    }

    /**
     * Gets the value of the iensc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIENSC() {
        return iensc;
    }

    /**
     * Sets the value of the iensc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIENSC(String value) {
        this.iensc = value;
    }

    /**
     * Gets the value of the gbsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGBSC() {
        return gbsc;
    }

    /**
     * Sets the value of the gbsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGBSC(String value) {
        this.gbsc = value;
    }

    /**
     * Gets the value of the usch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSCH() {
        return usch;
    }

    /**
     * Sets the value of the usch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSCH(String value) {
        this.usch = value;
    }

    /**
     * Gets the value of the chbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHBC() {
        return chbc;
    }

    /**
     * Sets the value of the chbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHBC(String value) {
        this.chbc = value;
    }

    /**
     * Gets the value of the usfw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSFW() {
        return usfw;
    }

    /**
     * Sets the value of the usfw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSFW(String value) {
        this.usfw = value;
    }

    /**
     * Gets the value of the ptncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTNCC() {
        return ptncc;
    }

    /**
     * Sets the value of the ptncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTNCC(String value) {
        this.ptncc = value;
    }

    /**
     * Gets the value of the rucb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUCB() {
        return rucb;
    }

    /**
     * Sets the value of the rucb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUCB(String value) {
        this.rucb = value;
    }

    /**
     * Gets the value of the itncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITNCC() {
        return itncc;
    }

    /**
     * Sets the value of the itncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITNCC(String value) {
        this.itncc = value;
    }

    /**
     * Gets the value of the atblz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATBLZ() {
        return atblz;
    }

    /**
     * Sets the value of the atblz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATBLZ(String value) {
        this.atblz = value;
    }

    /**
     * Gets the value of the cacpa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCACPA() {
        return cacpa;
    }

    /**
     * Sets the value of the cacpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCACPA(String value) {
        this.cacpa = value;
    }

    /**
     * Gets the value of the chsic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHSIC() {
        return chsic;
    }

    /**
     * Sets the value of the chsic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHSIC(String value) {
        this.chsic = value;
    }

    /**
     * Gets the value of the deblz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBLZ() {
        return deblz;
    }

    /**
     * Sets the value of the deblz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBLZ(String value) {
        this.deblz = value;
    }

    /**
     * Gets the value of the esncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESNCC() {
        return esncc;
    }

    /**
     * Sets the value of the esncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESNCC(String value) {
        this.esncc = value;
    }

    /**
     * Gets the value of the zancc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZANCC() {
        return zancc;
    }

    /**
     * Sets the value of the zancc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZANCC(String value) {
        this.zancc = value;
    }

    /**
     * Gets the value of the hkncc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHKNCC() {
        return hkncc;
    }

    /**
     * Sets the value of the hkncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHKNCC(String value) {
        this.hkncc = value;
    }

    /**
     * Gets the value of the aubsBx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUBSBx() {
        return aubsBx;
    }

    /**
     * Sets the value of the aubsBx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUBSBx(String value) {
        this.aubsBx = value;
    }

    /**
     * Gets the value of the aubsBs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUBSBs() {
        return aubsBs;
    }

    /**
     * Sets the value of the aubsBs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUBSBs(String value) {
        this.aubsBs = value;
    }

}
