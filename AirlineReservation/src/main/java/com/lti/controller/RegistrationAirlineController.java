package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.dto.RegistrationAirlineDTO;
import com.lti.service.RegistrationAirlineService;

@Controller
public class RegistrationAirlineController {
	@Autowired
	private RegistrationAirlineService registrationAirlineService;

	@RequestMapping(path ="/airline_register", method = RequestMethod.POST)
	public String registerAirline(RegistrationAirlineDTO registrationAirlineDTO) {
		registrationAirlineService.register(registrationAirlineDTO);
		return "/Login.jsp";
	}
	
	
}