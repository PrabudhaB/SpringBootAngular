package com.jbk.SpringMVC_DEC.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jbk.SpringMVC_DEC.entity.Employee;
import com.jbk.SpringMVC_DEC.model.EmployeeModel;
import com.jbk.SpringMVC_DEC.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(value="/")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping(value="/addEmployeePage")
	public String addEmployeePage() {
		return "addEmployee";
	}
	
	@RequestMapping(value="/forgotPasswordPage")
	public String forgotPasswordPage() {
		return "forgotPassword";
	}
	
	@PostMapping(value="/forgotPassword")
	public String forgotPassword(@ModelAttribute EmployeeModel employeeModel, Model model )
	{
		String msg= service.forgotPassword(employeeModel);
		model.addAttribute("msg", msg);
		
		if(msg.equals("Your paswword updated successfully"))
		
			return "index";
		
		else
			
			return "forgotPassword";
	}
	
	@PostMapping(value="/login")
	public ModelAndView login(@ModelAttribute Employee employee,HttpSession httpSession) {
		
	Employee emp=	service.login(employee);
	System.out.println(emp);
		
	if(emp!=null) 
		{
			httpSession.setAttribute("status", emp.getStatus());
			httpSession.setAttribute("type", emp.getType());
			httpSession.setAttribute("username", emp.getUsername());


			return new ModelAndView("home");
		}
		else {
			return new ModelAndView("index","msg","Invalid Credientials !");
		}
		
	}
	
	@GetMapping(value="/logout")
	public String logout(@RequestParam String username,HttpSession httpSession)
	{
	service.logout(username,httpSession);
	return  "redirect:/";
		
	}
	
	@PostMapping(value="/addEmployee")
	public ModelAndView addEmployee(@ModelAttribute Employee employee) {
		
	boolean b=	service.addEmployee(employee);
	if(b) {
		return new ModelAndView("addEmployee","msg","Employee Added Successfully !!");
	}
	else {
		return new ModelAndView("addEmployee","msg","Employee Not Added Successfully !!");

	}
		
	}
	
	@RequestMapping(value="/profile")
	public ModelAndView profile(@RequestParam String username ) {
		
	Employee employee=	service.profile(username);
		return new ModelAndView("profile","employee",employee);
	}
	
	@PostMapping(value="/updateEmployee")
	public ModelAndView updateEmployee(@ModelAttribute Employee employee) {
		
	Employee emp=	service.updateEmployee(employee);
	return new ModelAndView("profile","employee",emp);
	}
	
	@RequestMapping(value="/listOfEmployee")
	public ModelAndView listOfEmployee(@RequestParam String msg, Model model) 
	{
		List<Employee> list=service.listOfEmployee();
		
		if(!msg.equals("null"))
		{
			model.addAttribute("msg", msg);
		}
		return new ModelAndView("listOfEmployee","employees",list);

	}
	
	@RequestMapping(value="/deleteEmployee")
	public String deleteEmployee(@RequestParam String id)
	{
		boolean b =service.deleteEmployee(id);
		
		if(b)
		{
			return "redirect:/listOfEmployee?msg=Record Deleted";
		}
		else
		{
			return "redirect:/listOfEmployee?msg=Record Not Deleted";

		}
	}	
}
