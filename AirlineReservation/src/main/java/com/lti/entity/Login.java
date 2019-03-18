package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Login {

	@Id
	@GenericGenerator(name = "inc", strategy = "increment")
	@GeneratedValue(generator = "inc")
	private int passangerId;

	//private String title;
	//private String firstName;
	//private String lastName;
	private String emailId;
	private String password;
	//private String dob;
	//private int mobileNo;

	
	public int getPassangerId() {
		return passangerId;
	}

	public void setPassangerId(int passangerId) {
		this.passangerId = passangerId;
	}


	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
