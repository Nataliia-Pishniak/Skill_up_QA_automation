package com.course.lessons.ui;

import com.course.lessons.BaseTest;
import com.course.pageobjects.rozetka.pages.CheckoutPage;
import com.course.pageobjects.rozetka.pages.ComparePage;
import com.course.pageobjects.rozetka.pages.RozetkaNotebooksPage;
import com.course.pageobjects.rozetka.pages.RozetkaPhotoCamerasPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RozetkaTest extends BaseTest {

    @Test
    public void loginTest() {
        rozetkaHomePage.getPage();
        rozetkaHomePage.pressLogin();
        rozetkaHomePage.signInComponent.login(userName, password);
    }
    @Test
    public void buySmth() throws InterruptedException {
        rozetkaHomePage.getPage();
        RozetkaNotebooksPage rozetkaNotebooksPage = rozetkaHomePage.openNotebooksCategory();
        rozetkaNotebooksPage.filterProducts();
        rozetkaNotebooksPage.selectMacBook();
        rozetkaNotebooksPage.productComponent.buyProduct();
        CheckoutPage checkoutPage = rozetkaNotebooksPage.basketComponent.clickSubmitButton();
        Assert.assertEquals("Оформлення замовлення", checkoutPage.getCheckoutHeading());
    }
    @Test
    public void toCompare() throws InterruptedException {
        rozetkaHomePage.getPage();
        RozetkaPhotoCamerasPage rozetkaPhotoCamerasPage = rozetkaHomePage.openMobileDevicesCategory();
        rozetkaPhotoCamerasPage.selectCameras();
        rozetkaPhotoCamerasPage.pressCompareBtn();
        ComparePage comparePage = rozetkaPhotoCamerasPage.compareComponent.pressComparisonLink();
        Assert.assertEquals(comparePage.getProductsCount(),2);
    }
}
