//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.29 at 08:17:03 AM CST 
//


package com.cnaps2.xml.iso20022.camt.v05400102;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (com.cnaps2.xml.bind.Cnaps2DataTypeConverter.parseDateTime(value));
    }

    public String marshal(Date value) {
        return (com.cnaps2.xml.bind.Cnaps2DataTypeConverter.printDateTime(value));
    }

}
