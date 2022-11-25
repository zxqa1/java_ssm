package com.it.controller;

import com.it.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    // 请求参数名与形参名一致
    @RequestMapping("/save")
    @ResponseBody
    public String save(String name){
        System.out.println(name);
        return "张三";
    }

    // 请求参数名与形参名不一致
    // 使用注解 绑定 请求参数与形参关系 @RequestParam
    @RequestMapping("/save1")
    @ResponseBody
    public String save1(@RequestParam("username") String name){
        System.out.println(name);
        return "张三";
    }



    /**
     * 请求参数为POJO
     * 请求参数是 User 属性, springMVC 则自动封装进 user 对象
     * 即,当请求参数与user属性名不一致时,或部分一致时, 只封装对应的请求参数进user对象
     */
    @RequestMapping("/save2")
    @ResponseBody
    public String save2(User user){
        System.out.println(user);
        return "张三";
    }

    /**
     * 请求参数为嵌套POJO -- 即 user类的成员属性是引用类型
     * 请求参数格式为 引用类型.属性名 封装进对应引用类型的属性
     * User{username='null', age=null, address=Address{name='北京', num=null}}
     */
    @RequestMapping("/save3")
    @ResponseBody
    public String save3(User user){
        System.out.println(user);
        return "张三";
    }

    /**
     * 请求参数为数组
     * 请求参数格式为 数组参数名 值即为值
     *
     */
    @RequestMapping("/save4")
    @ResponseBody
    public String save4(String[] num){
        System.out.println(num);
        return "张三";
    }

    /**
     * 请求参数为集合
     * 请求参数格式为 集合参数名 值即为值
     * 需要使用注解 @RequestParam 告诉 SpringMVC 此时是使用集合接收参数, 不是创建一个引用对象, 封装为其属性
     * [1, 张三]
     */
    @RequestMapping("/save5")
    @ResponseBody
    public String save5(@RequestParam List<String> list){
        System.out.println(list);
        return "张三";
    }
}
