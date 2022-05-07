package com.mb.po;

import java.util.Date;

public class Website {
    private int id;
    private String name;
    private String url;
    private int age;
    private String country;
    private Date createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
