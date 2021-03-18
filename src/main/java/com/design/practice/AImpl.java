package com.design.practice;

public class AImpl extends AbstractStrategyImpl {


    public String getName(){
        return "A";
    }


    @Override
    public void goToSchool(){
        System.out.println("小芳走路去上学");
    }


}
