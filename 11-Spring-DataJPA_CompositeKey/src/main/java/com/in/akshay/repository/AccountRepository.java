package com.in.akshay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.akshay.entity.Account;
import com.in.akshay.entity.AccountPk;

public interface AccountRepository extends JpaRepository<Account, AccountPk> {

}
