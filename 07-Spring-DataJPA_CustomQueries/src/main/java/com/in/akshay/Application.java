package com.in.akshay;

import java.util.Iterator;
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
		
		/*
		 * List<User> userLocation = userRepository.getUserLocation("Akshay");
		 * userLocation.forEach(user ->{ System.out.println(user); });
		 */
		
		/*
		 * String userLocation = userRepository.getUserLocation("Akshay");
		 * System.out.println(userLocation);
		 */
		
		/*
		 * List<User> allHql = userRepository.getAllHql(); allHql.forEach(userr->{
		 * System.out.println(userr); });
		 */
		
		
		  String[] roleLocName = userRepository.getRoleLocName(); for (String string :
		  roleLocName) { System.out.println(string);
		 
		 }
		 
		
//		String[] roleLocNameHql = userRepository.getRoleLocNameHql();
//		for(String str:roleLocNameHql) {
//			System.out.println(str);
//		}
		
		
	}
	
	

}
