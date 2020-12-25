package com.course.lessons.seven.home_work;


//Используя TestNg DataProvider который содержит 3 разных юзернейма и пароля (не используйте реальные имена и пароли),
// зполнить форму http://the-internet.herokuapp.com/login,
//и нажать кнопку Login с помощью локатора XPATH

import org.testng.annotations.DataProvider;

public class LoginWithDataProvider {


    @DataProvider(name = "data-provider-first")
    public Object [][] dataProviderMethod (){
        return new Object[][]{{ "Tester1", "12345"}, {"Tester2", "123456"}, {"Tester3", "54321"}};
    }




}
