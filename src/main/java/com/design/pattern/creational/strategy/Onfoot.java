package com.design.pattern.creational.strategy;

public class Onfoot implements Strategy {
    @Override
    public void toWorkWay() {
        System.out.println("走路上班！");
    }
}
