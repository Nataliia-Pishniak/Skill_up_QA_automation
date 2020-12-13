package com.course.others;

 public class Cat extends Animal implements Action {

     public Object makeNoise;
     private String name;

  public Cat(String name) {
   this.name = name;
  }

  public void catTailWagging (){
  tailWagging();
  }


     @Override
     public void walk() {

     }

     @Override
     public void jump() {

     }

     @Override
     public void run() {

     }

     @Override
     public void voice() {

     }
 }
