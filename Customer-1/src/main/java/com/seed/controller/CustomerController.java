package com.seed.controller;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seed.model.Customer;
import com.seed.service.CustomerService;

@CrossOrigin("http://localhost:4200")
@RestController
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@GetMapping("/showallcustomers")
	public List<Customer> showData(){
		List<Customer> lst = service.getAllCustomers();
		return lst;
	}
	
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer cm) {
		System.out.println("Add Customer....!"+cm);
		return service.saveCustomer(cm);
	}
	
	@DeleteMapping("/deletecustomer/{id}")
	public void deleteCustomer(@PathVariable Integer id) {
		System.out.println("deleteById...");
		service.deleteCustomer(id);
	}
	
	@GetMapping("/getbyemailandpassword/{email}/{pass}")
	public Optional<Customer> getByEmailAndPassword(@PathVariable String email,@PathVariable String pass){
		return service.getByEmailAndPassword(email, pass);
		
	}


}
