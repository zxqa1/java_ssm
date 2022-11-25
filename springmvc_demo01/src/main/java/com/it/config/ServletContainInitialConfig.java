package com.it.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

// Servlet 容器的初始化类, 加载 SpringMVC 配置文件到 Servlet 容器中
public class ServletContainInitialConfig extends AbstractDispatcherServletInitializer {
    // 加载 SpringMVC 配置
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(SpringMVCConfig.class);
        return webApplicationContext;
    }

    // 设置哪些请求归属SpringMVC处理
    protected String[] getServletMappings() {
        return new String[]{"/"}; // 表示所有请求都由SpringMVC处理
    }

    // 加载 Spring 容器配置
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
