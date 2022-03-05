package com.educandoweb.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.order.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
