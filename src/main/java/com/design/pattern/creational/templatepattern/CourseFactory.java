package com.design.pattern.creational.templatepattern;

public class CourseFactory {

    public ICourse getCourseByName(Class c) {
        try {
            return (ICourse)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;

    }
}
