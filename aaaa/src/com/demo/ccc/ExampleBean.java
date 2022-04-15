package com.demo.ccc;

public class ExampleBean {
    private String propertyNull;
    private String propertyEmpty;
    private String propertyLiteral;
    private String propertyLiteral22;

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

    @Override
    public String toString() {
        return "【ExampleBean】{" +
                "propertyNull='" + propertyNull + '\'' +
                "，propertyEmpty='" + propertyEmpty + '\'' +
                "，propertyLiteral='" + propertyLiteral + '\'' +
                "，propertyLiteral22='" + propertyLiteral22 + '\'' +
                '}';
    }
}

