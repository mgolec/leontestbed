package com.topfinance.converter;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.beanutils.Converter;
import org.jpos.iso.ISODate;

public class XMLGregorianCalendarConverter implements Converter {
    
    private void info(String msg) {
        System.out.println(msg);
    }
    public Object convert(Class type, Object value) {
        if (value == null) {
            return null;
        }

        if (value instanceof XMLGregorianCalendar  ) {
            return (value);
        }

        XMLGregorianCalendar res = null;
        if(value instanceof String) {
            
            Date dd = null;
            try {
                // TODO
                dd = ISODate.parseISODate((String)value);
            } catch (Exception ex) {
                info("in[XMLGregorianCalendarConverter] failed to convert to ISODate from a value="+value);
                dd = new Date();
            }
            
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(dd);
            
            res = new XMLGregorianCalendarImpl();
            res.setYear(calendar.get(Calendar.YEAR));
            res.setMonth(calendar.get(Calendar.MONTH) +1);
            res.setDay(calendar.get(Calendar.DAY_OF_MONTH));
            res.setHour(calendar.get(Calendar.HOUR_OF_DAY));
            res.setMinute(calendar.get(Calendar.MINUTE));
            res.setSecond(calendar.get(Calendar.SECOND));
            res.setMillisecond(calendar.get(Calendar.MILLISECOND));
            res.setTimezone(calendar.get(Calendar.ZONE_OFFSET) / 60000 );
            
            
        }
        return res;
        
//        try {
//            return (new BigDecimal  (value.toString()));
//        } catch (Exception   e) {
//            if (useDefault) {
//                return (defaultValue);
//            } else {
//                throw new ConversionException(e);
//            }
//        }
    }

}
