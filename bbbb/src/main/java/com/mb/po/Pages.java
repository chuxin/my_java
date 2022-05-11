package com.mb.po;

import java.util.Date;

public class Pages {
    private Integer id;
    private String page_name;
    private String page_content;
    private Date create_date;
    private Integer website_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPage_name() {
        return page_name;
    }

    public void setPage_name(String page_name) {
        this.page_name = page_name;
    }

    public String getPage_content() {
        return page_content;
    }

    public void setPage_content(String page_content) {
        this.page_content = page_content;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Integer getWebsite_id() {
        return website_id;
    }

    public void setWebsite_id(Integer website_id) {
        this.website_id = website_id;
    }

    @Override
    public String toString() {
        return "Pages{" +
                "id=" + id +
                ", page_name='" + page_name + '\'' +
                ", page_content='" + page_content + '\'' +
                ", create_date=" + create_date +
                ", website_id=" + website_id +
                '}';
    }
}
