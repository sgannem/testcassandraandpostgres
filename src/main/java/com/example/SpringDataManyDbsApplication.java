package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringDataManyDbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataManyDbsApplication.class, args);
	}
	
}
