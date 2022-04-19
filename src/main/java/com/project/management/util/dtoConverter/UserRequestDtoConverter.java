package com.project.management.util.dtoConverter;

import com.project.management.dto.requestDto.UserRequestDto;
import com.project.management.model.User;
import com.project.management.model.UserRoleMapping;

public class UserRequestDtoConverter {

	public User userRequestDtoToUserConverter(UserRequestDto userRequestDto){

		User user = new User();
		user.setId(userRequestDto.getUser().getId()).setBillableRate(userRequestDto.getUser().getBillableRate()).setPhoneNumber(
				userRequestDto.getUser().getPhoneNumber()).setPassword(userRequestDto.getUser().getPassword()).setEmailId(
				userRequestDto.getUser().getEmailId()).setLastName(userRequestDto.getUser().getLastName()).setFirstName(
				userRequestDto.getUser().getFirstName()).setIsFirstTimeLogin(userRequestDto.getUser().getIsFirstTimeLogin()).
				setIsActive(userRequestDto.getUser().getIsActive()).setCompanyId(userRequestDto.getUser().getCompanyId());
		return user;

	}

	public UserRequestDto userToUserRequestDtoConverter(User user, UserRoleMapping userRoleMapping){

		UserRequestDto userRequestDto = new UserRequestDto();
		userRequestDto.getUser().setId(user.getId()).setBillableRate(user.getBillableRate()).setPhoneNumber(
				user.getPhoneNumber()).setPassword(user.getPassword()).setEmailId(
				user.getEmailId()).setLastName(user.getLastName()).setFirstName(
				user.getFirstName()).setIsFirstTimeLogin(user.getIsFirstTimeLogin()).
				setIsActive(user.getIsActive()).setCompanyId(user.getCompanyId());
		userRequestDto.setUserRoleMapping(userRoleMapping);

		return userRequestDto;

	}

}
