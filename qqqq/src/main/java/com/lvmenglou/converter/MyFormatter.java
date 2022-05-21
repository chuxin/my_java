package com.lvmenglou.converter;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Component
public class MyFormatter implements Formatter<Date> {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public String print(Date object, Locale arg1) {
        System.out.println("=======MyFormatter========");
        System.out.println(object);
        return dateFormat.format(object);
    }

    public Date parse(String source, Locale arg1) throws ParseException {
        System.out.println("-------MyFormatter--------");
        System.out.println(source);
        return dateFormat.parse(source);    // Formatter只能对字符串转换
    }
}
