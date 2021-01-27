package com.course.pageobjects.homeworkLesson10Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

    public class TheInternet2 extends BaseTheInternet2{

        @FindBy(linkText = "Form Authentication")
    private WebElement formAuthentication2;

    @FindBy(xpath = "//*[@id='username']")
    private WebElement userName2;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement password2;

    @FindBy(xpath = "//*[@id='login']/button")
    private WebElement login2;

    @FindBy(xpath = "//*[@id='flash']")
    private WebElement message2;

        private WebDriver driver2;

        public TheInternet2(WebDriver driver2) {
            PageFactory.initElements(driver2, this);
            this.driver2 = driver2;
        }

    public void clickform2 (){
        formAuthentication2.click();
    }

    public void setUserName2(String name102){
        userName2.sendKeys(name102);
    }

    public void setPassword2(String password102){
        password2.sendKeys(password102);
    }

    public void login2 (){
        login2.click();
    }

    public void warningMessage2 (){
        message2.getText();
        System.out.println(message2.getText());
        String ActualText = message2.getText();
        String ExpectedText ="You logged into a secure area!\n" +
                "×";
        Assert.assertEquals(ExpectedText, ActualText);

    }

    @Override
    public void getPageInternet2() {
        driver2.get("http://the-internet.herokuapp.com/");
    }
}



