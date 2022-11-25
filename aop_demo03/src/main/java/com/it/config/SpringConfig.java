package com.it.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.it")
@EnableAspectJAutoProxy  // 启动 aspect aop 自动代理
//@PropertySource("jdbc.properties")
//@Import({JDBCConfig.class, MyBatisConfig.class})
// 导入 jdbc(dataSource)配置类 也可在该类加 @Configuration 注解,但需要包扫描注解@ComponentScan扫描到该类所在包
public class SpringConfig {
}
