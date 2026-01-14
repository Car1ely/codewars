package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodewarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodewarsApplication.class, args);
        Thirteen thirteen = new Thirteen();
        System.out.println(thirteen.thirt(321));
	}
}
