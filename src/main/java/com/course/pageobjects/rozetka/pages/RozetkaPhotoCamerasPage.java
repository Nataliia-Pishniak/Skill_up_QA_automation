package com.course.pageobjects.rozetka.pages;

import com.course.pageobjects.rozetka.components.CompareComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RozetkaPhotoCamerasPage extends BasePage {

    @FindBy(xpath = "//*[@class='compare-button']")
    List<WebElement> favouritesList;
    @FindBy(xpath = "//*[@class='goods-tile__heading' and @href='https://rozetka.com.ua/ua/canon_2680c060aa/p39995696/']")
    private WebElement camera;
    @FindBy(xpath = "//*[@class='header-actions__button-icon']")
    private WebElement compareBtn;
    public CompareComponent compareComponent;

    private WebDriver driver;

    public RozetkaPhotoCamerasPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
        compareComponent = new CompareComponent(driver);
        waitUntilPageIsLoaded();
    }

    @Override
    public void getPage() {
        driver.get("https://rozetka.com.ua/ua/photo/c80001/");
    }

    public void selectCameras() {

        waitUtils.waitUntilElementClickable(camera, 15);
        favouritesList.get(0).click();
        favouritesList.get(1).click();
    }

    public void pressCompareBtn() {
        compareBtn.click();
    }
}


