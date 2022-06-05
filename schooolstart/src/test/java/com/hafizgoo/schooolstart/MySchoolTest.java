package com.hafizgoo.schooolstart;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @Auther: hafizgoo
 * @Date: DATE−2022/6/5 - MONTH−06 - DAY−05 - TIME−19:20
 * @Description: com.hafizgoo.schooolstart
 * @version: 1.0
 */


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SchoolAutoConfiguration.class)
public class MySchoolTest {

    @Autowired
    MySchool mySchool;

    @Test
    public void test() {
        System.out.println(mySchool.toString());
    }
}
