package com.demo.ccc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LifeCycleBean22 {
    private static final Log LOGGER = LogFactory.getLog(LifeCycleBean22.class);

    private String webName;
    private String url;

    public void setWebName(String webName) {
        this.webName = webName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "LifeCycleBean22{" +
                "webName='" + webName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    // 初始化回调方法
    public void init() {
        LOGGER.info("在 XML 配置中通过 init-method 属性指定初始化方法：init()");
    }

    // 销毁回调方法
    public void destroy() {
        LOGGER.info("在 XML 配置中通过 destroy-method 属性指定回调方法：destroy()");
    }
}
