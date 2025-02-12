package com.in.akshay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in.akshay.entity.Product;
import com.in.akshay.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductRepository repository = context.getBean(ProductRepository.class);
		
		Product product = new Product();
		
		product.setProductName("Iphone 15");
		product.setProductPrice(700000.00);
		
		repository.save(product);
		
	}

}
