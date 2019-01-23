package com.hongghe.dubboconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * 实例服务
 *
 * @author hongghe 12/08/2018
 */
@Slf4j
@RestController
@RequestMapping(path = "/hello")
public class HelloController {

    @RequestMapping(value = "hello")
    public String helloWorld() {
        log.debug("[hello]", "format", "[arg]");
        return "hello";
    }
    
}
