package com.demo.backendservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.backendservice.model.User;
import com.demo.backendservice.service.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/findUser")
	public User findUser(@RequestParam(value="id") Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}
	
	@GetMapping("/listUsers")
	public List<User> listUsers() {
		return userRepository.findAll(); 
	}
	
	@PostMapping("/createUser")
	public Long createUser(@RequestBody User user) {
		User savedUser = userRepository.save(user);
		
		return savedUser.getId(); 
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteStudent(@PathVariable long id) {
		userRepository.deleteById(id);
	}
	
	@PutMapping("/updateUser/{id}")
	public User updateStudent(@RequestBody User user, @PathVariable long id) {

		Optional<User> userOptional = userRepository.findById(id);

		if (!userOptional.isPresent())
			return null;

		user.setId(id);
		
		userRepository.save(user);

		return user;
	}
}
