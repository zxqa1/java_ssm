package com.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Integer id){
        System.out.println("id ==> " + id);
        return "spring boot!";
    }

}
