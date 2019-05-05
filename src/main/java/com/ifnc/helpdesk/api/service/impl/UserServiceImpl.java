package com.ifnc.helpdesk.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ifnc.helpdesk.api.entity.User;
import com.ifnc.helpdesk.api.repository.UserRepository;
import com.ifnc.helpdesk.api.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	};

	@Override
	public User createOrUpdate(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public Optional<User> findById(String id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public Page<User> findAll(int page, int count) {
		// TODO Auto-generated method stub		
		return userRepository.findAll(PageRequest.of(page, count));
	}
	
	

}
