package com.mayra.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayra.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@SuppressWarnings("unchecked")
	User save(User user);
}