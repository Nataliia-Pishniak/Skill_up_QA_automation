package com.course.others;

import com.course.others.Interfaces.Action;

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
