package com.fxbin.mybatis.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fxbin.mybatis.bean.User;
import com.fxbin.mybatis.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * created with IntelliJ IDEA.
 * author: fxbin
 * date: 2018/10/21
 * time: 5:53
 * version: 1.0
 * description:
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 查询全部
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/listAll")
    public Object listAll(@RequestParam(value = "page",defaultValue = "1")int page,
                          @RequestParam(value = "size",defaultValue = "10")int size){
        return userService.listAll(page, size);
    }

    /**
     * 添加数据
     * @param user
     * @return
     */
    @RequestMapping("/insert")
    public int insert (User user){
        return userService.insert(user);
    }

    /**
     * 删除
     * @param userId
     * @return
     */
    @RequestMapping("/remove")
    public int remove(Integer userId){
        return userService.remove(userId);
    }

    /**
     * 修改
     * @param user
     * @return
     */
    @RequestMapping("/update")
    public int update(User user){
        return userService.update(user);
    }

}
