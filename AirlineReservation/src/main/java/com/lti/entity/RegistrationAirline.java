package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TBL_REGISTRATION_AIRLINE")
public class RegistrationAirline {

	@Id
	@GenericGenerator(name = "inc", strategy = "increment")
	@GeneratedValue(generator = "inc")
	private int passangerId;

	private String title;
	private String firstName;
	private String lastName;
	
	@Column(name="emailId", unique=true)
    private String emailId;
	
	private String password;
	private String dob;
	private long mobileNo;
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

	public String getEmailId() {
		return emailId;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
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

	public String getSecurityanswer() {
		return securityanswer;
	}

	public void setSecurityanswer(String securityanswer) {
		this.securityanswer = securityanswer;
	}

	public String getSecurityquestion() {
		return securityquestion;
	}

	public void setSecurityquestion(String securityquestion) {
		this.securityquestion = securityquestion;
	}

}
