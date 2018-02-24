package com.spring.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.Dao.EmployeeDAO;
import com.spring.Dao.EmployeeIDAO;
import com.spring.beans.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeIDAO{
	
	EmployeeIDAO employeeDao; 

	public void setEmployeeDao(EmployeeIDAO employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	@Transactional
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.addEmployee(employee);
		
	}
	
	

}
