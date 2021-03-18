package com.design.pattern.creational.adapter;

public class MediaAdpter implements MediaPlay {

    AdvancedPlay advancedPlay;
    MediaAdpter(String audioType){
        if ("mp4".equalsIgnoreCase(audioType)) {
            advancedPlay = new Mp4Player();
        }else if ("vlc".equalsIgnoreCase(audioType)) {
            advancedPlay = new VlcPlayer();
        }

    }

    @Override
    public void play(String audioType, String fileName) {
        if ("mp4".equalsIgnoreCase(audioType)) {
            advancedPlay.mp4Play(fileName);
        }else if ("vlc".equalsIgnoreCase(audioType)) {
            advancedPlay.vlcPlay(fileName);
        }
    }
}
