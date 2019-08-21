package com.bx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaoh
 * @create 2019-08-19-14:42
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "hello test 3";
    }

    @RequestMapping("/jenkins")
    public String jenkinsTest(){
        return "jenkins test 3";
    }
    @RequestMapping("/map")
    public Map mapTest(){
        HashMap<String, String> map = new HashMap<>();
        map.put("唐僧","one");
        map.put("孙悟空","two");
        map.put("猪八戒","three");
        map.put("沙和尚","four");
        return map;
    }

}
