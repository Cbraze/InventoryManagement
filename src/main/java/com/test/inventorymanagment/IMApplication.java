package com.test.inventorymanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.test.inventorymanagment")
@SpringBootApplication
public class IMApplication {

	public static void main(String[] args) {
		SpringApplication.run(IMApplication.class, args);
	}

}
