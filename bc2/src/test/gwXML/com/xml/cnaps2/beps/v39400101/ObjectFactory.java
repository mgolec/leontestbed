//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:44:27 ���� CST 
//


package com.xml.cnaps2.beps.v39400101;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xml.cnaps2.beps.v39400101 package. 
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

    private final static QName _Document_QNAME = new QName("urn:cnaps:std:beps:2010:tech:xsd:beps.394.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xml.cnaps2.beps.v39400101
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InstgPty1 }
     * 
     */
    public InstgPty1 createInstgPty1() {
        return new InstgPty1();
    }

    /**
     * Create an instance of {@link CreditorAccount1 }
     * 
     */
    public CreditorAccount1 createCreditorAccount1() {
        return new CreditorAccount1();
    }

    /**
     * Create an instance of {@link Other1 }
     * 
     */
    public Other1 createOther1() {
        return new Other1();
    }

    /**
     * Create an instance of {@link OriginalTransactionInformation1 }
     * 
     */
    public OriginalTransactionInformation1 createOriginalTransactionInformation1() {
        return new OriginalTransactionInformation1();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link CustomerPaymentQueryResponsionInformation1 }
     * 
     */
    public CustomerPaymentQueryResponsionInformation1 createCustomerPaymentQueryResponsionInformation1() {
        return new CustomerPaymentQueryResponsionInformation1();
    }

    /**
     * Create an instance of {@link CustomerPaymentDetails1 }
     * 
     */
    public CustomerPaymentDetails1 createCustomerPaymentDetails1() {
        return new CustomerPaymentDetails1();
    }

    /**
     * Create an instance of {@link InstdPty1 }
     * 
     */
    public InstdPty1 createInstdPty1() {
        return new InstdPty1();
    }

    /**
     * Create an instance of {@link ActiveCurrencyAndAmount }
     * 
     */
    public ActiveCurrencyAndAmount createActiveCurrencyAndAmount() {
        return new ActiveCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link Creditor1 }
     * 
     */
    public Creditor1 createCreditor1() {
        return new Creditor1();
    }

    /**
     * Create an instance of {@link GroupHeader1 }
     * 
     */
    public GroupHeader1 createGroupHeader1() {
        return new GroupHeader1();
    }

    /**
     * Create an instance of {@link BranchIdentification1 }
     * 
     */
    public BranchIdentification1 createBranchIdentification1() {
        return new BranchIdentification1();
    }

    /**
     * Create an instance of {@link CustomerPaymentQueryResponsion }
     * 
     */
    public CustomerPaymentQueryResponsion createCustomerPaymentQueryResponsion() {
        return new CustomerPaymentQueryResponsion();
    }

    /**
     * Create an instance of {@link CreditorAgent1 }
     * 
     */
    public CreditorAgent1 createCreditorAgent1() {
        return new CreditorAgent1();
    }

    /**
     * Create an instance of {@link ResponsionInformation1 }
     * 
     */
    public ResponsionInformation1 createResponsionInformation1() {
        return new ResponsionInformation1();
    }

    /**
     * Create an instance of {@link Identification1 }
     * 
     */
    public Identification1 createIdentification1() {
        return new Identification1();
    }

    /**
     * Create an instance of {@link OriginalGroupHeader1 }
     * 
     */
    public OriginalGroupHeader1 createOriginalGroupHeader1() {
        return new OriginalGroupHeader1();
    }

    /**
     * Create an instance of {@link FinancialInstitutionIdentification1 }
     * 
     */
    public FinancialInstitutionIdentification1 createFinancialInstitutionIdentification1() {
        return new FinancialInstitutionIdentification1();
    }

    /**
     * Create an instance of {@link ClearingSystemMemberIdentification1 }
     * 
     */
    public ClearingSystemMemberIdentification1 createClearingSystemMemberIdentification1() {
        return new ClearingSystemMemberIdentification1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cnaps:std:beps:2010:tech:xsd:beps.394.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

}
