package com.project.management.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Blob;
import java.util.Date;

@Entity
@Data
public class Company {

	@Id
	private String id;
	private String name;
	private Date createDate;
	private Date updateDate;
	@ManyToOne
	private User createdBy;
	private String description;
	private Blob logo;
	private String url;
	private Boolean isActive;
	private Date licenseExpiryDate;
	private String currency;
	@ManyToOne
	private User ownerId;


}
