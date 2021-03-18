package com.design.test.testfactory;

public class TestMain {
    public static void main(String[] args) {
        Factory javaFactory = new JavaFactory();
        Video video = javaFactory.getVideo();
        video.produce();
    }
}
