package com.mb.po;

import java.util.Date;

public class StudentCard {
    private int id;
    private int studentId;
    private Date startDate;
    private Date endDate;

    @Override
    public String toString() {
        return "StudentCard{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
