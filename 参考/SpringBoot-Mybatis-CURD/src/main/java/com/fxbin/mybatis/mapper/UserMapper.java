package com.fxbin.mybatis.mapper;

import com.fxbin.mybatis.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * created with IntelliJ IDEA.
 * author: fxbin
 * date: 2018/10/21
 * time: 5:55
 * version: 1.0
 * description:
 */
@Mapper
public interface UserMapper {


    @Select({
            "select * from user"
    })
    List<User> listAll();

    @Insert({
            "insert into user(`username`, `password`) values(#{username}, #{password})"
    })
    int insert(User user);

    @Delete({
            "delete from user where id = #{userId}"
    })
    int remove(Integer userId);

    @Update({
            "update user set username = #{username}, password = #{password} where id = #{id}"
    })
    int update(User user);

}
