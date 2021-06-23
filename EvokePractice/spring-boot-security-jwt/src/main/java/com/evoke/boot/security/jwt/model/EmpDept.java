package com.evoke.boot.security.jwt.model;

import java.util.Date;

public class EmpDept {
	private Integer id;
	private String name;
	private String dept_name;
	private Date created_on;
	
	public EmpDept(Integer id, String name, String dept_name, Date created_on) {
		super();
		this.id = id;
		this.name = name;
		this.dept_name = dept_name;
		this.created_on = created_on;
	}



	public EmpDept() {
	
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

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	

}
