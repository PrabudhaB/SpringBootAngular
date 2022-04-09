package com.jbk.SpringMVC_DEC.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table
public class Employee {
	
	@Id
	
	private String eid;
	
	@Column(nullable=false, unique=true)
	private String username;
	private String lastName;
	private String password;
	private String gender;
	private String mail;
	private String phone;
	private String question;
	private String answer;
	
	
	private String status="inactive";
	private String type;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String eid, String username, String lastName, String password, String gender, String mail,
			String phone, String question, String answer, String status, String type) {
		super();
		this.eid = eid;
		this.username = username;
		this.lastName = lastName;
		this.password = password;
		this.gender = gender;
		this.mail = mail;
		this.phone = phone;
		this.question = question;
		this.answer = answer;
		this.status = status;
		this.type = type;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", username=" + username + ", lastName=" + lastName + ", password=" + password
				+ ", gender=" + gender + ", mail=" + mail + ", phone=" + phone + ", question=" + question + ", answer="
				+ answer + ", status=" + status + ", type=" + type + "]";
	}
	

}
