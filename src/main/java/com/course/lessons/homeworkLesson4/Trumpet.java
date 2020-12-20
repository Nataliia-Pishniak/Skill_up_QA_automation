package com.course.lessons.homeworkLesson4;

public class Trumpet  implements Instruments{
    private int qqq = 30;

    public Trumpet(int diametr) {
       this.qqq = diametr;
    }



    @Override
    public void play() {
        System.out.println("Now plays Trumpet");
    }
}
