package com.it.service;

import com.it.config.SpringConfig;
import com.it.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // 注明 spring 测试 设定专用的类运行器
@ContextConfiguration(classes = SpringConfig.class) // 注明 spring 核心配置类的位置
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSelectByID(){
        User user = userService.selectByID(2);
        System.out.println(user);
    }
}
