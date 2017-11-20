package com.siddu.springdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerFinalApplication.class, args);
	}
	
	 @RequestMapping("/")
	    public String home() {
	        return "Hello Docker World.............:)";
	    }
}
