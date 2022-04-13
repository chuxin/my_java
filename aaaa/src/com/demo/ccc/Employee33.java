package com.demo.ccc;

public class Employee33 {
    private String empNo;
    private String empName;
    private Dept33 dept;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Dept33 getDept() {
        return dept;
    }

    public void setDept(Dept33 dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "【Employee33】 {" + "empNo=" + empNo + ", empName=" + empName + ", dept=" + dept + "}";
    }
}
