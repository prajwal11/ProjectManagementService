package com.project.management.dto.requestDto;

import com.project.management.model.User;
import com.project.management.model.UserRoleMapping;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserRequestDto {

	private User user;
	private UserRoleMapping userRoleMapping;
}