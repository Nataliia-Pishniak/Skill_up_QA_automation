package com.course.lessons;

import com.course.others.Animal;
//import com.course.others.Cat;
import com.course.others.Cat;
import com.course.others.Dog;
import com.course.others.Human;
import com.course.others.enums.Day;

import static com.course.others.enums.Day.SATURDAY;

public class LessonFour {


    public static void main(String[] args) {

        Human human =new Human("Michael", "Jackson");
        human.setAge(20) ;
        System.out.println( "My age is: "+ human.getAge());



        Dog dog = new Dog ( "Jack");
        Cat cat = new Cat( "Max");
        dog.tailWagging();
        cat.tailWagging();
        dog.voice();
        cat.voice();
        dog.jump();
        dog.walk();
        cat.jump();
        cat.walk();
        cat.run();



        //ENUM EXAMPLE

        Day currentDay  = SATURDAY;
        System.out.println(currentDay);

        switch (currentDay){

            case MONDAY:
                System.out.println("Toady is MON");
                break;
            case TUESDAY:
                System.out.println("Toady is TUE");
                break;
            case WEDNESDAY:
                System.out.println("Toady is WED");
                break;
            case THURSDAY:
                System.out.println("Toady is THU");
                break;
            case FRIDAY:
                System.out.println("Toady is FRD");
                 break;
            case SATURDAY:
                System.out.println("Toady is SAT");
                break;
            case SUNDAY:
                System.out.println("Toady is SUN");
                break;
            default:
                System.out.println("Unknown");


        }

    // Animal animal = new Animal();

    }

}


