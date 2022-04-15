package com.demo.ccc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CollectionObject {
    private static final Log LOGGER = LogFactory.getLog(CollectionObject.class);
    private Integer collId;
    private String collName;

    public void setCollId(Integer collId) {
        this.collId = collId;
    }

    public void setCollName(String collName) {
        this.collName = collName;
    }

    @Override
    public String toString() {
        return "CollectionObject {" +
                "collId=" + collId +
                ", collName='" + collName + '\'' +
                '}';
    }
}
