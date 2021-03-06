package com.logshop.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logshop.springboot.model.Buyer;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Long>{
	
}
