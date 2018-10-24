package com.course.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyCookiesForPost {
    private String url;
    private ResourceBundle bundle;
    //用来存储cookies信息的变量
    private CookieStore store;
    @BeforeTest
    public void beforeTest(){
        bundle=ResourceBundle.getBundle("application", Locale.CHINA);
        url=bundle.getString("test.url");
    }
    @Test
    public void testGetCookies() throws IOException {
        String result;
//        从配置文件中拼接测试的url
        String uri=bundle.getString("getCookies.uri");
        String testUrl=this.url+uri;
        System.out.println("testurl:"+testUrl);

//        测试逻辑代码书写
        HttpGet get=new HttpGet(testUrl);
        DefaultHttpClient client=new DefaultHttpClient();
        HttpResponse response=client.execute(get);
        result= EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println("result: "+result);

        //获取cookies信息
        this.store=client.getCookieStore();
        List<Cookie> cookieList=store.getCookies();
        for(Cookie cookie:cookieList){
            String name=cookie.getName();
            String value=cookie.getValue();
            System.out.println("cookie name= "+name+"; cookie value= "+value);

        }
    }
    @Test(dependsOnMethods = {"testGetCookies"})
    public void testPostMethod(){
        String uri=bundle.getString("test.post.with.cookies");
//        拼接最终的测试地址
        String testurl=this.url+uri;
//        声明一个client对象，用来进行方法的执行
DefaultHttpClient client=new DefaultHttpClient();
//        声明一个方法，这个方法就是post方法
        HttpPost post=new HttpPost();
//                添加参数

//                设置请求头信息
//        声明一个对象进行响应结果的存储
//        设置cookies信息
//        执行post方法
//        获取响应结果
//        处理结果，就是判断返回结果是否符合预期
    }
}
