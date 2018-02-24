package com.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.Dao.EmployeeDAO;
import com.spring.beans.Employee;
import com.spring.services.EmployeeService;


@Controller
public class EmployeeController {
	

    @Autowired
    private EmployeeService employeeService;
	
	public EmployeeController() {
        System.out.println("EmployeeController()");
    }
	@RequestMapping("/openEmpForm")
	public ModelAndView DisplayEmployeeForm()
	{
		return new ModelAndView("EmployeeForm");
	}
	@RequestMapping(value="/Save" ,method=RequestMethod.POST)
	public ModelAndView SaveEmployee(@ModelAttribute("emp") Employee emp)
	{
		employeeService.addEmployee(emp);
		//dao.save(emp);  
        return new ModelAndView("redirect:/");
		
	}
	

}
