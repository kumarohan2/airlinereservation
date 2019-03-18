package com.lti.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Booking_Details")
public class BookingDetails {
	
	@Id
	@GeneratedValue(generator="pk_gen")
	@GenericGenerator(name="pk_gen",strategy="increment")
	private int bookingId;
	
	private String email;
	private String mobileNo;
	
	private double bookingAmount;
	private Date bookingDate; 

	@ManyToOne
	@JoinColumn(name="flightId")
	private Flight FlightDetails;
	
	@OneToMany(mappedBy = "bookingDetails", cascade = CascadeType.ALL)
	private Set<PassengerDetails> passengerDetails;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
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

	public double getBookingAmount() {
		return bookingAmount;
	}

	public void setBookingAmount(double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Flight getFlightDetails() {
		return FlightDetails;
	}

	public void setFlightDetails(Flight flightDetails) {
		FlightDetails = flightDetails;
	}

	public Set<PassengerDetails> getPassengerDetails() {
		return passengerDetails;
	}

	public void setPassengerDetails(Set<PassengerDetails> passengerDetails) {
		this.passengerDetails = passengerDetails;
	}
	
	
}
