package com.course.pageobjects.rozetka.components;

import com.course.pageobjects.rozetka.pages.ComparePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareComponent extends BaseComponent{

    @FindBy(xpath = "//*[@class='modal__header']")
    private WebElement header;
    @FindBy(xpath = "//*[@class='comparison-modal__link']")
    private WebElement comparisonLink;

    private WebDriver driver;


    public CompareComponent(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public ComparePage pressComparisonLink(){
        waitComponentToBePresent();
        comparisonLink.click();
        return new ComparePage(driver);
    }

    private void waitComponentToBePresent() {
        waitUtils.waitUntilElementVisible(header, 10);
    }
}
