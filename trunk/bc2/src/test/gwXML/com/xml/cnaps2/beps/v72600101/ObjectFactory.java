//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:51 ���� CST 
//


package com.xml.cnaps2.beps.v72600101;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xml.cnaps2.beps.v72600101 package. 
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

    private final static QName _Document_QNAME = new QName("urn:cnaps:std:beps:2010:tech:xsd:beps.726.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xml.cnaps2.beps.v72600101
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdvanceAccountCheck }
     * 
     */
    public AdvanceAccountCheck createAdvanceAccountCheck() {
        return new AdvanceAccountCheck();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link CheckInformationDetails2 }
     * 
     */
    public CheckInformationDetails2 createCheckInformationDetails2() {
        return new CheckInformationDetails2();
    }

    /**
     * Create an instance of {@link ReceiveDetails1 }
     * 
     */
    public ReceiveDetails1 createReceiveDetails1() {
        return new ReceiveDetails1();
    }

    /**
     * Create an instance of {@link ReceiveDetails2 }
     * 
     */
    public ReceiveDetails2 createReceiveDetails2() {
        return new ReceiveDetails2();
    }

    /**
     * Create an instance of {@link ActiveCurrencyAndAmount }
     * 
     */
    public ActiveCurrencyAndAmount createActiveCurrencyAndAmount() {
        return new ActiveCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link SendDetails2 }
     * 
     */
    public SendDetails2 createSendDetails2() {
        return new SendDetails2();
    }

    /**
     * Create an instance of {@link InstgPty1 }
     * 
     */
    public InstgPty1 createInstgPty1() {
        return new InstgPty1();
    }

    /**
     * Create an instance of {@link Partition1 }
     * 
     */
    public Partition1 createPartition1() {
        return new Partition1();
    }

    /**
     * Create an instance of {@link GroupHeader1 }
     * 
     */
    public GroupHeader1 createGroupHeader1() {
        return new GroupHeader1();
    }

    /**
     * Create an instance of {@link InstdPty1 }
     * 
     */
    public InstdPty1 createInstdPty1() {
        return new InstdPty1();
    }

    /**
     * Create an instance of {@link OriginalGroupHeader1 }
     * 
     */
    public OriginalGroupHeader1 createOriginalGroupHeader1() {
        return new OriginalGroupHeader1();
    }

    /**
     * Create an instance of {@link AccountCheckInformation1 }
     * 
     */
    public AccountCheckInformation1 createAccountCheckInformation1() {
        return new AccountCheckInformation1();
    }

    /**
     * Create an instance of {@link SendDetails1 }
     * 
     */
    public SendDetails1 createSendDetails1() {
        return new SendDetails1();
    }

    /**
     * Create an instance of {@link CheckInformationDetails1 }
     * 
     */
    public CheckInformationDetails1 createCheckInformationDetails1() {
        return new CheckInformationDetails1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cnaps:std:beps:2010:tech:xsd:beps.726.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

}
