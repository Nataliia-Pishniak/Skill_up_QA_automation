package com.course.others.Interfaces;

public interface Action {


    void walk ();
    void jump ();

    default void run() {
        System.out.println("I can run");

    }

}
