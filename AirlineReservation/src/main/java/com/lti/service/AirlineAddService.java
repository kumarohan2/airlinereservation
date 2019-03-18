package com.lti.airline.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.airline.admin.dao.AirlineAddDao;
import com.lti.airline.admin.dao.AirlineDTO;
import com.lti.airline.admin.entity.AirlineDetails;

@Service
public class AirlineAddService {
	@Autowired
	private AirlineAddDao airlineAddDao;
	@Transactional
	public void addAirline(AirlineDTO airlineDto) {
		AirlineDetails airlineDetail = new AirlineDetails();
		airlineDetail.setFlightNo(airlineDto.getFlightNo());
		airlineDetail.setFlightName(airlineDto.getFlightName());
		airlineDetail.setSource(airlineDto.getSource());
		airlineDetail.setDestination(airlineDto.getDestination());
		airlineDetail.setPrice(airlineDto.getPrice());
		airlineDetail.setCapacity(airlineDto.getCapacity());
		airlineDetail.setDepartureTime(airlineDto.getDepartureTime());
		airlineDetail.setArrivalTime(airlineDto.getArrivalTime());
		airlineDetail.setDepartureDate(airlineDto.getDepartureDate());
		airlineDetail.setArrivalDate(airlineDto.getArrivalDate());
		airlineAddDao.addAirlineDetails(airlineDetail);

	}

	
}
