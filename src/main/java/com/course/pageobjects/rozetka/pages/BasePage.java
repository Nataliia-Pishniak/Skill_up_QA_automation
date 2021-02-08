package com.course.pageobjects.rozetka.pages;

import com.course.utils.WaitUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WaitUtils waitUtils;
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils(driver);
    }

    protected void waitUntilPageIsLoaded(){
        new WebDriverWait(driver, 15).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    protected abstract void getPage();



}

