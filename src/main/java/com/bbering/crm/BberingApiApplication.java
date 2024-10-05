package com.bbering.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bbering.crm")
public class BberingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BberingApiApplication.class, args);
	}

}
