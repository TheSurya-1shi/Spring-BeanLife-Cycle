package com.in.akshay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.akshay.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
