package com.it.controller;

import com.it.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * SpringMVC
 *  响应页面跳转
 *  响应数据
 */
@RequestMapping("/response")
@Controller
public class ResponseController {

    // 跳转页面
    @RequestMapping("/page")
    public String page(){
        System.out.println("page");
        return "/page.jsp";
    }

    // 响应文本数据(字符串)
    @RequestMapping("/text")
    @ResponseBody
    public String text(){
        System.out.println("text--string");
        return "text";
    }

    // 响应json数据
    // 直接返回对应的pojo,使用注解 @ResponseBody jackson自动处理为json数据
    // 前端接收数据:{
    //    "username": "张三",
    //    "age": 20,
    //    "address": null
    //}
    @RequestMapping("/pojo")
    @ResponseBody
    public User pojo(){
        System.out.println("pojo");
        User user = new User("张三",20);
        return user;
    }

    // 响应json数据
    // 直接返回对应的pojo,使用注解 @ResponseBody jackson自动处理为json数据
    // 前端接收数据: [
    //    {
    //        "username": "张三",
    //        "age": 20,
    //        "address": null
    //    },
    //    {
    //        "username": "张三",
    //        "age": 30,
    //        "address": null
    //    }
    //]
    @RequestMapping("/list")
    @ResponseBody
    public List<User> pojoList(){
        System.out.println("pojoList");
        User user1 = new User("张三",20);
        User user2 = new User("张三",30);
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        return list;
    }
}
