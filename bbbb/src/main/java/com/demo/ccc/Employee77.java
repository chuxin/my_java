package com.demo.ccc;

public class Employee77 {
    //员工编号
    private String empNo;
    //员工姓名
    private String empName;
    //部门信息
    private Dept77 dept77;

    public Employee77() {
        System.out.println("正在执行 Employee77 的无参构造方法>>>>");
    }

    public Employee77(String empNo, String empName, Dept77 dept) {
        System.out.println("正在执行 Employee77 的有参构造方法>>>>");
        this.empNo = empNo;
        this.empName = empName;
        this.dept77 = dept;
    }

    public void setEmpNo(String empNo) {
        System.out.println("正在执行 Employee77 的 setEmpNo 方法>>>>");
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        System.out.println("正在执行 Employee77 的 setEmpName 方法>>>>");
        this.empName = empName;
    }

    public void setDept77(Dept77 dept) {
        System.out.println("正在执行 Employee77 的 setDept77 方法>>>>");
        this.dept77 = dept;
    }

    public Dept77 getDept77() {
        return dept77;
    }

    public String getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "Employee77 {" +
                "empNo='" + empNo + '\'' +
                ", empName='" + empName + '\'' +
                ", dept=" + dept77 +
                '}';
    }
}
