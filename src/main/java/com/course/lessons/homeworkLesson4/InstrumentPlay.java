package com.course.lessons.homeworkLesson4;

public class InstrumentPlay {

    public static void main(String[] args) {

        Instruments[] inst_list = new Instruments[3];
        inst_list[0] = new Guitar(5);
        inst_list[1] = new DrumSet(7);
        inst_list[2] = new Trumpet(9);

    for (Instruments bbb:inst_list){
            bbb.play();
    }

    }
}
