package com.hongghe.dubboproducer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hongghe.dubboproducer.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实例化的服务
 *
 * @author hongghe 12/08/2018
 */
@Slf4j
@RestController
public class HelloController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @GetMapping(value = "/hello")
    public String index() {
        return demoService.hello("Hello,Henry.");
    }
}