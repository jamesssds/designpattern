package com.design.princeplle.dependenceinversion;

public class Geely {
    ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImmocCourse(){
        iCourse.studyCourse();
    }

}
