package com.design.pattern.creational.decoratorpattern;

public class Main {
    public static void main(String[] args) {

        RedDecorator  circleDecorator = new RedDecorator(new Circle());
        circleDecorator.draw();
        RedDecorator  squareDecorator = new RedDecorator(new Square());
        squareDecorator.draw();
    }
}
