package com.mayra.demo.service;

import java.util.List;

import com.mayra.demo.model.User; ;

public interface UserService {

	User save(User user);

	List<User> findAll();

}