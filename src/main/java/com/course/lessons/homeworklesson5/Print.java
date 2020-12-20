package com.course.lessons.homeworklesson5;

public class Print {

    public static void main(String[] args) {

    Printable [] printableList = new Printable[2];
                 printableList [0] = new Book ("Mein Kampf");
                 printableList [1] = new Magazine ("Spotlight");

                 for (Printable i: printableList) {

                 i.print();

                 }
    }
//    Instruments[] inst_list = new Instruments[3];
//        inst_list[0] = new Guitar(5);
//        inst_list[1] = new DrumSet(7);
//        inst_list[2] = new Trumpet(9);
//
//    for (Instruments bbb:inst_list){
//            bbb.play();
//    }

}
