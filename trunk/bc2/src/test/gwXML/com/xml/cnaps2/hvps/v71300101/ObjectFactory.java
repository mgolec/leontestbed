//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.11 at 04:33:52 ���� CST 
//


package com.xml.cnaps2.hvps.v71300101;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xml.cnaps2.hvps.v71300101 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Document_QNAME = new QName("urn:cnaps:std:hvps:2010:tech:xsd:hvps.713.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xml.cnaps2.hvps.v71300101
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SndgAndRcvg1 }
     * 
     */
    public SndgAndRcvg1 createSndgAndRcvg1() {
        return new SndgAndRcvg1();
    }

    /**
     * Create an instance of {@link NPCPrcInf1 }
     * 
     */
    public NPCPrcInf1 createNPCPrcInf1() {
        return new NPCPrcInf1();
    }

    /**
     * Create an instance of {@link ActiveCurrencyAndAmount }
     * 
     */
    public ActiveCurrencyAndAmount createActiveCurrencyAndAmount() {
        return new ActiveCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link GroupHeader1 }
     * 
     */
    public GroupHeader1 createGroupHeader1() {
        return new GroupHeader1();
    }

    /**
     * Create an instance of {@link OrgnlGrpHdr1 }
     * 
     */
    public OrgnlGrpHdr1 createOrgnlGrpHdr1() {
        return new OrgnlGrpHdr1();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link InstdPty1 }
     * 
     */
    public InstdPty1 createInstdPty1() {
        return new InstdPty1();
    }

    /**
     * Create an instance of {@link DtlRspnInf1 }
     * 
     */
    public DtlRspnInf1 createDtlRspnInf1() {
        return new DtlRspnInf1();
    }

    /**
     * Create an instance of {@link Prttn1 }
     * 
     */
    public Prttn1 createPrttn1() {
        return new Prttn1();
    }

    /**
     * Create an instance of {@link InstgPty1 }
     * 
     */
    public InstgPty1 createInstgPty1() {
        return new InstgPty1();
    }

    /**
     * Create an instance of {@link DtlRspnV01 }
     * 
     */
    public DtlRspnV01 createDtlRspnV01() {
        return new DtlRspnV01();
    }

    /**
     * Create an instance of {@link Dtls2 }
     * 
     */
    public Dtls2 createDtls2() {
        return new Dtls2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cnaps:std:hvps:2010:tech:xsd:hvps.713.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

}
