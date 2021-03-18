package com.design.pattern.creational.observerpattren;

public class WatchObserver implements Observer {

    private Subject subject;

    WatchObserver(Subject subject){
        this.subject = subject;
        this.subject.attact(this);
    }

    @Override
    public void update() {
        System.out.println("通知看球赛的"+subject.getAction());
    }
}
