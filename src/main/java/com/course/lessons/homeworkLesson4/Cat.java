package com.course.lessons.homeworkLesson4;

public class Cat extends Animal{

    public String catFavourite = "Milk";

    public Cat(String food, String location) {
        super(food,location,"meow");

    this.setLocation("House");
        this.setFood("Mouse");

    }
    @Override
    public void makeNoise (){
        System.out.println("Cat asks for " + getFood());
    }
    @Override

    public void eat (){
        System.out.println("My food is " + catFavourite);

    }

}
