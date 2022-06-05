package com.hafizgoo.springstart.bean;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: hafizgoo
 * @Date: DATE−2022/6/5 - MONTH−06 - DAY−05 - TIME−17:13
 * @Description: com.hafizgoo.springstart.bean
 * @version: 1.0
 */

@Service("userService")
public class UserServiceImpl  implements UserService{
    @Resource(name="userDao")
    private  UserDao userDao;

    @Override
    public void study() {
        userDao.study();
    }
}
