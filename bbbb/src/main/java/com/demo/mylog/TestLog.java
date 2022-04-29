package com.demo.mylog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {
    private static final Logger log = LoggerFactory.getLogger(TestLog.class);
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        log.info("自定义消息为：" + message);
    }
}
