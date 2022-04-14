package com.lxy.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lxy
 * @create 2022-04-07 11:07
 */
@Controller
@RequestMapping("/atest")
public class ATest {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHallo(){
        String s = "sss";
        return "hello spring boot";
    }
}
