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
@Table(name="EMP_ADDR")
public class Address {
	
	@Column(name="EMP_ID")
	private Integer empId;
	
	@Column(name="ADDRESS_ID")
	@Id
	private Integer addrId;
	
	@Column(name="COMPLETE_ADDRESS")
	private String completeAddr;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;

}
