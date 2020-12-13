package com.course.lessons;

import com.course.others.Animal;
import com.course.others.Cat;
import com.course.others.Dog;

public class LessonFourExamples {



    public static void main(String[] args) {

        Dog dog = new Dog ( "Jack");
        Cat cat = new Cat( "Max");

        //Run time polymorphism
        Animal dogTheBoy = new Dog( "TheBoy");
        Animal catTheGirl = new Cat("TheGirl");


        Animal [] animals  = new Animal[2];
        animals [0] = dogTheBoy;
        animals [1] = catTheGirl;

        for (Animal animal: animals){
            animal.tailWagging();
        }


//        dog.tailWagging();
//        cat.tailWagging();
//
//        dog.displayUs ("Nick ", "Jojj ", "male");
//        dog.tailWagging();

    }

}
