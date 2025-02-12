package com.in.akshay.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface UserRepository extends CrudRepository<User, Integer> {
	
	// select * from users where user_location=:userLocation
	List<User> findByUserLocation(String userLocation);
	
	//select * from user where user_location=ul and user_age=age;
	List<User> findByUserLocationAndUserAge(String userLocation, Integer userAge);
	
	// select * from user where user_role in ();
	List<User> findByUserRoleIn(Iterable<String>userRole);

}
