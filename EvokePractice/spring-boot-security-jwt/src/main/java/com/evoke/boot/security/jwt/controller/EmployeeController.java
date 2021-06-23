package com.evoke.boot.security.jwt.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evoke.boot.security.jwt.model.EmpDept;
import com.evoke.boot.security.jwt.model.Employee;
import com.evoke.boot.security.jwt.service.EmployeeService;


@RestController
public class EmployeeController {
	
@Autowired	 
EmployeeService empService;

	@RequestMapping("/employee")	
	public 	List<Employee> getAllEmployeeDetails() {
		List<Employee> empList = new ArrayList<>();
		empService.getAllEmployees().forEach(empList::add);
		return empList ;

	}
	
	@GetMapping("/search-employee/{id}")	
	public 	Employee getEmployeeById(@PathVariable Integer id)  {
		return empService.getEmployeeById(id);
		

	}
	
	@PostMapping("/add-employee")	
	public 	ResponseEntity<String> addEmployee(@RequestBody Employee e)  {
		
		Employee ee = empService.findByEmail(e.getEmail());
		
		if(ee == null) {
			empService.addEmployee(e);
			return new ResponseEntity<>("Employee Added",HttpStatus.OK);
		}
		
		else {
			return new ResponseEntity<>("Employee already exists...",HttpStatus.BAD_REQUEST);
		}
		 
		 
		

	}
	@PutMapping("/update-employee/{id}")	
	public 	void updateEmployee(@PathVariable Integer id, @RequestBody Employee e)  {
		 empService.updateEmployee(id,e);
		

	}
	
	@DeleteMapping("/delete-employee/{id}")	
	public 	void deleteEmployee(@PathVariable Integer id)  {
		 empService.deleteEmployee(id);
		

	}
	
	/*
	 * @GetMapping("/search-employee-dept/{id}") public Employee
	 * getEmployeeDeptDetailsbyId(@PathVariable Integer id) { return
	 * empService.getEmployeeById(id);
	 * 
	 * 
	 * }
	 */
	
	@GetMapping("/search-employee-name/{name}")	
	public 	List<String>  loadAllEmployeeDetailsByName(@PathVariable String name)  {
		return empService.loadAllEmployeeDetailsByName(name);
		

	}
	
	@GetMapping("/search-employee-dept/{name}")	
	public 	List<EmpDept>  loadAllEmployeeDeptDetails(@PathVariable String name)  {
		return empService.loadAllEmployeeDeptDetailsByName(name);
		

	}
	@GetMapping("/search-employee-dept/")	
	public 	List<EmpDept>  loadAllEmployeeDeptDetails()  {
		return empService.loadAllEmployeeDeptDetails();
		

	}
	@GetMapping("/search-employee-email/{email}")	
	public 	Employee  findbyEmail(@PathVariable String email)  {
		return empService.findByEmail(email);
		

	}



}
