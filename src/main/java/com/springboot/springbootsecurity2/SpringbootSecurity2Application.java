package com.springboot.springbootsecurity2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot.springbootsecurity2")
public class SpringbootSecurity2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecurity2Application.class, args);
	}

}
