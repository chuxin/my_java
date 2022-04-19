package com.demo.ccc;

public class Employee66 {
    private String empNo;
    private String empName;
    private Dept66 dept;

    public Employee66(String empNo, String empName, Dept66 dept) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "【Employee66】 {" + "empNo=" + empNo + ", empName=" + empName + ", dept=" + dept + "}";
    }
}
