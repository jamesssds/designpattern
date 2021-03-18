package com.design.pattern.creational.observerpattren;

import java.util.ArrayList;
import java.util.List;

public class BossSubject implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private String action;
    @Override
    public void attact(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observers.remove(observer);
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String getAction() {
        return action;
    }

    @Override
    public void notifyOberser() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
