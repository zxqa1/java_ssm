package com.it.controller;

import com.it.code.Code;
import com.it.domain.Book;
import com.it.service.BookService;
import com.it.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public Result findAll(){
        List<Book> books = bookService.findAll();
        return new Result(books != null ? Code.SELECT_OK : Code.SELECT_ERR, books, books != null ? "success" : "fail");
    }

    @GetMapping("/{id}")
    public Result findById(@PathVariable Integer id){
        Book book = bookService.findById(id);
        return new Result(book != null ? Code.SELECT_OK : Code.SELECT_ERR, book,
                book != null ? "success" : "fail");
    }

    @PostMapping
    public Result save(@RequestBody Book book){
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.INSERT_OK : Code.INSERT_ERR, null, flag ? "success" : "fail");
    }

    @PutMapping
    public Result updateById(@RequestBody Book book){
        System.out.println(book);
        boolean flag = bookService.updateById(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, null, flag ? "success" : "fail");
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id){
        boolean flag = bookService.deleteById(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,null,flag? "success" : "fail");
    }
}
