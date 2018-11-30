package com.hongghe.dubboconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * 实例服务
 *
 * @author hongghe 12/08/2018
 */
@RestController
@Slf4j
public class HelloController {

    @RequestMapping(value = "hello")
    public String helloWorld() {
        return "hello";
    }
    
}
