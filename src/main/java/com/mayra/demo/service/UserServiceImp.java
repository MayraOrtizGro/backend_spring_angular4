package com.mayra.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayra.demo.dao.UserRepository;
import com.mayra.demo.model.User;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	protected UserRepository userRepository;

	@Override
	public User save(User user) {		
		return this.userRepository.save(user);
	}
	
}