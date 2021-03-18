package com.design.pattern.creational.templatepattern;

public abstract class AbstractCourse implements ICourse {

    abstract void stand();

    abstract void openBook();

    abstract void listen();

    @Override
    public void attendClass() {
        stand();
        openBook();
        listen();
    }
}
