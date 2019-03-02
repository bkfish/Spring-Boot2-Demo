package com.fxbin.mybatis.service;

import com.fxbin.mybatis.bean.User;

import java.util.List;

/**
 * created with IntelliJ IDEA.
 * author: fxbin
 * date: 2018/10/21
 * time: 5:54
 * version: 1.0
 * description:
 */
public interface UserService {

    Object listAll(int page, int size);

    int insert(User user);

    int remove(Integer userId);

    int update(User user);

}
