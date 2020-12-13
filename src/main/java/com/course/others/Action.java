package com.course.others;

public interface Action {


    void walk ();
    void jump ();

    default void run() {
        System.out.println("I can run");

    }

}
