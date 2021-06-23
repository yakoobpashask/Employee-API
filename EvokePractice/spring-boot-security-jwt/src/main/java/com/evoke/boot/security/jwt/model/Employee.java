package com.evoke.boot.security.jwt.model;	

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Table(name="employee")
public class Employee {

@Id
private Integer id;
private String name;
private String phone;

@Column(unique=true)
private String email;
private String created_By;
private Date created_on;


  @ManyToOne 
  @JoinColumn(name="fk_id",referencedColumnName = "id")
  private Department depart;
 

public Employee() {
	
}
public Employee(Integer id, String name, String phone, String email, String created_By, Date created_on) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
	this.email = email;
	this.created_By = created_By;
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
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
