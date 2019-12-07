package com.tu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @RequestMapping("/info")
    public String info(){
        return "hello";
        //我的一次修改
        //我的二次修改
        //33333333
    }
}
