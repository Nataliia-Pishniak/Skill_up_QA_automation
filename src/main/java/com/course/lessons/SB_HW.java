package com.course.lessons;

public class SB_HW {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder ("Hello Winter 2020\n");

        System.out.println(sb);

        sb.append("Yaay");
        System.out.println(sb);

        sb.delete(0,2);
        System.out.println(sb);

        sb.deleteCharAt(7);
        System.out.println(sb);

        sb.insert( 0, 'H');
        System.out.println(sb);

        sb.insert( 8, 't');
        System.out.println(sb);
        sb.replace(1,1, "eee" );

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.reverse();

        System.out.println("substring is = "+sb.substring(8));
        System.out.println("substring is = "+sb.substring(8,14));

    }


}
