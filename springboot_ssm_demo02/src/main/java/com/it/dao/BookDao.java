package com.it.dao;

import com.it.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;
// TODO dao层添加 @Mapper 注解， 以便spring扫描到bean
@Mapper
public interface BookDao {

    @Select("select * from tb_book")
    List<Book> findAll();

    @Select("select * from tb_book where id = #{id}")
    Book findById(Integer id);

    @Insert("insert into tb_book values(null, #{name}, #{type}, #{description})")
    int save(Book book);

    @Update("update tb_book set name = #{name}, type = #{type}, description = #{description} where id = #{id}")
    int updateById(Book book);

    @Delete("delete from tb_book where id = #{id}")
    int deleteById(Integer id);
}
