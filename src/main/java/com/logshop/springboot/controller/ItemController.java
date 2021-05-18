package com.logshop.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logshop.springboot.exception.ResourceNotFoundException;
import com.logshop.springboot.model.Items;
import com.logshop.springboot.repository.ItemRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ItemController {

	@Autowired
	private ItemRepository itemRepository;

	// Add Items RESTapi
	@PostMapping("/items")
	public Items addItem(@RequestBody Items item) {
		return itemRepository.save(item);
	}

	// Get Items
	@GetMapping("/items")
	public List<Items> getAllItems() {
		return itemRepository.findAll();
	}

	// Get Item by ID
	@GetMapping("/items/{id}")
	public ResponseEntity<Items> getItemByID(@PathVariable Long id) {
		Items item = itemRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Item not found"));
		return ResponseEntity.ok(item);
	}

	// Update items
	@PutMapping("/items/{id}")
	public ResponseEntity<Items> updateItems(@PathVariable Long id, @RequestBody Items itemDetails) {
		Items item = itemRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Item not found"));
		item.setItemName(itemDetails.getItemName());
		item.setDescription(itemDetails.getDescription());
		item.setImageUrl(itemDetails.getImageUrl());
		item.setPrice(itemDetails.getPrice());

		Items updatedItem = itemRepository.save(item);
		return ResponseEntity.ok(updatedItem);
	}
	
	//Delete items rest api
	@DeleteMapping("/items/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		Items item = itemRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Item not found"));
		itemRepository.delete(item);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	

}
