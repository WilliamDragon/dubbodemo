package com.gjl.parent.springbootdubboserver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class BootStart {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"properties/dubbo-server.xml"});
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();  //保持服务一直在运行
    }
}
