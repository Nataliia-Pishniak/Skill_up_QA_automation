package com.course.pageobjects.homeworks.homeworkLesson10Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


//1й тест:  Зайти на страницу http://the-internet.herokuapp.com/ выбрать раздел Form Authentication,
//   ввести Username: admin и Password admin, нажать кнопку лоигн,
//   написать Assert который проверяет, что отображается сообщение "Your username is invalid!"

public class TheInternet extends BaseTheInternet {

    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthentication;

    @FindBy(xpath = "//*[@id='username']")
    private WebElement userName;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//*[@id='login']/button")
    private WebElement login;

    @FindBy(xpath = "//*[@id='flash']")
    private WebElement message;

    private WebDriver driver;
    //   private String ExpectedText;

    public TheInternet(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickform() {
        formAuthentication.click();
    }

    public void setUserName(String name10) {
        userName.sendKeys(name10);
    }

    public void setPassword(String password10) {
        password.sendKeys(password10);
    }

    public void login() {
        login.click();
    }

    public void warningMessage() {
        message.getText();
        System.out.println(message.getText());
        String ActualText = message.getText();
        String ExpectedText = "Your username is invalid!\n" +
                "×";
        Assert.assertEquals(ExpectedText, ActualText);

    }

    @Override
    public void getPageInternet() {
        driver.get("http://the-internet.herokuapp.com/");
    }
}
