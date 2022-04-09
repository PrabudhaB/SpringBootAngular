package com.jbk.SpringMVC_DEC.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.SpringMVC_DEC.dao.EmployeeDao;
import com.jbk.SpringMVC_DEC.entity.Employee;
import com.jbk.SpringMVC_DEC.model.EmployeeModel;

@Service
public class EmployeeService_impl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee login(Employee employee) {
		Employee emp =dao.login(employee);
		return emp;
	}

	@Override
	public boolean logout(String username,HttpSession httpSession) {
		boolean b= dao.logout(username);
		
		if(b) {
			httpSession.invalidate();
		}
		
		return b;
	}

	@Override
	public boolean addEmployee(Employee employee) {
	boolean b=dao.addEmployee(employee);
		return b;
	}

	@Override
	public Employee profile(String username) {
	Employee employee=dao.profile(username);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
	Employee emp=dao.updateEmployee(employee);
		return emp;
	}

	@Override
	public List<Employee> listOfEmployee() {
	List<Employee> list=dao.listOfEmployee();
		return list;
	}

	@Override
	public boolean deleteEmployee(String id) 
	{
		boolean b=dao.deleteEmployee(id);
		
		return b;
	}

	@Override
	public String forgotPassword(EmployeeModel employeeModel)
	{
		String msg =dao.forgotPassword(employeeModel);
		
		return msg;
	}
	
	
}
