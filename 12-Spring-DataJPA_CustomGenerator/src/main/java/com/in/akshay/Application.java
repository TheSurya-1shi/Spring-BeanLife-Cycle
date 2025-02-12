package com.in.akshay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in.akshay.entity.OrderEntity;
import com.in.akshay.repository.OrderRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		OrderRepository repository = context.getBean(OrderRepository.class);
		
		OrderEntity entity = new OrderEntity();
		entity.setOrderedBy("Zahida Khala 3");
		entity.setOrderNumber(13236);
		entity.setOrderName("Order for 1 kg Malpova");
		
		OrderEntity save = repository.save(entity);
		System.out.println(save);
	}

}
