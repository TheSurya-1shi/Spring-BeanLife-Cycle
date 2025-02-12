package com.in.akshay.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ACCOUNT")
public class Account {

	@Column(name="ACCOUNT_HOLDER")
	private String AccHolder;
	
	@Column(name="CURRENT_BALANCE")
	private Double currBal;
	
	@Column(name="BRANCH_NAME")
	private String branch;
	
	@EmbeddedId
	private AccountPk accoutnPk;
}
