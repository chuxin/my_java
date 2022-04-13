package com.demo.ccc;

public class Employee44 {
    private String empNo;
    private String empName;
    private Dept44 dept;

    public Employee44(String empNo, String empName, Dept44 dept) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "【Employee44】 {" + "empNo=" + empNo + ", empName=" + empName + ", dept=" + dept + "}";
    }
}
