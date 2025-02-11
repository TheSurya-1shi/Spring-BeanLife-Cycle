package com.in.akshay;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Component
public class Car {
	
	public Car() {
		System.out.println("Car:: Constructor");
	}
	@PostConstruct
	public void drift() {
		System.out.println("Car is Drifting...");
	}
	@PreDestroy
	public void garage() {
		System.out.println("Car is in Garage");
	}

}
