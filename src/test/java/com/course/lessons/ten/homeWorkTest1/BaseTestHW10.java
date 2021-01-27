package com.course.lessons.ten.homeWorkTest1;


import com.course.pageobjects.homeworkLesson10Test1.TheInternet;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class BaseTestHW10  {

    private WebDriver driver;
    protected TheInternet theInternet ;
    private String browser = "chrome";
    protected Properties props;

    @BeforeSuite
    public void setup () throws IOException {
        props = new Properties();
        props.load(new FileInputStream( "/Users/nataliiap/Documents/repo_test/Skill_up_QA_automation/src/main/resources/"+System.getProperty("ENV") +".properties"));
    }

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
        theInternet = new TheInternet(driver);

    }
    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }       }
}

