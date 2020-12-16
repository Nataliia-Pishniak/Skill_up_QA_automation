package com.course.lessons.homeworkLesson4;

public class DrumSet  implements Instruments{

    public DrumSet(int size) {
//        super("DrumSet");

        this.size = size;
    }

    public int size = 8;


    @Override
    public void play() {
        System.out.println("Now Play DrumSet");

    }
}
