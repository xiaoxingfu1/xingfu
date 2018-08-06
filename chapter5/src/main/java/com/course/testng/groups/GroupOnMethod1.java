package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupOnMethod1 {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法1111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法2222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法33333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法44444");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("server组运行前的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("server组运行后的方法");
    }
}
