package com.design.test.testfactory;

public class JavaFactory implements Factory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
