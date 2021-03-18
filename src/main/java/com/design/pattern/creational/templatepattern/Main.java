package com.design.pattern.creational.templatepattern;

public class Main {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse jack = courseFactory.getCourseByName(JackStudent.class);
        jack.attendClass();

    }
}
