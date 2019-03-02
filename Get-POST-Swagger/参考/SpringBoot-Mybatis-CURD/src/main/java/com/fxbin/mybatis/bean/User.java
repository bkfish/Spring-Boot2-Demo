package com.fxbin.mybatis.bean;

import lombok.Data;

import java.util.Date;

/**
 * created with IntelliJ IDEA.
 * author: fxbin
 * date: 2018/10/21
 * time: 5:59
 * version: 1.0
 * description:
 */
@Data
public class User {

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

}
