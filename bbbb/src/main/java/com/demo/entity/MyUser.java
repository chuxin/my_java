package com.demo.entity;

public class MyUser {
    private Integer userId;
    private String userName;
    private String status;

    @Override
    public String toString() {
        return "MyUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
