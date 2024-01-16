package com.seed.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.seed.model.Customer;

@Repository
public interface customerRepository extends JpaRepository<Customer, Integer> {

	@Query(value = "SELECT c from Customer c where c.email_id=:email and c.password=:pass")
	Optional<Customer> getByEmailAndPassword(String email,String pass);
	

	

}
