package com.mycompany.rajstore.Product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApplication {

	// This is the Product microservice start point
	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

}
