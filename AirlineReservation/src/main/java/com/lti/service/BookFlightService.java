package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.BookFlightDao;
import com.lti.dto.PassengerDetailsDTO;
import com.lti.entity.FlightDetails;

@Service
public class BookFlightService {

	@Autowired
	private BookFlightDao bookFlightDao;

	@Transactional
	public void getPassenger(PassengerDetailsDTO passengerDetailsDTO) {

		/*
		 * PassengerDetails passengerDetails=new PassengerDetails();
		 * passengerDetails.setName(passengerDetailsDTO.get);
		 * passengerDetails.setGender(passengerDetailsDTO.getGender());
		 * passengerDetails.setDateOfBirth(passengerDetailsDTO.getDateOfBirth());
		 * passengerDetails.setMobileNo(passengerDetailsDTO.getMobileNo());
		 * passengerDetails.setEmail(passengerDetailsDTO.getEmail());
		 * 
		 * bookFlightDao.addPassenger(passengerDetails); }
		 */
	}

	public FlightDetails getFlightDetails(int flightId) {
		return bookFlightDao.fetchFlightDetails(flightId);
	}

}
