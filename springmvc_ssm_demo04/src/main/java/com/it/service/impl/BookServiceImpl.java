package com.it.service.impl;

import com.it.dao.BookMapper;
import com.it.domain.Book;
import com.it.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    /**
     * 规范
     *  1. 返回值为boolean,都返回true, 抛异常时返回false
     */

    @Autowired
    private BookMapper bookMapper;

    public boolean save(Book book) {
        return bookMapper.save(book) > 0;
        // return true;
    }

    public boolean update(Book book) {
        return bookMapper.update(book) > 0;
        //return true;
    }

    public boolean delete(Integer id) {
        return bookMapper.delete(id) > 0;
        //return true;
    }

    public Book getById(Integer id) {
        Book book = bookMapper.getById(id);
        return book;
    }

    public List<Book> getAll() {
        List<Book> bookList = bookMapper.getAll();
        return bookList;
    }
}
