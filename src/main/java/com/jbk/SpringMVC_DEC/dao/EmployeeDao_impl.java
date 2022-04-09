package com.jbk.SpringMVC_DEC.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.SpringMVC_DEC.entity.Employee;
import com.jbk.SpringMVC_DEC.model.EmployeeModel;

import net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy.Simple;

@Repository
public class EmployeeDao_impl implements EmployeeDao
{
	@Autowired
	private SessionFactory sf;

	@Override
	public Employee login(Employee employee) 
	{
		Employee emp= null;
		
		try 
		{
			Session session = sf.openSession();
			Criteria criteria = session.createCriteria(Employee.class);

			Criterion username = Restrictions.eq("username", employee.getUsername());
			Criterion password = Restrictions.eq("password", employee.getPassword());

			criteria.add(Restrictions.and(username, password));
			emp = (Employee) criteria.uniqueResult();

			if (emp != null) 
			{
				emp.setStatus("active");
				Transaction transaction = session.beginTransaction();
				session.update(emp);
				transaction.commit();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return emp;
	}

	@Override
	public boolean logout(String username) {
		boolean b = false;
		try {
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.eq("username", username));
			Employee employee = (Employee) criteria.uniqueResult();
			employee.setStatus("inactive");
			session.update(employee);
			transaction.commit();
			b = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return b;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		boolean b = false;
		try {
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			String eid = new SimpleDateFormat("yyyyMMddHHmmsssss").format(new Date());
			employee.setEid(eid);
			session.save(employee);
			transaction.commit();
			b = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public Employee profile(String username) {
		Employee employee = null;
		try {
			Session session = sf.openSession();
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.eq("username", username));
			employee = (Employee) criteria.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee emp = null;
		try {
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(employee);
			transaction.commit();
			emp = session.load(Employee.class, employee.getEid());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public List<Employee> listOfEmployee() {
		List<Employee> list = null;
		try {
			Session session = sf.openSession();
			list = session.createCriteria(Employee.class).list();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean deleteEmployee(String id) 
	{
		boolean b=false;
		
		try {
			
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			Employee employee=session.get(Employee.class, id);
			session.delete(employee);
			
			transaction.commit();
			b=true;
			
		} catch (Exception e) {e.printStackTrace();}
		
		return b;
	}

	@Override
	public String forgotPassword(EmployeeModel employeeModel)
	{
		String msg=null;
		
		try {
			
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("username", employeeModel.getUsername()));
		Employee employee=(Employee)criteria.uniqueResult();
		
		if(employee!=null)
		{
			if(employeeModel.getQuestion().equals(employee.getQuestion()) && employeeModel.getAnswer().equals(employee.getAnswer()))
			{
				if(employeeModel.getNewPassword().equals(employeeModel.getConfirmPassword()))
				{
					employee.setPassword(employeeModel.getNewPassword());
					session.update(employee); //data reached from uniqueResults to employe object
					
					transaction.commit();
					
					msg="Your paswword updated successfully";
				}
				else
				{
					msg="Password is not matched";
				}
			}
			else
			{
				msg="Wrong security question & answer";
			}
		}
		else
		{
			msg="Employee not exists";
		}
			
		} catch (Exception e) {}
		return msg;
	}

	
}
