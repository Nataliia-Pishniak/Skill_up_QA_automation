package com.course.lessons.homeworkLesson4;


public class Animal {


    public String food;
    public String location;
    public String voice;


    public Animal(String food, String location,String voice) {
        this.food = food;
        this.location = location;
        this.voice = voice;
    }

    public void makeNoise (){
        System.out.println("The animal asks for food");
    }

    public void eat (){

        System.out.println("My food is");

    }

    public void sleep (){

    }


}


