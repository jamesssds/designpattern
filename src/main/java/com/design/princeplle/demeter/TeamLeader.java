package com.design.princeplle.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void commandCheckOfCourse(){
        List<Course> courses = new ArrayList<Course>();
        for (int i = 0; i < 20; i++){
            courses.add(new Course());
        }
        System.out.println("在线课程的数量是： "+courses.size());
    }
}
