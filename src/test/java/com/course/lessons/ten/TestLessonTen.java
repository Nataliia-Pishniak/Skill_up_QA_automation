package com.course.lessons.ten;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestLessonTen extends BaseTest {
    private Properties props;

    @BeforeSuite
    public void setup () throws IOException {
        props = new Properties();
        props.load(new FileInputStream( "/Users/nataliiap/Documents/repo_test/Skill_up_QA_automation/src/main/resources/"+System.getProperty("ENV") +".properties"));
    }
    @Test
    public void BaseTestOne (){
        props.setProperty("city","Kyiv");
        System.out.println(props.getProperty("url"));
        System.out.println(props.getProperty("userName"));
        System.out.println(props.getProperty("password"));
        System.out.println(props.getProperty("city"));

    }
    @Test
    public void BaseTestTwo (){
        props.setProperty("city","Kyiv");
        System.out.println(props.getProperty("url"));
        System.out.println(props.getProperty("userName"));
        Assert.assertEquals(5, 6);

    }
    @Test
    public void BaseTestThree (){

        System.out.println(props.getProperty("password"));
        Assert.assertEquals(6, 6);



    }


}
