package com.seed.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.seed.model.EventBook;
import com.seed.service.EventBookService;


@CrossOrigin("http://localhost:4200")
@RestController
public class EventBookController {
	
	@Autowired
	EventBookService service;
	
	@GetMapping("/showalleventbooks")
	public List<EventBook> showData(){
		List<EventBook> lst = service.getAllEventBooks();
		return lst;
	}
	
	@PostMapping("/addevents")
	public EventBook addEventBook(@RequestBody EventBook eb) {
		System.out.println("Add Customer....!"+eb);
		return service.saveEventBook(eb);
	}
	
	@DeleteMapping("/deleteevents/{id}")
	public void deleteEventBook(@PathVariable Integer id) {
		System.out.println("deleteById...");
		service.deleteEventBook(id);
	}
	
	
	

}
