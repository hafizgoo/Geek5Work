package com.hafizgoo.schooolstart;

import java.util.List;

/**
 * @Auther: hafizgoo
 * @Date: DATE−2022/6/5 - MONTH−06 - DAY−05 - TIME−19:11
 * @Description: com.hafizgoo.schooolstart
 * @version: 1.0
 */


public class MySchool {

    private List<MyClass> myClasses;

    public MySchool(List<MyClass> myClasses) {
        this.myClasses = myClasses;
    }

    @Override
    public String toString() {
        return "MyClass::" + myClasses.toString();
    }
}
