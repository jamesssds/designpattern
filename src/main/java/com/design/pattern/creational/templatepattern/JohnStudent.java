package com.design.pattern.creational.templatepattern;

public class JohnStudent extends AbstractCourse {

    @Override
    void stand() {
        System.out.println("john立马就站起来来的");
    }

    @Override
    void openBook() {
        System.out.println("john立马就打开书本");
    }

    @Override
    void listen() {
        System.out.println("john认真听讲");
    }
}
