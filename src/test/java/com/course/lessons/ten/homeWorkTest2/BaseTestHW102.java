package com.course.lessons.ten.homeWorkTest2;

import com.course.pageobjects.homeworks.homeworkLesson10Test2.TheInternet2;
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

public abstract class BaseTestHW102  {
    private WebDriver driver2;
    protected TheInternet2 theInternet2 ;
    private String browser2 = "chrome";
    protected Properties props;


    @BeforeSuite
    public void setup () throws IOException {
        props = new Properties();
        props.load(new FileInputStream( "/Users/nataliiap/Documents/repo_test/Skill_up_QA_automation/src/main/resources/properties/"+System.getProperty("ENV") +".properties"));
    }

    @BeforeTest
    public void setupTest() throws Exception {
        switch (browser2.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver2 = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver2 = new FirefoxDriver();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver2 = new InternetExplorerDriver();
                break;
            default:
                throw new Exception("Browser " + browser2 + " is not supported");
        }
        theInternet2 = new TheInternet2(driver2);

    }
    @AfterMethod
    public void teardown() {
        if (driver2 != null) {
            driver2.quit();
        }       }
}

