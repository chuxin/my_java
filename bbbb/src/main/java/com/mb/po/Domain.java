package com.mb.po;

import java.util.Date;

public class Domain {
    private Integer id;
    private String domain_name;
    private String domain_author;
    private Date begin_date;
    private Date end_date;

    @Override
    public String toString() {
        return "Domain{" +
                "id=" + id +
                ", domain_name='" + domain_name + '\'' +
                ", domain_author='" + domain_author + '\'' +
                ", begin_date=" + begin_date +
                ", end_date=" + end_date +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDomain_name() {
        return domain_name;
    }

    public void setDomain_name(String domain_name) {
        this.domain_name = domain_name;
    }

    public String getDomain_author() {
        return domain_author;
    }

    public void setDomain_author(String domain_author) {
        this.domain_author = domain_author;
    }

    public Date getBegin_date() {
        return begin_date;
    }

    public void setBegin_date(Date begin_date) {
        this.begin_date = begin_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }


}
