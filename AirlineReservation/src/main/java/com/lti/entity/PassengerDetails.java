package com.lti.entity;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="Passenger_Details")
	public class PassengerDetails {
		
		@Id
		@GeneratedValue
		private int passengerId;
		private String name;
		private String dateOfBirth;
		private String gender;
		private String email;
		private String mobileNo;
		
		public int getPassengerId() {
			return passengerId;
		}
		public void setPassengerId(int passengerId) {
			this.passengerId = passengerId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		@Override
		public String toString() {
			return "PassengerDetails [passengerId=" + passengerId + ", name=" + name + ", dateOfBirth=" + dateOfBirth
					+ ", gender=" + gender + ", email=" + email + ", mobileNo=" + mobileNo + "]";
		}
		
		
	}



	

