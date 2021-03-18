package com.design.pattern.creational.decoratorpattern;

public class RedDecorator extends AbstractRedDecorator {
    RedDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setBorde();
    }
    private void setBorde() {
        System.out.println("设置红色边界");
    }
}
