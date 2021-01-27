package com.course.lessons.ten.homeWorkTest1;
import org.testng.annotations.Test;

public class TheInternetCollection extends BaseTestHW10 {

    @Test
    public void theInternetTest() {
        theInternet.getPageInternet();
        theInternet.clickform();
        theInternet.setUserName(props.getProperty("userName"));
        theInternet.setPassword(props.getProperty("password"));
        theInternet.login();
        theInternet.warningMessage();
        long threadId = Thread.currentThread().getId();
        System.out.println("First test thread: "+threadId);
        }
    }
