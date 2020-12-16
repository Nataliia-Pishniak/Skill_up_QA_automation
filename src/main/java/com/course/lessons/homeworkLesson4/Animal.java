package com.course.lessons.homeworkLesson4;


public class Animal {

    private String food;
    private String location;
    private String voice;

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

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public String getVoice() {
        return voice;
    }
}


