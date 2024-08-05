package com.sk.gihub_cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GihubCicdApplication {

	@GetMapping("/greet")
	public String sayHello(){
		return "Hello World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(GihubCicdApplication.class, args);
	}

}
