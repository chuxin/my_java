package com.demo.ccc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleBean33 {
    private static final Log LOGGER = LogFactory.getLog(LifeCycleBean33.class);

    private String webName;
    private String url;

    public LifeCycleBean33(String webName, String url) {
        this.webName = webName;
        this.url = url;
    }

    @Override
    public String toString() {
        return "【LifeCycleBean33】 {" +
                "webName='" + webName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    // 初始化回调方法
    @PostConstruct
    public void init() {
        LOGGER.info("在 XML 配置中通过 init-method 属性指定初始化方法：init()");
    }

    // 销毁回调方法
    @PreDestroy
    public void destroy() {
        LOGGER.info("在 XML 配置中通过 destroy-method 属性指定回调方法：destroy()");
    }
}
