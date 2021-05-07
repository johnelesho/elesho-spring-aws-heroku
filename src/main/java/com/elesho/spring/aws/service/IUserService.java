package com.elesho.spring.aws.service;

import java.util.List;

import com.elesho.spring.aws.model.User;

public interface IUserService {

	User findByUsername(String username);

	User saveUser(User user);

	List<User> findAllUsers();

}
