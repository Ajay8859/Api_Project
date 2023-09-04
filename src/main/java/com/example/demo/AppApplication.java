package com.example.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.Dao")
public class AppApplication {

	public static void main(String[] args) {
		System.out.println("***** Spring Boot is Started *****");
		SpringApplication.run(AppApplication.class, args);
	}

}
