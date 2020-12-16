package com.course.others;

public class Printer {

//Generic method

    public <T, S, V, R> void print(T[] data) {
        for (T value : data) {
            System.out.println(value);
        }
    }

    }
