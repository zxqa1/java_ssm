package com.it.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 创建 SpringMVC 的配置文件, 加载controller对应的所有 Bean
@Configuration
@ComponentScan("com.it.controller")
public class SpringMVCConfig {
}
