package com.course.lessons.seven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderContainer {



    @DataProvider(name = "data-provider1")
    public Object [][] dataProviderMethod1 (){
        return new Object[][]{{"My data: ", 10}, { "My data: ", 100}};
    }
    @DataProvider(name = "data-provider2")
    public Object [][] dataProviderMethod2 (){
        return new Object[][]{{"My data: ", 33}, { "My data: ", 500}};
    }
    @DataProvider(name = "data-provider3")
    public Object [][] dataProviderMethod3 (){
        return new Object[][]{{"My data: ", 10}, { "My data: ", 100}};
    }
}
