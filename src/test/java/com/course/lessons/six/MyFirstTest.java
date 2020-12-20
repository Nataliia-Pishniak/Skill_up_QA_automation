package com.course.lessons.six;

import org.testng.Assert;
import org.testng.annotations.*;

public class MyFirstTest {

    @BeforeClass
    public void setupClass(){
        System.out.println("Setup Class");
    }

    @BeforeTest
    public void setupTest(){
        System.out.println("Setup Test");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("Setup Method");
    }

    @BeforeSuite
    public void setupSuite(){
        System.out.println("Setup Suite");
    }

    @Test(description = "This is first basic test", priority = 2, enabled = true)
    public void basicTest (){
        System.out.println("First test executed");
        Assert.assertEquals(2,2);
       // System.out.println("Hello TestNg");
    }

    @Test(description = "This is second basic test", priority = 1, enabled = true)
    public void basicTest2 () {
        System.out.println("Second test executed");
        Assert.assertEquals(4, 44);
        //System.out.println("Hello TestNG2");
    }
    @AfterClass
    public void teardownClass(){
        System.out.println("Tear Down Class");
    }

    @AfterTest
    public void teardownTest(){
        System.out.println("Tear Down Test");
    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("Tear Down  Method");
    }

    @AfterSuite
    public void teardownSuite(){
        System.out.println("Tear Down Suite");
    }
}
