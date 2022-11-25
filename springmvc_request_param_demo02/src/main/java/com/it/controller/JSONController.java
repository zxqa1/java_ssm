package com.it.controller;

import com.it.pojo.User;
import org.springframework.expression.EvaluationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 接收json数据
 * 1. 导坐标
 * 2. 开启注解 @EnableWebMvc
 */
@Controller
@RequestMapping("/json")
public class JSONController {

    // 集合参数: json格式 ["xxx","xxx"]
    // 参数:["张三","abc","12\"34"]
    // 输出: [张三, abc, 1234]
    @RequestMapping("/json1")
    @ResponseBody
    public String json1(@RequestBody List<String> list){
        System.out.println(list);
        return "json1";
    }

    // pojo: json格式
//    {
//        "key":value,
//        "key":value
//    }
    // 参数:{
    //    "username":"张三",
    //    "age":20,
    //    "address":{
    //        "name":"北京",
    //        "num":33
    //    }
    //}
    // 输出:User{username='张三', age=20, address=Address{name='北京', num=33}}
    @RequestMapping("/json2")
    @ResponseBody
    public String json2(@RequestBody User user){
        System.out.println(user);
        return user.toString();
    }

    // 集合引用类型: json格式
//    [
//    {
//        "key":value,
//        "key":value
//    },
//    {
////        "key":value,
////        "key":value
////    },
//    ]
    // 参数:[
    //    {
    //    "username":"张三",
    //    "age":20,
    //    "address":{
    //        "name":"北京",
    //        "num":33
    //    }
    //},
    //{
    //    "username":"张三2",
    //    "age":20,
    //    "address":{
    //        "name":"北京2",
    //        "num":33
    //    }
    //}
    //]
    // 输出: [User{username='张三', age=20, address=Address{name='北京', num=33}},
    // User{username='张三2', age=20, address=Address{name='北京2', num=33}}]
    @RequestMapping("/json3")
    @ResponseBody
    public String json3(@RequestBody List<User> user){
        System.out.println(user);
        return user.toString();
    }
}
