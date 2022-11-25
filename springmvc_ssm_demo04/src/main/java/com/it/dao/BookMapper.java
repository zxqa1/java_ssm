package com.it.dao;

import com.it.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookMapper {

    // 添加 save
    @Insert("insert into tb_book (type,name,description) values(#{type},#{name},#{description})")
//    @Insert("insert into tb_book values(null, #{type},#{name},#{description})")
    public int save(Book book);

    // 更新
    @Update("update tb_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public int update(Book book);

    // 删除
    @Delete("delete from tb_book where id = #{id}")
    public int delete(Integer id);

    // 查询单个
    @Select("select id,type,name,description from tb_book where id = #{id}")
    public Book getById(Integer id);

    // 查询全部
    @Select("select * from tb_book")
    public List<Book> getAll();
}
