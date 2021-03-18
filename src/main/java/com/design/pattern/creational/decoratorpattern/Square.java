package com.design.pattern.creational.decoratorpattern;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画了一个方形");
    }
}
