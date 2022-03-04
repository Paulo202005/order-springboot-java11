package com.educandoweb.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.order.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
