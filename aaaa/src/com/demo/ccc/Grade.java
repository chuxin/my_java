package com.demo.ccc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Grade {
    private static final Log LOGGER = LogFactory.getLog(Grade.class);
    private Integer gradeId;
    private String gradeName;

    public Grade(Integer gradeId, String gradeName) {
        LOGGER.info("正在执行 Grade 的有参数的构造方法，参数分别为gradeId:" + gradeId + ", gradeName：" + gradeName);
        this.gradeId = gradeId;
        this.gradeName = gradeName;
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
        return "Grade{" + "gradeId=" + gradeId + ", gradeName=" + gradeName + "}";
    }

}
