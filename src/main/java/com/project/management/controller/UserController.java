package com.project.management.controller;

import com.project.management.dao.UserRepository;
import com.project.management.dto.requestDto.UserRequestDto;
import com.project.management.model.User;
import com.project.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	public UserRepository userRepository;

	@Autowired
	public UserService userService;

	@GetMapping("/{userId}")
	public Optional<User> getUserByUserId(@PathVariable("userId") String userId){
		return userRepository.findById(userId);
	}


	@GetMapping("/email/{emailId}")
	public User getUserByEmailId(@PathVariable("emailId") String emailId){
		return userRepository.findByEmailId(emailId);
	}


	@PostMapping()
	public UserRequestDto saveUser(@RequestBody UserRequestDto userRequestDto){
		return userService.saveUser(userRequestDto);
	}

}
