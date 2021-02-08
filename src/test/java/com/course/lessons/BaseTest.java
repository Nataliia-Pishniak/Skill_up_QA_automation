package com.course.lessons;

import com.course.lessons.nine.MvnTest;
import com.course.pageobjects.linkedin.LinkedinHomePage;
import com.course.pageobjects.rozetka.pages.RozetkaHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.util.Properties;
public abstract class BaseTest {
    private WebDriver driver;
    protected LinkedinHomePage linkedinHomePage;
    //    private String browser = "chrome";
    protected Properties props;
    protected RozetkaHomePage rozetkaHomePage;
    protected String userName;
    protected String password;
    private static Logger logger = LogManager.getLogger(MvnTest.class);

    @BeforeSuite
    public void setupTest() throws Exception {
        logger.info("Setup properties");
        props = new Properties();
//      props.load(new FileInputStream( "/Users/nataliiap/Documents/repo_test/Skill_up_QA_automation/src/main/resources/"+System.getProperty("ENV") +".properties"));
        props.load(new FileInputStream("/Users/nataliiap/Documents/repo_test/Skill_up_QA_automation/src/main/resources/properties/dev.properties"));

        logger.info("Setup driver");
        switch (props.getProperty("browser")) {
            case "chrome":
                /* Remote execution
                DesiredCapabilities dc = new DesiredCapabilities();
                dc.setBrowserName("chrome");
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);*/

                //Local execution
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
        logger.info("Initialize pages");
        linkedinHomePage = new LinkedinHomePage(driver);
        rozetkaHomePage = new RozetkaHomePage(driver);
        userName = props.getProperty("userName");
        password = props.getProperty("password");
    }

    @AfterMethod
    public void teardown() {
        logger.info("Shutdown tests....");
        if (driver != null) {
            driver.quit();
        }
    }
}
