package com.hafizgoo.springstart.bean;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Auther: hafizgoo
 * @Date: DATE−2022/6/5 - MONTH−06 - DAY−05 - TIME−17:16
 * @Description: com.hafizgoo.springstart.bean
 * @version: 1.0
 */

@Controller("userController")
public class UserController {

    @Resource(name="userService")
    private  UserService userService;

    public  void study(){
        userService.study();
    }
}
