package com.course.lessons.homeworklesson5;

public class Magazine implements Printable {

    public String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {

        System.out.println("Magazine"+name);

    }
}
