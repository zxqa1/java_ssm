package com.it.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration  // 注明该类为Spring核心配置类
@ComponentScan("com.it") // 注明 bean 扫描包
@PropertySource("properties.properties") // 加载配置文件
public class SpringConfiguration {
}
