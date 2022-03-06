package com.educandoweb.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.order.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
