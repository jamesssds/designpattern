package com.design.pattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {

        VideoFactory videoFactory = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
