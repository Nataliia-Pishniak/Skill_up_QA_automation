package com.course.lessons.homeworkLesson4;

public class Dog extends Animal {

    public String dogFavourite = "Meat";

    public Dog(String food, String location) {
        super(food, location,"woof");

        this.setLocation("Yard");
        this.setFood("Poddige");
  //         this.name "Barsik";

    }

    @Override
    public void makeNoise() {
        System.out.println("Dog asks for "+ getFood());
    }

    @Override
    public void eat() {
        System.out.println("My food is " + dogFavourite);


    }
}
