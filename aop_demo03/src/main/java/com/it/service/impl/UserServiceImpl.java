package com.it.service.impl;

import com.it.pojo.User;
import com.it.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public User selectByID(int id) {
        return null;
    }

    public void save(){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(" save ..." + i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}