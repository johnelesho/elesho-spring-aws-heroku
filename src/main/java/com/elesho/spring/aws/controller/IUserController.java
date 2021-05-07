package com.elesho.spring.aws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elesho.spring.aws.model.User;
import com.elesho.spring.aws.service.IUserService;

@RestController
@RequestMapping("/api/user")
public class IUserController {

	@Autowired
	private IUserService userService;
	
	@PostMapping
	public ResponseEntity<?> saveUser(@RequestBody User user){
		if(userService.findByUsername(user.getUsername()) != null ) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		
		return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
		
	}
	
	@GetMapping
	public ResponseEntity<?> findAll(){
		
		
		return new ResponseEntity<>(userService.findAllUsers(), HttpStatus.OK);
		
	}
}
