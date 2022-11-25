package com.it.dao;

import com.it.pojo.User;
//import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

//    @Select("select * from tb_user where id = #{id}")
    User selectByID(int id);
}
