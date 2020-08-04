package com.gjl.parent.springvootdubboclient;

import com.gjl.parent.springvootdubboapi.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoServiceCilent {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"properties/dubbo-client.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // get remote service proxy

        //demoService.sayHello();
        System.out.println(demoService.sayHello2("syaysya"));
    }
}
