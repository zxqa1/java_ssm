package com.it.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.it")
@PropertySource("jdbc.properties")
@Import({JDBCConfig.class, MyBatisConfig.class})
// 导入 jdbc(dataSource)配置类 也可在该类加 @Configuration 注解,但需要包扫描注解@ComponentScan扫描到该类所在包
public class SpringConfig {
}
