package com.design.princeplle.singleresponsibility;

public class bird {
    public void mainMoveMode(String birdName){
        //平常添加业务功能，容易杂乱
//        if("鸵鸟".equals(birdName)){
//            System.out.println(birdName+"用脚走");
//        }else{
//            System.out.println(birdName+"用翅膀飞");
//        }
        System.out.println(birdName+"用翅膀飞");
    }
}
