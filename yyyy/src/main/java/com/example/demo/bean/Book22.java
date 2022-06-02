package com.example.demo.bean;

import com.example.demo.mypackages.IsbnDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

public class Book22 {
    public long id;
    public String name;
    public String author;

    // 自定义解析规则
    @JsonDeserialize(using = IsbnDeserializer.class)
    public BigInteger isbn;

    public List<String> tags;
    public LocalDate pubDate;
    public BigDecimal price;
}


