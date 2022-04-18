package com.demo.ccc;

public class ExampleBean {
    // Null值
    private String propertyNull;
    // 空字符串
    private String propertyEmpty;
    // 包含特殊符号的字面量
    private String propertyLiteral;
    private String propertyLiteral22;
    // 依赖的 Bean(对象属性)
    private DependBean dependBean;

    public void setPropertyLiteral22(String propertyLiteral22) {
        this.propertyLiteral22 = propertyLiteral22;
    }

    public void setPropertyNull(String propertyNull) {
        this.propertyNull = propertyNull;
    }

    public void setPropertyEmpty(String propertyEmpty) {
        this.propertyEmpty = propertyEmpty;
    }

    public void setPropertyLiteral(String propertyLiteral) {
        this.propertyLiteral = propertyLiteral;
    }

    public void setDependBean(DependBean dependBean) {
        this.dependBean= dependBean;
    }

    // 使用级联属性赋值时，需提供一个依赖对象的 getXxx() 方法
    public DependBean getDependBean() {
        return dependBean;
    }

    @Override
    public String toString() {
        return "【ExampleBean】{" +
                "propertyNull='" + propertyNull + '\'' +
                "，propertyEmpty='" + propertyEmpty + '\'' +
                "，propertyLiteral='" + propertyLiteral + '\'' +
                "，propertyLiteral22='" + propertyLiteral22 + '\'' +
                "，dependBean='" + dependBean + '\'' +
                '}';
    }
}

