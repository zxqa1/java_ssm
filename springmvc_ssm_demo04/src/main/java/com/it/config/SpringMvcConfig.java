package com.it.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * "com.it.controller" : 扫描 controller
 * "com.it.exception" : 扫描 ProjectExceptionAdvice
 * "com.it.config" : 扫描 SpringMvcSupportConfig
 */
@Configuration
@ComponentScan({"com.it.controller","com.it.exception","com.it.config"})
@EnableWebMvc // 开启 jackson
public class SpringMvcConfig {
    /**
     * 1.配置 SpringMvc 扫描包
     * 2.加类注解 @EnableWebMvc --  开启 jackson
     */
}
