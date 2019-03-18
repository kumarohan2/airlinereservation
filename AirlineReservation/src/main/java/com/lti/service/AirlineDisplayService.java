package com.lti.airline.admin.service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

import com.lti.airline.admin.dao.AirlineDTO;
import com.lti.airline.admin.dao.AirlineDisplayDao;
import com.lti.airline.admin.entity.AirlineDetails;

	

	@Service
	public class AirlineDisplayService {

		
			@Autowired
		private AirlineDisplayDao airlinedisplaydao;
		
//			public void display(AirlineDTO airlineDTO) {
//				AirlineDetails airline = new AirlineDetails();
//				airline.setFlightNo(airlineDTO.getFlightNo());
//				airline.setFlightName(airlineDTO.getFlightName());
//				airline.setCapacity(airlineDTO.getCapacity());
//				airline.setPrice(airlineDTO.getPrice());
//				airline.setDestination(airlineDTO.getDestination());
//				airline.setSource(airlineDTO.getSource());
//			airline.setDepartureTime(airlineDTO.getDepartureTime());
//			airline.setArrivalTime(airlineDTO.getArrivalTime());
//			airline.setBoardingDate(airlineDTO.getBoardingDate());
//			airline.setAlightingDate(airlineDTO.getAlightingDate());
//			
//				airlinedisplaydao.add(airline);
//			}
			
			public List<AirlineDetails> getdetails() {
				return airlinedisplaydao.fetchAll();
			}
	}




