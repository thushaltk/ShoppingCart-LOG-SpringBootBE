package com.logshop.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logshop.springboot.model.Items;

@Repository
public interface ItemRepository extends JpaRepository<Items, Long>{

}
