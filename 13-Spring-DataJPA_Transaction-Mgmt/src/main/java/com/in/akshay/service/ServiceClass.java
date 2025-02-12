package com.in.akshay.service;

import org.springframework.stereotype.Service;

import com.in.akshay.entity.Address;
import com.in.akshay.entity.Employee;
import com.in.akshay.repository.AddressRepository;
import com.in.akshay.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class ServiceClass {
	
	private EmployeeRepository employeeRepo;
	private AddressRepository addressRepo;
	
	public ServiceClass(EmployeeRepository employeeRepo, AddressRepository addressRepo) {
		this.employeeRepo=employeeRepo;
		this.addressRepo=addressRepo;
	}
	@Transactional(rollbackOn = Exception.class)
	public void saveData() {
		
		Employee employee = new Employee();
		employee.setEmpName("Mahendra");
		employee.setEmpRole("Dental-Officer");
		employeeRepo.save(employee);
		
		 int i=10/0;
		 
		Address address = new Address();
		address.setAddrId(103);
		address.setEmpId(employee.getEmpId());
		address.setCity("Nanded");
		address.setCompleteAddr("Namaskar-Chowk");
		address.setState("Maharashtra");
		addressRepo.save(address);
	}

}
