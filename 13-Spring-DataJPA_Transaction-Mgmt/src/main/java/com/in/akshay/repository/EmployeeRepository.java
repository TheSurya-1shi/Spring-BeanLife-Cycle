package com.in.akshay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.akshay.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
