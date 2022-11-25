package com.it.dao.impl;

import com.it.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component // java bean 注入容器 类获取bean
//@Component("bookDao") // java bean 注入容器  id或取 bean
@Scope
public class BookDaoImpl implements BookDao {


    public void save(){
        System.out.println("BookDao: save...");
    }

    @PostConstruct
    public void init(){
        System.out.println("init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy...");
    }
}
