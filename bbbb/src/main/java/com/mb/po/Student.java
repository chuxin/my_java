package com.mb.po;

public class Student {
    private int id;
    private String name;
    private int sex;

    private StudentCard studentCard;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", studentCard=" + studentCard +
                '}';
    }
}
