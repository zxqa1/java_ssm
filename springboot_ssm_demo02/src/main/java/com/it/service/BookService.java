package com.it.service;

import com.it.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional // 开启service层事务
public interface BookService {

    List<Book> findAll();

    Book findById(Integer id);

    boolean save(Book book);

    boolean updateById(Book book);

    boolean deleteById(Integer id);
}
