package com.project.management.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ProjectMemberMapping {

	@Id
	private String id;
	@ManyToOne(cascade= CascadeType.ALL)
	//@JoinColumn(name="id")
	private Project projectId;
	private String associationId;
	//Change this to Enum Type
	private String associationType;

}
