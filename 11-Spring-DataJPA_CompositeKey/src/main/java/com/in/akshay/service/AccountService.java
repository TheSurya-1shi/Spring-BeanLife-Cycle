package com.in.akshay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.in.akshay.entity.Account;
import com.in.akshay.entity.AccountPk;
import com.in.akshay.repository.AccountRepository;

@Service
public class AccountService {
	
	private AccountRepository accountRepository;
	
	public AccountService(AccountRepository accountRepository) {
		this.accountRepository=accountRepository;
	}
	
	public void saveAccountInfo() {
		
		AccountPk accPk = new AccountPk();
		accPk.setAccId(20002);
		accPk.setAccNumber(2222);
		accPk.setDateOfBirth(18011997);
		
		
		Account acc = new Account();
		acc.setAccHolder("Jaydeep");
		acc.setBranch("Shrirampur");
		acc.setCurrBal(100000000.00);
		acc.setAccoutnPk(accPk);
		
		
		accountRepository.save(acc);
		
		
	}
	
	public void getByPk(){
		
		AccountPk pk = new AccountPk();
		pk.setAccId(10001);
		pk.setAccNumber(0001);
		pk.setDateOfBirth(26012000);
		
		Optional<Account> byId = accountRepository.findById(pk);
		if(byId.isPresent()) {
			System.out.println(byId.get());
		}else {
			System.out.println("No such account found...");
		}
	}

}
