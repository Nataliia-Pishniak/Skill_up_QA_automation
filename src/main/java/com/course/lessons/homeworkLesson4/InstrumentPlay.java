package com.course.lessons.homeworkLesson4;

public class InstrumentPlay {

    public static void main(String[] args) {

        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(5);
        instruments[1] = new DrumSet(7);
        instruments[2] = new Trumpet(9);

    for (Instrument bbb:instruments){
            bbb.play();
    }

    }
}
