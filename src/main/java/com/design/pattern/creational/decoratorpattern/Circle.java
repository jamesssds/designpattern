package com.design.pattern.creational.decoratorpattern;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画了一个圆圈");
    }
}
