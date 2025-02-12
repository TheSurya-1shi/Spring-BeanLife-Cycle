package com.in.akshay;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.in.akshay.repository.User;
import com.in.akshay.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user = new User("Will", 101, 37, "China", "JConsultant");
//		User user1 = new User("Bharath",102, 38, "Australia", "SManager");
//		User user2 = new User("Gokul", 103, 31, "Germany", "Lead");
//		User user3 = new User("Venu", 104, 33, "France", "Principal");
//		User user4 = new User("Vishnu", 105, 32, "India", "Lead");
//		User user5 = new User("Mrinal", 106, 36, "New-Zealand", "PConsultant");
//		
//		userRepository.saveAll(Arrays.asList(user,user1,user2,user3,user4,user5));
		
//		List<User> all = userRepository.findAll();
//		all.forEach(user ->{
//			System.out.println(user);
//		});
		
//		List<User> allbutSorted = userRepository.findAll(Sort.by("userAge"));
//		
//		allbutSorted.forEach(user->{
//			System.out.println(user);
//		});
		
		long count = userRepository.count();
		System.out.println(count);
		
		List<User> allSorted = userRepository.findAll(Sort.by("userLocation"));
		allSorted.forEach(user ->{
			System.out.println(user);
		});
		
		
		
	}

}
