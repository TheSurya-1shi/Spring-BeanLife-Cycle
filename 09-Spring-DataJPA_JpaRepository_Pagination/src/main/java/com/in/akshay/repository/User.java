package com.in.akshay.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Column(name="user_NAME")
	private String userName;
	
	@Column(name="user_id")
	@Id
	private Integer userId;
	
	@Column(name="user_age")
	private Integer userAge;
	
	@Column(name="user_location")
	private String userLocation;
	
	@Column(name="user_role")
	private String userRole;
	

}
