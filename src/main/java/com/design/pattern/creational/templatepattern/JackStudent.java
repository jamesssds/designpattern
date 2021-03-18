package com.design.pattern.creational.templatepattern;

public class JackStudent extends AbstractCourse {

    @Override
    void stand() {
        System.out.println("jack慢吞吞的站起来");
    }

    @Override
    void openBook() {
        System.out.println("jack慢吞吞的打开书本");
    }

    @Override
    void listen() {
        System.out.println("jack上课不听课");
    }
}
