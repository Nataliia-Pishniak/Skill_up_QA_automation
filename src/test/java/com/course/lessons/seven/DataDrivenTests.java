package com.course.lessons.seven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTests {

    @Test (dataProvider = "data-provider2", dataProviderClass = DataProviderContainer.class)
    public void testingData(String message, int value){
        System.out.println(message+value);
    }

//    @DataProvider (name = "data-provider1")
//    public Object [][] dataProviderMethod (){
//        return new Object[][]{{"My Data: ", 10}, {"Second Data: ", 190}};
//    }


}
