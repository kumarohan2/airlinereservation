package com.lti.dto;

import javax.persistence.Id;

public class RegistrationAirlineDTO {
  
	private int passangerId;

	private String title;
	private String firstName;
	private String lastName;
	private String emailId;
	private long mobileNo;
	private String password;
	private String dob;
	private String securityquestion;
	private String securityanswer;

	public int getPassangerId() {
		return passangerId;
	}

	public void setPassangerId(int passangerId) {
		this.passangerId = passangerId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

public void setDob(String dob) {
	this.dob = dob;
}

public String getSecurityquestion() {
	return securityquestion;
}

public void setSecurityquestion(String securityquestion) {
	this.securityquestion = securityquestion;
}

public String getSecurityanswer() {
	return securityanswer;
}

public void setSecurityanswer(String securityanswer) {
	this.securityanswer = securityanswer;
}
}
