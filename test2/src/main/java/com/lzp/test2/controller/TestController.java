package com.lzp.test2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test2")
    public String te2(){
        System.out.println("2");
        return "nihao2";
    }
}
