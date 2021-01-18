package com.course.lessons.nine;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MvnTest {
    @Parameters ({"first-name"})
    @Test
  public void testOne (String fristName){
        long threadId = Thread.currentThread().getId();
        System.out.println("First test thread: "+threadId);
        Assert.assertEquals(5, 6);
    }

    @Test
    public void testTwo (){
        long threadId = Thread.currentThread().getId();
        System.out.println("Second test thread: "+threadId);
        Assert.assertEquals(6, 6);

    }
    @Test
    public void testThree (){
        long threadId = Thread.currentThread().getId();
        System.out.println("Third test thread: "+threadId);
        Assert.assertEquals(77, 77);

    }

}
