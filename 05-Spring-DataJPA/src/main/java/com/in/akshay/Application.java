package com.in.akshay;

import java.util.Arrays;

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
		
		
		User user = new User("Utkarsh", 11, 25, "Finland", "DotNet-Engineer");
		User user2 = new User("Kirti", 333, 24, "Canada", "Frontend-Engineer");
		User user3 = new User("Gopal", 99, 27, "Japan", "MAWM-Developer");
		
		//userRepository.save(user);
		userRepository.saveAll(Arrays.asList(user,user2,user3));
		
			
	}

}
