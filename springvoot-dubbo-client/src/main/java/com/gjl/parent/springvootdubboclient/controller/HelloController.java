package com.gjl.parent.springvootdubboclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gjl.parent.springvootdubboapi.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*再次提交*/
@RestController
public class HelloController {

    @Reference
    private DemoService demoService;

    @RequestMapping("/helloSay")
    public String HelloSay(String str) {
        String stringto = demoService.sayHello2(str);
        System.out.println(stringto);
        return stringto;
    }
}
