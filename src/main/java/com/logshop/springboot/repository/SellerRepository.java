package com.logshop.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logshop.springboot.model.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long>{
	
}
