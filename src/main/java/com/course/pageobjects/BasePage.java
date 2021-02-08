//package com.course.pageobjects;
//
//import org.openqa.selenium.WebDriver;
//
//public abstract class BasePage {
//    private static WebDriver driver;
//    public BasePage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    protected abstract void getPage();
//    public static WebElement waitUntilElementVisible(WebElement element, int timeOutInSec) {
//        WebDriverWait wait = new WebDriverWait(driver, timeOutInSec);
//        return wait.until(ExpectedConditions.visibilityOf(element));
//    }
//    public static WebElement waitUntilElementClickable(WebElement element, int timeOutInSec) {
//        WebDriverWait wait = new WebDriverWait(driver, timeOutInSec);
//        return wait.until(ExpectedConditions.visibilityOf(element));
//    }
//
//    public boolean isElementPresent(WebElement element, int timeOutInSec){
//        try{
//            waitUntilElementVisible(element, timeOutInSec);
//        } catch (TimeoutException e){
//           return false;
//        }
//        return true;
//    }
//    public static void assertElementIsVisible(WebElement element, int timeOutInSec, String message) {
//        try{
//            waitUntilElementVisible(element, timeOutInSec);
//
//        } catch (TimeoutException e){
//            throw new AssertionError(message);
//        }
//    }
//}