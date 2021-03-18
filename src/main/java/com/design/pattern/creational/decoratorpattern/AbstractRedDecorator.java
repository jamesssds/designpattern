package com.design.pattern.creational.decoratorpattern;

public abstract class AbstractRedDecorator implements Shape {

    protected Shape shape;

    AbstractRedDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }

}
