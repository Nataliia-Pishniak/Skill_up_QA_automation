package com.course.lessons;

public class LessonOne {

    public static void main(String[] args) {
        int x;
        x = 5;
        int a, b, c;
        final int z = 5;


        boolean boolT = true, boolF = false;

        //byte -128 to 127and w 1 byte.
        byte bt = 100;

        //-32768 to 32767;
        short shrt = 32767;

        //-2147483648 to 2147483647
        int intenger = 2147483647;

        //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long long1 = 9223372036854775807L;

        //
        double dbl = 8.5;
        float flt = 2.6F;

        char chr = 'c';
        char one = 223;

        String file = "text \n text1";
        System.out.println(file);

        String file2 = "Hello December\nHello Winter 2020";
        System.out.println(file2);

        int ab = 42;
        StringBuilder sb = new StringBuilder(40);

        String s = sb.append("a = ").append(ab).append("!").toString();
        System.out.println(s);
    }


    }



