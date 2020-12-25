package com.course.lessons.seven.home_work;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class theInterneTherokuappTest {

    private WebDriver driver;


    @BeforeTest
    public void setUpTest (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(dataProvider = "data-provider-first", dataProviderClass = LoginWithDataProvider.class)
    public void test(String userName, String password){
        driver.get( "http://the-internet.herokuapp.com/login");
        WebElement Name = driver.findElement(By.id("username"));
        WebElement passwordTest= driver.findElement(By.name("password"));
        WebElement Login = driver.findElement(By.xpath("//*[contains(@class, 'fa fa-2x fa-sign-in')]"));

        Name.sendKeys(userName);
        passwordTest.sendKeys(password);
        Login.click();


    }
    @AfterTest
    public void burnDown(){
        driver.quit();

    }

}
