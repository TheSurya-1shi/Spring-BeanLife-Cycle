package com.in.akshay;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in.akshay.repository.User;
import com.in.akshay.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		List<User> byUserLocation = userRepository.findByUserLocation("Bangalore");
		System.out.println(byUserLocation);
		
		List<User> userLocationAndUserAge = userRepository.findByUserLocationAndUserAge("Japan", 27);
		System.out.println(userLocationAndUserAge);
		
		List<User> byUserRoleIn = userRepository.findByUserRoleIn(Arrays.asList("Frontend-Engineer","Software-Engineer"));
		byUserRoleIn.forEach(userr -> {
			System.out.println(userr);
		});
		
		
		
		
		
		
	}

}
