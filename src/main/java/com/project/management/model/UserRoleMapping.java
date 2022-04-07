package com.project.management.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@Data
public class UserRoleMapping {

	@Id
	private String id;
	@ManyToOne
	private Role roleId;
	@ManyToOne
	private User userId;
}
