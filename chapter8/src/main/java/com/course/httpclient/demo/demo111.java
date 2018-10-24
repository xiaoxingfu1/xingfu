package com.course.httpclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class demo111 {
    @Test
    public void test1() throws IOException {
//        用来存放我们的结果
        String goal;
        HttpGet get=new HttpGet("http://www.baidu.com");
//        用来执行get方法
        HttpClient client=new DefaultHttpClient();
        HttpResponse response=client.execute(get);
        goal=EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(goal);
        }

}
