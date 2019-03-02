package com.wj.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.wj.demo.bean.LoginDao;
import com.wj.demo.service.UserService;
import com.wj.demo.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(description = "用户管理接口")
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
    @GetMapping("/listAll")
    @ApiOperation(value = "查询全部")
    public Object listAll(@RequestParam(value = "page",defaultValue = "1")int page,
                          @RequestParam(value = "size",defaultValue = "10")int size){
        return userService.listAll(page, size);
    }

    /**
     * 添加数据
     * @param loginDao
     * @return
     */
    @ApiOperation(value = "添加用户")
    @PostMapping("/insert")
    public int insert (@RequestBody LoginDao loginDao){
        return userService.insert(loginDao);
    }

    /**
     * 删除
     * @param userId
     * @return
     */
    @DeleteMapping("/removeById")
    @ApiOperation(value = "根据id删除用户")
    public int remove(Integer userId){
        return userService.remove(userId);
    }

    /**
     * 修改
     * @param user
     * @return
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改用户")
    public int update(@RequestBody User user){
        return userService.update(user);
    }


    /**
     * 登录
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "用户登录")
    public JSONObject login(@RequestBody LoginDao loginDao) {
        JSONObject result = new JSONObject();
        String tname = userService.login(loginDao);
        if(tname == null){
            result.put("loginStatus","fail");
        }else{
            result.put("loginStatus","success");
        }
        return  result;
    }

}

