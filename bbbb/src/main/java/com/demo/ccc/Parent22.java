package com.demo.ccc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Parent22 {
    private static final Log LOGGER = LogFactory.getLog(Parent22.class);
    private Integer gradeId;
    private String gradeName;

    // 无参构造方法, 在没有其他带参构造方法的情况下，可以省略
    public Parent22() {
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    @Override
    public String toString() {
        return "【Parent22】 {" + "gradeId=" + gradeId + ", gradeName=" + gradeName + "}";
    }

}
