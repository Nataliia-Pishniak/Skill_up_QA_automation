package com.course.lessons;
import com.course.others.Dog;
import com.course.others.Cat;
import com.course.others.Human;


public class Creatures {

    Dog dog1 = new Dog("Jack");
    Dog dog2 = new Dog("Sharik");
    Cat cat1 = new Cat("Max");

    public static void main(String[] args) {

        Human vasya =new Human ( "Gena", "GaGaGuZa");

        vasya.displayInfo();

    }
}
