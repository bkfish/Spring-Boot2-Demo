package com.wj.demo.bean;


import lombok.Data;

@Data
public class LoginDao {
    public LoginDao(){
        this.username="";
        this.password="";
    }
    public LoginDao(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * 用户账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    public String getUsername() {
        return username;
    }



    public void setUsername(String name) {
        this.username = name;
    }


    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;
    }

}


