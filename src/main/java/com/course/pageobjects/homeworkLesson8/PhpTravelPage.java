package com.course.pageobjects.homeworkLesson8;
// С помощью Page Object и Page Factory открыть https://phptravels.org/,
// перейти в раздел Store -> Mobile,
// выбрать чекбокc Hybrid Applications и нажать Continue,

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class  PhpTravelPage extends BasePhpTravelPage {


    @FindBy(xpath = " //*[@id='Primary_Navbar-Store']")
    private WebElement storeFld;

    @FindBy(xpath = "//*[@id='Primary_Navbar-Store-Mobile']")
    private WebElement Mobile;

    @FindBy(xpath =" //*[@id='pid41']" )
    private WebElement HybridApplications;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-lg']")
    private WebElement Continue;

    private WebDriver driver;

    public PhpTravelPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickStoreFld (){
        storeFld.click();
    }

    public void selectMobile (){
        Mobile.click();

    }

    public void hybridApplications (){
        HybridApplications.click ();
    }

    public void continue1 (){
        Continue.click ();}

    @Override
        public void getPhpPage (){
        driver.get("https://phptravels.org/clientarea.php");

    }
    }
