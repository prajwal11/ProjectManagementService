package com.project.management.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Data
public class Task {

	@Id
	private String id;
	private String name;
	private String description;
	private String priority;
	@ManyToOne
	private User assignedTo;
	@ManyToOne
	private User assignedBy;
	private String taskType;
	private String status;
	private Boolean isDeleted;
	@ManyToOne
	private Project projectId;
	private int totalBillableRate;
	private int totalDuration;
}
