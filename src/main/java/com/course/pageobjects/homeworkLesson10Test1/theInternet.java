package com.course.pageobjects.homeworkLesson10Test1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//1й тест:  Зайти на страницу http://the-internet.herokuapp.com/ выбрать раздел Form Authentication,
//   ввести Username: admin и Password admin, нажать кнопку лоигн,
//   написать Assert который проверяет, что отображается сообщение "Your username is invalid!"

public class theInternet extends BaseTheInternet{

//By.linkText("Form Authentication")
      //  @FindBy(xpath = "//*[@id='content']/ul/li[21]/a")
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

        public theInternet(WebDriver driver) {
                PageFactory.initElements(driver, this);
                this.driver = driver;
        }



        public void clickformAuthentication (){
                formAuthentication.click();
        }
        public void setUserName(String name10){
                userName.sendKeys(name10);
        }
        public void setPassword(String password10){
                userName.sendKeys(password10);
        }
        public void login (){
                login.click();
        }

        public void warningMessage (){
                message.getText();
                System.out.println("Printing "+message);
                Assert.assertTrue("Your username is invalid!".equals(message));

        }


        @Override
        protected void getPageInternet() {
            driver.get("http://the-internet.herokuapp.com/");
        }
    }
