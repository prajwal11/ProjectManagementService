package com.project.management.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Accessors(chain = true)
public class User {

	@Id
	//@GeneratedValue(generator = "UniqueIdGenerator")
	//@GenericGenerator(strategy = "com.project.management.util.SequentialGuidGenerator", name = "UniqueIdGenerator")
	private String id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String phoneNumber;
	private String companyId;
	private Boolean isActive;
	private Boolean isFirstTimeLogin;
	private int billableRate;
}