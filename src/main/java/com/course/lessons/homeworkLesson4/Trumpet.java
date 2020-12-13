package com.course.lessons.homeworkLesson4;

public class Trumpet extends Instrument implements Instruments{
    public int diametr = 30;

    public Trumpet(int diametr) {
        super("Trumpet");

        this.diametr = diametr;
    }



    @Override
    public void play() {
        System.out.println("Now plays Trumpet");
    }
}
