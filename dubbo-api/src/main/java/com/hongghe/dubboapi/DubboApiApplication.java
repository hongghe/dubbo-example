package com.hongghe.dubboapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * The startup class of project.
 *
 * @author hongghe 12/08/2018
 */
@EnableAsync
@EnableScheduling
@SpringBootApplication
public class DubboApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboApiApplication.class, args);
	}
}
