package com.course.lessons.homeworkLesson4;

public class Instrument implements Instruments {

    public String myType;

    public Instrument(String instrumentType ) {
        myType = instrumentType;
    }

    @Override
    public void play() {
        System.out.println("parent played");
    }
}

