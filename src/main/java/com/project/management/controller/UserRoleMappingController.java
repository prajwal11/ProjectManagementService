package com.project.management.controller;

import com.project.management.dao.UserRoleMappingRepository;
import com.project.management.model.UserRoleMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userRoleMapping")
public class UserRoleMappingController {

	@Autowired
	private UserRoleMappingRepository userRoleMappingRepository;

	@GetMapping("/all")
	public List<UserRoleMapping> getAllUserRoleMapping(){
		return userRoleMappingRepository.findAll();
	}

}
