package com.in.akshay.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.akshay.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Serializable>{

}
