package com.demo.ccc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Student {
    private static final Log LOGGER = LogFactory.getLog(Student.class);
    private Integer id;
    private Integer studentNo;
    private Grade gradeObj;

    public Student(Integer id, Integer studentNo, Grade gradeObj) {
        LOGGER.info("正在执行 Student 的有参数的构造方法，参数分别为id:" + id + ", studentNo:" + studentNo + ", gradeObj：" + gradeObj);
        this.id = id;
        this.studentNo = studentNo;
        this.gradeObj = gradeObj;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", studentNo=" + studentNo + ", gradeObj=" + gradeObj + "}";
    }
}
