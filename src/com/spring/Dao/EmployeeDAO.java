package com.spring.Dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.beans.Employee;

@Repository
public class EmployeeDAO implements EmployeeIDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public void addEmployee(Employee employee) {
		 sessionFactory.getCurrentSession().saveOrUpdate(employee);
		
		
	}

	

}
