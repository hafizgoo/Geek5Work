package com.hafizgoo.springstart.bean;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import javax.annotation.Resource;

/**
 * @Auther: hafizgoo
 * @Date: DATE−2022/6/5 - MONTH−06 - DAY−05 - TIME−17:58
 * @Description: com.hafizgoo.springstart.bean
 * @version: 1.0
 */

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = CD.class)
public class CDTest {

    @Autowired
    private  CD cd;

    @Test
    public   void  test(){
        cd.play();
    }
 }
