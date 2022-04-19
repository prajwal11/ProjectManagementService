package com.project.management.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Project {

	@Id
	@GeneratedValue(generator = "UniqueIdGenerator")
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Company companyId;
	//Create Enum for this - public or private
	private String accessType;
	private Date createDate;
	private Date updateDate;
	@ManyToOne
	private User createdBy;
	@ManyToOne
	private User clientId;
	private String color;
	private Boolean isBillable;
	private int billableRate;


}
