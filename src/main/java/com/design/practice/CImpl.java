package com.design.practice;

public class CImpl extends AbstractStrategyImpl {

    public String getName(){
        return "C";
    }

    @Override
    public void playFootBall() {
        System.out.println("小王上厕所");
        System.out.println("踢球");
    }

    @Override
    public void buyBreakfast() {
        System.out.println("买早餐");
    }
}
