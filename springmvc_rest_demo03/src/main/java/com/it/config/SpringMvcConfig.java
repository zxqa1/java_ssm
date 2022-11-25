package com.it.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.it")
@EnableWebMvc // 启用 jackson
@Import(SpringMvcSupport.class)
public class SpringMvcConfig {
}
