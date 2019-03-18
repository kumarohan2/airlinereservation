package com.lti.airline.admin.controller;

	import java.util.List;
	import java.util.Map;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.airline.admin.entity.AirlineDetails;

import com.lti.airline.admin.service.AirlineDisplayService;

	@Controller
	public class AirlineDisplayController {

		@Autowired
		private AirlineDisplayService airlineDisplayService;
		
		@RequestMapping(path = "/airlinedisplay", method = RequestMethod.GET)
		public String list(Map<String, Object> model) {
			List<AirlineDetails> list = airlineDisplayService.getdetails();
			model.put("listOfAirlines",list);
			return "/displayairlines.jsp";
		}
		
		


	/*	@RequestMapping(path = "/airline-dashboard", method = RequestMethod.POST)
		public String (BusDetailsDTO busDTO) {  
			busService.Details(busDTO);
			return "/confirmation.jsp"; 
		*/
	}


