package com.it.controller;

import com.it.domain.Book;
import com.it.exception.BusinessException;
import com.it.exception.SystemException;
import com.it.service.BookService;
import com.it.vo.Code;
import com.it.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 封装数据的 controller 层
 */
@RestController
@RequestMapping("/books_result")
public class BookControllerResult {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);

    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);

    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable("id") Integer id) {
        // 业务异常
        if (id<0){
            throw new BusinessException(Code.Business_ERR,"id非法");
        }
        // 系统异常
        if (id==1){
            try{
                int i = 1/0;
            }catch (Exception e){
                throw new SystemException(Code.System_ERR,"系统异常",e);

            }
        }
        // 其他异常
        if (id==2){
            int[] arr = new int[5];
            arr[8] = 0;
        }
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String msg = book != null ? "success" : "error";
        return new Result(code,book,msg);
    }

    @GetMapping
    public Result getAll() {
        System.out.println("1111");
        List<Book>  book = bookService.getAll();
        Integer code = book != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String msg = book != null ? "success" : "error";
        return new Result(code,book,msg);
    }
}
