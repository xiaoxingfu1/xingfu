package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void test1(){
        System.out.println("Test这是测试用例1");
    }
    @Test
    public void test2(){
        System.out.println("Test这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod是测试用例之前执行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod是测试用例之后执行");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass是测试类前执行");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass是测试类后执行");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite是测试套件之前执行");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite是测试套件之后执行");
    }

}
