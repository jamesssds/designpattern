package com.design.test.testfactory;

public class PythonFactory implements Factory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
