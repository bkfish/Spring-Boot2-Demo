package com.wj.demo.bean;

import lombok.Data;


@Data
public class User {

    public User(){
        this.username="";
        this.password="";
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户账号
     */
    private String username;



    /**
     * 密码
     */
    private String password;




    public String getUserName() {
        return username;
    }



    public void setUserName(String name) {
        this.username = name;
    }


    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;
    }
}

