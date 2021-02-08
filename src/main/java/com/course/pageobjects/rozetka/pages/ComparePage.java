package com.course.pageobjects.rozetka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ComparePage extends BasePage{

    @FindBy(xpath = "//*[@class='comparison__heading']")
    private WebElement categoriesHeading;

    @FindBy(xpath = "//*[@class='products-grid__cell']")
    List<WebElement> listOfProducts;

    private WebDriver driver;

    public ComparePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public int getProductsCount() {
        waitUtils.waitUntilElementVisible(categoriesHeading, 15);
        return listOfProducts.size();
    }

    @Override
    public void getPage() {
        driver.get("https://rozetka.com.ua/ua/comparison/");
    }




}
