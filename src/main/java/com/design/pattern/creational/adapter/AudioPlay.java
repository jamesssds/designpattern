package com.design.pattern.creational.adapter;

public class AudioPlay implements MediaPlay {
    MediaAdpter mediaAdpter;
    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("播放MP3"+fileName);
        }else if ("mp4".equalsIgnoreCase(audioType)) {
            mediaAdpter = new MediaAdpter(audioType);
            mediaAdpter.play(audioType, fileName);
        }else if ("vlc".equalsIgnoreCase(audioType)) {
            mediaAdpter  = new MediaAdpter(audioType);
            mediaAdpter.play(audioType, fileName);
        }

    }
}
