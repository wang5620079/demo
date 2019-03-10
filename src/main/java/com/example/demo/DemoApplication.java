package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping("")
	public String index(){
//		System.out.println("get request!");
		logger.info("get index request!");
		return "Test index OK!";
	}
	@RequestMapping("hi")
	public String hi(){
//		System.out.println("get request!");
		logger.info("get request!");
		return "Test OK!";
	}
}
