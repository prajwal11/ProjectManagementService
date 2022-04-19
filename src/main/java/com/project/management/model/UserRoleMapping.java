package com.project.management.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
public class UserRoleMapping {

	@Id
	@GeneratedValue(generator = "UniqueIdGenerator")
	@GenericGenerator(strategy = "com.project.management.util.SequentialGuidGenerator", name = "UniqueIdGenerator")
	private String id;
	@ManyToOne
	private Role role;
	@ManyToOne
	private User user;
}
