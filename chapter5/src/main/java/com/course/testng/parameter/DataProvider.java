package com.course.testng.parameter;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProvider {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("11111");
        System.out.println("name = [" + name + "], age = [" + age + "]");
    }

    @org.testng.annotations.DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] obj=new Object[][]{
                {"zhangsan",15},
                {"wangwu",36},
                {"lisi",89}
        };
        return obj;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1111方法");
        System.out.println("name = [" + name + "], age = [" + age + "]");

    }
    @Test(dataProvider = "methodData" )
    public void test2(String name,int age){
        System.out.println("test222222方法");
        System.out.println("name = [" + name + "], age = [" + age + "]");

    }
    @org.testng.annotations.DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;
        if(method.getName().equals("test1")){
            result=new Object[][]{
                    {"zhangsansan",20},
                    {"lisi",25}
            };

        }else if(method.getName().equals("test2")){
            result =new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}
            };

        }
        return result;

    }
}
