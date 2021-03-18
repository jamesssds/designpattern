package com.design.pattern.creational.adapter;

public class Main {
    public static void main(String[] args) {
        MediaPlay audioPlay = new AudioPlay();
        audioPlay.play("mp4", "张学友");
        audioPlay.play("mp3", "周杰伦");
    }
}
