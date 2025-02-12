package com.in.akshay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.akshay.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
