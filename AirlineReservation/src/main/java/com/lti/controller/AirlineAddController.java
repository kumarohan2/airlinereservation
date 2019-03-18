package com.lti.airline.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.airline.admin.dao.AirlineDTO;
import com.lti.airline.admin.service.AirlineAddService;

@Controller
public class AirlineAddController {

	@Autowired 
	private AirlineAddService airlineAddService;
	
	@RequestMapping(path = "/airlinedetails", method = RequestMethod.GET)
	public String register(AirlineDTO airlineDto) {
		
		airlineAddService.addAirline(airlineDto);
		return "/successfull.jsp"; 

	}
}
