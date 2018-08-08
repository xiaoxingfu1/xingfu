package com.course.testng.groups;

import org.testng.annotations.Test;

public class ExceptedException
{

//    这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
//    这是一个测试结果会成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTumeExceptionSuccesee(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}
