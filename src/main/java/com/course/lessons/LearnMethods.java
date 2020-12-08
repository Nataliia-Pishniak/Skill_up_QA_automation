package com.course.lessons;

public class LearnMethods {

    public static void hello(String message){
        System.out.println(message);
    }

    public static String hello2(String hello){
        return hello +"hello world";
    }

    public static void main(String[] args) {
        hello ("Hello World\n");

        String hello =hello2("Hi");
        hello2 ("Hello World");



    }
}

