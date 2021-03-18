package com.design.practice;

public abstract class AbstractStrategyImpl implements GoClassStrategy, GoSchoolWayStrategy, PlayFootBall, BuyBreakfast {


    public void goOut(){
        System.out.println("出门");
        goToSchool();
        buyBreakfast();
        goClass();
        playFootBall();
    }


    @Override
    public void goClass() {
        System.out.println("上课");
    }

    @Override
    public void goToSchool() {
        System.out.println("打车去上学");
    }

    @Override
    public void playFootBall() {
        //Do Nothing
    }

    @Override
    public void buyBreakfast() {
        //Do Nothing
    }
}
