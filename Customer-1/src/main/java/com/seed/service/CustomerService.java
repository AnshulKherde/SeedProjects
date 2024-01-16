package com.seed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seed.model.Customer;
import com.seed.repo.customerRepository;

@Service
public class CustomerService {
	
	@Autowired
	customerRepository repo;

	public List<Customer> getAllCustomers() {
		System.out.println("Service fetching Customers...!");
		return repo.findAll();
	}

	public Optional<Customer> getCustomerById(Integer id) {
		return repo.findById(id);
	}

	public Customer saveCustomer(Customer cm) {
		return repo.save(cm);
		
	}

	public void deleteCustomer(Integer id) {
		repo.deleteById(id);	
		
	}

	public Optional<Customer> getByEmailAndPassword(String email,String pass){
		return repo.getByEmailAndPassword(email, pass);
		
	}


	
	
	
	

}
