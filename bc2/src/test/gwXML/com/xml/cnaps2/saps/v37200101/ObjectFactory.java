//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 08:46:56 ���� CST 
//


package com.xml.cnaps2.saps.v37200101;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xml.cnaps2.saps.v37200101 package. 
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

    private final static QName _Document_QNAME = new QName("urn:cnaps:std:saps:2010:tech:xsd:saps.372.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xml.cnaps2.saps.v37200101
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link AmountWarningSetting1 }
     * 
     */
    public AmountWarningSetting1 createAmountWarningSetting1() {
        return new AmountWarningSetting1();
    }

    /**
     * Create an instance of {@link AccountMaintenanceApplication1 }
     * 
     */
    public AccountMaintenanceApplication1 createAccountMaintenanceApplication1() {
        return new AccountMaintenanceApplication1();
    }

    /**
     * Create an instance of {@link ProtocolStatus1 }
     * 
     */
    public ProtocolStatus1 createProtocolStatus1() {
        return new ProtocolStatus1();
    }

    /**
     * Create an instance of {@link AccountManagementNotificationInformation1 }
     * 
     */
    public AccountManagementNotificationInformation1 createAccountManagementNotificationInformation1() {
        return new AccountManagementNotificationInformation1();
    }

    /**
     * Create an instance of {@link FundsOfPoolManagement1 }
     * 
     */
    public FundsOfPoolManagement1 createFundsOfPoolManagement1() {
        return new FundsOfPoolManagement1();
    }

    /**
     * Create an instance of {@link NotificationContent1 }
     * 
     */
    public NotificationContent1 createNotificationContent1() {
        return new NotificationContent1();
    }

    /**
     * Create an instance of {@link SettlementAccountStatus1 }
     * 
     */
    public SettlementAccountStatus1 createSettlementAccountStatus1() {
        return new SettlementAccountStatus1();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link AcctMgmtNtfctnV01 }
     * 
     */
    public AcctMgmtNtfctnV01 createAcctMgmtNtfctnV01() {
        return new AcctMgmtNtfctnV01();
    }

    /**
     * Create an instance of {@link InstdPty1 }
     * 
     */
    public InstdPty1 createInstdPty1() {
        return new InstdPty1();
    }

    /**
     * Create an instance of {@link InstgPty1 }
     * 
     */
    public InstgPty1 createInstgPty1() {
        return new InstgPty1();
    }

    /**
     * Create an instance of {@link PledgeFinancingModel1 }
     * 
     */
    public PledgeFinancingModel1 createPledgeFinancingModel1() {
        return new PledgeFinancingModel1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cnaps:std:saps:2010:tech:xsd:saps.372.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

}