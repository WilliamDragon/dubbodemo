package com.gjl.parent.springbootdubboserver;

import com.gjl.parent.springvootdubboapi.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoServiceImpl implements DemoService {
    @Override
    public void sayHello() {
        //System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        //return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " );
        System.out.println("hello,dubboto");

    }
}
