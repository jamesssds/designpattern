package com.design.princeplle.dependenceinversion;

public class Test {
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyFECourse();
//        geely.studyJavaCourse();
//    }
    //接口注入
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyImmocCourse(new FECourse());
//        geely.studyImmocCourse(new JavaCourse());
//    }
    //构造器注入
//public static void main(String[] args) {
//    Geely geely = new Geely(new FECourse());
//    geely.studyImmocCourse();
//}
    //setter注入
public static void main(String[] args) {
    Geely geely = new Geely();
    geely.setiCourse(new FECourse());
    geely.studyImmocCourse();
}
}
