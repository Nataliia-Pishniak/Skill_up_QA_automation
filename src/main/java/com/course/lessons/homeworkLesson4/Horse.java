package com.course.lessons.homeworkLesson4;

public class Horse extends Animal {

    public String horseFavourite = "Oat";

    public Horse(String food, String location) {
        super(food, location,"eee ho hoo");

        this.setLocation("Meadow");
        this.setFood("Grass");
//        this.name = "Bonnya";
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse asks for " + getFood());
    }

    @Override
    public void eat() {
        System.out.println("My food is " + horseFavourite);

    }
}
