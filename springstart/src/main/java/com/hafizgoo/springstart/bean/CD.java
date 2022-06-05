package com.hafizgoo.springstart.bean;

import org.springframework.stereotype.Component;

/**
 * @Auther: hafizgoo
 * @Date: DATE−2022/6/5 - MONTH−06 - DAY−05 - TIME−17:34
 * @Description: com.hafizgoo.springstart.bean
 * @version: 1.0
 */
    @Component
    public class CD{

        private String title="";
        private String artist="";

    public CD() {
        this.title = "稻香";
        this.artist = "周杰伦";
    }

    public void play(){
            System.out.println("CD开始播放"+artist+"演唱的"+title+"...童年的纸飞机飞回我手里...");
        }
}

