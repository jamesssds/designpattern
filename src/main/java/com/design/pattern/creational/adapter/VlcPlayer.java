package com.design.pattern.creational.adapter;

public class VlcPlayer implements AdvancedPlay {
    @Override
    public void mp4Play(String fileName) {

    }

    @Override
    public void vlcPlay(String fileName) {
        System.out.println("播放Vlc视频,播放"+fileName+"视频");
    }
}
