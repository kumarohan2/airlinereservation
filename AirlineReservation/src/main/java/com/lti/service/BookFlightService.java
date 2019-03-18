package com.lti.service;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.BookFlightDao;
import com.lti.dto.PassengerDetailsDTO;
import com.lti.entity.BookingDetails;
import com.lti.entity.Flight;
import com.lti.entity.PassengerDetails;

@Service
public class BookFlightService {

	@Autowired
	private BookFlightDao bookFlightDao;

	@Transactional
	public void addBookingDetails(Flight flight,PassengerDetailsDTO passengerDetailsDTO)
	{

		BookingDetails bookingDetails = new BookingDetails();
		bookingDetails.setBookingAmount(flight.getPrice());
		bookingDetails.setFlightDetails(flight);
		bookingDetails.setBookingDate(new Date());
		bookingDetails.setMobileNo(""+passengerDetailsDTO.getMobileNo());
		
		Set<PassengerDetails> set = new HashSet<PassengerDetails>();
		for(PassengerDetails p : passengerDetailsDTO.getPassengerDetails()) {
			p.setBookingDetails(bookingDetails);
			set.add(p);
		}
		bookingDetails.setPassengerDetails(set);
		
		bookFlightDao.add(bookingDetails);
		  /* PassengerDetails passengerDetails=new PassengerDetails();
		  passengerDetails.setName(passengerDetailsDTO.getName());
		  passengerDetails.setGender(passengerDetailsDTO.getGender());
		  passengerDetails.setDateOfBirth(passengerDetailsDTO.getDateOfBirth());
		  passengerDetails.setMobileNo(passengerDetailsDTO.getMobileNo());
		  passengerDetails.setEmail(passengerDetailsDTO.getEmail());
		  
		  bookFlightDao.addPassenger(passengerDetails);
		  } */
	
	}
	

	public Flight getFlightDetails(int flightId) {
		return bookFlightDao.fetchFlightDetails(flightId);
	}

}

