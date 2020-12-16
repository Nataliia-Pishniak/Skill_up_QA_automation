package com.course.lessons.homeworkLesson4;

public class Guitar  implements Instruments{


    public int stringsNum = 5;


    public Guitar(int stringsNum) {
//        super("Guitar" );
        this.stringsNum = stringsNum;
    }

    @Override
    public void play() {
        System.out.println("Now plays Guitar");

   }
}
