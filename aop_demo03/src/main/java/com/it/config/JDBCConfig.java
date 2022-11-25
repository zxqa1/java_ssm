//package com.it.config;
//
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//
//import javax.sql.DataSource;
//
////@Configuration
////// 也可以加@Configuration注解,注明这是一个spring配置类,但需要在主配置类加包扫描注解,扫描到本类所在包, 不太清晰
////// 推荐在 spring 主配置类 使用 @Import 注解 注明该类为 spring 配置类
//public class JDBCConfig {
//
//    @Value("${jdbc.driver}")
//    private String driver;
//
//    @Value("${jdbc.url}")
//    private String url;
//
//    @Value("${jdbc.username}")
//    private String username;
//
//    @Value("${jdbc.password}")
//    private String password;
//
//    /**
//     * 将 Bean DataSource 注入 spring 容器
//     * @return
//     */
//    @Bean
//    public DataSource dataSource(){
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setDriverClassName(driver);
//        druidDataSource.setUrl(url);
//        druidDataSource.setUsername(username);
//        druidDataSource.setPassword(password);
//
//        return druidDataSource;
//    }
//}
