package com.in.akshay.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="EMP_DTLS")
public class Employee {
	
	@Id
	@Column(name="EMP_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empId;
	
	@Column(name="EMP_NAME")
	private String empName;
	
	@Column(name="EMP_ROLE")
	private String empRole;
	

}
