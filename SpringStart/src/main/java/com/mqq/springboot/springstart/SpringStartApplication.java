package com.mqq.springboot.springstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan("com.mqq.springboot.controller")
public class SpringStartApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringStartApplication.class, args);
	}

}
