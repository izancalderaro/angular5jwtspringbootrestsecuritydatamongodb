package com.ifnc.helpdesk.api.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.ifnc.helpdesk.api.entity.User;


public interface UserService {

	public User findByEmail(String email);
	
	public User createOrUpdate(User user);
	
	public Optional<User> findById(String id);
	
	public void delete(String id);
	
	public Page<User> findAll(int page, int count);
	
}
