package com.in.akshay.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class AccountPk {
	
	
	private Integer accNumber;
	
	private Integer accId;
	
	private Integer dateOfBirth;
	
	
}
