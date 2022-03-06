package com.educandoweb.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.order.entities.OrderItem;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {
	
}
