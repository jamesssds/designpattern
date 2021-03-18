package com.design.princeplle.openclose;

public class Test {
    public static void main(String[] args) {
        //ICourse javaCourse = new JavaCource(96, "java开发", 854d);
        //新增的业务，折扣
        ICourse iCourse = new JavaDiscountCourse(96, "java开发", 854d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程id : "+javaCourse.getId()+
                "课程介绍 ： "+ javaCourse.getName()+"课程价格 : "+javaCourse.getPrice()+"课程原价 : "+javaCourse.getOriginPrice());
    }
}
