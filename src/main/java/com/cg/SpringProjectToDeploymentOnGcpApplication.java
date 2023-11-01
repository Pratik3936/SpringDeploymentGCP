package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/message")
public class SpringProjectToDeploymentOnGcpApplication {
	
	@GetMapping("/get")
	public static String getMessage() {
		return "Hello Guyz !!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectToDeploymentOnGcpApplication.class, args);
		
		getMessage();
	}

}
