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

import com.logshop.springboot.model.Seller;
import com.logshop.springboot.repository.SellerRepository;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class SellerController {
	
	@Autowired
	private SellerRepository sellerRepository; 
	
	//Add Seller RESTapi
	@PostMapping("/sellers")
	public Seller createSeller(@RequestBody Seller seller) {
		return sellerRepository.save(seller);
	}
	
	//Get Seller
	@GetMapping("/sellers")
	public List<Seller> getAllSellers(){
		return sellerRepository.findAll();
	}

}
