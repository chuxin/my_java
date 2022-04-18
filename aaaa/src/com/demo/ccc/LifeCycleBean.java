package com.demo.ccc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class LifeCycleBean implements InitializingBean, DisposableBean {
    private static final Log LOGGER = LogFactory.getLog(LifeCycleBean.class);

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
        return "LifeCycleBean{" +
                "webName='" + webName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    // 初始化回调逻辑
    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("实现接口：InitializingBean 里的内部方法：afterPropertiesSet，无参数");
    }

    // 销毁回调逻辑
    @Override
    public void destroy() throws Exception {
        LOGGER.info("实现接口：DisposableBean 里的内部方法：destroy，无参数");
    }
}
