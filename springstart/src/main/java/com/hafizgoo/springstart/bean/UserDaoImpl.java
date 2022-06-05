package com.hafizgoo.springstart.bean;

import org.springframework.stereotype.Repository;

/**
 * @Auther: hafizgoo
 * @Date: DATE−2022/6/5 - MONTH−06 - DAY−05 - TIME−17:11
 * @Description: com.hafizgoo.springstart.bean
 * @version: 1.0
 */

@Repository("userDao")
public class UserDaoImpl  implements UserDao{
    @Override
    public void study() {
     System.out.println("user study");
    }
}
