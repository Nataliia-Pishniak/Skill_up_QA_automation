package com.course.lessons.seven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MySecondSeleniumTest {

    private WebDriver driver;


    @BeforeTest
    public void setUpTest (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void seleniumTestChrome(){

        driver.get( "https://www.google.com/");
    }
    @AfterMethod
        public void teardown () throws InterruptedException {
            if (driver != null){
            Thread.sleep(5000);
                driver.quit();

            }
        }
}
