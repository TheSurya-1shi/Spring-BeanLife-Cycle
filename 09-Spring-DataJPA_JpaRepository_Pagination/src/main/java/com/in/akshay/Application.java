package com.in.akshay;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.in.akshay.repository.User;
import com.in.akshay.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		int pageSize=3;
//		int pageNum=4; // in realtime projects page number will come from frontend.
//		
//		PageRequest pageRequest = PageRequest.of(pageNum-1, pageSize);
//		Page<User> all = userRepository.findAll(pageRequest);
//		all.forEach(user -> {
//			System.out.println(user);
//		});
		
		//Query by example
		User filter = new User();
		//filter.setUserAge(26);
		//filter.setUserName(null);
		Example<User> example = Example.of(filter);
		List<User> allExample = userRepository.findAll(example);
		allExample.forEach(user ->{
			System.out.println(user);
		});
	}
	
}
