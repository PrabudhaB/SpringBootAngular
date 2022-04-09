package com.jbk.SpringMVC_DEC.dao;

import java.util.List;

import com.jbk.SpringMVC_DEC.entity.Employee;
import com.jbk.SpringMVC_DEC.model.EmployeeModel;

public interface EmployeeDao 
{
	public Employee login(Employee employee);

	public boolean logout(String username);

	public boolean addEmployee(Employee employee);

	public Employee profile(String username);

	public Employee updateEmployee(Employee employee);

	public List<Employee> listOfEmployee();

	public boolean deleteEmployee(String id);

	public String forgotPassword(EmployeeModel employeeModel);
}
