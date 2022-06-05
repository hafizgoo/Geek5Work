package com.hafizgoo.schooolstart;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: hafizgoo
 * @Date: DATE−2022/6/5 - MONTH−06 - DAY−05 - TIME−19:10
 * @Description: com.hafizgoo.schooolstart
 * @version: 1.0
 */

public class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "MyClass::" + students.toString();
    }
}
