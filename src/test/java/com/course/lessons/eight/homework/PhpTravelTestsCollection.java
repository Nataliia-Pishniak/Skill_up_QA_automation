package com.course.lessons.eight.homework;

import org.testng.annotations.Test;

public class PhpTravelTestsCollection extends BaseTestHW {


    @Test
    public void phpTravelTest() {

        phpTravelPage.getPhpPage();
        phpTravelPage.clickStoreFld();
        phpTravelPage.selectMobile();
        // phpTravelPage.selectMobile();
        phpTravelPage.hybridApplications();
        phpTravelPage.continue1();

    }
}
