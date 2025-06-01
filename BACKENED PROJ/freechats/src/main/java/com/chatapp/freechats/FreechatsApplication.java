package com.chatapp.freechats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com", "config", "controller", "model"})  // Explicitly specify packages to scan

public class FreechatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreechatsApplication.class, args);
	}

}
