package ui;

import com.course.lessons.BaseTest;
import com.course.pageobjects.LinkedinSignInPage;
import org.testng.annotations.Test;

public class LinkedinTest extends BaseTest {
    @Test
    public void signInTest(){
        linkedinHomePage.getPage();
        LinkedinSignInPage linkedinSignInPage=linkedinHomePage.clickSignIn();
        linkedinSignInPage.signIn(userName, password);
         System.out.println();


    }
}
