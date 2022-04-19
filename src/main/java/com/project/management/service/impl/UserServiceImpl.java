package com.project.management.service.impl;

import com.project.management.dao.RoleRepository;
import com.project.management.dao.UserRepository;
import com.project.management.dao.UserRoleMappingRepository;
import com.project.management.dto.requestDto.UserRequestDto;
import com.project.management.exception.RoleDoesNotExistException;
import com.project.management.exception.UserAlreadyExistException;
import com.project.management.model.Role;
import com.project.management.model.User;
import com.project.management.model.UserRoleMapping;
import com.project.management.service.UserService;
import com.project.management.util.dtoConverter.UserRequestDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepository userRepository;

	@Autowired
	public RoleRepository roleRepository;

	@Autowired
	public UserRoleMappingRepository userRoleMappingRepository;

	@Override
	public UserRequestDto saveUser(UserRequestDto userRequestDto){
		//This if for First time User creation
		if(userRequestDto.getUser().getId().equals("0")) {
			User checkUserEmailId = userRepository.findByEmailId(userRequestDto.getUser().getEmailId());
			if (checkUserEmailId != null) {
				throw new UserAlreadyExistException("User with emailId " + userRequestDto.getUser().getEmailId() + " already exists");
			}
			UUID uuid = UUID.randomUUID();
			userRequestDto.getUser().setId(uuid.toString());
			//TODO - Create Password
		}
		userRequestDto.getUser().setIsActive(true);
		userRequestDto.getUser().setIsFirstTimeLogin(true);
		UserRequestDtoConverter userRequestDtoConverter = new UserRequestDtoConverter();
		User user = userRequestDtoConverter.userRequestDtoToUserConverter(userRequestDto);
		Role role = roleRepository.findByIdAndIsDeleted(userRequestDto.getUserRoleMapping().getRole().getId(),false);
		if(role==null){
			throw new RoleDoesNotExistException("Role with roleId "+userRequestDto.getUserRoleMapping().getRole().getId()+" does not exist");
		}else{
			UserRoleMapping userRoleMapping = new UserRoleMapping();
			userRoleMapping.setUser(user);
			userRoleMapping.setRole(role);
			User savedUser =  userRepository.save(user);
			userRoleMappingRepository.save(userRoleMapping);
			//TODO - Send out an email to user with dummy password and login url for firsttimeUser alone
			UserRequestDto responseDto = new UserRequestDto();
			responseDto.setUser(user);
			responseDto.setUserRoleMapping(userRoleMapping);
			return responseDto;
		}
	}
}
