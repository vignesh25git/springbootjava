package com.vicky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.vicky","in.vicky"})
public class Sb02WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb02WebApplication.class, args);
	}

}
