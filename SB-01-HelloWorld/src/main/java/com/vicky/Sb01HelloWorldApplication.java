package com.vicky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb01HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb01HelloWorldApplication.class, args);
		System.out.println("Hello world");
	}

}