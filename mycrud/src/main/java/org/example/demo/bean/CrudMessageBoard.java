package org.example.demo.bean;

import java.sql.Clob;
import java.sql.Date;

public class CrudMessageBoard {
    private int m_id;
    private String title;
    private Clob content;
    private String author;
    private String category;
    private Date create_time;
    private Date updateTime;

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Clob getContent() {
        return content;
    }

    public void setContent(Clob content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "CrudMessageBoard{" +
                "m_id=" + m_id +
                ", title='" + title + '\'' +
                ", content=" + content +
                ", author='" + author + '\'' +
                ", category=" + category +
                ", create_time=" + create_time +
                ", updateTime=" + updateTime +
                '}';
    }
}
