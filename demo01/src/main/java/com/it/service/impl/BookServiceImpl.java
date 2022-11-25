package com.it.service.impl;

import com.it.dao.BookDao;
import com.it.dao.impl.BookDaoImpl;
import com.it.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Value("${url}")
    private String url; //"jdbc:mysql://localhost:3306/world"

    @Autowired
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;

    }

    public void save() {
        System.out.println("BookService: save...");
        System.out.println(bookDao);
        bookDao.save();
        System.out.println(url);
    }
}
