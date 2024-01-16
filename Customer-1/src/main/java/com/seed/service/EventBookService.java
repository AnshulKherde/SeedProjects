package com.seed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seed.model.EventBook;
import com.seed.repo.EventBookRepo;

@Service
public class EventBookService {
	
	@Autowired
	EventBookRepo repo;

	
	public List<EventBook> getAllEventBooks() {
		System.out.println("servive fetching eventsBook...");
		return repo.findAll();
	}

	public Optional<EventBook> getEventBookById(Integer id) {
		return repo.findById(id);
	}

	public EventBook saveEventBook(EventBook eb) {
		return repo.save(eb);
	}


	public void deleteEventBook(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
