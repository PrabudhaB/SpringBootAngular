package com.jbk.SpringMVC_DEC.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.jbk.SpringMVC_DEC.entity.Employee;

@Configuration
public class HibernateConfiguration {
	
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/dec_ojt_mvc");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
		
	}
	
	@Bean
	public LocalSessionFactoryBean getsessionFactoryBean() {
		
		LocalSessionFactoryBean sessionFactoryBean=new LocalSessionFactoryBean();
		
		sessionFactoryBean.setDataSource(dataSource());
		sessionFactoryBean.setAnnotatedClasses(Employee.class);
		Properties hibernateProperties=new Properties(); 
		hibernateProperties.put("hibernate.show_sql", true);
		hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		hibernateProperties.put("hibernate.hbm2ddl.auto", "update");
		sessionFactoryBean.setHibernateProperties(hibernateProperties);
		
		return sessionFactoryBean;
		
	}
	


}
