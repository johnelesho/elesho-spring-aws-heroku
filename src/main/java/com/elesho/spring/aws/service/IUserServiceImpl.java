package com.elesho.spring.aws.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elesho.spring.aws.model.User;
import com.elesho.spring.aws.repositories.IUserRepository;


@Service
public class IUserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		user.setCreateTime(LocalDateTime.now());
		
		return userRepository.save(user);
	}
	
	
	@Override
	public User findByUsername(String username) {
		
		return userRepository.findByUsername(username).orElse(null);
	}
	
	
	@Override
	public List<User> findAllUsers(){
		return userRepository.findAll();
	}
	
	
}
