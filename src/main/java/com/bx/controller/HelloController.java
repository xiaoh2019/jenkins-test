package com.bx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoh
 * @create 2019-08-19-14:42
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "hello tieshangongzhu";
    }

    @RequestMapping("/jenkins")
    public String jenkinsTest(){
        return "jenkins1";
    }

}
