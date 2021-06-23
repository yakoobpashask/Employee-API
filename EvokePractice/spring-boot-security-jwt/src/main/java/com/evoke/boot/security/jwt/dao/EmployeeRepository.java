package com.evoke.boot.security.jwt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.evoke.boot.security.jwt.model.EmpDept;
import com.evoke.boot.security.jwt.model.Employee;


public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
	
	public Employee findByEmail(String email) ;
	
	 @Query("SELECT e.id from Employee e  where e.name = ?1 ")
	public List<String> loadAllEmployeeDetailsByName(String name);

	 
	@Query("SELECT new com.evoke.boot.security.jwt.model.EmpDept(e.id,e.name,d.name,e.created_on) from Employee e join e.depart d ")
	public List<EmpDept> loadAllEmployeeDeptDetails();
	
	@Query("SELECT new com.evoke.boot.security.jwt.model.EmpDept(e.id,e.name,d.name,e.created_on) from Employee e join e.depart d  where e.name = ?1")
	public List<EmpDept> loadAllEmployeeDeptDetailsByName(String name);
	
	
}
