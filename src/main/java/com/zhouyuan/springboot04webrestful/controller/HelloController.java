package com.zhouyuan.springboot04webrestful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.tools.jar.resources.jar;

/**
 * @author zhouyuan
 * @data 2019/6/17-2:56
 */
@Controller
public class HelloController {

    // webjars\jquery\3.4.1\jquery.js

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello springBoot!!";
    }

}
