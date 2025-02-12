package com.in.akshay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	
	
	@Query(value="select user_location from user where user_name=:uName", nativeQuery=true)
	public String getUserLocation(String uName);
	
	@Query(value="from User") // we need to use EntityClass name as Table name and Entity class variable name as column name.
	public List<User> getAllHql();
	
	@Query(value="Select user_role, user_location, user_name from user where user_age>=24", nativeQuery=true)
	public String[] getRoleLocName();
	
	@Query(value="select userRole, userLocation, userName from User where userAge>24")
	public String[] getRoleLocNameHql();
	

}
