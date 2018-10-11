package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

	@RequestMapping("/")
	public String sayHi(String name) {
		return "版本22";
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
