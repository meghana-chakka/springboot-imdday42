package com.jobiak.springbootimd;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(scanBasePackages=com.jobiak.model,com.jobiak.controller,com.jobiak.repository)
public class SpringbootImdday42Application {


	public static void main(String[] args) {
		System.out.println("Starting Boot App");
		SpringApplication.run(SpringbootImdday42Application.class, args);
		System.out.println("Boot App started");
		
	}

}