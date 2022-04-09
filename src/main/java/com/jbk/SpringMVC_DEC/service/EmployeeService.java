package com.jbk.SpringMVC_DEC.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.jbk.SpringMVC_DEC.entity.Employee;
import com.jbk.SpringMVC_DEC.model.EmployeeModel;

public interface EmployeeService {
	
	public Employee login(Employee employee);

	public boolean logout(String username,HttpSession httpSession);

	public boolean addEmployee(Employee employee);

	public Employee profile(String username);

	public Employee updateEmployee(Employee employee);

	public List<Employee> listOfEmployee();

	public boolean deleteEmployee(String id);

	public String forgotPassword(EmployeeModel employeeModel);

}
