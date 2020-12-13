package com.course.others;

public class Dog extends  Animal implements Action{

// public,package-private, private, protected

    public   String name;

    public Dog (String name){
    this.name = name;
    }
//Static polymorphism (Method overloading)

    public void display (){
        tailWagging();
    }
    public void displayUs(String nick_, String jojj_, String name){
        System.out.println(name);

    }
    public void displayUs (String name, String age){
        System.out.println(name + age);
    }


//Dynamic polymorphism (Method overriding)



    @Override
    public void voice (){
        System.out.println("Say woof");

    }
@Override
    public void walk() {
        System.out.println("Dog can walk");
    }
@Override
    public void jump() {
        System.out.println("Dog can walk");

    }
//





}
