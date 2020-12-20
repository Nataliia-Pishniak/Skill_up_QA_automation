package com.course.lessons.homeworkLesson4;

public class Person {
    private String name;
    private String lastName;
    private int sex;

    public String getName() {

        if (this.name=="Oleg")
            return "Natasha"; else
        return this.name;
    }

    public Person(String name, String lastName, int sex) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
    }
}
