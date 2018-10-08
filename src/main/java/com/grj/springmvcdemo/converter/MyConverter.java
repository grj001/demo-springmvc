package com.grj.springmvcdemo.converter;

import org.springframework.core.convert.converter.Converter;

public class MyConverter implements Converter<String, String>{



    @Override
    public String convert(String source) {
        System.out.println("MyConverter进行格式转换...");

        return null;
    }
}
