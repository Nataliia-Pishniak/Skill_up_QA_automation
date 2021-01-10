package com.course.lessons.seven.home_work;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Используя локатор XPATH заполнить check-out форму http://www.practiceselenium.com/check-out.html
// и нажать кнопку Place Order
//(Как выбрать значение из дропдауна ->
// https://stackoverflow.com/questions/20138761/how-to-select-a-dropdown-value-in-selenium-webdriver-using-java)
public class PlaceOrder {

    private WebDriver driver;

    @BeforeTest
    public void setUpTest (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test(){
        driver.get( "http://www.practiceselenium.com/check-out.html");
        WebElement email = driver.findElement(By.id("email"));
        WebElement name = driver.findElement(By.xpath("//*[@id='name']"));
        WebElement address= driver.findElement(By.xpath("//*[@id='address']"));
        WebElement cardNumber= driver.findElement(By.xpath("//*[@id='card_number']"));
        WebElement cardholderName= driver.findElement(By.xpath("//*[@id='cardholder_name']"));
        WebElement verification= driver.findElement(By.xpath("//*[@id='verification_code']"));
        WebElement placeOrder= driver.findElement(By.xpath("//*[text()='Place Order']"));

        Select dropdown = new Select(driver.findElement(By.id("card_type")));

        email.sendKeys("test@test.com");
        name.sendKeys("test");
        address.sendKeys("My home town");
        dropdown.selectByIndex(1);
        cardNumber.sendKeys("12345678");
        cardholderName.sendKeys( "Sanya");
        verification.sendKeys("123");
        placeOrder.click();



    }
    @AfterTest
    public void burnDown(){
        driver.quit();

    }



}



