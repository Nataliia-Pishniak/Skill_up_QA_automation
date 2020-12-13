package com.course.lessons.homeworkLesson4;

public class Cat extends Animal{

    public String catFavourite = "Milk";

    public Cat(String food, String location) {
        super(food,location,"meoww");

    this.location = "House";
    this.food = "Mouse";

    }
    @Override
    public void makeNoise (){
        System.out.println("Cat asks for " +food);
    }
    @Override

    public void eat (){
        System.out.println("My food is " + catFavourite);

    }

}
