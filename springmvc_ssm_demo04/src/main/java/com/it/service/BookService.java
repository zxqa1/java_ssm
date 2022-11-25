package com.it.service;

import com.it.domain.Book;

import java.util.List;

public interface BookService {
    /**
     * 规范:
     *  1. 方法名见名知义
     *  2. dao返回值为void这里修改为boolean
     *  3. 添加方法说明
     */

    /**
     * 添加
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll();
}
