package com.wj.demo.service;


import com.wj.demo.bean.LoginDao;
import com.wj.demo.bean.User;

public interface UserService {

    Object listAll(int page, int size);

    int insert(LoginDao loginDao);

    int remove(Integer userId);

    int update(User user);

    String login(LoginDao loginDao);

}

