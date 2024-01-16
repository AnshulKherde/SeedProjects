package com.seed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.seed.model.EventBook;

@Repository
public interface EventBookRepo extends JpaRepository<EventBook, Integer> {
	
}
