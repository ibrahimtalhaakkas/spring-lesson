package com.tutorial.springlesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //Spring boot default configuration
@RestController		   //It says this class contains some APIs
public class SpringLessonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLessonApplication.class, args); }

		@GetMapping("/")
		public String mainPage(){
		return "Welcome!";
		}
	// CRUD -> create, read, update, delete
	@GetMapping("/hello") //Read
	public String sayHello(){
		return "Hello,world";
	}

}
