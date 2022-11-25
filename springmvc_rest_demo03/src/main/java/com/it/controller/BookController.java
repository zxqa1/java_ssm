package com.it.controller;

import com.it.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save ==> " + book);
        return "{'module' : 'book save success' }";
    }

    @GetMapping
    public List<Book> getAll(){
        Book book1 = new Book(1,"计算机","SpringMVC入门教程","小试牛刀");
        Book book2 = new Book(2,"计算机","SpringMVC实战教程","一代宗师");
        List<Book> list = new ArrayList<Book>();
        list.add(book1);
        list.add(book2);

        return list;
    }
}
