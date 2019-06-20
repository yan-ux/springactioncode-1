package com.xml;

import com.auto.soundsystem.CompactDisc;

import java.util.List;

/**
 * @author dongmei.gao
 * @date 2019/5/22 10:57
 */
public class BlankDisc implements CompactDisc {

    private String title ;
    //(英国)披头士四人爵士乐队
    private String artist ;

    private List<String> tracks ;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }


    public void playList() {
        for (String track : tracks){
            System.out.println("track is : " + track);
        }
        System.out.println("XML Playing" + title + " by " + artist);
    }

    public void play() {

        System.out.println("XML Playing" + title + " by " + artist);
    }

}
