package com.course.lessons.thirteen;

import com.course.lessons.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestLoggers extends BaseTest {

    private static Logger logger = LogManager.getLogger(TestLoggers.class);

    @Test
    public void test() {
        logger.debug("This is debug log lvl1");
        logger.info("This is info log lvl1");
        logger.error("This is error log lvl1", new NullPointerException("This is my exception"));

    }
}