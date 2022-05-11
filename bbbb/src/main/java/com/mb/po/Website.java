package com.mb.po;

import java.util.Date;
import java.util.List;

public class Website {
    public int id;
    public String name;
    public String url;
    private int age;
    private String country;

    private Date createtime;

    private Domain domainObj;

    private List<Pages> pagesList;

    @Override
    public String toString() {
        return "Website{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", createtime=" + createtime +
                ", domainObj=" + domainObj +
                ", pagesList=" + pagesList +
                '}';
    }

    public List<Pages> getPagesList() {
        return pagesList;
    }

    public void setPagesList(List<Pages> pagesList) {
        this.pagesList = pagesList;
    }

    public Domain getDomainObj() {
        return domainObj;
    }

    public void setDomainObj(Domain domainObj) {
        this.domainObj = domainObj;
    }

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

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }


}
