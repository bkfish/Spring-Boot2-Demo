package com.wj.demo.mapper;

import com.wj.demo.bean.LoginDao;
import com.wj.demo.bean.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface UserMapper {


    @Select({
            "select * from user"
    })
    List<User> listAll();

    @Insert({
            "insert into user(`username`, `password`) values(#{username}, #{password})"
    })
    int insert(LoginDao loginDao);

    @Delete({
            "delete from user where id = #{userId}"
    })
    int remove(Integer userId);

    @Update({
            "update user set username = #{username}, password = #{password} where id = #{id}"
    })
    int update(User user);

    @Select({
            "select username from user where username=#{username} and password=#{username}"
    })
  //  String login(@Param("username")String username,@Param("password")String password);
    String login(LoginDao loginDao);

}
