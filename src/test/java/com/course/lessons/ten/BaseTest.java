package com.course.lessons.ten;

import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class  BaseTest {

    @BeforeSuite
    public void setup () throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream( " /Users/nataliiap/Documents/repo_test/Skill_up_QA_automation/src/main/resources/dev.properties"));
    }
}
