package com.design.pattern.creational.testdecora;

public abstract class AbstractCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("上课了，大家认真学习");
        studyAfter();
    }

    abstract void studyAfter();
}
