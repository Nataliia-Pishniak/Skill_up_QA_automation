package com.course.lessons.six;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyFirstSeleniumTest {

    @Test
    public void seleniumTestChrome(){
    System.setProperty( "webdriver.chrome.driver", "/Users/nataliiap/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.google.com/");
        driver.quit();
    }

    @Test
    public void mozillaTest(){

    System.setProperty( "webdriver.gecko.driver","/Users/nataliiap/Downloads/geckodriver");

        WebDriver driverFox =  new FirefoxDriver();
        driverFox.get( "https://www.google.com/");
        //Closing the browser
        driverFox.quit();
    }
}
