package com.project.management.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Data
public class User {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String phoneNumber;
	//@OneToMany
	private String companyId;
	private Boolean isActive;
	private Boolean isFirstTimeLogin;
	private int billableRate;
}
