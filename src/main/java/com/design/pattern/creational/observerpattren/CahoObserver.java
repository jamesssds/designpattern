package com.design.pattern.creational.observerpattren;

public class CahoObserver implements Observer {
    private Subject subject;

    CahoObserver(Subject subject) {
        this.subject = subject;
        this.subject.attact(this);
    }

    @Override
    public void update() {
        System.out.println("通知炒股的"+subject.getAction());
    }
}
