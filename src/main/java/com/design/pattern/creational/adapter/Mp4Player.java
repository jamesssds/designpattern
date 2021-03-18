package com.design.pattern.creational.adapter;

public class Mp4Player implements AdvancedPlay {
    @Override
    public void mp4Play(String fileName) {
        System.out.println("播放MP4视频,播放"+fileName+"文件");
    }

    @Override
    public void vlcPlay(String fileName) {

    }
}
