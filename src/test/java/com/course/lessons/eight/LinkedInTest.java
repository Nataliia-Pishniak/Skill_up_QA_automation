package com.course.lessons.eight;


import org.testng.annotations.Test;

public class LinkedInTest extends Basetest{


    @Test
    public void linkedinTest (){

        linkedinLoginPage.getPage();
        linkedinLoginPage.login("Test","Test");
        System.out.println();

    }

}
