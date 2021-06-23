package com.evoke.boot.security.jwt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.evoke.boot.security.jwt.dao.EmployeeRepository;
import com.evoke.boot.security.jwt.model.EmpDept;
import com.evoke.boot.security.jwt.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;
	
	public List<Employee> getAllEmployees() {
		
		List<Employee> listEmp = new ArrayList<>();
		empRepository.findAll().forEach(listEmp::add);
		return listEmp;
		
	}
	
public Employee getEmployeeById(Integer id) {
		
	Optional<Employee>  e = empRepository.findById(id);
	return e.get();
	}

public void addEmployee(Employee e) {
	empRepository.save(e);	
}

public void updateEmployee(Integer id, Employee e) {
	empRepository.save(e);	
}

public void deleteEmployee(Integer id) {
	empRepository.deleteById(id);	
}


public List<String> loadAllEmployeeDetailsByName(String name) {
	
	return empRepository.loadAllEmployeeDetailsByName(name);
	
}

public List<EmpDept> loadAllEmployeeDeptDetails() {
	
	return empRepository.loadAllEmployeeDeptDetails();
	
}
public Employee findByEmail(String email) {
	return empRepository.findByEmail(email);
}

public List<EmpDept> loadAllEmployeeDeptDetailsByName(String name) {
	
	return empRepository.loadAllEmployeeDeptDetailsByName(name);

	
}



}
