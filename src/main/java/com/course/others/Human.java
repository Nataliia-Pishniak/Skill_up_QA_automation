package com.course.others;

public class Human {
    String f;
    String l;

    public Human(String firstName, String lastName){
    this.f = firstName;
    this.l = lastName ;
    }

    public void displayInfo(){
        System.out.println("Name: " +f+"  "+ "Last Name: "+l);
    }


}
