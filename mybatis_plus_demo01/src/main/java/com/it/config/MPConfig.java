package com.it.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis plus 配置文件
 *  1. 配置分页拦截器
 */
@Configuration // 加载到spring环境中
public class MPConfig {

    @Bean
    public MybatisPlusInterceptor mpInterceptor(){
        // 1. 定义 MP 拦截器
        MybatisPlusInterceptor mp = new MybatisPlusInterceptor();
        // 添加具体的拦截器
        mp.addInnerInterceptor(new PaginationInnerInterceptor());
        return  mp;
    }
}
