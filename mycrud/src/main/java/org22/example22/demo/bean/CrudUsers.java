package org22.example22.demo.bean;

import java.time.LocalDateTime;

public class CrudUsers {
    private int id;
    private String username;
    private String passwd;
    private String ip;
    private String mobile;
    private LocalDateTime create_time;
    private LocalDateTime update_time;

    public CrudUsers(int id, String username, String passwd, String ip, String mobile, LocalDateTime create_time, LocalDateTime update_time) {
        this.id = id;
        this.username = username;
        this.passwd = passwd;
        this.ip = ip;
        this.mobile = mobile;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public LocalDateTime getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDateTime create_time) {
        this.create_time = create_time;
    }

    public LocalDateTime getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(LocalDateTime update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "CrudUsers{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                ", ip='" + ip + '\'' +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
