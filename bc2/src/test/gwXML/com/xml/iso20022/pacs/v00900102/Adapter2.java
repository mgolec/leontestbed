//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 05:01:58 ���� CST 
//


package com.xml.iso20022.pacs.v00900102;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (com.cnaps2.xml.bind.Cnaps2DataTypeConverter.parseDateTime(value));
    }

    public String marshal(Date value) {
        return (com.cnaps2.xml.bind.Cnaps2DataTypeConverter.printDateTime(value));
    }

}
