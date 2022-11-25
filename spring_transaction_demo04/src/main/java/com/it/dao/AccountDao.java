package com.it.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface AccountDao {

    @Update("update tb_account set money = money + #{money} where name = #{name}")
    void inMoney(@Param("name") String name, @Param("money") Double money);

    @Update("update tb_account set money = money - #{money} where name = #{name}")
    void outMoney(@Param("name")String name, @Param("money") Double money);
}
