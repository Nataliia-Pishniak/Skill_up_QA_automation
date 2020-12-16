package com.course.lessons.homeworkLesson4;

public class Trumpet  implements Instruments{
    public int diametr = 30;

    public Trumpet(int diametr) {

        this.diametr = diametr;
    }



    @Override
    public void play() {
        System.out.println("Now plays Trumpet");
    }
}
