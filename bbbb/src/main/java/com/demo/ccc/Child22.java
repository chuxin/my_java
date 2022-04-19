package com.demo.ccc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Child22 {
    private static final Log LOGGER = LogFactory.getLog(Child22.class);
    private Integer id;
    private Integer childNo;
    private Parent22 parent22Obj;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChildNo() {
        return childNo;
    }

    public void setChildNo(Integer childNo) {
        this.childNo = childNo;
    }

    public Parent22 getParent22Obj() {
        return parent22Obj;
    }

    public void setParent22Obj(Parent22 parent22Obj) {
        this.parent22Obj = parent22Obj;
    }

    @Override
    public String toString() {
        return "【Child22】 {" + "id=" + id + ", childNo=" + childNo + ", parent22Obj=" + parent22Obj + "}";
    }
}
