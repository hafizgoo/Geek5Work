package com.hafizgoo.springstart.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: hafizgoo
 * @Date: DATE−2022/6/5 - MONTH−06 - DAY−05 - TIME−16:57
 * @Description: com.hafizgoo.springstart.bean
 * @version: 1.0
 */


public class UserTest{
    public static void main(String[] args){


        //1.XML方式
        User u1 = new User("Tom", 23);
        System.out.println(u1.toString());

        User u2 = new User();
        u2.setName("Jerry");
        u2.setAge(27);
        System.out.println(u2.toString());

        ApplicationContext ac = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
        // 通过构造器注入
        System.out.println(ac.getBean("u1"));
        // 通过setter注入
        System.out.println(ac.getBean("u2"));

        //2.显示装配
        ApplicationContext ac1 = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
        UserController userController = (UserController)ac.getBean("userController");
        userController.study();


    }
}

