package com.course.others;

import java.util.Objects;

public class Human {
    private String firstName;
    private String lastName;
    private int age;
    public static int handCount;

    public void getHandCount() {
        System.out.println(handCount);
    }

    public void setHandCount(int handCount) {
        Human.handCount = handCount;
    }



    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Constructor");

    }

    static {
        System.out.println("Static Block");
    handCount=2;
    }

    public void displayInfo(){
        System.out.println("Name: " + firstName + "  " + "Last Name: " + lastName + age);
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be below 0");
        } else {
            this.age = age;
        }

    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
                Objects.equals(firstName, human.firstName) &&
                Objects.equals(lastName, human.lastName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
