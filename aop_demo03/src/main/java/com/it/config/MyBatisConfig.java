//package com.it.config;
//
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.mapper.MapperScannerConfigurer;
//import org.springframework.context.annotation.Bean;
//
//import javax.sql.DataSource;
//
//public class MyBatisConfig {
//
//    /**
//     * 注入 SqlSessionFactory 使用 mybatis-spring 提供的 SqlSessionFactoryBean
//     * @param dataSource
//     * @return
//     */
//    @Bean
//    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
//        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
////        ssfb.setTypeAliasesPackage("com.it.pojo");
//        ssfb.setDataSource(dataSource);
//        return ssfb;
//    }
//
//    /**
//     * 注入 mybatis 配置文件中 mapper 标签
//     * @return
//     */
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer(){
//        MapperScannerConfigurer msc = new MapperScannerConfigurer();
//        msc.setBasePackage("com.it.dao");
//        return msc;
//    }
//}
