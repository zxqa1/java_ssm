package com.it.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LogDao {

    @Insert("insert into tb_log (log,createDate,state) values(#{info},now(),#{state})")
    void insertLog(@Param("info") String info, @Param("state") String state);
}
