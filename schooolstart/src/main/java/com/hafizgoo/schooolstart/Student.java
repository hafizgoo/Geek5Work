package com.hafizgoo.schooolstart;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: hafizgoo
 * @Date: DATE−2022/6/5 - MONTH−06 - DAY−05 - TIME−19:11
 * @Description: com.hafizgoo.schooolstart
 * @version: 1.0
 */

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        Map<String, Object> map = new HashMap<>(2);
        map.put("id", id);
        map.put("name", name);
        return "Student::" + map.toString();
    }
}