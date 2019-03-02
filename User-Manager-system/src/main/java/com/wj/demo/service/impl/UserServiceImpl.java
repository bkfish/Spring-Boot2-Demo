package com.wj.demo.service.impl;
import com.wj.demo.bean.LoginDao;
import com.wj.demo.bean.User;
import com.wj.demo.mapper.UserMapper;
import com.wj.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Object listAll(int page, int size) {
        PageHelper.startPage(page, size);
        List<User> userList = userMapper.listAll();
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return pageInfo;
    }

    public int insert(LoginDao loginDao) {
        return userMapper.insert(loginDao);
    }

    @Override
    public int remove(Integer userId) {
        return userMapper.remove(userId);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public String login(LoginDao loginDao) {
        return userMapper.login(loginDao);
    }

}

