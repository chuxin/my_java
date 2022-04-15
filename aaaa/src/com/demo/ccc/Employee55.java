package com.demo.ccc;

public class Employee55 {
    private String empNo;
    private String empName;
    private Dept55 dept;

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDept(Dept55 dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "【Employee55】 {" + "empNo=" + empNo + ", empName=" + empName + ", dept=" + dept + "}";
    }
}
