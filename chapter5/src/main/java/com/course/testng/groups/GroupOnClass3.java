package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupOnClass3 {
    public void tea1(){
        System.out.println("GroupOnClass333333中的teacher11运行");
    }
    public void tea2(){
        System.out.println("GroupOnClass33333中的teacher2222运行");
    }
}
