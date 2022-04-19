package com.project.management.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class TaskActivity {

	@Id
	private String id;
	@ManyToOne
	private Task taskId;
	private long startTime;
	private long endTime;
	private int duration;
	private int billableRate;
	@ManyToOne
	private User userId;

}
