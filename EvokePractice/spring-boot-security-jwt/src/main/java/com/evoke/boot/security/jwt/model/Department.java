package com.evoke.boot.security.jwt.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="department")
public class Department {

	
	@Id
	private Integer id;
	private String name;
	private String description;
	private String created_By;
	private Date created_on;
	
	
	 // @OneToMany(mappedBy = "depart")
	//  @JoinColumn(name = "empdep_fk",referencedColumnName = "id")
	 // private List<Employee> employees;
	 
	
	public Department() {
		
	}
	
	public Department(Integer id, String name, String description, String created_By, Date created_on) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.created_By = created_By;
		this.created_on = created_on;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreated_By() {
		return created_By;
	}

	public void setCreated_By(String created_By) {
		this.created_By = created_By;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	
	
}

