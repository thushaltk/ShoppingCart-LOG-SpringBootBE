package com.logshop.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logshop.springboot.exception.ResourceNotFoundException;
import com.logshop.springboot.model.Buyer;
import com.logshop.springboot.model.Seller;
import com.logshop.springboot.repository.BuyerRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class BuyerController {

	@Autowired
	private BuyerRepository buyerRepository;

	// Add Buyer RESTapi
	@PostMapping("/buyers")
	public Buyer createBuyer(@RequestBody Buyer buyer) {
		return buyerRepository.save(buyer);
	}

	// Get Buyer
	@GetMapping("/buyers")
	public List<Buyer> getAllBuyers() {
		return buyerRepository.findAll();
	}

}
