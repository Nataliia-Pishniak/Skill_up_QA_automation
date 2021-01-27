package com.course.lessons;

import com.course.pageobjects.LinkedinHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.util.Properties;

public abstract class  BaseTest {
    private WebDriver driver;
    protected LinkedinHomePage linkedinHomePage;
//    private String browser = "chrome";
    protected Properties props;
//    protected LinkedinLoginPage linkedinLoginPage;
    protected String userName;
    protected String password;

    @BeforeSuite
    public void setupTest () throws Exception {
        props = new Properties();
//      props.load(new FileInputStream( "/Users/nataliiap/Documents/repo_test/Skill_up_QA_automation/src/main/resources/"+System.getProperty("ENV") +".properties"));
        props.load(new FileInputStream( "/Users/nataliiap/Documents/repo_test/Skill_up_QA_automation/src/main/resources/dev.properties"));

        switch (props.getProperty("browser")) {
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
                throw new Exception("Browser " + props.getProperty("browser") + " is not supported");
        }
        driver.manage().window().maximize();
        linkedinHomePage = new LinkedinHomePage(driver);
        userName=props.getProperty("userName");
        password=props.getProperty("password");
    }
    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }       }
    }
