package com.design.pattern.creational.strategy;

public class Traffic implements Strategy {
    @Override
    public void toWorkWay() {
        System.out.println("坐公交车上班");
    }
}
