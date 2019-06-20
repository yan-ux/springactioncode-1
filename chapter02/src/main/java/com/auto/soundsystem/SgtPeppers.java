package com.auto.soundsystem;

import org.springframework.stereotype.Component;

/**
 * 佩波中士的孤独之心乐队。
 * Component注解：该类会作为组件类，spring会创建bean ; 但组建扫描默认不会开启
 * @author dongmei.gao
 * @date 2019/5/21 9:21
 */
@Component
public class SgtPeppers implements CompactDisc{
    private String title = "Sgt Peppers Lonely Heart Club Band";

    //(英国)披头士四人爵士乐队
    private String artist= "The Beatles";

    public void play() {
        System.out.println("Playing" + title + " by " + artist);
    }

    public void playList() {

    }
}
