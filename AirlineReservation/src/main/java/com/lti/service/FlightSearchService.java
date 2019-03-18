package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.FlightSearchDao;
import com.lti.dto.FlightSearchDTO;
import com.lti.entity.Flight;

@Service
public class FlightSearchService {

	@Autowired

	private FlightSearchDao flightSearchDao;

	@Transactional
	public void show(FlightSearchDTO flightSearchDTO) {
		Flight flight = new Flight();
		flight.setSource(flightSearchDTO.getSource());
		flight.setDestination(flightSearchDTO.getDestination());
	//	flight.setArivalTime(Double.parseDouble(flightSearchDTO.getArivalTime()));
	//	flight.setDepartureTime(Double.parseDouble(flightSearchDTO.getDepartureTime()));

		flightSearchDao.addDetails(flight);
	}

	public List<Flight> getFlight() {

		return flightSearchDao.fetchFlight();
	}

	public List<Flight> getFlight(FlightSearchDTO flightSearchDTO) {

		return flightSearchDao.fetchFlight(flightSearchDTO);
	}

	public List<Flight> getMorningFlight(FlightSearchDTO flightSearchDTO) {
		return flightSearchDao.fetchMorningFlight(flightSearchDTO);
	}

	public List<Flight> getEveningFlight(FlightSearchDTO flightSearchDTO) {
		return flightSearchDao.fetchEveningFlight(flightSearchDTO);
	}

	public List<Flight> getFlightByCarrier(FlightSearchDTO flightSearchDTO, String carrier) {
		return flightSearchDao.fetchFlightByCarrier(flightSearchDTO,carrier);
	}

	public List<String> getAllCarriers() {
		return flightSearchDao.fetchAllCarriers();
	}
}
