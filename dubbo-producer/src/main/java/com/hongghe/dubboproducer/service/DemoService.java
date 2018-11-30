package com.hongghe.dubboproducer.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 实例服务
 *
 * @author hongghe 12/08/2018
 */
@Service(version = "1.0.0")
public class DemoService {

    public String hello(String name) {
        return "From Spring-Boot-Starter Provider, Hello "+name+", Fuck it whatever!";
    }
}
