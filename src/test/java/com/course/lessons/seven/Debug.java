package com.course.lessons.seven;

public class Debug {

    public static void main(String[] args) {


        int[] myArray = new int[10];
        myArray[0] = 1;
        myArray[1] = 5;
        myArray[2] = 10;
        myArray[3] = 15;
        myArray[4] = 28;
        myArray[5] = 25;
        myArray[6] = 30;
        myArray[7] = 16;
        myArray[8] = 96;
        myArray[9] = 54;

        for (int value: myArray) {
            System.out.println(value);
        }

    }
}
