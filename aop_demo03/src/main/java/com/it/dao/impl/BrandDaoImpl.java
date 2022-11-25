package com.it.dao.impl;

import com.it.dao.BrandDao;
import org.springframework.stereotype.Repository;

@Repository
public class BrandDaoImpl implements BrandDao {
    public void save(){
        System.out.println(System.currentTimeMillis());
        System.out.println(" book dao save ... ");
    }

    public void update(){
        System.out.println("book dao update...");
    }

    public String findNameByID(int id) {
        System.out.println("id: " + id);
        return "itheima";
    }
}
