package com.educandoweb.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.order.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
