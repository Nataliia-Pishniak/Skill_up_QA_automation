package com.course.lessons.ten.homeWorkTest2;

import org.testng.annotations.Test;

public class TheInternetCollection2 extends BaseTestHW102 {


    @Test
    public void theInternetTest2() {
        theInternet2.getPageInternet2();
        theInternet2.clickform2();
        theInternet2.setUserName2(props.getProperty("userName"));
        theInternet2.setPassword2(props.getProperty("password"));
        theInternet2.login2();
        theInternet2.warningMessage2();
        long threadId = Thread.currentThread().getId();
        System.out.println("Second test thread: "+threadId);
    }
}