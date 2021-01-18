package com.course.lessons.ten.homeWorkTest2;

import org.testng.annotations.Test;


public class theInternetCollection extends BaseTestHW10 {

    @Test
    public void theInternetTest() { {

        theInternet.clickformAuthentication();
        theInternet.setUserName("admin");
        theInternet.setPassword("admin");
        theInternet.login();
        theInternet.warningMessage();


        }
    }
}