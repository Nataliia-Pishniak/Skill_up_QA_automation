package com.course.lessons.eight.homework;

import com.course.pageobjects.homework.PhpTravelPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public abstract class BaseTestHW {

    private WebDriver driver;
    protected PhpTravelPage phpTravelPage;
    private String browser = "chrome";


    @BeforeTest
    public void setupTest() throws Exception {
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                throw new Exception("Browser " + browser + " is not supported");
        }
         phpTravelPage = new PhpTravelPage(driver);

    }
    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }       }
}