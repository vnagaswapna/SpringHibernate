package com.spring.services;

import java.util.List;

import com.spring.beans.Employee;


	 
	public interface EmployeeService {
	     
	    public void addEmployee(Employee employee);
	 
	    public List<Employee> getAllEmployees();
	 
	    public void deleteEmployee(Integer employeeId);
	 
	    public Employee getEmployee(int employeeid);
	 
	    public Employee updateEmployee(Employee employee);
	}


