package com.design.practice;

public class BImpl extends AbstractStrategyImpl {

    public String getName(){
        return "B";
    }

    @Override
    public void playFootBall() {
        System.out.println("踢球");
    }

    @Override
    public void buyBreakfast() {
        //Do Nothing
    }
}
