package com.design.pattern.creational.observerpattren;

public interface Subject {

    void attact(Observer observer);

    void delete(Observer observer);

    String getAction();

    void notifyOberser();
}
