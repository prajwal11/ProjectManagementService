package com.project.management.service;

import com.project.management.dto.requestDto.UserRequestDto;
import com.project.management.model.User;

public interface UserService {

	public UserRequestDto saveUser(UserRequestDto userRequestDto);

}
