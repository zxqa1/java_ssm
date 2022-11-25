package com.it.service.impl;

import com.it.dao.BookDao;
import com.it.domain.Book;
import com.it.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public Book findById(Integer id) {
        return bookDao.findById(id);
    }

    @Override
    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    @Override
    public boolean updateById(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    public boolean deleteById(Integer id) {
        return bookDao.deleteById(id) > 0;
    }
}
