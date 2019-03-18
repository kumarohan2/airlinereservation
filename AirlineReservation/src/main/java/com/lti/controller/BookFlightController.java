package com.lti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.FlightSearchDTO;
import com.lti.dto.PassengerDetailsDTO;
import com.lti.entity.Flight;
import com.lti.service.BookFlightService;



@Controller
@SessionAttributes({"flightDetails","passengerDetailsDTO","flightSearchDTO","bookingDetails"})
public class BookFlightController {
	
	@Autowired
	private BookFlightService bookFlightService;
	
	
	@RequestMapping(path="/initiateBooking", method=RequestMethod.GET)
	
	public String initiateBooking(@RequestParam("flightId") int flightId,
													Map<String,Object> model) {
		
		FlightSearchDTO flightSearchDTO = (FlightSearchDTO) model.get("flightSearchDTO");
		
		Flight flightDetails = bookFlightService.getFlightDetails(flightId);
		model.put("flightDetails", flightDetails);
		model.put("noOfPassengers",  flightSearchDTO.getNoOfSeats());
	//	System.out.println(flightSearchDTO.getNoOfSeats());
		return "/BookFlight.jsp";
	}
	
	@RequestMapping(path="/passenger", method=RequestMethod.POST)
	public String passenger(PassengerDetailsDTO passengerDetailsDTO, Map<String, Object> model) {
		System.out.println(passengerDetailsDTO);
		if(model.get("passengerDetailsDTO") != null)
			model.remove("passengerDetailsDTO");
		
		model.put("passengerDetailsDTO", passengerDetailsDTO);
		return "/confirmBooking.jsp";
	}
	
	@RequestMapping(path="/confirmBooking", method=RequestMethod.GET)
	public String confirmBooking(Map<String,Object> model) {
		Flight flightDetails = (Flight) model.get("flightDetails");
		PassengerDetailsDTO passengerDetailsDTO=(PassengerDetailsDTO)model.get("passengerDetailsDTO");
		bookFlightService.addBookingDetails(flightDetails,passengerDetailsDTO);
		return "/ticketPrint.jsp";
	}

	
	/*@RequestMapping(path="/getDetails", method=RequestMethod.POST)
	public String confirmBooking(Map<String,Object> model) {
		flightDetails flightDetails = (flightDetails) model.get("flightDetails");
		PassengerDetailsDTO passengerDetailsDTO = (PassengerDetailsDTO) model.get("passengerDetailsDTO");
		return "/bookflight.jsp";
	}*/
	
	
@RequestMapping(path="/passenger", method=RequestMethod.GET)
	
	public String passengerBooking(@RequestParam("flightId") int flightId,
													@RequestParam("noOfPassengers") int noOfPassengers, 
													Map<String,Object> model) {
		
		
		Flight flightDetails = bookFlightService.getFlightDetails(flightId);
		model.put("flightDetails", flightDetails);
		model.put("noOfPassengers",  noOfPassengers);
		
		return "/BookFlight.jsp";
	}
	
}
