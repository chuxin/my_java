package com.demo.ccc;

public class Dept77 {
    //部门编号
    private String deptNo;
    //部门名称
    private String deptName;

    public Dept77() {
        System.out.println("正在执行 Dept77 的无参构造方法>>>>");
    }

    public Dept77(String deptNo, String deptName) {
        System.out.println("正在执行 Dept77 的有参构造方法>>>>");
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    public void setDeptNo(String deptNo) {
        System.out.println("正在执行 Dept 的 setDeptNo 方法>>>>");
        this.deptNo = deptNo;
    }

    public void setDeptName(String deptName) {
        System.out.println("正在执行 Dept 的 setDeptName 方法>>>>");
        this.deptName = deptName;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        return "Dept77 {" +
                "deptNo='" + deptNo + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
