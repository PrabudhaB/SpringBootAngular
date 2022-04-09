package com.jbk.SpringMVC_DEC.model;

public class EmployeeModel 
{
	private String username;
	private String question;
	private String answer;
	private String newPassword;
	private String confirmPassword;
	
	
	public EmployeeModel()
	{
		
	}
	
	public EmployeeModel(String username, String question, String answer, String newPassword, String confirmPassword) 
	{
		super();
		this.username = username;
		this.question = question;
		this.answer = answer;
		this.newPassword = newPassword;
		this.confirmPassword = confirmPassword;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
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


	public String getNewPassword() {
		return newPassword;
	}


	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
}
